package com.atakmap.android.plugintemplate.plugin;

// ----- Android API import ----- //

// ----- Local API import ----- //

// ----- ATAK API import ----- //
import com.atak.plugins.impl.AbstractPlugin;
import com.atak.plugins.impl.IToolbarItem;
import com.atakmap.android.maps.MapComponent;
import com.atakmap.android.plugintemplate.PluginTemplateMapComponent;

import gov.tak.api.plugin.IServiceController;

public class PluginTemplateLifeCycle extends AbstractPlugin
{
    /** ************************* CONSTRUCTOR ************************* **/
    public PluginTemplateLifeCycle (IServiceController isc)
    {
        super(isc,
                (IToolbarItem) new PluginTemplateMapComponent(),
                        (MapComponent) new PluginTemplateMapComponent());

    }
}
