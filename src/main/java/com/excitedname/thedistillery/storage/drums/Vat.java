package com.excitedname.thedistillery.storage.drums;

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

public class Vat extends Item {

	public static final String[] Meta = new String[] {"Vat", "Min", "Tra", "Iro", "War", "Hea", 
			"Wat", "Hot"};
	@SideOnly(Side.CLIENT)
    private IIcon[] IIcons;

		public Vat() {
			
			this.setUnlocalizedName("Vat");
			this.setHasSubtypes(true);
			this.setCreativeTab(Tabs.StoTab);
		}

	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int par1Icons)
		{
		    int j = MathHelper.clamp_int(par1Icons, 0, 7);
		    return this.IIcons[j];
		}
	
	public String getUnlocalizedName(ItemStack par1Vat)
		{
		    int i = MathHelper.clamp_int(par1Vat.getItemDamage(), 0, 7);
		    return super.getUnlocalizedName() + Meta[i];
		}
	
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1Vat, CreativeTabs par2Tabs, List par3List)
		{
		    for (int i = 0; i < 8; ++i)
		    {
		    	par3List.add(new ItemStack(par1Vat, 1, i));
		    }
		}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1Icons)
		{
			this.IIcons = new IIcon[Meta.length];
		
		    for (int i = 0; i < IIcons.length; ++i)
		    {
		        this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "Vat" + Meta[i]);
		    }
		}
			
}
