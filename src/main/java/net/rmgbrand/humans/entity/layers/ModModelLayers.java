package net.rmgbrand.humans.entity.layers;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.rmgbrand.humans.Humans;

public class ModModelLayers {
    public static final ModelLayerLocation MAN_LAYER = new ModelLayerLocation(
            new ResourceLocation(Humans.MOD_ID,"man_layer"),"man_layer");

    public static final ModelLayerLocation WOMAN_LAYER = new ModelLayerLocation(
            new ResourceLocation(Humans.MOD_ID,"woman_layer"),"woman_layer");

}
