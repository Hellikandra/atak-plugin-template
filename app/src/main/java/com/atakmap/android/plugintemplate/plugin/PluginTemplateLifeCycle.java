package com.atakmap.android.plugintemplate.plugin;

// ----- Android API import ----- //
import android.content.Context;

// ----- Local API import ----- //
import com.atakmap.android.plugintemplate.PluginTemplateMapComponent;

// ----- ATAK API import ----- //
import com.atak.plugins.impl.AbstractPluginLifecycle;

public class PluginTemplateLifeCycle extends AbstractPluginLifecycle
{
    /** ************************* CONSTRUCTOR ************************* **/
    public PluginTemplateLifeCycle (Context context)
    {
        super(context, new PluginTemplateMapComponent());
    }
}
