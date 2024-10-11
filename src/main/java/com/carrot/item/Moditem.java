package com.carrot.item;

import com.carrot.MoreCarrotMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class Moditem {
    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new Item.Settings()));
    public static final Item CARROT = registerItems("carrot",new Item(new Item.Settings()));
    private  static void addItemToIG0(FabricItemGroupEntries fabricItemGroupEntries){
 //      fabricItemGroupEntries.add(ICE_ETHER);
    }
    private  static void addItemToIG1(FabricItemGroupEntries fabricItemGroupEntries){
 //       fabricItemGroupEntries.add(CARROT);
    }
    private static Item registerItems(String name, Item item){
        return Registry.register(Registries.ITEM,Identifier.of(MoreCarrotMod.Mod_ID,name),item);
    }

    public static void registerModItem(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditem::addItemToIG0);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditem::addItemToIG1);
    }
}
