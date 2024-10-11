package com.carrot.block;

import com.carrot.MoreCarrotMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static  final Block CARROT_BLOCK = registerBlock("carrot_block",
            new Block((FabricBlockSettings.copyOf(Blocks.NETHERRACK))));
    public static  final Block TWO_LEVEL_CARROT_BLOCK = registerBlock("two_level_carrot_block",
            new Block((FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK))));
    public static  final Block THREE_LEVEL_CARROT_BLOCK = registerBlock("three_level_carrot_block",
            new Block((FabricBlockSettings.copyOf(Blocks.OBSIDIAN))));
    public static  final Block GOLD_CARROT_BLOCK = registerBlock("gold_carrot_block",
            new Block((FabricBlockSettings.copyOf(Blocks.STONE))));
    public static  final Block TWO_LEVEL_GOLD_CARROT_BLOCK = registerBlock("two_level_gold_carrot_block",
            new Block((FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK))));
    public static  final Block THREE_LEVEL_GOLD_CARROT_BLOCK = registerBlock("three_level_gold_carrot_block",
            new Block((FabricBlockSettings.copyOf(Blocks.OBSIDIAN))));
    public static  final Block GOLD_CARROT_BLOCK_ORE = registerBlock("gold_carrot_block_ore",
            new Block((FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK))));
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,Identifier.of(MoreCarrotMod.Mod_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(MoreCarrotMod.Mod_ID,name),
                new BlockItem(block,new Item.Settings()));
    }
    public static void registerModBlock(){

    }
}
