package net.rmgbrand.humans.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.ModEntites;
import net.rmgbrand.humans.entity.client.ManModel;
import net.rmgbrand.humans.entity.client.WomanModel;
import net.rmgbrand.humans.entity.custom.ManEntity;
import net.rmgbrand.humans.entity.custom.WomanEntity;
import net.rmgbrand.humans.entity.layers.ModModelLayers;

@Mod.EventBusSubscriber(modid = Humans.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MAN_LAYER, ManModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.WOMAN_LAYER, WomanModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntites.MAN.get(), ManEntity.createAttributes().build());
        event.put(ModEntites.WOMAN.get(), WomanEntity.createAttributes().build());
    }
}
