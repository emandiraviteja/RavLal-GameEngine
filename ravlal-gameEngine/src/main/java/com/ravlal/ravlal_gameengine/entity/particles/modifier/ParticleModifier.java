package com.ravlal.ravlal_gameengine.entity.particles.modifier;

import com.ravlal.ravlal_gameengine.entity.particles.Particle;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface ParticleModifier {

    void updateParticle(Particle particle, long elapsedMillis);

}
