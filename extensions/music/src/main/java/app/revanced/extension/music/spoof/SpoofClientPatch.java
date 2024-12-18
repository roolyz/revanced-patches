package app.revanced.extension.music.spoof;

/**
 * @noinspection unused
 */
public class SpoofClientPatch {
    private static final int CLIENT_TYPE_ID = 26;
    private static final String CLIENT_VERSION = "7.31.51";
    private static final String DEVICE_MODEL = "SM-S928U";
    private static final String OS_VERSION = "14.0";

    public static int getClientId() {
        return CLIENT_TYPE_ID;
    }

    public static String getClientVersion() {
        return CLIENT_VERSION;
    }

    public static String getClientModel() {
        return DEVICE_MODEL;
    }

    public static String getOsVersion() {
        return OS_VERSION;
    }
}
