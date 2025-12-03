package h06;

public interface ElectricallyPowered {
    /**
     * The electrical device will be use lasting given duration.
     *
     * @param duration how long the device will be use for
     */
    void use(int duration);

    /**
     * Give the plug type of the device
     * @return the plug type of the device
     */
    PlugType getSupportedPlugType();
}
