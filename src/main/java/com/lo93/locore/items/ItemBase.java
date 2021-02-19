package com.lo93.locore.items;

import com.lo93.locore.LoCoreMain;

import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	String name;
	
	public ItemBase(Properties properties, String registryname) {
		super(properties);
		this.name = registryname;
	}
	
	public void RegisterItemModel(ModelResourceLocation modelloc) {
		LoCoreMain.Proxy.registerItemRenderer(this, 0, modelloc);
	}
	
	/*
	public String getName() {
		return this.name;
	}
	*/
}
