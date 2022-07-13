package com.realcraft.thefatherkaz.recipes;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(ItemInit.RAW_COPPER), new ItemStack(ItemInit.COPPER_INGOT), 0.4F);
	}
}
