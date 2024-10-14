
package net.mcreator.devilmaycryweaponsreborn.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.devilmaycryweaponsreborn.procedures.KalinaAnnIIWhileProjectileFlyingTickProcedure;
import net.mcreator.devilmaycryweaponsreborn.procedures.KalinaAnnIIProjectileHitsBlockProcedure;
import net.mcreator.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModItems;
import net.mcreator.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class KalinaAnnIIProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(DevilMayCryWeaponsRebornModItems.KALINA_ANN_2_BULLET.get());

	public KalinaAnnIIProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_II_PROJECTILE.get(), world);
	}

	public KalinaAnnIIProjectileEntity(EntityType<? extends KalinaAnnIIProjectileEntity> type, Level world) {
		super(type, world);
	}

	public KalinaAnnIIProjectileEntity(EntityType<? extends KalinaAnnIIProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public KalinaAnnIIProjectileEntity(EntityType<? extends KalinaAnnIIProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		KalinaAnnIIProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		KalinaAnnIIProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		KalinaAnnIIProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		KalinaAnnIIWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static KalinaAnnIIProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 0f, 0, 0);
	}

	public static KalinaAnnIIProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		KalinaAnnIIProjectileEntity entityarrow = new KalinaAnnIIProjectileEntity(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_II_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static KalinaAnnIIProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		KalinaAnnIIProjectileEntity entityarrow = new KalinaAnnIIProjectileEntity(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_II_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
