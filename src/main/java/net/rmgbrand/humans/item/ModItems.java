package net.rmgbrand.humans.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.ModEntites;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Humans.MOD_ID);

   public static final RegistryObject<Item> MAN_SPAWN_EGG = ITEMS.register("man_spawn_egg",
           () -> new ForgeSpawnEggItem(ModEntites.MAN, 0x00afaf, 0x3f2a15,
                   new Item.Properties()));

   public static final RegistryObject<Item> WOMAN_SPAWN_EGG = ITEMS.register("woman_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntites.WOMAN, 0x8cbe8a, 0xeb983f,
                    new Item.Properties()));

   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
