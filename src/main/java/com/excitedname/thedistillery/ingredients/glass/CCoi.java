package com.excitedname.thedistillery.ingredients.glass;

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

public class CCoi extends Item {

	public static final String[] Meta = new String[] {"T1", "T2", "T3"};
	@SideOnly(Side.CLIENT)
    private IIcon[] IIcons;

	public CCoi() {
		
		this.setUnlocalizedName("CCoi");
		this.setHasSubtypes(true);
		this.setCreativeTab(Tabs.IngTab);
	}

@SideOnly(Side.CLIENT)
public IIcon getIconFromDamage(int par1Icons)
    {
        int j = MathHelper.clamp_int(par1Icons, 0, 2);
        return this.IIcons[j];
    }
	
public String getUnlocalizedName(ItemStack par1CCoi)
    {
        int i = MathHelper.clamp_int(par1CCoi.getItemDamage(), 0, 2);
        return super.getUnlocalizedName() + Meta[i];
    }

@SideOnly(Side.CLIENT)
public void getSubItems(Item par1CCoi, CreativeTabs par2Tabs, List par3List)
    {
        for (int i = 0; i < 3; ++i)
        {
        	par3List.add(new ItemStack(par1CCoi, 1, i));
        }
    }

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1Icons)
    {
		this.IIcons = new IIcon[Meta.length];

        for (int i = 0; i < IIcons.length; ++i)
        {
            this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "CCoi" + Meta[i]);
        }
    }
			
}
