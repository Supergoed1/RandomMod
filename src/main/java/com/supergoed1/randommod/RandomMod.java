package com.supergoed1.randommod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.supergoed1.randommod.proxy.CommonProxy;

@Mod(modid = RandomMod.MODID, name = RandomMod.NAME, version = RandomMod.VERSION)
public class RandomMod
{
    public static final String MODID = "randommod";
    public static final String NAME = "Random Mod";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "com.supergoed1.randommod.proxy.ClientProxy", serverSide = "com.supergoed1.randommod.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger = event.getModLog();
        logger.info("PREINIT");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        logger.info("INIT");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    	logger.info("POSTINIT");
    }
}
