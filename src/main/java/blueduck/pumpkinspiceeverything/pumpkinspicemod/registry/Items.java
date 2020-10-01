package blueduck.pumpkinspiceeverything.pumpkinspicemod.registry;

import blueduck.pumpkinspiceeverything.pumpkinspicemod.PumpkinSpiceMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PumpkinSpiceMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PumpkinSpiceMod.MODID);

    public static final RegistryObject<Item> PUMPKIN_SPICE = ITEMS.register("pumpkin_spice", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PUMPKIN_SPICE_APPLE = ITEMS.register("pumpkin_spice_apple", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.4F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_POTATO = ITEMS.register("pumpkin_spice_potato", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.3F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_BAKED_POTATO = ITEMS.register("pumpkin_spice_baked_potato", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.3F).effect(new EffectInstance(Effects.POISON, 100, 0), 0.4F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_POISONOUS_POTATO = ITEMS.register("pumpkin_spice_poisonous_potato", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_MELON_SLICE = ITEMS.register("pumpkin_spice_melon_slice", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.3F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_BREAD = ITEMS.register("pumpkin_spice_bread", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_CARROT = ITEMS.register("pumpkin_spice_carrot", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.7F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_COOKIE = ITEMS.register("pumpkin_spice_cookie", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.3F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_SPIDER_EYE = ITEMS.register("pumpkin_spice_spider_eye", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.8F).effect(new EffectInstance(Effects.POISON, 100, 0), 1.0F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_ROTTEN_FLESH = ITEMS.register("pumpkin_spice_rotten_flesh", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.1F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 0.5F).meat().build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_BEETROOT = ITEMS.register("pumpkin_spice_beetroot", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.6F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_MUSHROOM_STEW = ITEMS.register("pumpkin_spice_mushroom_stew", () -> new SoupItem(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_BEETROOT_SOUP = ITEMS.register("pumpkin_spice_beetroot_soup", () -> new SoupItem(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_RABBIT_STEW = ITEMS.register("pumpkin_spice_rabbit_stew", () -> new SoupItem(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(0.6F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_COD = ITEMS.register("pumpkin_spice_cod", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.1F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_COOKED_COD = ITEMS.register("pumpkin_spice_cooked_cod", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_SALMON = ITEMS.register("pumpkin_spice_salmon", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.1F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_COOKED_SALMON = ITEMS.register("pumpkin_spice_cooked_salmon", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_TROPICAL_FISH = ITEMS.register("pumpkin_spice_tropical_fish", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.1F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_PUFFERFISH = ITEMS.register("pumpkin_spice_pufferfish", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.1F).effect(new EffectInstance(Effects.POISON, 1200, 3), 0.8F).effect(new EffectInstance(Effects.HUNGER, 300, 2), 0.8F).effect(new EffectInstance(Effects.NAUSEA, 300, 0), 0.8F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_SWEET_BERRIES = ITEMS.register("pumpkin_spice_sweet_berries", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.7F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_DRIED_KELP = ITEMS.register("pumpkin_spice_dried_kelp", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.4F).fastToEat().build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_PUMPKIN_PIE = ITEMS.register("pumpkin_spice_pumpkin_pie", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.5F).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_CHORUS_FRUIT = ITEMS.register("pumpkin_spice_chorus_fruit", () -> new ChorusFruitItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.2F).build())));

    public static final RegistryObject<Block> PUMPKIN_SPICE_CAKE = BLOCKS.register("pumpkin_spice_cake", () -> new CakeBlock(AbstractBlock.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
    public static final RegistryObject<Item> PUMPKIN_SPICE_CAKE_ITEM = ITEMS.register("pumpkin_spice_cake", () -> new BlockItem(PUMPKIN_SPICE_CAKE.get(), new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1)));

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
