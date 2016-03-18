package com.excitedname.thedistillery.ingredients.material;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LilyE extends Item {

	public LilyE() {
		
		this.setUnlocalizedName("LilyE");
		this.setTextureName("LilyE");
		this.setCreativeTab(Tabs.IngTab);
	}
	
	public boolean hasEffect(ItemStack par1LilyE, int pass){
		return true;
	}

//Texture Icon	

@Override
@SideOnly(Side.CLIENT)
	
public void registerIcons(IIconRegister iconReg){
	itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
		.substring(this.getUnlocalizedName().indexOf(".")+1));
}
			
}
