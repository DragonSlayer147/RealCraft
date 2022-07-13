package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftToolsTab extends CreativeTabs
{
	public RealCraftToolsTab(String label)
	{
		super("realcrafttoolstab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(ItemInit.CORN);
	}
}
