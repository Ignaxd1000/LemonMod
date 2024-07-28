package com.Ignacio.lemonmod.item.items;

import net.minecraft.item.Food;

public class ModFoods{

    // Foods that only reguire a builder are declared here and registered in the ModItems class
    public static final Food LEMON = (new Food.Builder().hunger(1).saturation(0.2f)).build();
    public static final Food LEMON_POSSET = (new Food.Builder().hunger(6).saturation(0.4f).build());
    public static final Food LEMON_PIE = (new Food.Builder().hunger(9).saturation(0.7f).build());
}
