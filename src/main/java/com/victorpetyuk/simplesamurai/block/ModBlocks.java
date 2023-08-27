package com.victorpetyuk.simplesamurai.block;

import com.victorpetyuk.simplesamurai.SimpleSamurai;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModBlocks {
    
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SimpleSamurai.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleSamurai.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SimpleSamurai.LOGGER.info("Registering ModBlocks for " + SimpleSamurai.MOD_ID);
    }
}
