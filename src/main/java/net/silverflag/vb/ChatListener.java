package net.silverflag.vb;

import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.text.Text;

public class ChatListener {
    public static void register() {
        ClientReceiveMessageEvents.ALLOW.register((message, signed, sender, params) -> {
            String msg = message.getString();
            if (msg.equalsIgnoreCase(".vbfullbright")) {
                    FullBrightLogic.toggle();
                return false;
            }
            return true;
        });
    }
}  
