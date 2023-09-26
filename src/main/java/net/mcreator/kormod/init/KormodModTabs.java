
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.kormod.KormodMod;

public class KormodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KormodMod.MODID);
	public static final RegistryObject<CreativeModeTab> MELIMOD = REGISTRY.register("melimod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kormod.melimod")).icon(() -> new ItemStack(KormodModItems.MELINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KormodModItems.MELIORAISIMPARFAIT.get());
				tabData.accept(KormodModBlocks.MELIOBLOCK.get().asItem());
				tabData.accept(KormodModItems.MELINGOT.get());
				tabData.accept(KormodModItems.MELIO_HELMET.get());
				tabData.accept(KormodModItems.MELIO_CHESTPLATE.get());
				tabData.accept(KormodModItems.MELIO_LEGGINGS.get());
				tabData.accept(KormodModItems.MELIO_BOOTS.get());
				tabData.accept(KormodModItems.COUTEAUDELANCER.get());
				tabData.accept(KormodModItems.PIOCHE.get());
				tabData.accept(KormodModItems.EPEE.get());
				tabData.accept(KormodModItems.POINTDI.get());
				tabData.accept(KormodModItems.BACKPACK.get());
				tabData.accept(KormodModItems.GEMME.get());
			}).withSearchBar().build());
}
