package com.realcraft.thefatherkaz;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import com.realcraft.thefatherkaz.proxy.CommonProxy;
import com.realcraft.thefatherkaz.util.Reference;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class RealCraft {

	@Instance
	public static RealCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
	}
	public void init(FMLInitializationEvent event)
	{
		
		
	}
	public void postInit(FMLPostInitializationEvent event)
	{
		
		
	}

	@EventHandler
	public void serverInit(FMLServerStartingEvent event) {}
}
