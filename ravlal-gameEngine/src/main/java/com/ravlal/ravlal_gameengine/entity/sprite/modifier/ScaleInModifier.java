package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class ScaleInModifier extends ScaleModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public ScaleInModifier(long duration) {
        super(0, 1, duration);
    }

    public ScaleInModifier(long duration, long startDelay) {
        super(0, 1, duration, startDelay);
    }

    public ScaleInModifier(long duration, Tweener tweener) {
        super(0, 1, duration, tweener);
    }

    public ScaleInModifier(long duration, long startDelay, Tweener tweener) {
        super(0, 1, duration, startDelay, tweener);
    }
    //========================================================

}
