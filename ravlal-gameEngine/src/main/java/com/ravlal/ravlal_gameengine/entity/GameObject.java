package com.ravlal.ravlal_gameengine.entity;

import com.ravlal.ravlal_gameengine.Game;
import com.ravlal.ravlal_gameengine.event.GameEvent;
import com.ravlal.ravlal_gameengine.event.GameEventListener;

public abstract class GameObject implements Updatable, GameEventListener {

    protected final Game mGame;

    public boolean mIsActive = false;

    protected GameObject(Game game) {
        mGame = game;
    }

    @Override
    public void update(long elapsedMillis) {
        onPreUpdate(elapsedMillis);
        onUpdate(elapsedMillis);
        onPostUpdate(elapsedMillis);
    }

    @Override
    public void addToGame() {
        mIsActive = true;
        mGame.getGameEngine().addUpdatable(this);
        onStart();
    }

    @Override
    public void removeFromGame() {
        mIsActive = false;
        mGame.getGameEngine().removeUpdatable(this);
        onRemove();
    }

    @Override
    public boolean isActive() {
        return mIsActive;
    }

    public abstract void onUpdate(long elapsedMillis);

    public void onPreUpdate(long elapsedMillis) {
    }

    public void onPostUpdate(long elapsedMillis) {
    }

    public void onStart() {
    }

    public void onRemove() {
    }

    @Override
    public void gameEvent(GameEvent gameEvent) {
        mGame.getGameEngine().onGameEvent(gameEvent);
    }

    @Override
    public void onGameEvent(GameEvent gameEvent) {
    }

}
