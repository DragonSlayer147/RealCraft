package com.realcraft.thefatherkaz.objects.blocks;

import com.realcraft.thefatherkaz.util.interfaces.IHasModel;

import net.minecraft.block.Block;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase()
	{
		ItemInit.ITEMS.add(new ItemBlock(this.getRegistryName(this.setRegistryName(name))))
	}
	
	
}
