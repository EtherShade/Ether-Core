package net.ethershade.ethercore.item;

import net.ethershade.ethercore.EtherCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EtherCore.MOD_ID);

    public static final RegistryObject<Item> STONE_PEBBLE = ITEMS.register("stone_pebble",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_PEBBLE = ITEMS.register("diorite_pebble",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_PEBBLE = ITEMS.register("andesite_pebble",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_PEBBLE = ITEMS.register("granite_pebble",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
