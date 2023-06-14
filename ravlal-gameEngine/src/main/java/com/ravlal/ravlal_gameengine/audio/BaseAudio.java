package com.ravlal.ravlal_gameengine.audio;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public abstract class BaseAudio implements Audio {

    private final AudioManager<? extends Audio> mParent;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected BaseAudio(AudioManager<? extends Audio> audioManager) {
        mParent = audioManager;
    }
    //========================================================

    protected AudioManager<? extends Audio> getParent() {
        return mParent;
    }
}
