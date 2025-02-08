package net.rmgbrand.humans.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ModAnimationDefinitions {

    public static final AnimationDefinition WALKING_ANIMATION = AnimationDefinition.Builder.withLength(1f).looping()
.addAnimation("RArm",
                      new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.25f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("LArm",
                                  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.75f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("RLeg",
                                  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.75f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("LLeg",
                                  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.25f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition IDLE_ANIMATION = AnimationDefinition.Builder.withLength(1f).looping().build();
}
