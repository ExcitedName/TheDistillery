package com.excitedname.thedistillery.distilleries;

import com.excitedname.thedistillery.distilleries.dist.ComDist;
import com.excitedname.thedistillery.distilleries.dist.Dist;
import com.excitedname.thedistillery.distilleries.eoill.DraOilL;
import com.excitedname.thedistillery.distilleries.eoill.HeaOilL;
import com.excitedname.thedistillery.distilleries.eoill.HotOilL;
import com.excitedname.thedistillery.distilleries.eoill.IroOilL;
import com.excitedname.thedistillery.distilleries.eoill.KraOilL;
import com.excitedname.thedistillery.distilleries.eoill.MinOilL;
import com.excitedname.thedistillery.distilleries.eoill.TraOilL;
import com.excitedname.thedistillery.distilleries.eoill.WarOilL;
import com.excitedname.thedistillery.distilleries.eoill.WatOilL;
import com.excitedname.thedistillery.distilleries.eoils.DraOilS;
import com.excitedname.thedistillery.distilleries.eoils.HeaOilS;
import com.excitedname.thedistillery.distilleries.eoils.HotOilS;
import com.excitedname.thedistillery.distilleries.eoils.IroOilS;
import com.excitedname.thedistillery.distilleries.eoils.KraOilS;
import com.excitedname.thedistillery.distilleries.eoils.MinOilS;
import com.excitedname.thedistillery.distilleries.eoils.TraOilS;
import com.excitedname.thedistillery.distilleries.eoils.WarOilS;
import com.excitedname.thedistillery.distilleries.eoils.WatOilS;
import com.excitedname.thedistillery.distilleries.juice.DistH2O;
import com.excitedname.thedistillery.distilleries.juice.DistLav;
import com.excitedname.thedistillery.distilleries.juice.FruJui;
import com.excitedname.thedistillery.distilleries.juice.FruJuiHea;
import com.excitedname.thedistillery.distilleries.mres.MRE;
import com.excitedname.thedistillery.distilleries.pearls.IroPearl;
import com.excitedname.thedistillery.distilleries.pearls.IroPearlE;
import com.excitedname.thedistillery.entities.EntIroPearl;
import com.excitedname.thedistillery.entities.EntIroPearlE;
import com.excitedname.thedistillery.ingredients.Ing;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Dis {

	
public static void Distilleries() {
	
	Dist = new Dist();
	GameRegistry.registerItem(Dist, "Dist");
		
}
	
	public static Item Dist;
	
	
public static void ComboDistilleries() {
	
	ComDist = new ComDist();
	GameRegistry.registerItem(ComDist, "ComDist");
	
}
	
	public static Item ComDist;
	
	
	
public static void DistRec() {
	
//Miner
	GameRegistry.addShapedRecipe(new ItemStack(Dis.Dist, 1, 1), new Object []{
		"D",
		"J",
		
			'D', Ing.GDist, 'J', Ing.H2OJar
	});
	
} 


	
public static void EOilSmall() {
	
	MinOilS = new MinOilS();
	GameRegistry.registerItem(MinOilS, "MinOilS");
	
	TraOilS = new TraOilS();
	GameRegistry.registerItem(TraOilS, "TraOilS");
	
	IroOilS = new IroOilS();
	GameRegistry.registerItem(IroOilS, "IroOilS");
	
	WarOilS = new WarOilS();
	GameRegistry.registerItem(WarOilS, "WarOilS");
	
	HeaOilS = new HeaOilS();
	GameRegistry.registerItem(HeaOilS, "HeaOilS");
	
	WatOilS = new WatOilS();
	GameRegistry.registerItem(WatOilS, "WatOilS");
	
	HotOilS = new HotOilS();
	GameRegistry.registerItem(HotOilS, "HotOilS");
	
	KraOilS = new KraOilS();
	GameRegistry.registerItem(KraOilS, "KraOilS");
	
	DraOilS = new DraOilS();
	GameRegistry.registerItem(DraOilS, "DraOilS");	
	
}
	
	public static Item MinOilS;
	public static Item TraOilS;
	public static Item IroOilS;
	public static Item WarOilS;
	public static Item HeaOilS;
	public static Item WatOilS;
	public static Item HotOilS;
	public static Item KraOilS;
	public static Item DraOilS;
	
	
	
public static void EOilLarge() {
	
	MinOilL = new MinOilL();
	GameRegistry.registerItem(MinOilL, "MinOilL");
	
	TraOilL = new TraOilL();
	GameRegistry.registerItem(TraOilL, "TraOilL");
	
	IroOilL = new IroOilL();
	GameRegistry.registerItem(IroOilL, "IroOilL");
	
	WarOilL = new WarOilL();
	GameRegistry.registerItem(WarOilL, "WarOilL");
	
	HeaOilL = new HeaOilL();
	GameRegistry.registerItem(HeaOilL, "HeaOilL");
	
	WatOilL = new WatOilL();
	GameRegistry.registerItem(WatOilL, "WatOilL");
	
	HotOilL = new HotOilL();
	GameRegistry.registerItem(HotOilL, "HotOilL");
	
	KraOilL = new KraOilL();
	GameRegistry.registerItem(KraOilL, "KraOilL");
	
	DraOilL = new DraOilL();
	GameRegistry.registerItem(DraOilL, "DraOilL");
	
}
	
	public static Item MinOilL;
	public static Item TraOilL;
	public static Item IroOilL;
	public static Item WarOilL;
	public static Item HeaOilL;
	public static Item WatOilL;
	public static Item HotOilL;
	public static Item KraOilL;
	public static Item DraOilL;	
	
	
	
public static void Juice() {
	
	DistH2O = new DistH2O(Blocks.flowing_water);
	GameRegistry.registerItem(DistH2O, "DistH2O");
	
	DistLav = new DistLav(Blocks.flowing_lava);
	GameRegistry.registerItem(DistLav, "DistLav");
	
	FruJui = new FruJui();
	GameRegistry.registerItem(FruJui, "FruJui");
	
	FruJuiHea = new FruJuiHea();
	GameRegistry.registerItem(FruJuiHea, "FruJuiHea");
	
}	

	public static Item DistH2O;
	public static Item DistLav;
	public static Item FruJui;
	public static Item FruJuiHea;
	
	
	
public static void Pearls() {
	
	IroPearl = new IroPearl();
	GameRegistry.registerItem(IroPearl, "IroPearl");
	EntityRegistry.registerModEntity(EntIroPearl.class, "EntityGelatinPearl", 0, Ref.MOD_ID, 80, 3, true);
	
	IroPearlE = new IroPearlE();
	GameRegistry.registerItem(IroPearlE, "IroPearlE");
	EntityRegistry.registerModEntity(EntIroPearlE.class, "EntityGelatinPearl", 0, Ref.MOD_ID, 80, 3, true);
	
}	

	public static Item IroPearl;
	public static Item IroPearlE;
	
	
	
public static void MRE() {
	
	MRE = new MRE();
	GameRegistry.registerItem(MRE, "MRE");
	
}

	public static Item MRE;
	
}














