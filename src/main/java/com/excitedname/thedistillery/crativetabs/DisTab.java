package com.excitedname.thedistillery.crativetabs;

import com.excitedname.thedistillery.distilleries.Dis;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DisTab extends CreativeTabs {

	public DisTab(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return Dis.ComDist;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return this.getTabLabel();
	}
	
}
