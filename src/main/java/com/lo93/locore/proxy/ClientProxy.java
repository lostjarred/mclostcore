package com.lo93.locore.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, ModelResourceLocation modellocation) {
        ModelLoader.setCustomModelResourceLocation(item, meta, modellocation);
    }

    @Override
	public String localize(String unlocalized, Object... args) {
		return I18n.format(unlocalized, args);
	}
}