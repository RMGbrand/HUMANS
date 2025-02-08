package net.rmgbrand.humans.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rmgbrand.humans.Humans;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Humans.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HUMANS_TAB = CREATIVE_MODE_TABS.register("humans_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAN_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.humans_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.MAN_SPAWN_EGG.get());
                        output.accept(ModItems.WOMAN_SPAWN_EGG.get());




                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
