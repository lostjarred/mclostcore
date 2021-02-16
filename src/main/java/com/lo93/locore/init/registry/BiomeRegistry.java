package com.lo93.locore.init.registry;

import org.apache.logging.log4j.Logger;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.IForgeRegistry;

public class BiomeRegistry {
	private Logger logger;
	
	public BiomeRegistry(Logger loggerin) {
		this.logger = loggerin;
	}
	
 	public void RegisterBiome(IForgeRegistry<Biome> registry, Biome biomein) {
 		registry.register(biomein);
 		logger.info("Registered Biome: " + biomein.getRegistryName().toString());
 	}
}
