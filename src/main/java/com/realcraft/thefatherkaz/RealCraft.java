package com.realcraft.thefatherkaz;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import com.realcraft.thefatherkaz.proxy.CommonProxy;
import com.realcraft.thefatherkaz.recipes.SmeltingRecipes;
import com.realcraft.thefatherkaz.tabs.RealCraftBuildingBlocksTab;
import com.realcraft.thefatherkaz.tabs.RealCraftCombatTab;
import com.realcraft.thefatherkaz.tabs.RealCraftDecorationBlocksTab;
import com.realcraft.thefatherkaz.tabs.RealCraftDevTab;
import com.realcraft.thefatherkaz.tabs.RealCraftFoodstuffsTab;
import com.realcraft.thefatherkaz.tabs.RealCraftMedicineTab;
import com.realcraft.thefatherkaz.tabs.RealCraftMiscellaneousTab;
import com.realcraft.thefatherkaz.tabs.RealCraftTechnologyTab;
import com.realcraft.thefatherkaz.tabs.RealCraftToolsTab;
import com.realcraft.thefatherkaz.tabs.RealCraftTransportationTab;
import com.realcraft.thefatherkaz.util.Reference;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class RealCraft 
{
	@Instance
	public static RealCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs REALCRAFTBUILDINGBLOCKSTAB = new RealCraftBuildingBlocksTab("realcraftbuildingblockstab");
	public static final CreativeTabs REALCRAFTDECORATIONBLOCKSTAB = new RealCraftDecorationBlocksTab("realcraftdecorationblockstab");
	public static final CreativeTabs REALCRAFTTECHNOLOGYTAB = new RealCraftTechnologyTab("realcrafttechnologytab");
	public static final CreativeTabs REALCRAFTTRANSPORTATIONTAB = new RealCraftTransportationTab("realcrafttransportationtab");
	public static final CreativeTabs REALCRAFTMISCELLANEOUSTAB = new RealCraftMiscellaneousTab("realcraftmiscellaneoustab");
	public static final CreativeTabs REALCRAFTFOODSTUFFSTAB = new RealCraftFoodstuffsTab("realcraftfoodstuffstab");
	public static final CreativeTabs REALCRAFTTOOLSTAB = new RealCraftToolsTab("realcrafttoolstab");
	public static final CreativeTabs REALCRAFTCOMBATTAB = new RealCraftCombatTab("realcraftcombattab");
	public static final CreativeTabs REALCRAFTMEDICINETAB = new RealCraftMedicineTab("realcreaftmedicinetab");
	
	public static final CreativeTabs REALCRAFTDEVTAB = new RealCraftDevTab("realcraftdevtab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		SmeltingRecipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

	@EventHandler
	public void serverInit(FMLServerStartingEvent event) 
	{
		
	}
}
