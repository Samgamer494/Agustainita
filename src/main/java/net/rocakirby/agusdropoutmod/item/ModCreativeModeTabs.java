package net.rocakirby.agusdropoutmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rocakirby.agusdropoutmod.AgusDropOut;
import net.rocakirby.agusdropoutmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AgusDropOut.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AGUSDROPOUT_MOD_TAB = CREATIVE_MODE_TABS.register("agustainita_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AGUSTAINITA.get()))
                    .title(Component.translatable("creativetab.agusdropoutmod.agustainita_mod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AGUSTAINITA.get());
                        output.accept(ModItems.AGUSTAINITA_SWORD.get());
                        output.accept(ModItems.AGUSTAINITA_PICKAXE.get());
                        output.accept(ModItems.AGUSTAINITA_AXE.get());
                        output.accept(ModBlocks.AGUSTAINITA_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
