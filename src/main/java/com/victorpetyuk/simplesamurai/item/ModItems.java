package com.victorpetyuk.simplesamurai.item;

import com.victorpetyuk.simplesamurai.SimpleSamurai;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KATANA = registerItem("katana", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 7, 1.6f, new FabricItemSettings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(KATANA);
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(RUBY_SWORD);
    }
    //ivory, jade, ruby, steel
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleSamurai.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimpleSamurai.LOGGER.info("Registering Mod Items for " + SimpleSamurai.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }


}
