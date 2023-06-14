package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;
import com.ravlal.ravlal_gameengine.entity.sprite.Sprite;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class RotationModifier extends SingleValueSpriteModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public RotationModifier(float startValue, float endValue, long duration) {
        super(startValue, endValue, duration);
    }

    public RotationModifier(float startValue, float endValue, long duration, long startDelay) {
        super(startValue, endValue, duration, startDelay);
    }

    public RotationModifier(float startValue, float endValue, long duration, Tweener tweener) {
        super(startValue, endValue, duration, tweener);
    }

    public RotationModifier(float startValue, float endValue, long duration, long startDelay, Tweener tweener) {
        super(startValue, endValue, duration, startDelay, tweener);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onInitValue(Sprite sprite, float rotation) {
        sprite.setRotation(rotation);
    }

    @Override
    protected void onUpdateValue(Sprite sprite, float rotation) {
        sprite.setRotation(rotation);
    }

    @Override
    protected void onEndValue(Sprite sprite, float rotation) {
        sprite.setRotation(rotation);
    }
    //========================================================

}
