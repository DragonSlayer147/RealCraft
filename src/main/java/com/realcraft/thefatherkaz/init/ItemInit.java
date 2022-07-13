package com.realcraft.thefatherkaz.init;

import java.util.ArrayList;
import java.util.List;

import com.realcraft.thefatherkaz.objects.items.food.FoodstuffsBase;
import com.realcraft.thefatherkaz.objects.items.ItemBase;
import com.realcraft.thefatherkaz.objects.items.MiscellaneousiBase;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Dev Tab
	
	//Technology Tab
	
	//Transportation Tab
	
	//Miscellaneous Tab
	
	public static final Item BUTTER = new MiscellaneousiBase("butter");
	public static final Item COPPER_INGOT = new MiscellaneousiBase("copper_ingot");
	public static final Item RAW_COPPER = new MiscellaneousiBase("raw_copper");
	public static final Item ROCK = new MiscellaneousiBase("rock");
	
	//Foodstuffs Tab
	
	public static final Item CORN = new FoodstuffsBase("corn", 3, false);
	public static final Item POPCORN = new FoodstuffsBase("popcorn", 4, false);
	
	//Tools Tab
	
	//Combat Tab
	

	
}
