package com.lo93.locore.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTab extends CreativeTabs {
	Item creativetabicon;
	
	public ModCreativeTab(String creativetabname, Item creativetabiconin) {
		super(creativetabname+".creativetab");
		this.creativetabicon = creativetabiconin;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(creativetabicon);
	}

}
