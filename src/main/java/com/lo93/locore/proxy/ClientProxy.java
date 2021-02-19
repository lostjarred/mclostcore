package com.lo93.locore.proxy;

import com.lo93.locore.LoCoreMain;

import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, ModelResourceLocation modellocation) {
        //ModelLoader.setCustomModelResourceLocation(item, meta, modellocation);
        LoCoreMain.LOGGER.info("Registered item model: " + item.getRegistryName().toString());
    }

    /*
    @Override
	public String localize(String unlocalized, Object... args) {
		return I18n.format(unlocalized, args);
	}
	*/
}