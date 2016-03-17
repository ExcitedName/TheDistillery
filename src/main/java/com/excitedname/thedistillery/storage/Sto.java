package com.excitedname.thedistillery.storage;

import com.excitedname.thedistillery.storage.drums.Barrel;
import com.excitedname.thedistillery.storage.drums.BoneBar;
import com.excitedname.thedistillery.storage.drums.DistCryBar;
import com.excitedname.thedistillery.storage.drums.DistCryEBar;
import com.excitedname.thedistillery.storage.drums.DraEVat;
import com.excitedname.thedistillery.storage.drums.Vat;
import com.excitedname.thedistillery.storage.drums.FlourBar;
import com.excitedname.thedistillery.storage.drums.FruJuiHeaVat;
import com.excitedname.thedistillery.storage.drums.FruJuiVat;
import com.excitedname.thedistillery.storage.drums.GlassBar;
import com.excitedname.thedistillery.storage.drums.H2OVat;
import com.excitedname.thedistillery.storage.drums.KraEVat;
import com.excitedname.thedistillery.storage.drums.LavVat;
import com.excitedname.thedistillery.storage.drums.LilyBar;
import com.excitedname.thedistillery.storage.drums.LilyEBar;
import com.excitedname.thedistillery.storage.drums.SugBar;
import com.excitedname.thedistillery.storage.drums.WPulpBar;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Sto {
	
	
public static void Vat() {
	
	Vat = new Vat();
	GameRegistry.registerItem(Vat, "Vat");
	
	KraVat = new KraEVat();
	GameRegistry.registerItem(KraVat, "KraVat");
	
	DraVat = new DraEVat();
	GameRegistry.registerItem(DraVat, "DraVat");
	
	FruJuiVat = new FruJuiVat();
	GameRegistry.registerItem(FruJuiVat, "FruJuiVat");
	
	FruJuiHeaVat = new FruJuiHeaVat();
	GameRegistry.registerItem(FruJuiHeaVat, "FruJuiHeaVat");
	
	H2OVat = new H2OVat();
	GameRegistry.registerItem(H2OVat, "H2OVat");
	
	LavVat = new LavVat();
	GameRegistry.registerItem(LavVat, "LavVat");
	
}
		
	public static Item Vat;
	public static Item KraVat;
	public static Item DraVat;
	public static Item FruJuiVat;
	public static Item FruJuiHeaVat;
	public static Item H2OVat;
	public static Item LavVat;	
	
	
	
public static void Barrel() {
		
		Barrel = new Barrel();
		GameRegistry.registerItem(Barrel, "Barrel");
	
		GlassBar = new GlassBar();
		GameRegistry.registerItem(GlassBar, "GlassBar");
		
		BoneBar = new BoneBar();
		GameRegistry.registerItem(BoneBar, "BoneBar");
		
		DistCryBar = new DistCryBar();
		GameRegistry.registerItem(DistCryBar, "DistCryBar");
		
		DistCryEBar = new DistCryEBar();
		GameRegistry.registerItem(DistCryEBar, "DistCryEBar");
		
		LilyBar = new LilyBar();
		GameRegistry.registerItem(LilyBar, "LilyBar");
		
		LilyEBar = new LilyEBar();
		GameRegistry.registerItem(LilyEBar, "LilyEBar");
		
		FlourBar = new FlourBar();
		GameRegistry.registerItem(FlourBar, "FlourBar");
		
		SugBar = new SugBar();
		GameRegistry.registerItem(SugBar, "SugBar");
		
		WPulpBar = new WPulpBar();
		GameRegistry.registerItem(WPulpBar, "WPulpBar");
		
	}
	
	public static Item Barrel;
	public static Item GlassBar;
	public static Item BoneBar;
	public static Item DistCryBar;
	public static Item DistCryEBar;
	public static Item LilyBar;
	public static Item LilyEBar;
	public static Item FlourBar;
	public static Item SugBar;
	public static Item WPulpBar;
	
}














