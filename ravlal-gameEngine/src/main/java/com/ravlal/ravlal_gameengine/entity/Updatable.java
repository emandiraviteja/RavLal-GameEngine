package com.ravlal.ravlal_gameengine.entity;

public interface Updatable {

    void update(long elapsedMillis);

    void addToGame();

    void removeFromGame();

    boolean isActive();

}
