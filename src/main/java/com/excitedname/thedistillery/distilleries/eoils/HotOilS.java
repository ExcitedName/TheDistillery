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

public class HotOilS extends Item {

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

	//Declaration (Boolean)}

		public HotOilS() {
			
			this.setUnlocalizedName("HotOilS");
			this.setTextureName("HotOilS");
			this.setCreativeTab(Tabs.DisTab);
			this.setFirstPotionEffect(Potion.fireResistance.id, 20, 0, 1F);
			this.setSecondPotionEffect(Potion.moveSpeed.id, 20, 1, 1F);
			this.setThirdPotionEffect(Potion.harm.id, 1, 0, 1F);
			
		}
		
public ItemStack onEaten(ItemStack par1HotOilS, World par2World, EntityPlayer par3EntityPlayer){
	super.onEaten(par1HotOilS,  par2World,  par3EntityPlayer);
	
	if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1HotOilS.stackSize;
    }
	
	if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 540, this.FirstPotionAmplifier));
	}
	
	if (!par2World.isRemote && this.SecondPotionid > 0 && par2World.rand.nextFloat() < this.SecondPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.SecondPotionid, this.SecondPotionDuration * 30, this.SecondPotionAmplifier));
	}
	
	if (!par2World.isRemote && this.ThirdPotionid > 0 && par2World.rand.nextFloat() < this.ThirdPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.ThirdPotionid, this.ThirdPotionDuration * 1, this.ThirdPotionAmplifier));
	}
	
	return par1HotOilS;
	
 }
		
public int getMaxItemUseDuration(ItemStack par1HotOilS)
{
    return 14;
}

public EnumAction getItemUseAction(ItemStack par1HotOilS)
{
    return EnumAction.drink;
}

public ItemStack onItemRightClick(ItemStack par1HotOilS, World par2World, EntityPlayer par3EntityPlayer)
{
	par3EntityPlayer.setItemInUse(par1HotOilS, this.getMaxItemUseDuration(par1HotOilS));
    return par1HotOilS;
	
}

public HotOilS setFirstPotionEffect(int par1, int par2, int par3, float par4){
	
	this.FirstPotionid = par1;
	this.FirstPotionDuration = par2;
	this.FirstPotionAmplifier = par3;
	this.FirstPotionEffectProbability = par4;
	return this;			
}

public HotOilS setSecondPotionEffect(int par1, int par2, int par3, float par4){
	
	this.SecondPotionid = par1;
	this.SecondPotionDuration = par2;
	this.SecondPotionAmplifier = par3;
	this.SecondPotionEffectProbability = par4;
	return this;			
}

public HotOilS setThirdPotionEffect(int par1, int par2, int par3, float par4){
	
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
