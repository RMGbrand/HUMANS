package net.rmgbrand.humans.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.custom.ManEntity;

public class ModEntites {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Humans.MOD_ID);

    public static final RegistryObject<EntityType<ManEntity>> MAN =
            ENTITY_TYPES.register("man", () -> EntityType.Builder.of(ManEntity::new, MobCategory.CREATURE)
                    .sized(1f,2f).build("man"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
