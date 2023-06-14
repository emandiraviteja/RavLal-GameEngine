package com.ravlal.ravlal_gameengine.entity.runnable;

import com.ravlal.ravlal_gameengine.engine.Engine;
import com.ravlal.ravlal_gameengine.entity.Entity;
import com.ravlal.ravlal_gameengine.ui.GameActivity;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class RunnableEntity extends Entity implements Runnable {

    protected final GameActivity mActivity;

    private boolean mIsPostRunnable = false;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected RunnableEntity(GameActivity activity, Engine engine) {
        super(engine);
        mActivity = activity;
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public boolean isPostRunnable() {
        return mIsPostRunnable;
    }

    public void setPostRunnable(boolean post) {
        mIsPostRunnable = post;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void onPostUpdate(long elapsedMillis) {
        if (mIsPostRunnable) {
            mActivity.runOnUiThread(this);
            mIsPostRunnable = false;
            // Important to only post the Runnable one time, so it won't block the ui thread
        }
    }

    @Override
    public void run() {
        onUpdateRunnable();
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    protected abstract void onUpdateRunnable();
    //========================================================

}
