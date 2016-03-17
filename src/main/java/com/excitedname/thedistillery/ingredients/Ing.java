package com.excitedname.thedistillery.ingredients;

import com.excitedname.thedistillery.distilleries.juice.DistH2O;
import com.excitedname.thedistillery.distilleries.juice.DistLav;
import com.excitedname.thedistillery.ingredients.glass.Bla;
import com.excitedname.thedistillery.ingredients.glass.Bla;
import com.excitedname.thedistillery.ingredients.glass.Bot;
import com.excitedname.thedistillery.ingredients.glass.CCoi;
import com.excitedname.thedistillery.ingredients.glass.ETu;
import com.excitedname.thedistillery.ingredients.glass.FunT1;
import com.excitedname.thedistillery.ingredients.glass.FunT2;
import com.excitedname.thedistillery.ingredients.glass.GDist;
import com.excitedname.thedistillery.ingredients.glass.GJar;
import com.excitedname.thedistillery.ingredients.lamp.Lamp;
import com.excitedname.thedistillery.ingredients.lamp.LampEx;
import com.excitedname.thedistillery.ingredients.material.ClaJui;
import com.excitedname.thedistillery.ingredients.material.CrafMed;
import com.excitedname.thedistillery.ingredients.material.CrafMedE;
import com.excitedname.thedistillery.ingredients.material.DistCry;
import com.excitedname.thedistillery.ingredients.material.DistShaE;
import com.excitedname.thedistillery.ingredients.material.Frag;
import com.excitedname.thedistillery.ingredients.material.Gem;
import com.excitedname.thedistillery.ingredients.material.Grou;
import com.excitedname.thedistillery.ingredients.material.H2OJar;
import com.excitedname.thedistillery.ingredients.material.HeaEle;
import com.excitedname.thedistillery.ingredients.material.HeaEleT3;
import com.excitedname.thedistillery.ingredients.material.IroRod;
import com.excitedname.thedistillery.ingredients.material.LavJar;
import com.excitedname.thedistillery.ingredients.material.Lily;
import com.excitedname.thedistillery.ingredients.material.LilyE;
import com.excitedname.thedistillery.ingredients.material.SteIng;
import com.excitedname.thedistillery.ingredients.utilities.BBur;
import com.excitedname.thedistillery.ingredients.utilities.BBurT3;
import com.excitedname.thedistillery.ingredients.utilities.CerJui;
import com.excitedname.thedistillery.ingredients.utilities.MandP;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class Ing {
	
	
public static void Util() {
	
		CerJui = new CerJui();
		GameRegistry.registerItem(CerJui, "CerJui");
		
		MandP = new MandP();
		GameRegistry.registerItem(MandP, "MandP");
		
		BBur = new BBur();
		GameRegistry.registerItem(BBur, "BBur");
		
		BBurT3 = new BBurT3();
		GameRegistry.registerItem(BBurT3, "BBurT3");
		
	}
	
	public static Item CerJui;
	public static Item MandP;
	public static Item BBur;
	public static Item BBurT3;
	
	

public static void Glass() {
		
		Bla = new Bla();
		GameRegistry.registerItem(Bla, "Bla");
	
		ETu = new ETu();
		GameRegistry.registerItem(ETu, "ETu");
		
		CCoi = new CCoi();
		GameRegistry.registerItem(CCoi, "CCoi");
		
		FunT1 = new FunT1();
		GameRegistry.registerItem(FunT1, "FunT1");
		
		FunT2 = new FunT2();
		GameRegistry.registerItem(FunT2, "FunT2");
		
		Bot = new Bot();
		GameRegistry.registerItem(Bot, "Bot");
		
		GJar = new GJar(Blocks.air);
		GameRegistry.registerItem(GJar, "GJar");
		
		GDist = new GDist(Blocks.air);
		GameRegistry.registerItem(GDist, "GDist");
		
	}

	public static Item Bla;
	public static Item ETu;
	public static Item CCoi;
	public static Item FunT1;
	public static Item FunT2;
	public static Item Bot;
	public static Item GJar;
	public static Item GDist;
	
	

public static void Material() {
	
		CrafMed = new CrafMed();
		GameRegistry.registerItem(CrafMed, "CrafMed");
		
		CrafMedE = new CrafMedE();
		GameRegistry.registerItem(CrafMedE, "CrafMedE");
	
		ClaJui = new ClaJui();
		GameRegistry.registerItem(ClaJui, "ClaJui");
		
		Ele = new HeaEle();
		GameRegistry.registerItem(Ele, "Ele");
		
		HeaEleT3 = new HeaEleT3();
		GameRegistry.registerItem(HeaEleT3, "HeaEleT3");
		
		SteIng = new SteIng();
		GameRegistry.registerItem(SteIng, "SteIng");
		
		DistCry = new DistCry();
		GameRegistry.registerItem(DistCry, "DistCry");		
		
		Gem = new Gem();
		GameRegistry.registerItem(Gem, "Gem");		
		
		Frag = new Frag();
		GameRegistry.registerItem(Frag, "Frag");		
		
		DistShaE = new DistShaE();
		GameRegistry.registerItem(DistShaE, "DistShaE");		
		
		IroRod = new IroRod();
		GameRegistry.registerItem(IroRod, "IroRod");		
		
		Lily = new Lily();
		GameRegistry.registerItem(Lily, "Lily");
		
		LilyE = new LilyE();
		GameRegistry.registerItem(LilyE, "LilyE");		
		
		Grou = new Grou();
		GameRegistry.registerItem(Grou, "Grou");
		
		H2OJar = new H2OJar(Blocks.flowing_water);
		GameRegistry.registerItem(H2OJar, "H2OJar");
		
		LavJar = new LavJar(Blocks.flowing_lava);
		GameRegistry.registerItem(LavJar, "LavJar");
		
	}

	public static Item CrafMed;
	public static Item CrafMedE;
	public static Item ClaJui;
	public static Item Ele;
	public static Item HeaEleT3;
	public static Item SteIng;
	public static Item DistCry;	
	public static Item Gem;	
	public static Item Frag;		
	public static Item DistShaE;	
	public static Item IroRod;
	public static Item Lily;
	public static Item LilyE;
	public static Item Grou;
	public static Item H2OJar;
	public static Item LavJar;
		
	

public static void Lamp() {
	
		Lamp = new Lamp(Material.iron);
		GameRegistry.registerBlock(Lamp, "Lamp");
	
		LampE = new LampEx(Material.iron);
		GameRegistry.registerBlock(LampE, "LampE");
		
		LampEx = new LampEx(Material.iron);
		GameRegistry.registerBlock(LampEx, "LampEx");
		
	}

	public static Block Lamp;
	public static Block LampE;
	public static Block LampEx;
	

}
