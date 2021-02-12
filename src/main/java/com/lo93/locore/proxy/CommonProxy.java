package com.lo93.locore.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;

public class CommonProxy {

	public void registerItemRenderer(Item itemBasic, int meta, ModelResourceLocation modellocation) {
	}

	public String localize(String unlocalized, Object... args) {
		return I18n.translateToLocalFormatted(unlocalized, args);
	}
    
}