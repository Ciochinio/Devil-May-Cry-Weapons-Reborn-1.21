
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.devilmaycryweaponsreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DevilMayCryWeaponsRebornMod.MODID);
	public static final RegistryObject<Item> RED_QUEEN = REGISTRY.register("red_queen", () -> new RedQueenItem());
	public static final RegistryObject<Item> REBELLION = REGISTRY.register("rebellion", () -> new RebellionItem());
	public static final RegistryObject<Item> DEVIL_SWORD_DANTE = REGISTRY.register("devil_sword_dante", () -> new DevilSwordDanteItem());
	public static final RegistryObject<Item> YAMATO = REGISTRY.register("yamato", () -> new YamatoItem());
	public static final RegistryObject<Item> DEVIL_SWORD_SPARDA = REGISTRY.register("devil_sword_sparda", () -> new DevilSwordSpardaItem());
	public static final RegistryObject<Item> DR_FAUST_HELMET = REGISTRY.register("dr_faust_helmet", () -> new DrFaustItem.Helmet());
	public static final RegistryObject<Item> DMC = REGISTRY.register("dmc", () -> new DMCItem());
	public static final RegistryObject<Item> KALINA_ANN_1_BULLET = REGISTRY.register("kalina_ann_1_bullet", () -> new KalinaAnn1BulletItem());
	public static final RegistryObject<Item> KALINA_ANN_2_BULLET = REGISTRY.register("kalina_ann_2_bullet", () -> new KalinaAnn2BulletItem());
	public static final RegistryObject<Item> BLUE_ROSE_BULLET = REGISTRY.register("blue_rose_bullet", () -> new BlueRoseBulletItem());
	public static final RegistryObject<Item> COYOTE_A = REGISTRY.register("coyote_a", () -> new CoyoteAItem());
	public static final RegistryObject<Item> EBONY = REGISTRY.register("ebony", () -> new EbonyItem());
	public static final RegistryObject<Item> IVORY = REGISTRY.register("ivory", () -> new IvoryItem());
	public static final RegistryObject<Item> KALINA_ANN_I = REGISTRY.register("kalina_ann_i", () -> new KalinaAnnIItem());
	public static final RegistryObject<Item> KALINA_ANN_II = REGISTRY.register("kalina_ann_ii", () -> new KalinaAnnIIItem());
	public static final RegistryObject<Item> BLUE_ROSE = REGISTRY.register("blue_rose", () -> new BlueRoseItem());
}
