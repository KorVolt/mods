
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.kormod.world.features.ores.MelioblockFeature;
import net.mcreator.kormod.KormodMod;

@Mod.EventBusSubscriber
public class KormodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, KormodMod.MODID);
	public static final RegistryObject<Feature<?>> MELIOBLOCK = REGISTRY.register("melioblock", MelioblockFeature::new);
}
