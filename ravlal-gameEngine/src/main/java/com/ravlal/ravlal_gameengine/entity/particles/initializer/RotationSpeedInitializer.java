package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public class RotationSpeedInitializer implements ParticleInitializer {

    private final float mMinRotationSpeed;
    private final float mMaxRotationSpeed;

    public RotationSpeedInitializer(float minRotationSpeed, float maxRotationSpeed) {
        mMinRotationSpeed = minRotationSpeed;
        mMaxRotationSpeed = maxRotationSpeed;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        particle.mRotationSpeed = (random.nextFloat() *
                (mMaxRotationSpeed - mMinRotationSpeed) + mMinRotationSpeed) / 1000f;
    }

}
