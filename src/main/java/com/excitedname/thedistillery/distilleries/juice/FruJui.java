package com.excitedname.thedistillery.distilleries.juice;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FruJui extends Item {
	
	private static final String __OBFID = "clearActivePotions";
	
	 
	public FruJui() {
				
		this.setUnlocalizedName("FruJui");
		this.setTextureName("FruJui");
		this.setCreativeTab(Tabs.DisTab);

	}

	public ItemStack onEaten(ItemStack par1FruJui, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1FruJui.stackSize;
        }
       
        if (!par2World.isRemote)
        {
        	par3EntityPlayer.clearActivePotions();
        }

        return par1FruJui;
    }

    public int getMaxItemUseDuration(ItemStack par1FruJui)
    {
        return 14;
    }

    public EnumAction getItemUseAction(ItemStack par1FruJui)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack par1FruJui, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1FruJui, this.getMaxItemUseDuration(par1FruJui));
        return par1FruJui;
    }
    
    public Item getContainerItem()
    {
        return this.getContainerItem();
        
	}
        
	
//Texture Icon
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
}
