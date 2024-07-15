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
    public static final Item ULTIMATE_BOW;
    public static final Item EMERALD_AXE;
    public static final Item EMERALD_PICKAXE;
    public static final Item EMERALD_SHOVEL;
    public static final Item EMERALD_HOE;
    public static final Item EMERALD_SWORD;
    public static final Item ROSE_SWORD;

    static {
        RUBY_AXE = registerTools("ruby_axe", new AxeItem(ReItemMaterials.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterials.RUBY, 7, -3.0F))));
        RUBY_PICKAXE = registerTools("ruby_pickaxe", new PickaxeItem(ReItemMaterials.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterials.RUBY, 2, -2.8F))));
        RUBY_SHOVEL = registerTools("ruby_shovel", new ShovelItem(ReItemMaterials.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterials.RUBY, 2.5F, -3.0F))));
        RUBY_HOE = registerTools("ruby_hoe", new HoeItem(ReItemMaterials.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterials.RUBY, -2, 0.0F))));
        RUBY_SWORD = registerTools("ruby_sword", new SwordItem(ReItemMaterials.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterials.RUBY, 4, -2.4F))));

        AMETHYST_AXE = registerTools("amethyst_axe", new AxeItem(ReItemMaterials.AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterials.AMETHYST, 6, -3.0F))));
        AMETHYST_PICKAXE = registerTools("amethyst_pickaxe", new PickaxeItem(ReItemMaterials.AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterials.AMETHYST, 1, -2.8F))));
        AMETHYST_SHOVEL = registerTools("amethyst_shovel", new ShovelItem(ReItemMaterials.AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterials.AMETHYST, 1.5F, -3.0F))));
        AMETHYST_HOE = registerTools("amethyst_hoe", new HoeItem(ReItemMaterials.AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterials.AMETHYST, -2, 0.0F))));
        AMETHYST_SWORD = registerTools("amethyst_sword", new SwordItem(ReItemMaterials.AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterials.AMETHYST, 3, -2.4F))));

        ULTIMATE_AXE = registerTools("ultimate_axe", new AxeItem(ReItemMaterials.TITANIUM, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterials.TITANIUM, 9, -3.0F))));
        ULTIMATE_PICKAXE = registerTools("ultimate_pickaxe", new PickaxeItem(ReItemMaterials.TITANIUM, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterials.TITANIUM, 4, -2.8F))));
        ULTIMATE_SHOVEL = registerTools("ultimate_shovel", new ShovelItem(ReItemMaterials.TITANIUM, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterials.TITANIUM, 4.5F, -3.0F))));
        ULTIMATE_HOE = registerTools("ultimate_hoe", new HoeItem(ReItemMaterials.TITANIUM, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterials.TITANIUM, -3, 0.0F))));
        ULTIMATE_SWORD = registerTools("ultimate_sword", new SwordItem(ReItemMaterials.TITANIUM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterials.TITANIUM, 6, -2.4F))));
        ULTIMATE_BOW = registerTools("ultimate_bow", new BowItem(new Item.Settings().maxDamage(1000)));

        EMERALD_AXE = registerTools("emerald_axe", new AxeItem(ReItemMaterials.EMERALD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ReItemMaterials.EMERALD, 8, -3.0F))));
        EMERALD_PICKAXE = registerTools("emerald_pickaxe", new PickaxeItem(ReItemMaterials.EMERALD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ReItemMaterials.EMERALD, 3, -2.8F))));
        EMERALD_SHOVEL = registerTools("emerald_shovel", new ShovelItem(ReItemMaterials.EMERALD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ReItemMaterials.EMERALD, 3.5F, -3.0F))));
        EMERALD_HOE = registerTools("emerald_hoe", new HoeItem(ReItemMaterials.EMERALD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ReItemMaterials.EMERALD, -2, 0.0F))));
        EMERALD_SWORD = registerTools("emerald_sword", new SwordItem(ReItemMaterials.EMERALD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterials.EMERALD, 5, -2.4F))));

        ROSE_SWORD = registerTools("rose_sword", new SwordItem(ReItemMaterials.ROSE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ReItemMaterials.ROSE, 1, -2.4F))));
    }

    public static Item registerTools(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RespawnEye.MODID, name), item);
    }

    public static void registryTools() {
        RespawnEye.LOGGER.info("Registering Tools for " + RespawnEye.MODID);
    }
}
