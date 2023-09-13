package btw.community.sockthing;

import btw.AddonHandler;
import btw.BTWAddon;

public class SillyHatsAddon extends BTWAddon {
    private static SillyHatsAddon instance;

    private SillyHatsAddon() {
        super("SillyHats", "0.1.0", "SH");
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }

    public static SillyHatsAddon getInstance() {
        if (instance == null)
            instance = new SillyHatsAddon();
        return instance;
    }
}
