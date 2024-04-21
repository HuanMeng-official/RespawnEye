package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.item.ReArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ArmorGroups {
    public static final ItemGroup ARMORS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RespawnEye.MODID, "armors_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReArmor.RUBY_CHESTPLATE))
                    .displayName(Text.translatable("ig.respawneye.armor"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReArmor.RUBY_HELMET);
                        entries.add(ReArmor.RUBY_CHESTPLATE);
                        entries.add(ReArmor.RUBY_LEGGINGS);
                        entries.add(ReArmor.RUBY_BOOTS);
                        entries.add(ReArmor.AMETHYST_HELMET);
                        entries.add(ReArmor.AMETHYST_CHESTPLATE);
                        entries.add(ReArmor.AMETHYST_LEGGINGS);
                        entries.add(ReArmor.AMETHYST_BOOTS);
                    })
                    .build());

    public static void registryGroup() {
    }
}
