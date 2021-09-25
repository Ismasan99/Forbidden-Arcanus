package com.stal111.forbidden_arcanus.init;

import com.stal111.forbidden_arcanus.ForbiddenArcanus;
import com.stal111.forbidden_arcanus.item.*;
import com.stal111.forbidden_arcanus.item.block.EternalObsidianSkullItem;
import com.stal111.forbidden_arcanus.item.block.ObsidianSkullItem;
import com.stal111.forbidden_arcanus.item.block.UtremJarItem;
import com.stal111.forbidden_arcanus.item.renderer.ObsidianSkullItemRenderer;
import com.stal111.forbidden_arcanus.item.renderer.ObsidianSkullShieldItemRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.valhelsia.valhelsia_core.registry.ItemRegistryHelper;

/**
 * Mod Items
 * Forbidden Arcanus - com.stal111.forbidden_arcanus.init.NewModItems
 *
 * @author Valhelsia Team
 * @version 16.2.0
 * @since 2021-01-26
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewModItems {

    public static final ItemRegistryHelper HELPER = ForbiddenArcanus.REGISTRY_MANAGER.getItemHelper();

    public static final RegistryObject<Item> SANITY_METER = HELPER.register("sanity_meter", () -> new SanityMeterItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<Item> LENS_OF_VERITATIS = HELPER.register("lens_of_veritatis", () -> new Item(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<Item> PURIFYING_SOAP = HELPER.register("purifying_soap", () -> new PurifyingSoapItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<Item> WET_PURIFYING_SOAP = HELPER.register("wet_purifying_soap", () -> new WetPurifyingSoapItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<ObsidianSkullItem> OBSIDIAN_SKULL = HELPER.register("obsidian_skull", () -> new ObsidianSkullItem(NewModBlocks.OBSIDIAN_SKULL.get(), NewModBlocks.OBSIDIAN_WALL_SKULL.get(), new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1).rarity(Rarity.UNCOMMON).setISTER(() -> ObsidianSkullItemRenderer::new).isImmuneToFire()));
    public static final RegistryObject<ObsidianSkullShieldItem> OBSIDIAN_SKULL_SHIELD = HELPER.register("obsidian_skull_shield", () -> new ObsidianSkullShieldItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxDamage(1008).rarity(Rarity.UNCOMMON).setISTER(() -> ObsidianSkullShieldItemRenderer::new).isImmuneToFire()));
    public static final RegistryObject<EternalObsidianSkullItem> ETERNAL_OBSIDIAN_SKULL = HELPER.register("eternal_obsidian_skull", () -> new EternalObsidianSkullItem(NewModBlocks.ETERNAL_OBSIDIAN_SKULL.get(), NewModBlocks.ETERNAL_OBSIDIAN_WALL_SKULL.get(), new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1).rarity(Rarity.RARE).setISTER(() -> ObsidianSkullItemRenderer::new).isImmuneToFire()));
    public static final RegistryObject<UtremJarItem> UTREM_JAR = HELPER.register("utrem_jar", () -> new UtremJarItem(NewModBlocks.UTREM_JAR.get(), new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS)));
    public static final RegistryObject<AurealBottleItem> AUREAL_BOTTLE = HELPER.register("aureal_bottle", () -> new AurealBottleItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(16)));
    public static final RegistryObject<Item> ARCANE_CRYSTAL_DUST_SPECK = HELPER.register("arcane_crystal_dust_speck", () -> new Item(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS)));
    public static final RegistryObject<ArcaneBoneMealItem> ARCANE_BONE_MEAL = HELPER.register("arcane_bone_meal", () -> new ArcaneBoneMealItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS)));
    public static final RegistryObject<ZombieArmItem> ZOMBIE_ARM = HELPER.register("zombie_arm", () -> new ZombieArmItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<ZombieArmItem> SHINY_ZOMBIE_ARM = HELPER.register("shiny_zombie_arm", () -> new ZombieArmItem(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<Item> TEST_TUBE = HELPER.register("test_tube", () -> new Item(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(16)));
    public static final RegistryObject<BloodTestTubeItem> BLOOD_TEST_TUBE = HELPER.register("blood_test_tube", () -> new BloodTestTubeItem(new Item.Properties().maxStackSize(1)));
    public static final RegistryObject<Item> BLACKSMITH_GAVEL_HEAD = HELPER.register("blacksmith_gavel_head", () -> new Item(new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(16)));
    public static final RegistryObject<BlacksmithGavelItem> WOODEN_BLACKSMITH_GAVEL = HELPER.register("wooden_blacksmith_gavel", () -> new BlacksmithGavelItem(ItemTier.WOOD, 7, -3.25F, 1, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> STONE_BLACKSMITH_GAVEL = HELPER.register("stone_blacksmith_gavel", () -> new BlacksmithGavelItem(ItemTier.STONE, 7, -3.25F, 3, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> GOLDEN_BLACKSMITH_GAVEL = HELPER.register("golden_blacksmith_gavel", () -> new BlacksmithGavelItem(ItemTier.GOLD, 7, -3.25F, 2, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> IRON_BLACKSMITH_GAVEL = HELPER.register("iron_blacksmith_gavel", () -> new BlacksmithGavelItem(ItemTier.IRON, 7, -3.25F, 10, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> DIAMOND_BLACKSMITH_GAVEL = HELPER.register("diamond_blacksmith_gavel", () -> new BlacksmithGavelItem(ItemTier.DIAMOND, 7, -3.25F, 30, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> NETHERITE_BLACKSMITH_GAVEL = HELPER.register("netherite_blacksmith_gavel", () -> new BlacksmithGavelItem(ItemTier.NETHERITE, 7, -3.25F, 60, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> ARCANE_GOLDEN_BLACKSMITH_GAVEL = HELPER.register("arcane_golden_blacksmith_gavel", () -> new BlacksmithGavelItem(ModItemTier.ARCANE_GOLDEN, 7, -3.25F, 15, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> REINFORCED_ARCANE_GOLDEN_BLACKSMITH_GAVEL = HELPER.register("reinforced_arcane_golden_blacksmith_gavel", () -> new BlacksmithGavelItem(ModItemTier.REINFORCED_ARCANE_GOLDEN, 7, -3.25F, 80, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));
    public static final RegistryObject<BlacksmithGavelItem> OBSIDIAN_BLACKSMITH_GAVEL = HELPER.register("obsidian_blacksmith_gavel", () -> new BlacksmithGavelItem(ModItemTier.OBSIDIAN, 7, -3.25F, 50, new Item.Properties().group(ForbiddenArcanus.FORBIDDEN_ARCANUS).maxStackSize(1)));

    public static class Stacks {
        public static final ItemStack LENS_OF_VERITATIS = new ItemStack(NewModItems.LENS_OF_VERITATIS.get());
        public static final ItemStack ORB_OF_TEMPORARY_FLIGHT = new ItemStack(ModItems.ORB_OF_TEMPORARY_FLIGHT.get());
        public static final ItemStack SANITY_METER = new ItemStack(NewModItems.SANITY_METER.get());
    }
}