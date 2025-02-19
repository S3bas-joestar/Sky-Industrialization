package net.s3bas08.skyindustrialization.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.s3bas08.skyindustrialization.SkyIndustrialization;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SkyIndustrialization.MODID);

    public static final DeferredItem<Item> GEAR = ITEMS.register("wooden_gear",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MESH = ITEMS.register("mesh",
            ()-> new Item(new Item.Properties()));

    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
