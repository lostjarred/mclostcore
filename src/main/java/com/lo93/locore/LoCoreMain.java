package com.lo93.locore;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lo93.locore.init.registry.ItemRegistry;
import com.lo93.locore.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod("lostcore")
public class LoCoreMain
{
	public static CommonProxy Proxy;
	
    public static final String MODID = "lostcore";
    public static final String NAME = "Lost Core";
    public static final String VERSION = "1.0";

    public static final Logger LOGGER = LogManager.getLogger(MODID);
    
    public static final ItemRegistry ITEMREGISTRY = new ItemRegistry(LOGGER);
}
