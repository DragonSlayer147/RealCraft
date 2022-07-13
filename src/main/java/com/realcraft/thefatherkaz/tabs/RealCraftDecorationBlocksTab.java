package com.realcraft.thefatherkaz.tabs;

import com.realcraft.thefatherkaz.init.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RealCraftDecorationBlocksTab extends CreativeTabs
{
	public RealCraftDecorationBlocksTab(String label)
	{
		super("realcraftdecorationblockstab");
		this.setBackgroundImageName("realcraft.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new 	ItemStack(BlockInit.BRONZE_BLOCK);
	}
}
