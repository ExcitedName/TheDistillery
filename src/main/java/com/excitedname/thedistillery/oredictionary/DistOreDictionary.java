package com.excitedname.thedistillery.oredictionary;

import com.excitedname.thedistillery.ingredients.Ing;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DistOreDictionary {

	public static void InitDistOreDictionary() {
				
		OreDictionary.registerOre("shardDiamond", new ItemStack(Ing.Frag, 3, 3));
		
		OreDictionary.registerOre("shardEmerald", new ItemStack(Ing.Frag, 2, 2));
		
		OreDictionary.registerOre("nuggetIron", new ItemStack(Ing.Frag, 1, 1));
		
		OreDictionary.registerOre("foodFlour", new ItemStack(Ing.Grou, 0, 0));
		
		OreDictionary.registerOre("ingotSteel", new ItemStack(Ing.SteIng));
		
	}
	
}
