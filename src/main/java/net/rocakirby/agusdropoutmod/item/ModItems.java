package net.rocakirby.agusdropoutmod.item;

import net.minecraft.world.item.*;
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
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND,3,-2.4F))));
    public static final RegistryObject<Item> AGUSTAINITA_PICKAXE = ITEMS.register("agustainita_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND,new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1.0F, -2.8F))));
    public static final RegistryObject<Item> AGUSTAINITA_AXE = ITEMS.register("agustainita_axe",
            () -> new AxeItem(Tiers.DIAMOND,new Item.Properties().attributes(AxeItem.createAttributes(Tiers.DIAMOND, 5.5F, -3.0F))));



    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
