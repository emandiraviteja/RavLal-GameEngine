package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class FadeInModifier extends AlphaModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public FadeInModifier(long duration) {
        super(0, 255, duration);
    }

    public FadeInModifier(long duration, long startDelay) {
        super(0, 255, duration, startDelay);
    }

    public FadeInModifier(long duration, Tweener tweener) {
        super(0, 255, duration, tweener);
    }

    public FadeInModifier(long duration, long startDelay, Tweener tweener) {
        super(0, 255, duration, startDelay, tweener);
    }
    //========================================================

}
