package com.excitedname.thedistillery.crativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class IngTab extends CreativeTabs {

	public IngTab(int id, String label) {
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
