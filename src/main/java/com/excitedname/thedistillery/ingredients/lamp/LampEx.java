package com.excitedname.thedistillery.ingredients.lamp;

import java.util.Random;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LampEx extends Block {

	public LampEx(Material material) {
		super(material.iron);

		this.setBlockName("LampEx");
		this.setBlockTextureName("LampEx");
		this.setCreativeTab(Tabs.IngTab);
		this.setHardness(0.01F);
		this.setResistance(2000.0F);
		this.setStepSound(soundTypeMetal);
		this.setLightLevel(1.0F);
		this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.01F, 0.625F);
		
	}
	
	public boolean hasEffect(ItemStack par1ComDist, int pass){
		return true;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	};
	    
	 @SideOnly(Side.CLIENT)
	 public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	    {
	        int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
	        double d0 = (double)((float)p_149734_2_ + 0.5F);
	        double d1 = (double)((float)p_149734_3_ + 0.7F);
	        double d2 = (double)((float)p_149734_4_ + 0.5F);
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;

	        if (l == 1)
	        {
	            p_149734_1_.spawnParticle("portal", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d2 - d4, d2 + d4, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 2)
	        {
	            p_149734_1_.spawnParticle("portal", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d2 - d4, d2 + d4, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 3)
	        {
	            p_149734_1_.spawnParticle("portal", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d0, d2 + d4, d3 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 4)
	        {
	            p_149734_1_.spawnParticle("portal", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d0, d2 + d4, d3 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else
	        {
	            p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
	        }
	    }
	 
	 @Override
		@SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister iconReg) {
			blockIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + (this.getUnlocalizedName()).substring(5));
		}
	 
}
