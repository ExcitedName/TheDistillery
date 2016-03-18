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

public class IroOilL extends Item {

	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;

		public IroOilL() {
			
			this.setUnlocalizedName("IroOilL");
			this.setTextureName("IroOilL");
			this.setCreativeTab(Tabs.DisTab);
			this.setFirstPotionEffect(Potion.resistance.id, 20, 1, 1F);
		}

public ItemStack onEaten(ItemStack par1IroOilL, World par2World, EntityPlayer par3EntityPlayer){
	super.onEaten(par1IroOilL,  par2World,  par3EntityPlayer);
	
	if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1IroOilL.stackSize;
    }
	
	if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
		par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 540, this.FirstPotionAmplifier));
	}
	
	return par1IroOilL;
}

public int getMaxItemUseDuration(ItemStack par1IroOilL)
{
    return 12;
}

public EnumAction getItemUseAction(ItemStack par1IroOilL)
{
    return EnumAction.eat;
}

public ItemStack onItemRightClick(ItemStack par1IroOilL, World par2World, EntityPlayer par3EntityPlayer)
{
	par3EntityPlayer.setItemInUse(par1IroOilL, this.getMaxItemUseDuration(par1IroOilL));
    return par1IroOilL;
	
}


public IroOilL setFirstPotionEffect(int par1, int par2, int par3, float par4){
			
	this.FirstPotionid = par1;
	this.FirstPotionDuration = par2;
	this.FirstPotionAmplifier = par3;
	this.FirstPotionEffectProbability = par4;
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
