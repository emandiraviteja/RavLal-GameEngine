package com.ravlal.ravlal_gameengine.entity.sprite.animation;

import com.ravlal.ravlal_gameengine.util.math.MathUtils;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Animation {

    private long[] mFrameDurations;
    private long mDuration;
    private int mFrameCount;
    private boolean mIsLooping;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Animation() {
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public long[] getFrameDurations() {
        return mFrameDurations;
    }

    public long getDuration() {
        return mDuration;
    }

    public int getFrameCount() {
        return mFrameCount;
    }

    public boolean isLooping() {
        return mIsLooping;
    }

    public void set(long frameDuration, int frameCount) {
        set(MathUtils.fill(frameDuration, frameCount), false);
    }

    public void set(long frameDuration, int frameCount, boolean looping) {
        set(MathUtils.fill(frameDuration, frameCount), looping);
    }

    public void set(long[] frameDurations) {
        set(frameDurations, false);
    }

    public void set(long[] frameDurations, boolean looping) {
        mFrameDurations = frameDurations;
        mDuration = MathUtils.sum(mFrameDurations);
        mFrameCount = mFrameDurations.length;
        mIsLooping = looping;
    }
    //========================================================

}
