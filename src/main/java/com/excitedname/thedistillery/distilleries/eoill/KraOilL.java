package com.excitedname.thedistillery.distilleries.eoill;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class KraOilL extends Item {
	
	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;

	public int SecondPotionid;
	public int SecondPotionDuration;
	public int SecondPotionAmplifier;
	public float SecondPotionEffectProbability;
	
	public int ThirdPotionid;
	public int ThirdPotionDuration;
	public int ThirdPotionAmplifier;
	public float ThirdPotionEffectProbability;

		public KraOilL() {
			
			this.setUnlocalizedName("KraOilL");
			this.setTextureName("KraOilL");
			this.setCreativeTab(Tabs.DisTab);
			this.setFirstPotionEffect(Potion.waterBreathing.id, 20, 3, 1F);
			this.setSecondPotionEffect(Potion.nightVision.id, 20, 3, 1F);
			this.setThirdPotionEffect(Potion.digSpeed.id, 20, 3, 1F);
		}
		
public boolean hasEffect(ItemStack par1KraOilL, int pass){
	return true;
}

public ItemStack onEaten(ItemStack par1KraOilL, World par2World, EntityPlayer par3EntityPlayer){
	super.onEaten(par1KraOilL,  par2World,  par3EntityPlayer);
	
	if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1KraOilL.stackSize;
    }
	
	if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 540, this.FirstPotionAmplifier));
	}
	
	if (!par2World.isRemote && this.SecondPotionid > 0 && par2World.rand.nextFloat() < this.SecondPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.SecondPotionid, this.SecondPotionDuration * 540, this.SecondPotionAmplifier));
	}
	
	if (!par2World.isRemote && this.ThirdPotionid > 0 && par2World.rand.nextFloat() < this.ThirdPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.ThirdPotionid, this.ThirdPotionDuration * 540, this.ThirdPotionAmplifier));
	}
	
	return par1KraOilL;
}

public int getMaxItemUseDuration(ItemStack par1KraOilL)
{
    return 12;
}

public EnumAction getItemUseAction(ItemStack par1KraOilL)
{
    return EnumAction.eat;
}

public ItemStack onItemRightClick(ItemStack par1KraOilL, World par2World, EntityPlayer par3EntityPlayer)
{
	par3EntityPlayer.setItemInUse(par1KraOilL, this.getMaxItemUseDuration(par1KraOilL));
    return par1KraOilL;
	
}
		
public KraOilL setFirstPotionEffect(int par1, int par2, int par3, float par4){
	
	this.FirstPotionid = par1;
	this.FirstPotionDuration = par2;
	this.FirstPotionAmplifier = par3;
	this.FirstPotionEffectProbability = par4;
	return this;			
}

public KraOilL setSecondPotionEffect(int par1, int par2, int par3, float par4){
	
	this.SecondPotionid = par1;
	this.SecondPotionDuration = par2;
	this.SecondPotionAmplifier = par3;
	this.SecondPotionEffectProbability = par4;
	return this;			
}

public KraOilL setThirdPotionEffect(int par1, int par2, int par3, float par4){
	
	this.ThirdPotionid = par1;
	this.ThirdPotionDuration = par2;
	this.ThirdPotionAmplifier = par3;
	this.ThirdPotionEffectProbability = par4;
	return this;			
}

//Texture Icon	

@Override
@SideOnly(Side.CLIENT)
	
public void registerIcons(IIconRegister iconReg){
	itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
		.substring(this.getUnlocalizedName().indexOf(".")+1));
}
			
}
