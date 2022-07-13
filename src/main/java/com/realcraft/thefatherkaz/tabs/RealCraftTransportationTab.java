package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftTransportationTab extends CreativeTabs
{
	public RealCraftTransportationTab(String label)
	{
		super("realcrafttransportationtab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(ItemInit.CORN);
	}
}
