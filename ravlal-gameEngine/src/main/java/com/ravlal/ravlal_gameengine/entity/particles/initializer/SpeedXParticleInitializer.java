package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class SpeedXParticleInitializer implements ParticleInitializer {

    private final float mMinSpeedX;
    private final float mMaxSpeedX;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public SpeedXParticleInitializer(float minSpeedX, float maxSpeedX) {
        mMinSpeedX = minSpeedX;
        mMaxSpeedX = maxSpeedX;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinSpeedX, mMaxSpeedX) / 1000;
        particle.setSpeedX(value);
    }
    //========================================================

}
