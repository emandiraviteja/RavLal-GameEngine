package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public class DurationInitialize implements ParticleInitializer {

    private final long mDuration;

    public DurationInitialize(long duration) {
        mDuration = duration;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        particle.mDuration = mDuration;
    }

}
