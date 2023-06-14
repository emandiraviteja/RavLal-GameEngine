package com.ravlal.ravlal_gameengine.entity.sprite.modifier;

import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;
import com.ravlal.ravlal_gameengine.entity.sprite.Sprite;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class PositionXModifier extends SingleValueSpriteModifier {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public PositionXModifier(long duration) {
        super(0, 0, duration);
    }

    public PositionXModifier(long duration, long startDelay) {
        super(0, 0, duration, startDelay);
    }

    public PositionXModifier(long duration, Tweener tweener) {
        super(0, 0, duration, tweener);
    }

    public PositionXModifier(long duration, long startDelay, Tweener tweener) {
        super(0, 0, duration, startDelay, tweener);
    }

    public PositionXModifier(float startValue, float endValue, long duration) {
        super(startValue, endValue, duration);
    }

    public PositionXModifier(float startValue, float endValue, long duration, long startDelay) {
        super(startValue, endValue, duration, startDelay);
    }

    public PositionXModifier(float startValue, float endValue, long duration, Tweener tweener) {
        super(startValue, endValue, duration, tweener);
    }

    public PositionXModifier(float startValue, float endValue, long duration, long startDelay, Tweener tweener) {
        super(startValue, endValue, duration, startDelay, tweener);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onInitValue(Sprite sprite, float positionX) {
        sprite.setX(positionX);
    }

    @Override
    protected void onUpdateValue(Sprite sprite, float positionX) {
        sprite.setX(positionX);
    }

    @Override
    protected void onEndValue(Sprite sprite, float positionX) {
        sprite.setX(positionX);
    }
    //========================================================

}
