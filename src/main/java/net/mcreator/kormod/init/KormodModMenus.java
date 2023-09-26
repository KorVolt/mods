
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.kormod.world.inventory.TestMenu;
import net.mcreator.kormod.world.inventory.CoffreportableMenu;
import net.mcreator.kormod.KormodMod;

public class KormodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KormodMod.MODID);
	public static final RegistryObject<MenuType<TestMenu>> TEST = REGISTRY.register("test", () -> IForgeMenuType.create(TestMenu::new));
	public static final RegistryObject<MenuType<CoffreportableMenu>> COFFREPORTABLE = REGISTRY.register("coffreportable", () -> IForgeMenuType.create(CoffreportableMenu::new));
}
