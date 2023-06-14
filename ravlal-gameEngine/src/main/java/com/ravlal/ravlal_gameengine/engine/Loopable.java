package com.ravlal.ravlal_gameengine.engine;

public interface Loopable {

    void startLoop();

    void stopLoop();

    void pauseLoop();

    void resumeLoop();

    boolean isRunning();

    boolean isPaused();

    void onLoopUpdate(long elapsedMillis);

}
