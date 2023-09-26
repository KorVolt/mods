
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kormod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.kormod.entity.CouteaudelancerEntity;
import net.mcreator.kormod.KormodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KormodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KormodMod.MODID);
	public static final RegistryObject<EntityType<CouteaudelancerEntity>> COUTEAUDELANCER = register("projectile_couteaudelancer", EntityType.Builder.<CouteaudelancerEntity>of(CouteaudelancerEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CouteaudelancerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
