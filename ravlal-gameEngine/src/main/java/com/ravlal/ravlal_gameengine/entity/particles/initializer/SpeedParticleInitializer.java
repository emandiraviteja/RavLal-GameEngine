package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class SpeedParticleInitializer implements ParticleInitializer {

    private final float mMinSpeed;
    private final float mMaxSpeed;
    private final int mMinAngle;
    private final int mMaxAngle;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public SpeedParticleInitializer(float minSpeed, float maxSpeed, int minAngle, int maxAngle) {
        mMinSpeed = minSpeed;
        mMaxSpeed = maxSpeed;
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float speed = RandomUtils.nextFloat(mMinSpeed, mMaxSpeed);
        float angle = RandomUtils.nextFloat(mMinAngle, mMaxAngle);
        double angleInRads = Math.toRadians(angle);
        float valueX = (float) (speed * Math.cos(angleInRads) / 1000);
        float valueY = (float) (speed * Math.sin(angleInRads) / 1000);
        particle.setSpeedX(valueX);
        particle.setSpeedY(valueY);
    }
    //========================================================

}
