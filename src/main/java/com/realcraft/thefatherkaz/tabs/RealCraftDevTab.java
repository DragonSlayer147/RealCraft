package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftDevTab extends CreativeTabs
{
	public RealCraftDevTab(String label)
	{
		super("realcraftdevtab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.CORN);
	}
}
