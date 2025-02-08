package net.rmgbrand.humans.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.custom.ManEntity;
import net.rmgbrand.humans.entity.layers.ModModelLayers;

public class ManRenderer extends MobRenderer<ManEntity, ManModel<ManEntity>> {
    private static final ResourceLocation MAN_LOCATION = new ResourceLocation(Humans.MOD_ID, "textures/entity/man1.png");

    public ManRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ManModel<>(pContext.bakeLayer(ModModelLayers.MAN_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ManEntity manEntity) {
        return MAN_LOCATION;
    }
}
