package com.ravlal.ravlal_gameengine.engine;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public interface Updatable {

    boolean isRunning();

    void setRunning(boolean running);

    boolean isActive();

    void setActive(boolean active);

    void addToGame();

    void removeFromGame();

    void update(long elapsedMillis);

    void reset();

}
