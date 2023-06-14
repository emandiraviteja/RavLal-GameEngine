package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.DoubleValueModifier;
import com.ravlal.ravlal_gameengine.entity.modifier.tween.LinearTweener;
import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;
import com.ravlal.ravlal_gameengine.entity.sprite.Sprite;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class DoubleValueSpriteModifier extends DoubleValueModifier<Sprite> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected DoubleValueSpriteModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration) {
        super(startValueX, endValueX, startValueY, endValueY, duration, 0, LinearTweener.getInstance());
    }

    protected DoubleValueSpriteModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration, long startDelay) {
        super(startValueX, endValueX, startValueY, endValueY, duration, startDelay, LinearTweener.getInstance());
    }

    protected DoubleValueSpriteModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration, Tweener tweener) {
        super(startValueX, endValueX, startValueY, endValueY, duration, 0, tweener);
    }

    protected DoubleValueSpriteModifier(float startValueX, float endValueX, float startValueY, float endValueY,
                                        long duration, long startDelay, Tweener tweener) {
        super(startValueX, endValueX, startValueY, endValueY, duration, startDelay, tweener);
    }
    //========================================================

}
