package com.excitedname.thedistillery.crativetabs;

import com.excitedname.thedistillery.distilleries.Dis;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class StoTab extends CreativeTabs {

	public StoTab(int id, String label) {
		super(id, label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.gunpowder;
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return this.getTabLabel();
	}
	
}
