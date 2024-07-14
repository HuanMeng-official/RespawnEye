package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.item.ReItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FoodsGroup {
    public static final ItemGroup FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RespawnEye.MODID, "foods_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReItems.SPARK_FISH))
                    .displayName(Text.translatable("ig.respawneye.food"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReItems.SPARK_FISH);
                    })
                    .build());

    public static void registryGroup() {
    }
}
