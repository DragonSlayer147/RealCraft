package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftBuildingBlocksTab extends CreativeTabs
{
	public RealCraftBuildingBlocksTab(String label)
	{
		super("realcraftbuildingblockstab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(BlockInit.BRONZE_BLOCK);
	}
}
