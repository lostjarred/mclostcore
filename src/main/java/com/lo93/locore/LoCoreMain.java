package com.lo93.locore;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lo93.locore.init.registry.ItemRegistry;
import com.lo93.locore.proxy.CommonProxy;

import creativetab.ModCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = LoCoreMain.MODID, name = LoCoreMain.NAME, version = LoCoreMain.VERSION)
public class LoCoreMain
{
	@SidedProxy(serverSide = "com.lo93.locore.proxy.CommonProxy", clientSide = "com.lo93.locore.proxy.ClientProxy")
	public static CommonProxy Proxy;
	
    public static final String MODID = "lostcore";
    public static final String NAME = "Lost Core";
    public static final String VERSION = "1.0";

    public static final Logger LOGGER = LogManager.getLogger(MODID);
    
    public static final ItemRegistry ITEMREGISTRY = new ItemRegistry(LOGGER);
    
    public static final CreativeTabs locorecreativetab = new ModCreativeTab(MODID, Items.ARROW);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // mod heartbeat
        LOGGER.info(NAME + " is loading");
    }
}
