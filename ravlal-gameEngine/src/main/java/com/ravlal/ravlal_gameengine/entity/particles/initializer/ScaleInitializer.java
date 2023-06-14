package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public class ScaleInitializer implements ParticleInitializer {

    private final float mInitialValue;
    private final float mFinalValue;
    private final long mStartDelay;

    public ScaleInitializer(float initialValue, float finalValue, long startDelay) {
        mInitialValue = initialValue;
        mFinalValue = finalValue;
        mStartDelay = startDelay;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        particle.mScale = mInitialValue;
        particle.mScaleSpeed = (mFinalValue - mInitialValue) / (particle.mDuration - mStartDelay);
        particle.mScaleStartDelay = mStartDelay;
    }

}
