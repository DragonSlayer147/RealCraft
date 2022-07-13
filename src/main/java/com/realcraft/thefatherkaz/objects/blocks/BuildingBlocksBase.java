package com.realcraft.thefatherkaz.objects.blocks;

import com.realcraft.thefatherkaz.RealCraft;
import com.realcraft.thefatherkaz.init.BlockInit;
import com.realcraft.thefatherkaz.init.ItemInit;
import com.realcraft.thefatherkaz.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BuildingBlocksBase extends Block implements IHasModel
{
	public BuildingBlocksBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RealCraft.REALCRAFTBUILDINGBLOCKSTAB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		RealCraft.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
