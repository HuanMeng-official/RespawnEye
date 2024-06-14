package me.huanmeng.respawneye;

import com.mojang.logging.LogUtils;
import me.huanmeng.respawneye.group.FoodsGroup;
import me.huanmeng.respawneye.group.ItemsGroup;
import me.huanmeng.respawneye.group.ToolsGroup;
import me.huanmeng.respawneye.item.ReFoods;
import me.huanmeng.respawneye.item.ReItems;
import me.huanmeng.respawneye.item.ReTools;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(RespawnEye.MODID)
public class RespawnEye {
    public static final String MODID = "respawneye";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RespawnEye(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
        // Registry Bus
        ReItems.registryItems(modEventBus);
        ReFoods.registryItems(modEventBus);
        ReTools.registryTools(modEventBus);
        ItemsGroup.registryGroup(modEventBus);
        FoodsGroup.registryGroup(modEventBus);
        ToolsGroup.registryGroup(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
