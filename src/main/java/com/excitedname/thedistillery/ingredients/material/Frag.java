package com.excitedname.thedistillery.ingredients.material;

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

public class Frag extends Item {

	public static final String[] Meta = new String[] {"Ice", "Iro", "Eme", "Dia", "Dist"};
	@SideOnly(Side.CLIENT)
    private IIcon[] IIcons;
	
	public Frag() {
		
		this.setUnlocalizedName("Frag");
		this.setHasSubtypes(true);
		this.setCreativeTab(Tabs.IngTab);
	}

@SideOnly(Side.CLIENT)
public IIcon getIconFromDamage(int par1Icons)
	{
	    int j = MathHelper.clamp_int(par1Icons, 0, 4);
	    return this.IIcons[j];
	}

public String getUnlocalizedName(ItemStack par1Frag)
	{
	    int i = MathHelper.clamp_int(par1Frag.getItemDamage(), 0, 4);
	    return super.getUnlocalizedName() + Meta[i];
	}

@SideOnly(Side.CLIENT)
public void getSubItems(Item par1Frag, CreativeTabs par2Tabs, List par3List)
	{
	    for (int i = 0; i < 5; ++i)
	    {
	    	par3List.add(new ItemStack(par1Frag, 1, i));
	    }
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1Icons)
	{
		this.IIcons = new IIcon[Meta.length];
	
	    for (int i = 0; i < IIcons.length; ++i)
	    {
	        this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "Frag" + Meta[i]);
	    }
	}
			
}
