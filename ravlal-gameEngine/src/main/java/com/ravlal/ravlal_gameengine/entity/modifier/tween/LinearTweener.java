package com.ravlal.ravlal_gameengine.entity.modifier.tween;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class LinearTweener implements Tweener {

    private static final Interpolator INTERPOLATOR = new LinearInterpolator();

    private static LinearTweener INSTANCE;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private LinearTweener() {
    }
    //========================================================

    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static LinearTweener getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LinearTweener();
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
