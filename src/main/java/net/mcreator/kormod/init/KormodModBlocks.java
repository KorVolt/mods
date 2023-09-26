
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kormod.block.MelioblockBlock;
import net.mcreator.kormod.KormodMod;

public class KormodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KormodMod.MODID);
	public static final RegistryObject<Block> MELIOBLOCK = REGISTRY.register("melioblock", () -> new MelioblockBlock());
}
