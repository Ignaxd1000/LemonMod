package com.Ignacio.lemonmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ModGroup = new ItemGroup("groupModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LEMON.get());
        }
    };
}
