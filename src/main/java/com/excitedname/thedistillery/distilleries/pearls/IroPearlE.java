package com.excitedname.thedistillery.distilleries.pearls;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.entities.EntIroPearlE;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IroPearlE extends Item {

	
	public IroPearlE() {
		
		this.setUnlocalizedName("IroPearlE");
		this.setTextureName("IroPearlE");
		this.setCreativeTab(Tabs.DisTab);
	}
	
	public boolean hasEffect(ItemStack par1IroPearlE, int pass){
		return true;
	}
	
	public ItemStack onItemRightClick(ItemStack par1IroPearlE, World par2World, EntityPlayer par3Player)
    {
        if (!par3Player.capabilities.isCreativeMode)
        {
            --par1IroPearlE.stackSize;
        }

        par2World.playSoundAtEntity(par3Player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
        	par2World.spawnEntityInWorld(new EntIroPearlE(par2World, par3Player));
        }

        return par1IroPearlE;
    }
	

//Texture Icon	

	@Override
	@SideOnly(Side.CLIENT)
		
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
}
