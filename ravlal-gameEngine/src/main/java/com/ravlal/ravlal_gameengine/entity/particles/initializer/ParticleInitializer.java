package com.ravlal.ravlal_gameengine.entity.particles.initializer;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

import java.util.Random;

public interface ParticleInitializer {

    void initParticle(Particle particle, Random random);

}
