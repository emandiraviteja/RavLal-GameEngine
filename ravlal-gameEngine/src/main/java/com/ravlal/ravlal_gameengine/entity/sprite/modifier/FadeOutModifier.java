package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class FadeOutModifier extends AlphaModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public FadeOutModifier(long duration) {
        super(255, 0, duration);
    }

    public FadeOutModifier(long duration, long startDelay) {
        super(255, 0, duration, startDelay);
    }

    public FadeOutModifier(long duration, Tweener tweener) {
        super(255, 0, duration, tweener);
    }

    public FadeOutModifier(long duration, long startDelay, Tweener tweener) {
        super(255, 0, duration, startDelay, tweener);
    }
    //========================================================

}
