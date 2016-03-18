package com.excitedname.thedistillery.distilleries.eoils;

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

public class MinOilS extends Item {

	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;
	
	public int SecondPotionid;
	public int SecondPotionDuration;
	public int SecondPotionAmplifier;
	public float SecondPotionEffectProbability;
	

	//Declaration 

		public MinOilS() {
			
			this.setUnlocalizedName("MinOilS");
			this.setTextureName("MinOilS");
			this.setCreativeTab(Tabs.DisTab);
			this.setFirstPotionEffect(Potion.digSpeed.id, 20, 1, 1F);
			this.setSecondPotionEffect(Potion.nightVision.id, 20, 1, 1F);
		}
		
public ItemStack onEaten(ItemStack par1MinOilS, World par2World, EntityPlayer par3EntityPlayer){
	super.onEaten(par1MinOilS,  par2World,  par3EntityPlayer);
	
	if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1MinOilS.stackSize;
    }
	
	if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 540, this.FirstPotionAmplifier));
	}
	return par1MinOilS;
}

public int getMaxItemUseDuration(ItemStack par1MinOilS)
{
    return 12;
}

public EnumAction getItemUseAction(ItemStack par1MinOilS)
{
    return EnumAction.eat;
}

public ItemStack onItemRightClick(ItemStack par1MinOilS, World par2World, EntityPlayer par3EntityPlayer)
{
	par3EntityPlayer.setItemInUse(par1MinOilS, this.getMaxItemUseDuration(par1MinOilS));
    return par1MinOilS;
	
}

public MinOilS setFirstPotionEffect(int par1, int par2, int par3, float par4){
	
	this.FirstPotionid = par1;
	this.FirstPotionDuration = par2;
	this.FirstPotionAmplifier = par3;
	this.FirstPotionEffectProbability = par4;
	return this;			
}

public MinOilS setSecondPotionEffect(int par1, int par2, int par3, float par4){
	
	this.SecondPotionid = par1;
	this.SecondPotionDuration = par2;
	this.SecondPotionAmplifier = par3;
	this.SecondPotionEffectProbability = par4;
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
