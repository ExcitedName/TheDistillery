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

public class DraOilS extends Item {

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
	
	public int FourthPotionid;
	public int FourthPotionDuration;
	public int FourthPotionAmplifier;
	public float FourthPotionEffectProbability;
	
	public int FifthPotionid;
	public int FifthPotionDuration;
	public int FifthPotionAmplifier;
	public float FifthPotionEffectProbability;

		public DraOilS() {
			
			this.setUnlocalizedName("DraOilS");
			this.setTextureName("DraOilS");
			this.setCreativeTab(Tabs.DisTab);
			this.setFirstPotionEffect(Potion.moveSpeed.id, 20, 1, 1F);
			this.setSecondPotionEffect(Potion.jump.id, 20, 1, 1F);
			this.setThirdPotionEffect(Potion.resistance.id, 20, 1, 1F);
			this.setFourthPotionEffect(Potion.damageBoost.id, 20, 1, 1F);
			this.setFifthPotionEffect(Potion.fireResistance.id, 20, 1, 1F);
		}
		
	public boolean hasEffect(ItemStack par1DraOilS, int pass){
		return true;
	}
	
	public ItemStack onEaten(ItemStack par1DraOilS, World par2World, EntityPlayer par3EntityPlayer){
		super.onEaten(par1DraOilS,  par2World,  par3EntityPlayer);
		
		if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1DraOilS.stackSize;
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
		
		if (!par2World.isRemote && this.FourthPotionid > 0 && par2World.rand.nextFloat() < this.FourthPotionEffectProbability){
			par3EntityPlayer.addPotionEffect(new PotionEffect(this.FourthPotionid, this.FourthPotionDuration * 540, this.FourthPotionAmplifier));
		}
		
		if (!par2World.isRemote && this.FifthPotionid > 0 && par2World.rand.nextFloat() < this.FifthPotionEffectProbability){
			par3EntityPlayer.addPotionEffect(new PotionEffect(this.FifthPotionid, this.FifthPotionDuration * 540, this.FifthPotionAmplifier));
		}
					
		return par1DraOilS;
    }
	
	public int getMaxItemUseDuration(ItemStack par1DraOilS)
    {
        return 12;
    }

    public EnumAction getItemUseAction(ItemStack par1DraOilS)
    {
        return EnumAction.eat;
    }

    public ItemStack onItemRightClick(ItemStack par1DraOilS, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1DraOilS, this.getMaxItemUseDuration(par1DraOilS));
        return par1DraOilS;
		
    }
    
    public DraOilS setFirstPotionEffect(int par1, int par2, int par3, float par4){
		
		this.FirstPotionid = par1;
		this.FirstPotionDuration = par2;
		this.FirstPotionAmplifier = par3;
		this.FirstPotionEffectProbability = par4;
		return this;			
	}
	
	public DraOilS setSecondPotionEffect(int par1, int par2, int par3, float par4){
		
		this.SecondPotionid = par1;
		this.SecondPotionDuration = par2;
		this.SecondPotionAmplifier = par3;
		this.SecondPotionEffectProbability = par4;
		return this;			
	}
	
	public DraOilS setThirdPotionEffect(int par1, int par2, int par3, float par4){
		
		this.ThirdPotionid = par1;
		this.ThirdPotionDuration = par2;
		this.ThirdPotionAmplifier = par3;
		this.ThirdPotionEffectProbability = par4;
		return this;			
	}
	
	public DraOilS setFourthPotionEffect(int par1, int par2, int par3, float par4){
		
		this.FourthPotionid = par1;
		this.FourthPotionDuration = par2;
		this.FourthPotionAmplifier = par3;
		this.FourthPotionEffectProbability = par4;
		return this;			
	}
	
	public DraOilS setFifthPotionEffect(int par1, int par2, int par3, float par4){
		
		this.FifthPotionid = par1;
		this.FifthPotionDuration = par2;
		this.FifthPotionAmplifier = par3;
		this.FifthPotionEffectProbability = par4;
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
