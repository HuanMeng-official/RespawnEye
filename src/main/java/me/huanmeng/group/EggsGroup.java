package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.item.ReEggs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EggsGroup {
    public static final ItemGroup EGGS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RespawnEye.MODID, "eggs_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReEggs.ANT_SPAWN_EGG))
                    .displayName(Text.translatable("ig.respawneye.egg"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReEggs.ANT_SPAWN_EGG);
                    })
                    .build());

    public static void registryGroup() {
    }
}
