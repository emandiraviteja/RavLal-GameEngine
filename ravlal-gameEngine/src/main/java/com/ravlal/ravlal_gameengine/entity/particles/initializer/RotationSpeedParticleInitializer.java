package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class RotationSpeedParticleInitializer implements ParticleInitializer {

    private final float mMinRotationSpeed;
    private final float mMaxRotationSpeed;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public RotationSpeedParticleInitializer(float minRotationSpeed, float maxRotationSpeed) {
        mMinRotationSpeed = minRotationSpeed;
        mMaxRotationSpeed = maxRotationSpeed;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinRotationSpeed, mMaxRotationSpeed) / 1000;
        particle.setRotationSpeed(value);
    }
    //========================================================

}
