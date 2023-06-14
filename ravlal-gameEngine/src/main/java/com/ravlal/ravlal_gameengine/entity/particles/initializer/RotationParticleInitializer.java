package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class RotationParticleInitializer implements ParticleInitializer {

    private final int mMinAngle;
    private final int mMaxAngle;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public RotationParticleInitializer(int minAngle, int maxAngle) {
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinAngle, mMaxAngle);
        particle.setRotation(value);
    }
    //========================================================

}
