package com.supergoed1.randommod.proxy;

import com.supergoed1.randommod.RandomMod;
import com.supergoed1.randommod.init.RandomItems;
import com.supergoed1.randommod.items.IronStick;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	ModelResourceLocation resloc = new ModelResourceLocation(RandomMod.MODID + ":item/ironstick", "inventory");
    	//RandomMod.logger.info(resloc.getResourcePath());
    	ModelLoader.setCustomModelResourceLocation(new IronStick(), 0, resloc);
    	//RandomMod.logger.info("MODELS HAVE BEEN REGISTERD");
    }
}
