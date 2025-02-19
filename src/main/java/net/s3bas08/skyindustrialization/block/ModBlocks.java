package net.s3bas08.skyindustrialization.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.s3bas08.skyindustrialization.SkyIndustrialization;
import net.s3bas08.skyindustrialization.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SkyIndustrialization.MODID);


    public static final DeferredBlock<Block> SLUICE_BOX = registerBlock("sluice_box",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .strength(2.0f, 3.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));


private static  <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
    DeferredBlock<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
}


    private static  <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
}
}
