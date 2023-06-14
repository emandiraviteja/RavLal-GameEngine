package com.ravlal.ravlal_gameengine.engine.loop;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Loop {

    void startLoop();

    void stopLoop();

    void pauseLoop();

    void resumeLoop();

    void updateLoop(long elapsedMillis);

    boolean isRunning();

    boolean isPaused();

}
