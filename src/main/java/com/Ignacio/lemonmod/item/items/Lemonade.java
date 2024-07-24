package com.Ignacio.lemonmod.item.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class Lemonade extends Item {

    public Lemonade(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity consumer) {
        super.onItemUseFinish(stack, worldIn, consumer);

        if (!worldIn.isRemote) {
            consumer.addPotionEffect(new EffectInstance(Effects.SATURATION, 200));
        }
        if (stack.isEmpty()) {
            return new ItemStack(Items.GLASS_BOTTLE);
        }

        return stack;
    }

    public int getUseDuration(ItemStack stack) {
        return 40;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
    }
}
