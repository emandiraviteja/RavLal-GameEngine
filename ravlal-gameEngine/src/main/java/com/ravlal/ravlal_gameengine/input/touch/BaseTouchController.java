package com.ravlal.ravlal_gameengine.input.touch;

import android.view.View;


import com.ravlal.ravlal_gameengine.util.pool.ObjectPool;
import com.ravlal.ravlal_gameengine.util.pool.Pool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class BaseTouchController implements TouchController {

    protected final Pool<TouchEvent> mTouchEventPool;

    protected boolean mIsEnable = false;

    protected final List<TouchEvent> mTouchEvents = new ArrayList<>();
    protected final List<TouchEvent> mTouchEventsBuffer = new ArrayList<>();

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected BaseTouchController(View view) {
        mTouchEventPool = new ObjectPool<>(new Pool.PoolObjectFactory<TouchEvent>() {
            @Override
            public TouchEvent createObject() {
                return new TouchEvent();
            }
        }, 100);
        view.setOnTouchListener(this);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void start() {
        mIsEnable = true;
    }

    @Override
    public void stop() {
        mIsEnable = false;
        mTouchEventPool.release();
        mTouchEvents.clear();
        mTouchEventsBuffer.clear();
    }

    @Override
    public void pause() {
        mIsEnable = false;
    }

    @Override
    public void resume() {
        mIsEnable = true;
    }
    //========================================================

}
