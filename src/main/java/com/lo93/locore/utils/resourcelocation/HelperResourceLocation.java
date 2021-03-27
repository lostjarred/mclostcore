package com.lo93.locore.utils.resourcelocation;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class HelperResourceLocation {
	private String modid;
	
	public HelperResourceLocation(String modid){
		this.modid = modid;
	}
	
	public ModelResourceLocation genModelResourcelocation(String modelname) {
		ModelResourceLocation modellocation = new ModelResourceLocation(modid + ":" + modelname, "inventory");
		return modellocation;
	}
}
