package net.mcreator.devilmaycryweaponsreborn.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModItems;
import net.mcreator.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModEntities;
import net.mcreator.devilmaycryweaponsreborn.entity.CoyoteAProjectileEntity;

public class CoyoteARangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (DevilMayCryWeaponsRebornModItems.COYOTE_A.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			for (int index0 = 0; index0 < 8; index0++) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new CoyoteAProjectileEntity(DevilMayCryWeaponsRebornModEntities.COYOTE_A_PROJECTILE.get(), level) {
									@Override
									public byte getPierceLevel() {
										return piercing;
									}

									@Override
									protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
										if (knockback > 0) {
											double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
											Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
											if (vec3.lengthSqr() > 0.0) {
												livingEntity.push(vec3.x, 0.1, vec3.z);
											}
										}
									}
								};
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 8, 1, (byte) 0);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y + 1, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("devil_may_cry_weapons_reborn:coyotea.shot1")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, (y + 1), z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("devil_may_cry_weapons_reborn:coyotea.shot1")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
		}
		if (DevilMayCryWeaponsRebornModItems.COYOTE_A.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			for (int index1 = 0; index1 < 8; index1++) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new CoyoteAProjectileEntity(DevilMayCryWeaponsRebornModEntities.COYOTE_A_PROJECTILE.get(), level) {
									@Override
									public byte getPierceLevel() {
										return piercing;
									}

									@Override
									protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
										if (knockback > 0) {
											double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
											Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
											if (vec3.lengthSqr() > 0.0) {
												livingEntity.push(vec3.x, 0.1, vec3.z);
											}
										}
									}
								};
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 8, 1, (byte) 0);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 7);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y + 1, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("devil_may_cry_weapons_reborn:coyotea.shot1")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, (y + 1), z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("devil_may_cry_weapons_reborn:coyotea.shot1")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem(), 50);
		}
	}
}
