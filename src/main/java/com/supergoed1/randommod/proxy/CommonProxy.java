package com.supergoed1.randommod.proxy;

import com.supergoed1.randommod.RandomMod;
import com.supergoed1.randommod.init.RandomItems;
import com.supergoed1.randommod.items.IronStick;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		
    }

    public void init(FMLInitializationEvent e) {
    	
    }

    public void postInit(FMLPostInitializationEvent e) {
    	
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register(new IronStick());
    	RandomMod.logger.info("REGISTERED ITEMS");
    }
	
}
