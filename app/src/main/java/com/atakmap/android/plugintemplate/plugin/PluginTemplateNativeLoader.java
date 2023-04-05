package com.atakmap.android.plugintemplate.plugin;

import android.content.Context;
import java.io.File;

public class PluginTemplateNativeLoader {
    public static final String TAG = "NativeLoader";
    public static String ndl = null;

    public static void init (final Context context) {
        if (ndl == null) {
            try {
                ndl = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).nativeLibraryDir;
            } catch (Exception e) {
                throw new IllegalArgumentException("native library loading will fail, unable to grab the nativeLibraryDir from the package name");
            }
        }
    }
    public static void loadLibrary(String name) {
        if (ndl != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ndl);
            stringBuilder.append(File.separator);
            stringBuilder.append(System.mapLibraryName(name));
            name = stringBuilder.toString();

            if (new File(name).exists()) {
                System.load(name);
            }
            return;
        } else {
            throw new IllegalArgumentException("NativeLoader not initialized");
        }
    }
}
