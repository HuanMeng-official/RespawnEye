package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.item.ReTools;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ToolGroups {
    public static final ItemGroup TOOL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RespawnEye.MODID, "tools_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReTools.RUBY_AXE))
                    .displayName(Text.translatable("ig.respawneye.tool"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReTools.RUBY_AXE);
                        entries.add(ReTools.RUBY_PICKAXE);
                        entries.add(ReTools.RUBY_SHOVEL);
                        entries.add(ReTools.RUBY_HOE);
                        entries.add(ReTools.RUBY_SWORD);
                        entries.add(ReTools.AMETHYST_AXE);
                        entries.add(ReTools.AMETHYST_PICKAXE);
                        entries.add(ReTools.AMETHYST_SHOVEL);
                        entries.add(ReTools.AMETHYST_HOE);
                        entries.add(ReTools.AMETHYST_SWORD);
                        entries.add(ReTools.ULTIMATE_AXE);
                        entries.add(ReTools.ULTIMATE_PICKAXE);
                        entries.add(ReTools.ULTIMATE_SHOVEL);
                        entries.add(ReTools.ULTIMATE_HOE);
                        entries.add(ReTools.ULTIMATE_SWORD);
                        entries.add(ReTools.ULTIMATE_BOW);
                        entries.add(ReTools.EMERALD_AXE);
                        entries.add(ReTools.EMERALD_PICKAXE);
                        entries.add(ReTools.EMERALD_SHOVEL);
                        entries.add(ReTools.EMERALD_HOE);
                        entries.add(ReTools.EMERALD_SWORD);
                        entries.add(ReTools.ROSE_SWORD);
                    })
                    .build());

    public static void registryGroup() {
    }
}
