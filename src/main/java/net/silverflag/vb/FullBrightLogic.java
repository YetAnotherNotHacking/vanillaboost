package net.silverflag.vb;

import net.minecraft.client.MinecraftClient;

public class FullBrightLogic {
    private static boolean enabled = false;
    private static double previousGamma = -1;

    public static void toggle() {
        var options = MinecraftClient.getInstance().options;
        if (!enabled) {
            previousGamma = options.getGamma().getValue();
            options.getGamma().setValue(1000.0);
        } else {
            options.getGamma().setValue(previousGamma);
        }
        enabled = !enabled;
    }
}
