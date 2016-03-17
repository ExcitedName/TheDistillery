package com.excitedname.thedistillery.storage.drums;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FruJuiHeaVat extends Item {


		public FruJuiHeaVat() {
			
			this.setUnlocalizedName("FruJuiHeaVat");
			this.setTextureName("FruJuiHeaVat");
			this.setCreativeTab(Tabs.StoTab);
		}
		
		public boolean hasEffect(ItemStack par1ComDist, int pass){
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