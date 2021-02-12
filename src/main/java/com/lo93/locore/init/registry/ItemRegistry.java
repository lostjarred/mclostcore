package com.lo93.locore.init.registry;

import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegistry {
	
	private Logger modlogger;
	
	public void ItemRegisty(Logger loggerin) {
		this.modlogger = loggerin;
	}
	
	public void RegisterItem(IForgeRegistry<Item> registry, Item itemin) {
		registry.register(itemin);
		modlogger.info("Registed " + itemin.getRegistryName());
	}
	
	public void RegisterItems(IForgeRegistry<Item> registry, Item[] itemins) {
		
		for (int i = 0; i < itemins.length; i++) {
			RegisterItem(registry, itemins[i]);
		}
	}
}
