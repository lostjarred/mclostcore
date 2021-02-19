package com.lo93.locore.init.registry;

import com.lo93.locore.LoCoreMain;
import com.lo93.locore.init.items.ModItems;

import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {
	//example code
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		IForgeRegistry<Item> registry = event.getRegistry();
		//test item
		//LoCoreMain.ITEMREGISTRY.RegisterItem(registry, ModItems.TESTITEM);
	}
	
	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event){
		IForgeRegistry<Biome> registry = event.getRegistry();
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event){
		//test item model
		//ModItems.TESTITEM.RegisterItemModel(new ModelResourceLocation("minecraft:apple" ,"inventory"));	
	}
	
	
}
