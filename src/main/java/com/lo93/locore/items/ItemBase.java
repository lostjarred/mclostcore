package com.lo93.locore.items;

import com.lo93.locore.LoCoreMain;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	String name;
	
	public ItemBase(String registryname) {
		this.name = registryname;
		setRegistryName(this.name);
	}
	
	public void RegisterItemModel(ModelResourceLocation modelloc) {
		LoCoreMain.Proxy.registerItemRenderer(this, 0, modelloc);
	}
	
	public String getName() {
		return this.name;
	}
}
