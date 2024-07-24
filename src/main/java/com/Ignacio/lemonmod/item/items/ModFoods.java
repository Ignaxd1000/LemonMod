package com.Ignacio.lemonmod.item.items;

import net.minecraft.item.Food;

public class ModFoods{

    public static final Food Lemon = (new Food.Builder().hunger(1).saturation(0.2f)).build();

    public static final Food Lemonade = (new Food.Builder().hunger(7).saturation(0.7f).fastToEat()).build();
}
