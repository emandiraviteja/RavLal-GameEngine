package com.ravlal.ravlal_gameengine.entity.modifier;

import com.ravlal.ravlal_gameengine.entity.Entity;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class BaseModifier<T extends Entity> implements Modifier<T> {

    private ModifierListener mListener;
    private long mDuration;
    private long mStartDelay;
    private long mTotalTime;
    private boolean mIsRunning = false;
    private boolean mIsLooping = false;
    private boolean mIsAutoRemove = false;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected BaseModifier(long duration, long startDelay) {
        mDuration = duration;
        mStartDelay = startDelay;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public ModifierListener getListener() {
        return mListener;
    }

    @Override
    public void setListener(ModifierListener listener) {
        mListener = listener;
    }

    @Override
    public long getDuration() {
        return mDuration;
    }

    @Override
    public void setDuration(long duration) {
        mDuration = duration;
    }

    @Override
    public long getStartDelay() {
        return mStartDelay;
    }

    @Override
    public void setStartDelay(long startDelay) {
        mStartDelay = startDelay;
    }

    @Override
    public long getElapsedDuration() {
        return mTotalTime;
    }

    @Override
    public boolean isRunning() {
        return mIsRunning;
    }

    @Override
    public void setRunning(boolean running) {
        mIsRunning = running;
    }

    @Override
    public boolean isLooping() {
        return mIsLooping;
    }

    @Override
    public void setLooping(boolean looping) {
        mIsLooping = looping;
    }

    @Override
    public boolean isAutoRemove() {
        return mIsAutoRemove;
    }

    @Override
    public void setAutoRemove(boolean autoRemove) {
        mIsAutoRemove = autoRemove;
    }

    @Override
    public void init(T entity) {
        onStartModifier(entity);
        mIsRunning = true;
        mTotalTime = 0;
    }

    @Override
    public void update(T entity, long elapsedMillis) {
        if (!mIsRunning) {
            return;
        }
        mTotalTime += elapsedMillis;
        if (mTotalTime >= mDuration + mStartDelay) {
            onEndModifier(entity);
            if (!mIsLooping) {
                mIsRunning = false;
                if (mIsAutoRemove) {
                    entity.removeFromGame();
                }
            }
            mTotalTime = 0;
            if (mListener != null) {
                mListener.onModifierComplete();
            }
        } else if (mTotalTime < mStartDelay) {
            onStartModifier(entity);
        } else {
            float durationPercentage = (mTotalTime - mStartDelay) * 1f / mDuration;
            onUpdateModifier(entity, durationPercentage);
        }
    }

    @Override
    public void reset(T entity) {
        onResetModifier(entity);
        mIsRunning = false;
        mTotalTime = 0;
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    protected abstract void onStartModifier(T entity);

    protected abstract void onUpdateModifier(T entity, float durationPercentage);

    protected abstract void onEndModifier(T entity);

    protected abstract void onResetModifier(T entity);
    //========================================================

}
