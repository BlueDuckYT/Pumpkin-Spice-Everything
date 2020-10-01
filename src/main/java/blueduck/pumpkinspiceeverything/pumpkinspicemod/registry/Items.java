package blueduck.pumpkinspiceeverything.pumpkinspicemod.registry;

import blueduck.pumpkinspiceeverything.pumpkinspicemod.PumpkinSpiceMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SoupItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PumpkinSpiceMod.MODID);

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
    public static final RegistryObject<Item> PUMPKIN_SPICE_BEETROOT_STEW = ITEMS.register("pumpkin_spice_beetroot_stew", () -> new SoupItem(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
