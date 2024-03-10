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

    static {
        RUBY_AXE = registerTools("ruby_axe", new AxeItem(ItemMaterial.RUBY, 3, -3.0F, new FabricItemSettings()));
        RUBY_PICKAXE = registerTools("ruby_pickaxe", new PickaxeItem(ItemMaterial.RUBY, -1, -2.8F, new FabricItemSettings()));
        RUBY_SHOVEL = registerTools("ruby_shovel", new ShovelItem(ItemMaterial.RUBY, -0.5F, -3.0F, new FabricItemSettings()));
        RUBY_HOE = registerTools("ruby_hoe", new HoeItem(ItemMaterial.RUBY, -18, 0.0F, new FabricItemSettings()));
        RUBY_SWORD = registerTools("ruby_sword", new SwordItem(ItemMaterial.RUBY, 1, -2.4F, new FabricItemSettings()));

        AMETHYST_AXE = registerTools("amethyst_axe", new AxeItem(ItemMaterial.AMETHYST, 3, -3.0F, new FabricItemSettings()));
        AMETHYST_PICKAXE = registerTools("amethyst_pickaxe", new PickaxeItem(ItemMaterial.AMETHYST, -1, -2.8F, new FabricItemSettings()));
        AMETHYST_SHOVEL = registerTools("amethyst_shovel", new ShovelItem(ItemMaterial.AMETHYST, -0.5F, -3.0F, new FabricItemSettings()));
        AMETHYST_HOE = registerTools("amethyst_hoe", new HoeItem(ItemMaterial.AMETHYST, -13, 0.0F, new FabricItemSettings()));
        AMETHYST_SWORD = registerTools("amethyst_sword", new SwordItem(ItemMaterial.AMETHYST, 1, -2.4F, new FabricItemSettings()));

        ULTIMATE_AXE = registerTools("ultimate_axe", new AxeItem(ItemMaterial.TITANIUM, 3, -3.0F, new FabricItemSettings()));
        ULTIMATE_PICKAXE = registerTools("ultimate_pickaxe", new PickaxeItem(ItemMaterial.TITANIUM, -1, -2.8F, new FabricItemSettings()));
        ULTIMATE_SHOVEL = registerTools("ultimate_shovel", new ShovelItem(ItemMaterial.TITANIUM, -0.5F, -3.0F, new FabricItemSettings()));
        ULTIMATE_HOE = registerTools("ultimate_hoe", new HoeItem(ItemMaterial.TITANIUM, -38, 0.0F, new FabricItemSettings()));
        ULTIMATE_SWORD = registerTools("ultimate_sword", new SwordItem(ItemMaterial.TITANIUM, 1, -2.4F, new FabricItemSettings()));
    }

    public static Item registerTools(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryTools() {
        RespawnEye.LOGGER.info("Registering Tools for " + RespawnEye.MODID);
    }
}
