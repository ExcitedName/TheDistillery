package com.excitedname.thedistillery.ingredients.lamp;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class LampE extends Block {


	public LampE(Material material) {
		super(material.iron);

		this.setBlockName("LampE");
		this.setBlockTextureName("LampE");
		this.setCreativeTab(Tabs.IngTab);
		this.setHardness(0.01F);
		this.setResistance(2000.0F);
		this.setStepSound(soundTypeMetal);
		this.setLightLevel(1.0F);
		this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.01F, 0.625F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	};
	
@Override
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister iconReg) {
	blockIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + (this.getUnlocalizedName()).substring(5));
}
	
}
