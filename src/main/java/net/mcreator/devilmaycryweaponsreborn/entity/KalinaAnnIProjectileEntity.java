
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

import net.mcreator.devilmaycryweaponsreborn.procedures.KalinaAnnIWhileProjectileFlyingTickProcedure;
import net.mcreator.devilmaycryweaponsreborn.procedures.KalinaAnnIProjectileHitsBlockProcedure;
import net.mcreator.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModItems;
import net.mcreator.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class KalinaAnnIProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(DevilMayCryWeaponsRebornModItems.KALINA_ANN_1_BULLET.get());

	public KalinaAnnIProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_I_PROJECTILE.get(), world);
	}

	public KalinaAnnIProjectileEntity(EntityType<? extends KalinaAnnIProjectileEntity> type, Level world) {
		super(type, world);
	}

	public KalinaAnnIProjectileEntity(EntityType<? extends KalinaAnnIProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public KalinaAnnIProjectileEntity(EntityType<? extends KalinaAnnIProjectileEntity> type, LivingEntity entity, Level world) {
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
		KalinaAnnIProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		KalinaAnnIProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		KalinaAnnIProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		KalinaAnnIWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static KalinaAnnIProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 0f, 0, 0);
	}

	public static KalinaAnnIProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		KalinaAnnIProjectileEntity entityarrow = new KalinaAnnIProjectileEntity(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_I_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static KalinaAnnIProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		KalinaAnnIProjectileEntity entityarrow = new KalinaAnnIProjectileEntity(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_I_PROJECTILE.get(), entity, entity.level());
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
