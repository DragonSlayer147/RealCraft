package com.realcraft.thefatherkaz.objects.items;

import com.realcraft.thefatherkaz.RealCraft;
import com.realcraft.thefatherkaz.init.ItemInit;
import com.realcraft.thefatherkaz.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name){
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {

		RealCraft.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
