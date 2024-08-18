package net.rocakirby.agusdropoutmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rocakirby.agusdropoutmod.AgusDropOut;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AgusDropOut.MOD_ID);

    public static final RegistryObject<Item> AGUSTAINITA = ITEMS.register("agustainita",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AGUSTAINITA_SWORD = ITEMS.register("agustainita_sword",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
