package com.Ignacio.lemonmod.world;

import com.Ignacio.lemonmod.LemonMod;
import com.Ignacio.lemonmod.world.generation.TreeGenerator;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LemonMod.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        TreeGenerator.generateTreesPls(event);
    }
}
