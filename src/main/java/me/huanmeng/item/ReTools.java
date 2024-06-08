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
    public static final Item AMETHYST_AXE;
    public static final Item AMETHYST_PICKAXE;
    public static final Item AMETHYST_SHOVEL;
    public static final Item AMETHYST_HOE;
    public static final Item AMETHYST_SWORD;
    public static final Item ULTIMATE_AXE;
    public static final Item ULTIMATE_PICKAXE;
    public static final Item ULTIMATE_SHOVEL;
    public static final Item ULTIMATE_HOE;
    public static final Item ULTIMATE_SWORD;
//    public static final Item EMERALD_AXE;
//    public static final Item EMERALD_PICKAXE;
//    public static final Item EMERALD_SHOVEL;
//    public static final Item EMERALD_HOE;
//    public static final Item EMERALD_SWORD;

    static {
        RUBY_AXE = registerTools("ruby_axe", new AxeItem(ReItemMaterial.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterial.RUBY, 7, -3.0F))));
        RUBY_PICKAXE = registerTools("ruby_pickaxe", new PickaxeItem(ReItemMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterial.RUBY, 2, -2.8F))));
        RUBY_SHOVEL = registerTools("ruby_shovel", new ShovelItem(ReItemMaterial.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterial.RUBY, 2.5F, -3.0F))));
        RUBY_HOE = registerTools("ruby_hoe", new HoeItem(ReItemMaterial.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterial.RUBY, -2, 0.0F))));
        RUBY_SWORD = registerTools("ruby_sword", new SwordItem(ReItemMaterial.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterial.RUBY, 4, -2.4F))));

        AMETHYST_AXE = registerTools("amethyst_axe", new AxeItem(ReItemMaterial.AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterial.AMETHYST, 6, -3.0F))));
        AMETHYST_PICKAXE = registerTools("amethyst_pickaxe", new PickaxeItem(ReItemMaterial.AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterial.AMETHYST, 1, -2.8F))));
        AMETHYST_SHOVEL = registerTools("amethyst_shovel", new ShovelItem(ReItemMaterial.AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterial.AMETHYST, 1.5F, -3.0F))));
        AMETHYST_HOE = registerTools("amethyst_hoe", new HoeItem(ReItemMaterial.AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterial.AMETHYST, -2, 0.0F))));
        AMETHYST_SWORD = registerTools("amethyst_sword", new SwordItem(ReItemMaterial.AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterial.AMETHYST, 3, -2.4F))));

        ULTIMATE_AXE = registerTools("ultimate_axe", new AxeItem(ReItemMaterial.TITANIUM, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterial.TITANIUM, 9, -3.0F))));
        ULTIMATE_PICKAXE = registerTools("ultimate_pickaxe", new PickaxeItem(ReItemMaterial.TITANIUM, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterial.TITANIUM, 4, -2.8F))));
        ULTIMATE_SHOVEL = registerTools("ultimate_shovel", new ShovelItem(ReItemMaterial.TITANIUM, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterial.TITANIUM, 4.5F, -3.0F))));
        ULTIMATE_HOE = registerTools("ultimate_hoe", new HoeItem(ReItemMaterial.TITANIUM, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterial.TITANIUM, -3, 0.0F))));
        ULTIMATE_SWORD = registerTools("ultimate_sword", new SwordItem(ReItemMaterial.TITANIUM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterial.TITANIUM, 6, -2.4F))));

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
