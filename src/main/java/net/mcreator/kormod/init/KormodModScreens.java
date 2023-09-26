
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.kormod.client.gui.TestScreen;
import net.mcreator.kormod.client.gui.CoffreportableScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KormodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KormodModMenus.TEST.get(), TestScreen::new);
			MenuScreens.register(KormodModMenus.COFFREPORTABLE.get(), CoffreportableScreen::new);
		});
	}
}
