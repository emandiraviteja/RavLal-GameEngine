package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class AccelerationYParticleInitializer implements ParticleInitializer {

    private final float mMinAccelerationY;
    private final float mMaxAccelerationY;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public AccelerationYParticleInitializer(float minAccelerationY, float maxAccelerationY) {
        mMinAccelerationY = minAccelerationY;
        mMaxAccelerationY = maxAccelerationY;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinAccelerationY, mMaxAccelerationY) / 1000;
        particle.setAccelerationY(value);
    }
    //========================================================

}
