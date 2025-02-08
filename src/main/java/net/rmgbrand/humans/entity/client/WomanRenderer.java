package net.rmgbrand.humans.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.custom.ManEntity;
import net.rmgbrand.humans.entity.custom.WomanEntity;
import net.rmgbrand.humans.entity.layers.ModModelLayers;

public class WomanRenderer extends MobRenderer<WomanEntity, WomanModel<WomanEntity>> {
    private static final ResourceLocation WOMAN_LOCATION = new ResourceLocation(Humans.MOD_ID, "textures/entity/woman1.png");

    public WomanRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new WomanModel<>(pContext.bakeLayer(ModModelLayers.WOMAN_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(WomanEntity womanEntity) {
        return WOMAN_LOCATION;
    }
}