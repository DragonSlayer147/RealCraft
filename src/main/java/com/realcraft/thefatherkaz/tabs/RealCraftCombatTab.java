package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftCombatTab extends CreativeTabs
{
	public RealCraftCombatTab(String label)
	{
		super("realcraftcombattab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(ItemInit.CORN);
	}
}
