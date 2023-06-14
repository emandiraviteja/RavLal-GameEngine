package com.ravlal.ravlal_gameengine.entity.modifier;

import com.ravlal.ravlal_gameengine.entity.Entity;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class DurationModifier extends BaseModifier<Entity> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public DurationModifier(long duration) {
        super(duration, 0);
    }

    public DurationModifier(long duration, long startDelay) {
        super(duration, startDelay);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onStartModifier(Entity entity) {
    }

    @Override
    protected void onUpdateModifier(Entity entity, float durationPercentage) {
    }

    @Override
    protected void onEndModifier(Entity entity) {
    }

    @Override
    protected void onResetModifier(Entity entity) {
    }
    //========================================================

}
