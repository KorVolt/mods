
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kormod.item.PointdiItem;
import net.mcreator.kormod.item.PIOCHEItem;
import net.mcreator.kormod.item.MelioraisimparfaitItem;
import net.mcreator.kormod.item.MelioItem;
import net.mcreator.kormod.item.MelingotItem;
import net.mcreator.kormod.item.GemmeItem;
import net.mcreator.kormod.item.EpeeItem;
import net.mcreator.kormod.item.CouteaudelancerItem;
import net.mcreator.kormod.item.BackpackItem;
import net.mcreator.kormod.KormodMod;

public class KormodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KormodMod.MODID);
	public static final RegistryObject<Item> MELIORAISIMPARFAIT = REGISTRY.register("melioraisimparfait", () -> new MelioraisimparfaitItem());
	public static final RegistryObject<Item> MELIOBLOCK = block(KormodModBlocks.MELIOBLOCK);
	public static final RegistryObject<Item> MELINGOT = REGISTRY.register("melingot", () -> new MelingotItem());
	public static final RegistryObject<Item> MELIO_HELMET = REGISTRY.register("melio_helmet", () -> new MelioItem.Helmet());
	public static final RegistryObject<Item> MELIO_CHESTPLATE = REGISTRY.register("melio_chestplate", () -> new MelioItem.Chestplate());
	public static final RegistryObject<Item> MELIO_LEGGINGS = REGISTRY.register("melio_leggings", () -> new MelioItem.Leggings());
	public static final RegistryObject<Item> MELIO_BOOTS = REGISTRY.register("melio_boots", () -> new MelioItem.Boots());
	public static final RegistryObject<Item> COUTEAUDELANCER = REGISTRY.register("couteaudelancer", () -> new CouteaudelancerItem());
	public static final RegistryObject<Item> PIOCHE = REGISTRY.register("pioche", () -> new PIOCHEItem());
	public static final RegistryObject<Item> EPEE = REGISTRY.register("epee", () -> new EpeeItem());
	public static final RegistryObject<Item> POINTDI = REGISTRY.register("pointdi", () -> new PointdiItem());
	public static final RegistryObject<Item> BACKPACK = REGISTRY.register("backpack", () -> new BackpackItem());
	public static final RegistryObject<Item> GEMME = REGISTRY.register("gemme", () -> new GemmeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
