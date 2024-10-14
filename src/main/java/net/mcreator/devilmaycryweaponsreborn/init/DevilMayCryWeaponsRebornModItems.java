
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.devilmaycryweaponsreborn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.devilmaycryweaponsreborn.item.YamatoItem;
import net.mcreator.devilmaycryweaponsreborn.item.RedQueenItem;
import net.mcreator.devilmaycryweaponsreborn.item.RebellionItem;
import net.mcreator.devilmaycryweaponsreborn.item.KalinaAnnIItem;
import net.mcreator.devilmaycryweaponsreborn.item.KalinaAnnIIItem;
import net.mcreator.devilmaycryweaponsreborn.item.KalinaAnn2BulletItem;
import net.mcreator.devilmaycryweaponsreborn.item.KalinaAnn1BulletItem;
import net.mcreator.devilmaycryweaponsreborn.item.IvoryItem;
import net.mcreator.devilmaycryweaponsreborn.item.EbonyItem;
import net.mcreator.devilmaycryweaponsreborn.item.DrFaustItem;
import net.mcreator.devilmaycryweaponsreborn.item.DevilSwordSpardaItem;
import net.mcreator.devilmaycryweaponsreborn.item.DevilSwordDanteItem;
import net.mcreator.devilmaycryweaponsreborn.item.DMCItem;
import net.mcreator.devilmaycryweaponsreborn.item.CoyoteAItem;
import net.mcreator.devilmaycryweaponsreborn.item.BlueRoseItem;
import net.mcreator.devilmaycryweaponsreborn.item.BlueRoseBulletItem;
import net.mcreator.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

public class DevilMayCryWeaponsRebornModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DevilMayCryWeaponsRebornMod.MODID);
	public static final DeferredItem<Item> RED_QUEEN = REGISTRY.register("red_queen", RedQueenItem::new);
	public static final DeferredItem<Item> REBELLION = REGISTRY.register("rebellion", RebellionItem::new);
	public static final DeferredItem<Item> DMC = REGISTRY.register("dmc", DMCItem::new);
	public static final DeferredItem<Item> DEVIL_SWORD_DANTE = REGISTRY.register("devil_sword_dante", DevilSwordDanteItem::new);
	public static final DeferredItem<Item> YAMATO = REGISTRY.register("yamato", YamatoItem::new);
	public static final DeferredItem<Item> DR_FAUST_HELMET = REGISTRY.register("dr_faust_helmet", DrFaustItem.Helmet::new);
	public static final DeferredItem<Item> DEVIL_SWORD_SPARDA = REGISTRY.register("devil_sword_sparda", DevilSwordSpardaItem::new);
	public static final DeferredItem<Item> KALINA_ANN_1_BULLET = REGISTRY.register("kalina_ann_1_bullet", KalinaAnn1BulletItem::new);
	public static final DeferredItem<Item> KALINA_ANN_2_BULLET = REGISTRY.register("kalina_ann_2_bullet", KalinaAnn2BulletItem::new);
	public static final DeferredItem<Item> BLUE_ROSE_BULLET = REGISTRY.register("blue_rose_bullet", BlueRoseBulletItem::new);
	public static final DeferredItem<Item> COYOTE_A = REGISTRY.register("coyote_a", CoyoteAItem::new);
	public static final DeferredItem<Item> EBONY = REGISTRY.register("ebony", EbonyItem::new);
	public static final DeferredItem<Item> IVORY = REGISTRY.register("ivory", IvoryItem::new);
	public static final DeferredItem<Item> KALINA_ANN_I = REGISTRY.register("kalina_ann_i", KalinaAnnIItem::new);
	public static final DeferredItem<Item> KALINA_ANN_II = REGISTRY.register("kalina_ann_ii", KalinaAnnIIItem::new);
	public static final DeferredItem<Item> BLUE_ROSE = REGISTRY.register("blue_rose", BlueRoseItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
