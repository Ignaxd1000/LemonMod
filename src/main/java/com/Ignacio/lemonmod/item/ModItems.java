package com.Ignacio.lemonmod.item;

import com.Ignacio.lemonmod.item.items.Brochette;
import com.Ignacio.lemonmod.item.items.Lemonade;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.Ignacio.lemonmod.LemonMod;
import com.Ignacio.lemonmod.item.items.ModFoods;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LemonMod.MOD_ID);


    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().group(ModItemGroup.ModGroup).food(ModFoods.Lemon)));

    public static final RegistryObject<Item> LEMONADE = ITEMS.register("lemonade",
            () -> new Lemonade(new Item.Properties().group(ModItemGroup.ModGroup).maxStackSize(1)));

    public static final RegistryObject<Item> BROCHETTE = ITEMS.register("lemon_brochette",
            () -> new Brochette(ItemTier.WOOD, 2, -1.6f,
                    new Item.Properties().group(ModItemGroup.ModGroup).maxStackSize(1).maxDamage(1)));



    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
