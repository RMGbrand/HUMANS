package net.rmgbrand.humans.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.ModEntites;
import net.rmgbrand.humans.entity.client.ManModel;
import net.rmgbrand.humans.entity.custom.ManEntity;
import net.rmgbrand.humans.entity.layers.ModModelLayers;

import javax.swing.text.html.parser.Entity;

@Mod.EventBusSubscriber(modid = Humans.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MAN_LAYER, ManModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntites.MAN.get(), ManEntity.createAttributes().build());
    }
}
