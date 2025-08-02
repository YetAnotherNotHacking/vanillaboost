package net.silverflag.vb;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;

public class VanillaBoost implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChatListener.register();
    }
}
