
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rbm.devilmaycryweaponsreborn.init;

import net.rbm.devilmaycryweaponsreborn.item.YamatoItem;
import net.rbm.devilmaycryweaponsreborn.item.RedQueenItem;
import net.rbm.devilmaycryweaponsreborn.item.RebellionItem;
import net.rbm.devilmaycryweaponsreborn.item.KalinaAnnIItem;
import net.rbm.devilmaycryweaponsreborn.item.KalinaAnnIIItem;
import net.rbm.devilmaycryweaponsreborn.item.KalinaAnn2BulletItem;
import net.rbm.devilmaycryweaponsreborn.item.KalinaAnn1BulletItem;
import net.rbm.devilmaycryweaponsreborn.item.IvoryItem;
import net.rbm.devilmaycryweaponsreborn.item.EbonyItem;
import net.rbm.devilmaycryweaponsreborn.item.DrFaustItem;
import net.rbm.devilmaycryweaponsreborn.item.DevilSwordSpardaItem;
import net.rbm.devilmaycryweaponsreborn.item.DevilSwordDanteItem;
import net.rbm.devilmaycryweaponsreborn.item.DMCItem;
import net.rbm.devilmaycryweaponsreborn.item.CoyoteAItem;
import net.rbm.devilmaycryweaponsreborn.item.BlueRoseItem;
import net.rbm.devilmaycryweaponsreborn.item.BlueRoseBulletItem;
import net.rbm.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

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
