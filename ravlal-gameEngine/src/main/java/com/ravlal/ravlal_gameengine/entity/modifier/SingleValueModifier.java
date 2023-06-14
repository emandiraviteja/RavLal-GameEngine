package com.ravlal.ravlal_gameengine.entity.modifier;

import com.ravlal.ravlal_gameengine.entity.Entity;
import com.ravlal.ravlal_gameengine.entity.modifier.tween.Tweener;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class SingleValueModifier<T extends Entity> extends BaseValueModifier<T> {

    private float mStartValue;
    private float mEndValue;
    private float mRange;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected SingleValueModifier(float startValue, float endValue,
                                  long duration, long startDelay, Tweener tweener) {
        super(duration, startDelay, tweener);
        mStartValue = startValue;
        mEndValue = endValue;
        mRange = endValue - startValue;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public float getStartValue() {
        return mStartValue;
    }

    public float getEndValue() {
        return mEndValue;
    }

    public void setValue(float startValue, float endValue) {
        mStartValue = startValue;
        mEndValue = endValue;
        mRange = endValue - startValue;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void initValue(T entity) {
        onInitValue(entity, mStartValue);
    }

    @Override
    protected void updateValue(T entity, float percentage) {
        float currentValue = mStartValue + mRange * percentage;
        onUpdateValue(entity, currentValue);
    }

    @Override
    protected void endValue(T entity) {
        onEndValue(entity, mEndValue);
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    protected abstract void onInitValue(T entity, float value);

    protected abstract void onUpdateValue(T entity, float value);

    protected abstract void onEndValue(T entity, float value);
    //========================================================

}
