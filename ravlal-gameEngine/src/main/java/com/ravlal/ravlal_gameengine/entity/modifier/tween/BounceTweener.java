package com.ravlal.ravlal_gameengine.entity.modifier.tween;

import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class BounceTweener implements Tweener {

    private static final Interpolator INTERPOLATOR = new BounceInterpolator();

    private static BounceTweener INSTANCE;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private BounceTweener() {
    }
    //========================================================

    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static BounceTweener getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new BounceTweener();
        }

        return INSTANCE;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public float getTweenValue(float percentage) {
        return INTERPOLATOR.getInterpolation(percentage);
    }
    //========================================================

}
