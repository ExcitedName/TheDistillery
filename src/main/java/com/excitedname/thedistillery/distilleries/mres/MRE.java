package com.excitedname.thedistillery.distilleries.mres;

import java.util.List;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class MRE extends ItemFood {

	private static final String[] meta = new String[] {"MLo", "BePat"};
	@SideOnly(Side.CLIENT)
    private IIcon[] IIcons;

	public MRE(int food, float saturation, boolean wolfFood) {
		super(2, 1.5F, true);
		this.setUnlocalizedName("MRE");
		this.setHasSubtypes(true);
		this.setCreativeTab(Tabs.DisTab);
	}
	
@SideOnly(Side.CLIENT)
public IIcon getIconFromDamage(int par1Icons)
	{
	    int j = MathHelper.clamp_int(par1Icons, 0, 1);
	    return this.IIcons[j];
	}

public String getUnlocalizedName(ItemStack par1MRE)
	{
	    int i = MathHelper.clamp_int(par1MRE.getItemDamage(), 0, 1);
	    return super.getUnlocalizedName() + meta[i];
	}

@SideOnly(Side.CLIENT)
public void getSubItems(Item par1MRE, CreativeTabs par2Tabs, List par3List)
	{
	    for (int i = 0; i < 2; ++i)
	    {
	    	par3List.add(new ItemStack(par1MRE, 1, i));
	    }
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1Icons)
	{
		this.IIcons = new IIcon[meta.length];
	
	    for (int i = 0; i < IIcons.length; ++i)
	    {
	        this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "MRE" + meta[i]);
	    }
	}

}
