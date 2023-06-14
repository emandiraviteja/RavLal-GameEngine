package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;
import com.ravlal.ravlal_gameengine.util.math.RandomUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class SpeedYParticleInitializer implements ParticleInitializer {

    private final float mMinSpeedY;
    private final float mMaxSpeedY;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public SpeedYParticleInitializer(float minSpeedY, float maxSpeedY) {
        mMinSpeedY = minSpeedY;
        mMaxSpeedY = maxSpeedY;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinSpeedY, mMaxSpeedY) / 1000;
        particle.setSpeedY(value);
    }
    //========================================================

}
