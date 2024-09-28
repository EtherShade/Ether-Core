package net.ethershade.ethercore.datagen;

import net.ethershade.ethercore.EtherCore;
import net.ethershade.ethercore.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtherCore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.STONE_PEBBLE);
        simpleItem(ModItems.DIORITE_PEBBLE);
        simpleItem(ModItems.ANDESITE_PEBBLE);
        simpleItem(ModItems.GRANITE_PEBBLE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EtherCore.MOD_ID,"item/" + item.getId().getPath()));
    }
}
