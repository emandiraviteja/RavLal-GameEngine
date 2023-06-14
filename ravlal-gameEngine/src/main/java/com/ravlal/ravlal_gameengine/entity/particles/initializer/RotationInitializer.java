package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public class RotationInitializer implements ParticleInitializer {

    private final int mMinAngle;
    private final int mMaxAngle;

    public RotationInitializer(int minAngle, int maxAngle) {
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        particle.mRotation = random.nextFloat() * (mMaxAngle - mMinAngle) + mMinAngle;
    }

}
