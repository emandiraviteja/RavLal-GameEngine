package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class AccelerationXParticleInitializer implements ParticleInitializer {

    private final float mMinAccelerationX;
    private final float mMaxAccelerationX;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public AccelerationXParticleInitializer(float minAccelerationX, float maxAccelerationX) {
        mMinAccelerationX = minAccelerationX;
        mMaxAccelerationX = maxAccelerationX;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinAccelerationX, mMaxAccelerationX) / 1000;
        particle.setAccelerationX(value);
    }
    //========================================================

}
