package com.carrot.item;

import com.carrot.MoreCarrotMod;
import com.carrot.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//自己的一个物品栏

public class ModitemGroup {
    public  static  final ItemGroup RADISH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreCarrotMod.Mod_ID,"radish_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.radish_group"))
                    .icon(()-> new ItemStack(Moditem.CARROT)).entries((displayContext, entries) -> {
                        entries.add(Moditem.CARROT);
                        entries.add(ModBlocks.CARROT_BLOCK);
                        entries.add(ModBlocks.TWO_LEVEL_CARROT_BLOCK);
                        entries.add(ModBlocks.THREE_LEVEL_CARROT_BLOCK);
                        entries.add(ModBlocks.GOLD_CARROT_BLOCK);
                        entries.add(ModBlocks.TWO_LEVEL_GOLD_CARROT_BLOCK);
                        entries.add(ModBlocks.THREE_LEVEL_GOLD_CARROT_BLOCK);
                        entries.add(ModBlocks.GOLD_CARROT_BLOCK_ORE);

                    }).build());


    public  static void registerModItemGroup(){


    }
}
