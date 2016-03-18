package com.excitedname.thedistillery.distilleries.dist;

import java.util.List;

import com.excitedname.thedistillery.crativetabs.Tabs;
import com.excitedname.thedistillery.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class Dist extends Item {

	private static final String[] Meta = new String[] {"Min", "Tra", "Iro", "War", "Hea", "Wat", "Hot"};
	@SideOnly(Side.CLIENT)
    private IIcon[] IIcons;

	public Dist() {
		
		this.setUnlocalizedName("Dist");
		this.setHasSubtypes(true);
		this.setCreativeTab(Tabs.DisTab);
	}
	
@SideOnly(Side.CLIENT)
public IIcon getIconFromDamage(int par1Icons)
	{
	    int j = MathHelper.clamp_int(par1Icons, 0, 6);
	    return this.IIcons[j];
	}

public String getUnlocalizedName(ItemStack par1Dist)
	{
	    int i = MathHelper.clamp_int(par1Dist.getItemDamage(), 0, 6);
	    return super.getUnlocalizedName() + Meta[i];
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1Icons)
	{
		this.IIcons = new IIcon[Meta.length];
	
	    for (int i = 0; i < IIcons.length; ++i)
	    {
	        this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "Dist" + Meta[i]);
	    }
	}		
}
