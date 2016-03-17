package com.excitedname.thedistillery.distilleries.pearls;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.entities.EntIroPearl;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IroPearl extends Item {

	
	public IroPearl() {
		
		this.setUnlocalizedName("IroPearl");
		this.setTextureName("IroPearl");
		this.setCreativeTab(Tabs.DisTab);
	}
		
	
	public ItemStack onItemRightClick(ItemStack par1IroPearl, World par2World, EntityPlayer par3Player)
    {
        if (!par3Player.capabilities.isCreativeMode)
        {
            --par1IroPearl.stackSize;
        }

        par2World.playSoundAtEntity(par3Player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
        	par2World.spawnEntityInWorld(new EntIroPearl(par2World, par3Player));
        }

        return par1IroPearl;
    }
	

//Texture Icon	

	@Override
	@SideOnly(Side.CLIENT)
		
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
}
