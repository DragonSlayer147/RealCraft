package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftFoodstuffsTab extends CreativeTabs
{
	public RealCraftFoodstuffsTab(String label)
	{
		super("realcraftfoodstuffstab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(ItemInit.CORN);
	}
}
