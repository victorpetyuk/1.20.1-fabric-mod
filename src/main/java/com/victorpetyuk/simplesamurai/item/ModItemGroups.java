package com.victorpetyuk.simplesamurai.item;

import com.victorpetyuk.simplesamurai.SimpleSamurai;
import com.victorpetyuk.simplesamurai.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SIMPLE_SAMURAI = Registry.register(Registries.ITEM_GROUP,
        new Identifier(SimpleSamurai.MOD_ID, "katana"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.simplesamurai"))
        .icon(() -> new ItemStack(ModItems.KATANA)).entries((displayContext, entries) -> {
            entries.add(ModItems.KATANA);
            entries.add(ModItems.RUBY);

            entries.add(ModBlocks.RUBY_BLOCK);
        }).build());

    public static void registerItemGroups() {
        SimpleSamurai.LOGGER.info("Registering Item Groups for " + SimpleSamurai.MOD_ID);
    }
}