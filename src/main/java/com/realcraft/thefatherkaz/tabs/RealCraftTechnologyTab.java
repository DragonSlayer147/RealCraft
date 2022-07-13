package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftTechnologyTab extends CreativeTabs
{
	public RealCraftTechnologyTab(String label)
	{
		super("realcrafttechnologytab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(ItemInit.CORN);
	}
}
