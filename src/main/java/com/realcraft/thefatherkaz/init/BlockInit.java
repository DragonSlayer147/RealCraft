package com.realcraft.thefatherkaz.init;

import java.util.ArrayList;
import java.util.List;

import com.realcraft.thefatherkaz.objects.blocks.BlockBase;
import com.realcraft.thefatherkaz.objects.blocks.BuildingBlocksBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//DevTab
	
	//Building Blocks
	public static final Block BRONZE_BLOCK = new BuildingBlocksBase("bronze_block", Material.IRON);
}
