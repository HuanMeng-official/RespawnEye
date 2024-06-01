package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReTools {

    public static final Item RUBY_AXE;
    public static final Item RUBY_PICKAXE;
    public static final Item RUBY_SHOVEL;
    public static final Item RUBY_HOE;
    public static final Item RUBY_SWORD;
//    public static final Item AMETHYST_AXE;
//    public static final Item AMETHYST_PICKAXE;
//    public static final Item AMETHYST_SHOVEL;
//    public static final Item AMETHYST_HOE;
//    public static final Item AMETHYST_SWORD;
//    public static final Item ULTIMATE_AXE;
//    public static final Item ULTIMATE_PICKAXE;
//    public static final Item ULTIMATE_SHOVEL;
//    public static final Item ULTIMATE_HOE;
//    public static final Item ULTIMATE_SWORD;
//    public static final Item EMERALD_AXE;
//    public static final Item EMERALD_PICKAXE;
//    public static final Item EMERALD_SHOVEL;
//    public static final Item EMERALD_HOE;
//    public static final Item EMERALD_SWORD;

    static {
        RUBY_AXE = registerTools("ruby_axe", new AxeItem(ItemMaterial.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ItemMaterial.RUBY, 7, -3.0F))));
        RUBY_PICKAXE = registerTools("ruby_pickaxe", new PickaxeItem(ItemMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ItemMaterial.RUBY, 2, -2.8F))));
        RUBY_SHOVEL = registerTools("ruby_shovel", new ShovelItem(ItemMaterial.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ItemMaterial.RUBY, 2.5F, -3.0F))));
        RUBY_HOE = registerTools("ruby_hoe", new HoeItem(ItemMaterial.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ItemMaterial.RUBY, -2, 0.0F))));
        RUBY_SWORD = registerTools("ruby_sword", new SwordItem(ItemMaterial.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ItemMaterial.RUBY, 4, -2.4F))));

//        AMETHYST_AXE = registerTools("amethyst_axe", new AxeItem(ItemMaterial.AMETHYST, 6, -3.0F, new FabricItemSettings()));
//        AMETHYST_PICKAXE = registerTools("amethyst_pickaxe", new PickaxeItem(ItemMaterial.AMETHYST, 1, -2.8F, new FabricItemSettings()));
//        AMETHYST_SHOVEL = registerTools("amethyst_shovel", new ShovelItem(ItemMaterial.AMETHYST, 1.5F, -3.0F, new FabricItemSettings()));
//        AMETHYST_HOE = registerTools("amethyst_hoe", new HoeItem(ItemMaterial.AMETHYST, -2, 0.0F, new FabricItemSettings()));
//        AMETHYST_SWORD = registerTools("amethyst_sword", new SwordItem(ItemMaterial.AMETHYST, 3, -2.4F, new FabricItemSettings()));
//
//        ULTIMATE_AXE = registerTools("ultimate_axe", new AxeItem(ItemMaterial.TITANIUM, 9, -3.0F, new FabricItemSettings()));
//        ULTIMATE_PICKAXE = registerTools("ultimate_pickaxe", new PickaxeItem(ItemMaterial.TITANIUM, 4, -2.8F, new FabricItemSettings()));
//        ULTIMATE_SHOVEL = registerTools("ultimate_shovel", new ShovelItem(ItemMaterial.TITANIUM, 4.5F, -3.0F, new FabricItemSettings()));
//        ULTIMATE_HOE = registerTools("ultimate_hoe", new HoeItem(ItemMaterial.TITANIUM, -3, 0.0F, new FabricItemSettings()));
//        ULTIMATE_SWORD = registerTools("ultimate_sword", new SwordItem(ItemMaterial.TITANIUM, 6, -2.4F, new FabricItemSettings()));
//
//        EMERALD_AXE = registerTools("emerald_axe", new AxeItem(ItemMaterial.EMERALD, 8, -3.0F, new FabricItemSettings()));
//        EMERALD_PICKAXE = registerTools("emerald_pickaxe", new PickaxeItem(ItemMaterial.EMERALD, 3, -2.8F, new FabricItemSettings()));
//        EMERALD_SHOVEL = registerTools("emerald_shovel", new ShovelItem(ItemMaterial.EMERALD, 3.5F, -3.0F, new FabricItemSettings()));
//        EMERALD_HOE = registerTools("emerald_hoe", new HoeItem(ItemMaterial.EMERALD, -2, 0.0F, new FabricItemSettings()));
//        EMERALD_SWORD = registerTools("emerald_sword", new SwordItem(ItemMaterial.EMERALD, 5, -2.4F, new FabricItemSettings()));
    }

    public static Item registerTools(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryTools() {
        RespawnEye.LOGGER.info("Registering Tools for " + RespawnEye.MODID);
    }
}
