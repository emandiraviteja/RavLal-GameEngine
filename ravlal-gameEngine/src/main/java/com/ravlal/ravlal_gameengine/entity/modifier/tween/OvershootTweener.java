package com.ravlal.ravlal_gameengine.entity.modifier.tween;

import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class OvershootTweener implements Tweener {

    private static final Interpolator INTERPOLATOR = new OvershootInterpolator();

    private static OvershootTweener INSTANCE;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private OvershootTweener() {
    }
    //========================================================

    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static OvershootTweener getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OvershootTweener();
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
