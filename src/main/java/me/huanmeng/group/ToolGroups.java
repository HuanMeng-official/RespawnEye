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
            new Identifier(RespawnEye.MODID, "tools_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReTools.RUBY_AXE))
                    .displayName(Text.translatable("ig.respawneye.tool"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReTools.RUBY_AXE);
                        entries.add(ReTools.RUBY_PICKAXE);
                        entries.add(ReTools.RUBY_SHOVEL);
                        entries.add(ReTools.RUBY_HOE);
                        entries.add(ReTools.RUBY_SWORD);
                    })
                    .build());

    public static void registryGroup() {
    }
}
