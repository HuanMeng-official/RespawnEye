package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.block.ReBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BlockGroups {
    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RespawnEye.MODID, "blocks_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReBlocks.RUBY_ORE))
                    .displayName(Text.translatable("ig.respawneye.block"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReBlocks.RUBY_ORE);
                        entries.add(ReBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ReBlocks.RUBY_BLOCK);
                        entries.add(ReBlocks.TITANIUM_ORE);
                        entries.add(ReBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ReBlocks.TITANIUM_BLOCK);
                        entries.add(ReBlocks.URANIUM_ORE);
                        entries.add(ReBlocks.DEEPSLATE_URANIUM_ORE);
                        entries.add(ReBlocks.URANIUM_BLOCK);
                        entries.add(ReBlocks.SALT_ORE);
                        entries.add(ReBlocks.DEEPSLATE_SALT_ORE);
                        entries.add(ReBlocks.TIGERS_EYE_ORE);
                        entries.add(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE);
                        entries.add(ReBlocks.TIGERS_EYE_BLOCK);
                    })
                    .build());

    public static void registryGroup() {
    }
}
