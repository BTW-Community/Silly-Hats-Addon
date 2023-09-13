package net.fabricmc.sockthing;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import btw.community.sockthing.SillyHatsAddon;

public class ExamplePreLaunchInitializer implements PreLaunchEntrypoint {
    /**
     * Runs the PreLaunch entrypoint to register BTW-Addon.
     * Don't initialize anything else here, use
     * the method Initialize() in the Addon.
     */
    @Override
    public void onPreLaunch() {
        SillyHatsAddon.getInstance();
    }
}
