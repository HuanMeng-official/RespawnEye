package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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
        RUBY_AXE = registerTools("ruby_axe", new AxeItem(ItemMaterial.RUBY, 7, -3.0F, new FabricItemSettings()));
        RUBY_PICKAXE = registerTools("ruby_pickaxe", new PickaxeItem(ItemMaterial.RUBY, 2, -2.8F, new FabricItemSettings()));
        RUBY_SHOVEL = registerTools("ruby_shovel", new ShovelItem(ItemMaterial.RUBY, 2.5F, -3.0F, new FabricItemSettings()));
        RUBY_HOE = registerTools("ruby_hoe", new HoeItem(ItemMaterial.RUBY, -2, 0.0F, new FabricItemSettings()));
        RUBY_SWORD = registerTools("ruby_sword", new SwordItem(ItemMaterial.RUBY, 4, -2.4F, new FabricItemSettings()));

        AMETHYST_AXE = registerTools("amethyst_axe", new AxeItem(ItemMaterial.AMETHYST, 6, -3.0F, new FabricItemSettings()));
        AMETHYST_PICKAXE = registerTools("amethyst_pickaxe", new PickaxeItem(ItemMaterial.AMETHYST, 1, -2.8F, new FabricItemSettings()));
        AMETHYST_SHOVEL = registerTools("amethyst_shovel", new ShovelItem(ItemMaterial.AMETHYST, 1.5F, -3.0F, new FabricItemSettings()));
        AMETHYST_HOE = registerTools("amethyst_hoe", new HoeItem(ItemMaterial.AMETHYST, -2, 0.0F, new FabricItemSettings()));
        AMETHYST_SWORD = registerTools("amethyst_sword", new SwordItem(ItemMaterial.AMETHYST, 3, -2.4F, new FabricItemSettings()));

        ULTIMATE_AXE = registerTools("ultimate_axe", new AxeItem(ItemMaterial.ULTIMATE, 9, -3.0F, new FabricItemSettings()));
        ULTIMATE_PICKAXE = registerTools("ultimate_pickaxe", new PickaxeItem(ItemMaterial.ULTIMATE, 4, -2.8F, new FabricItemSettings()));
        ULTIMATE_SHOVEL = registerTools("ultimate_shovel", new ShovelItem(ItemMaterial.ULTIMATE, 4.5F, -3.0F, new FabricItemSettings()));
        ULTIMATE_HOE = registerTools("ultimate_hoe", new HoeItem(ItemMaterial.ULTIMATE, -3, 0.0F, new FabricItemSettings()));
        ULTIMATE_SWORD = registerTools("ultimate_sword", new SwordItem(ItemMaterial.ULTIMATE, 6, -2.4F, new FabricItemSettings()));
        ULTIMATE_BOW = registerTools("ultimate_bow", new BowItem(new FabricItemSettings().maxDamage(1000)));

        EMERALD_AXE = registerTools("emerald_axe", new AxeItem(ItemMaterial.EMERALD, 8, -3.0F, new FabricItemSettings()));
        EMERALD_PICKAXE = registerTools("emerald_pickaxe", new PickaxeItem(ItemMaterial.EMERALD, 3, -2.8F, new FabricItemSettings()));
        EMERALD_SHOVEL = registerTools("emerald_shovel", new ShovelItem(ItemMaterial.EMERALD, 3.5F, -3.0F, new FabricItemSettings()));
        EMERALD_HOE = registerTools("emerald_hoe", new HoeItem(ItemMaterial.EMERALD, -2, 0.0F, new FabricItemSettings()));
        EMERALD_SWORD = registerTools("emerald_sword", new SwordItem(ItemMaterial.EMERALD, 5, -2.4F, new FabricItemSettings()));

        ROSE_SWORD = registerTools("rose_sword", new SwordItem(ItemMaterial.ROSE, 1, -2.4F, new FabricItemSettings()));
    }

    public static Item registerTools(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryTools() {
        RespawnEye.LOGGER.info("Registering Tools for " + RespawnEye.MODID);
    }
}
