package me.huanmeng;

import me.huanmeng.util.RegistryEntity;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespawnEye implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("RespawnEye");
	public static final String MODID = "respawneye";

	@Override
	public void onInitialize() {
		RegistryEntity.registryEntities();
	}
}