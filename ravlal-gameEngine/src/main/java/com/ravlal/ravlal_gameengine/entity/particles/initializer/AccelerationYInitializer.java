package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public class AccelerationYInitializer implements ParticleInitializer {

    private final float mMinAccelerationY;
    private final float mMaxAccelerationY;

    public AccelerationYInitializer(float minAccelerationY, float maxAccelerationY) {
        mMinAccelerationY = minAccelerationY;
        mMaxAccelerationY = maxAccelerationY;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        particle.mAccelerationY = (random.nextFloat() *
                (mMaxAccelerationY - mMinAccelerationY) + mMinAccelerationY) / 1000f;
    }

}
