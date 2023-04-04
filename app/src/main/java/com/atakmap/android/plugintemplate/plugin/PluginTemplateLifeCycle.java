package com.atakmap.android.plugintemplate.plugin;

// ----- Android API import ----- //
import android.content.Context;

// ----- Local API import ----- //

// ----- ATAK API import ----- //
import com.atak.plugins.impl.AbstractPlugin;
import com.atak.plugins.impl.IToolbarItem;
import com.atak.plugins.impl.PluginContextProvider;
import com.atakmap.android.maps.MapComponent;
import com.atakmap.android.plugintemplate.PluginTemplateMapComponent;

import gov.tak.api.plugin.IServiceController;

public class PluginTemplateLifeCycle extends AbstractPlugin
{

    /** ************************* CONSTRUCTOR ************************* **/
    public PluginTemplateLifeCycle (IServiceController isc)
    {
        super(isc, (IToolbarItem) new PluginTemplateMapComponent(((PluginContextProvider)isc.getService(PluginContextProvider)).getPluginContext(), (MapComponent) new PluginTemplateMapComponent()));
    }
}
