package net.ethershade.ethercore.item;

import net.ethershade.ethercore.EtherCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EtherCore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ETHER_CORE_TAB = CREATIVE_MODE_TABS.register("ether_core_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONE_PEBBLE.get()))
                    .title(Component.translatable("creativetab.ether_core_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STONE_PEBBLE.get());
                        pOutput.accept(ModItems.DIORITE_PEBBLE.get());
                        pOutput.accept(ModItems.ANDESITE_PEBBLE.get());
                        pOutput.accept(ModItems.GRANITE_PEBBLE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
