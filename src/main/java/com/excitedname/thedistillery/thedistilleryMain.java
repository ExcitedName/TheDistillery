package com.excitedname.thedistillery;

import org.apache.logging.log4j.core.Logger;

import com.excitedname.thedistillery.distilleries.Dis;
import com.excitedname.thedistillery.ingredients.Ing;
import com.excitedname.thedistillery.oredictionary.OreDictionary;
import com.excitedname.thedistillery.proxies.ClientProxy;
import com.excitedname.thedistillery.proxies.CommonProxy;
import com.excitedname.thedistillery.ref.Ref;
import com.excitedname.thedistillery.storage.Sto;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Ref.MOD_NAME, modid = Ref.MOD_ID, version = Ref.MOD_VER)

public class thedistilleryMain {

	
@SidedProxy(clientSide="com.excitedname.thedistillery.proxies.ClientProxy",
			serverSide="com.excitedname.thedistillery.proxies.CommonProxy")

public static ClientProxy proxy;
public static CommonProxy cproxy;

public static Logger Log = (Logger) FMLLog.getLogger();



@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event){
	
	
	Ing.Lamp();
	Dis.Distilleries();
	Dis.ComboDistilleries();
	Dis.EOilSmall();
	Dis.EOilLarge();
	Dis.Juice();
	Dis.Pearls();
	Dis.MRE();
	Ing.Util();
	Ing.Glass();
	Ing.Material();
	Sto.Vat();
	Sto.Barrel();
	
	
	//Logger
			Log.info("The Distillery preInit");
	
	}



@Mod.EventHandler
public void Init(FMLInitializationEvent event){
		
	//Renders	
		proxy.registerPearlRenders();
	
		
	//Ore Dictionary
		OreDictionary.InitOreDictionary();
		
	//Recipes
		Dis.DistRec();
		
		
	//Logger
			Log.info("The Distillery Init");
	}



@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event){		
		
	//Logger		
		Log.info("The Distillery postInit");
	}
	
}
