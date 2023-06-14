package com.ravlal.ravlal_gameengine.entity.modifier.tween;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class DecelerateTweener implements Tweener {

    private static final Interpolator INTERPOLATOR = new DecelerateInterpolator();

    private static DecelerateTweener INSTANCE;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private DecelerateTweener() {
    }
    //========================================================

    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static DecelerateTweener getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DecelerateTweener();
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
