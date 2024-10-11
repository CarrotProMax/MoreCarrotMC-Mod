package com.carrot;

import com.carrot.block.ModBlocks;
import com.carrot.item.Moditem;
import com.carrot.item.ModitemGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreCarrotMod implements ModInitializer {
	public static final String Mod_ID = "morecarrotmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);


	@Override
	public void onInitialize() {
		Moditem.registerModItem();
		ModitemGroup.registerModItemGroup();
		ModBlocks.registerModBlock();
	}
}