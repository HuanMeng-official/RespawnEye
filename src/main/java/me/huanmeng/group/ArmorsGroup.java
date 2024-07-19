package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.item.ReArmors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ArmorsGroup {
    public static final ItemGroup ARMORS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RespawnEye.MODID, "armors_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReArmors.RUBY_CHESTPLATE))
                    .displayName(Text.translatable("ig.respawneye.armor"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReArmors.RUBY_HELMET);
                        entries.add(ReArmors.RUBY_CHESTPLATE);
                        entries.add(ReArmors.RUBY_LEGGINGS);
                        entries.add(ReArmors.RUBY_BOOTS);
                        entries.add(ReArmors.AMETHYST_HELMET);
                        entries.add(ReArmors.AMETHYST_CHESTPLATE);
                        entries.add(ReArmors.AMETHYST_LEGGINGS);
                        entries.add(ReArmors.AMETHYST_BOOTS);
                        entries.add(ReArmors.EMERALD_HELMET);
                        entries.add(ReArmors.EMERALD_CHESTPLATE);
                        entries.add(ReArmors.EMERALD_LEGGINGS);
                        entries.add(ReArmors.EMERALD_BOOTS);
                        entries.add(ReArmors.ULTIMATE_HELMET);
                        entries.add(ReArmors.ULTIMATE_CHESTPLATE);
                        entries.add(ReArmors.ULTIMATE_LEGGINGS);
                        entries.add(ReArmors.ULTIMATE_BOOTS);
                    })
                    .build());

    public static void registryGroup() {
    }
}
