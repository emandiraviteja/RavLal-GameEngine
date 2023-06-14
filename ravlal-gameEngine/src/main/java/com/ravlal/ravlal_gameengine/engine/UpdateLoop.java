package com.ravlal.ravlal_gameengine.engine;

public class UpdateLoop extends Loop {

    public UpdateLoop(GameEngine gameEngine) {
        super(gameEngine);
    }

    @Override
    public void onLoopUpdate(long elapsedMillis) {
        mGameEngine.update(elapsedMillis);
    }

}
