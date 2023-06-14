package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.SingleValueModifier;
import com.ravlal.ravlal_gameengine.entity.modifier.tween.LinearTweener;
import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;
import com.ravlal.ravlal_gameengine.entity.sprite.Sprite;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class SingleValueSpriteModifier extends SingleValueModifier<Sprite> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected SingleValueSpriteModifier(float startValue, float endValue, long duration) {
        super(startValue, endValue, duration, 0, LinearTweener.getInstance());
    }

    protected SingleValueSpriteModifier(float startValue, float endValue, long duration, long startDelay) {
        super(startValue, endValue, duration, startDelay, LinearTweener.getInstance());
    }

    protected SingleValueSpriteModifier(float startValue, float endValue, long duration, Tweener tweener) {
        super(startValue, endValue, duration, 0, tweener);
    }

    protected SingleValueSpriteModifier(float startValue, float endValue, long duration, long startDelay, Tweener tweener) {
        super(startValue, endValue, duration, startDelay, tweener);
    }
    //========================================================

}
