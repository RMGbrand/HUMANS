package net.rmgbrand.humans.entity.client;

import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rmgbrand.humans.Humans;
import net.rmgbrand.humans.entity.custom.ManEntity;
import net.rmgbrand.humans.entity.layers.ModModelLayers;

import java.util.Map;

public class ManRenderer extends MobRenderer<ManEntity, ManModel<ManEntity>> {
    private static final Map<Integer, ResourceLocation> TEXTURES = Util.make(Maps.newHashMap(), (map) -> {
        map.put(0, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_111.png"));
        map.put(1, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_112.png"));
        map.put(2, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_113.png"));
        map.put(3, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_121.png"));
        map.put(4, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_122.png"));
        map.put(5, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_123.png"));
        map.put(6, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_131.png"));
        map.put(7, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_132.png"));
        map.put(8, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_133.png"));
        map.put(9, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_211.png"));
        map.put(10, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_212.png"));
        map.put(11, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_213.png"));
        map.put(12, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_221.png"));
        map.put(13, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_222.png"));
        map.put(14, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_223.png"));
        map.put(15, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_231.png"));
        map.put(16, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_232.png"));
        map.put(17, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_233.png"));
        map.put(18, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_311.png"));
        map.put(19, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_312.png"));
        map.put(20, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_313.png"));
        map.put(21, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_321.png"));
        map.put(22, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_322.png"));
        map.put(23, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_323.png"));
        map.put(24, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_331.png"));
        map.put(25, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_332.png"));
        map.put(26, new ResourceLocation(Humans.MOD_ID, "textures/entity/man/man_333.png"));
        // Add more variants here as needed
    });

    public ManRenderer(EntityRendererProvider.Context context) {
        super(context, new ManModel<>(context.bakeLayer(ModModelLayers.MAN_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ManEntity pEntity) {
        return TEXTURES.getOrDefault(pEntity.getVariant(), TEXTURES.get(0));
    }
}