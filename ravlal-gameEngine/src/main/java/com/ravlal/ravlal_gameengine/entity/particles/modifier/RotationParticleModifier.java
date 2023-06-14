package com.ravlal.ravlal_gameengine.entity.particles.modifier;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class RotationParticleModifier implements ParticleModifier {

    private final float mStartValue;
    private final float mRange;
    private final long mStartDelay;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public RotationParticleModifier(float startValue, float endValue, long startDelay) {
        mStartValue = startValue;
        mRange = endValue - startValue;
        mStartDelay = startDelay;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void updateParticle(Particle particle, long elapsedMillis) {
        if (elapsedMillis < mStartDelay) {
            particle.setRotation(mStartValue);
        } else {
            float percentage = (elapsedMillis - mStartDelay) * 1f / (particle.getDuration() - mStartDelay);
            float value = mStartValue + mRange * percentage;
            particle.setRotation(value);
        }
    }
    //========================================================

}