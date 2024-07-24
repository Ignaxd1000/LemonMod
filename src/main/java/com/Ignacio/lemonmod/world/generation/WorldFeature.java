package com.Ignacio.lemonmod.world.generation;

import com.Ignacio.lemonmod.block.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class WorldFeature {


    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LEMON_TREE =
            register("lemon_tree", Feature.TREE.withConfiguration((
                    new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.LEMON_LOG.get().getDefaultState()),
                    new SimpleBlockStateProvider(ModBlocks.LEMON_LEAVES.get().getDefaultState()),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }
}
