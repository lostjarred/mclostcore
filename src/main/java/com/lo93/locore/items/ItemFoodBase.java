package com.lo93.locore.items;

import com.lo93.locore.LoCoreMain;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood {
	
	String name;

	public ItemFoodBase(String registryname, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
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
