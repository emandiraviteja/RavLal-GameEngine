package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public class SpeedAngleInitializer implements ParticleInitializer {

    private final float mSpeedMin;
    private final float mSpeedMax;
    private final int mMinAngle;
    private final int mMaxAngle;

    public SpeedAngleInitializer(float speedMin, float speedMax, int minAngle, int maxAngle) {
        mSpeedMin = speedMin;
        mSpeedMax = speedMax;
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        float speed = random.nextFloat() * (mSpeedMax - mSpeedMin) + mSpeedMin;
        float angle = random.nextFloat() * (mMaxAngle - mMinAngle) + mMinAngle;
        double angleInRads = Math.toRadians(angle);
        particle.mSpeedX = (float) (speed * Math.cos(angleInRads) / 1000);
        particle.mSpeedY = (float) (speed * Math.sin(angleInRads) / 1000);
    }

}
