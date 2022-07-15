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
	public static final Item COTTON = new MiscellaneousiBase("cotton");
	public static final Item MARIJUANA = new MiscellaneousiBase("marijuana");
	public static final Item RAW_RICE = new MiscellaneousiBase("raw_rice");
	public static final Item COFFEE_BEANS = new MiscellaneousiBase("coffee_beans");
	
	//Foodstuffs Tab
	
	public static final Item CORN = new FoodstuffsBase("corn", 3, false);
	public static final Item POPCORN = new FoodstuffsBase("popcorn", 4, false);
	public static final Item TOMATO = new FoodstuffsBase("tomato", 3, false);
	public static final Item EGGPLANT = new FoodstuffsBase("eggplant", -1, false);
	public static final Item LETTUCE = new FoodstuffsBase("lettuce", 1, false);
	public static final Item PEANUTS = new FoodstuffsBase("peanuts", 1, false);
	
	//Tools Tab
	
	//Combat Tab
	

	
}
