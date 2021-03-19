package com.lo93.locore.items;

public class ItemFoodBasic extends ItemFoodBase {

	public ItemFoodBasic(String registryname, int amount, float saturation) {
		super(registryname, amount, saturation, false);
		setTranslationKey(registryname);
	}

}
