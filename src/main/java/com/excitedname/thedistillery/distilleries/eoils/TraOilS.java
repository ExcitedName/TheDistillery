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

public class TraOilS extends Item {

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

		public TraOilS() {
			
			this.setUnlocalizedName("TraOilS");
			this.setTextureName("TraOilS");
			this.setCreativeTab(Tabs.DisTab);
			this.setFirstPotionEffect(Potion.jump.id, 20, 0, 1F);
			this.setSecondPotionEffect(Potion.moveSpeed.id, 20, 0, 1F);
			this.setThirdPotionEffect(Potion.nightVision.id, 20, 1, 1F);
		}
		
public ItemStack onEaten(ItemStack par1TraOilS, World par2World, EntityPlayer par3EntityPlayer){
	super.onEaten(par1TraOilS,  par2World,  par3EntityPlayer);
	
	if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1TraOilS.stackSize;
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
	
	return par1TraOilS;
	
 }

public int getMaxItemUseDuration(ItemStack par1TraOilS)
{
    return 12;
}

public EnumAction getItemUseAction(ItemStack par1TraOilS)
{
    return EnumAction.eat;
}

public ItemStack onItemRightClick(ItemStack par1TraOilS, World par2World, EntityPlayer par3EntityPlayer)
{
	par3EntityPlayer.setItemInUse(par1TraOilS, this.getMaxItemUseDuration(par1TraOilS));
    return par1TraOilS;
	
}

public TraOilS setFirstPotionEffect(int par1, int par2, int par3, float par4){
	
	this.FirstPotionid = par1;
	this.FirstPotionDuration = par2;
	this.FirstPotionAmplifier = par3;
	this.FirstPotionEffectProbability = par4;
	return this;			
}

public TraOilS setSecondPotionEffect(int par1, int par2, int par3, float par4){
	
	this.SecondPotionid = par1;
	this.SecondPotionDuration = par2;
	this.SecondPotionAmplifier = par3;
	this.SecondPotionEffectProbability = par4;
	return this;			
}

public TraOilS setThirdPotionEffect(int par1, int par2, int par3, float par4){
	
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
