package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class ScaleOutModifier extends ScaleModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public ScaleOutModifier(long duration) {
        super(1, 0, duration);
    }

    public ScaleOutModifier(long duration, long startDelay) {
        super(1, 0, duration, startDelay);
    }

    public ScaleOutModifier(long duration, Tweener tweener) {
        super(1, 0, duration, tweener);
    }

    public ScaleOutModifier(long duration, long startDelay, Tweener tweener) {
        super(1, 0, duration, startDelay, tweener);
    }
    //========================================================

}
