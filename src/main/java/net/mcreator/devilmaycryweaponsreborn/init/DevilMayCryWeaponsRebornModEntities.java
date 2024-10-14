
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.devilmaycryweaponsreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.devilmaycryweaponsreborn.entity.KalinaAnnIProjectileEntity;
import net.mcreator.devilmaycryweaponsreborn.entity.KalinaAnnIIProjectileEntity;
import net.mcreator.devilmaycryweaponsreborn.entity.IvoryProjectileEntity;
import net.mcreator.devilmaycryweaponsreborn.entity.EbonyProjectileEntity;
import net.mcreator.devilmaycryweaponsreborn.entity.CoyoteAProjectileEntity;
import net.mcreator.devilmaycryweaponsreborn.entity.BulletPlaceholderEntity;
import net.mcreator.devilmaycryweaponsreborn.entity.BlueRoseProjectileEntity;
import net.mcreator.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DevilMayCryWeaponsRebornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DevilMayCryWeaponsRebornMod.MODID);
	public static final RegistryObject<EntityType<EbonyProjectileEntity>> EBONY_PROJECTILE = register("projectile_ebony_projectile", EntityType.Builder.<EbonyProjectileEntity>of(EbonyProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EbonyProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CoyoteAProjectileEntity>> COYOTE_A_PROJECTILE = register("projectile_coyote_a_projectile", EntityType.Builder.<CoyoteAProjectileEntity>of(CoyoteAProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CoyoteAProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IvoryProjectileEntity>> IVORY_PROJECTILE = register("projectile_ivory_projectile", EntityType.Builder.<IvoryProjectileEntity>of(IvoryProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IvoryProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KalinaAnnIProjectileEntity>> KALINA_ANN_I_PROJECTILE = register("projectile_kalina_ann_i_projectile", EntityType.Builder
			.<KalinaAnnIProjectileEntity>of(KalinaAnnIProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KalinaAnnIProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KalinaAnnIIProjectileEntity>> KALINA_ANN_II_PROJECTILE = register("projectile_kalina_ann_ii_projectile",
			EntityType.Builder.<KalinaAnnIIProjectileEntity>of(KalinaAnnIIProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KalinaAnnIIProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlueRoseProjectileEntity>> BLUE_ROSE_PROJECTILE = register("projectile_blue_rose_projectile", EntityType.Builder.<BlueRoseProjectileEntity>of(BlueRoseProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlueRoseProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BulletPlaceholderEntity>> BULLET_PLACEHOLDER = register("projectile_bullet_placeholder", EntityType.Builder.<BulletPlaceholderEntity>of(BulletPlaceholderEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BulletPlaceholderEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
