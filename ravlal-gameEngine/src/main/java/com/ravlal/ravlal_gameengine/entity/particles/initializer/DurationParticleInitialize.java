package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class DurationParticleInitialize implements ParticleInitializer {

    private final long mDuration;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public DurationParticleInitialize(long duration) {
        mDuration = duration;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        particle.setDuration(mDuration);
    }
    //========================================================

}
