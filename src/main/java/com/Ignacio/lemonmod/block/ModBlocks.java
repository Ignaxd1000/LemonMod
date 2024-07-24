package com.Ignacio.lemonmod.block;

import com.Ignacio.lemonmod.LemonMod;
import com.Ignacio.lemonmod.block.tree.LemonTree;
import com.Ignacio.lemonmod.item.ModItemGroup;
import com.Ignacio.lemonmod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, LemonMod.MOD_ID);

    public static final RegistryObject<Block> LEMON_SAPLING = RegisterBlock("lemon_sapling",
            () -> new SaplingBlock(new LemonTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> LEMON_LOG = RegisterBlock("lemon_log",
           () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> LEMON_WOOD = RegisterBlock("lemon_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_LEMON_LOG = RegisterBlock("stripped_lemon_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_LEMON_WOOD = RegisterBlock("stripped_lemon_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> LEMON_LEAVES = RegisterBlock("lemon_leaves",
           () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LEMON_PLANKS = RegisterBlock("lemon_planks",
           () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));




    private static <T extends Block>RegistryObject<T> RegisterBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.ModGroup)));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
