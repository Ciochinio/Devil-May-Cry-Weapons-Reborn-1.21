
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.devilmaycryweaponsreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DevilMayCryWeaponsRebornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.EBONY_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.COYOTE_A_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.IVORY_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_I_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_II_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.BLUE_ROSE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.BULLET_PLACEHOLDER.get(), ThrownItemRenderer::new);
	}
}
