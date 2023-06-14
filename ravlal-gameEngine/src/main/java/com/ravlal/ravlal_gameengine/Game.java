package com.ravlal.ravlal_gameengine;

import com.ravlal.ravlal_gameengine.engine.Engine;
import com.ravlal.ravlal_gameengine.input.sensor.AccelerationController;
import com.ravlal.ravlal_gameengine.input.sensor.OrientationController;
import com.ravlal.ravlal_gameengine.ui.GameActivity;
import com.ravlal.ravlal_gameengine.ui.GameView;

/**
 * Created by Raviteja Emandi on 14,June,2023
 **/

public class Game {
    protected final GameActivity mActivity;
    protected final Engine mEngine;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Game(GameActivity activity, GameView gameView) {
        mActivity = activity;
        mEngine = new Engine(gameView);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public GameActivity getActivity() {
        return mActivity;
    }

    public Engine getEngine() {
        return mEngine;
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    public final void start() {
        mEngine.startGame();
        onStart();
    }

    public final void stop() {
        if (mEngine.isRunning()) {
            mEngine.stopGame();
            mEngine.disposeGame();
            onStop();
        }
    }

    public final void pause() {
        if (mEngine.isRunning() && !mEngine.isPaused()) {
            mEngine.pauseGame();
            onPause();
        }
    }

    public final void resume() {
        if (mEngine.isRunning() && mEngine.isPaused()) {
            mEngine.resumeGame();
            onResume();
        }
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    protected void onPause() {
    }

    protected void onResume() {
    }

    public void enableAccelerationSensor() {
        mEngine.setAccelerationController(new AccelerationController(mActivity));
    }

    public void disableAccelerationSensor() {
        if (mEngine.getAccelerationController() != null) {
            mEngine.getAccelerationController().stop();
        }
        mEngine.setAccelerationController(null);
    }

    public void enableOrientationSensor() {
        mEngine.setOrientationController(new OrientationController(mActivity));
    }

    public void disableOrientationSensor() {
        if (mEngine.getOrientationController() != null) {
            mEngine.getOrientationController().stop();
        }
        mEngine.setOrientationController(null);
    }
    //========================================================
}