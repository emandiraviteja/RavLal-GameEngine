package com.ravlal.ravlal_gameengine.audio.music;

import android.content.Context;
import android.media.MediaPlayer;

import com.ravlal.ravlal_gameengine.audio.BaseAudioManager;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class MusicManager extends BaseAudioManager<Music> {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public MusicManager(Context context) {
        super(context);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public Music load(int musicId) {
        MediaPlayer mediaPlayer = MediaPlayer.create(mContext, musicId);
        Music music = new Music(this, mediaPlayer);
        addAudio(music);
        return music;
    }

    @Override
    protected void onAudioEnable() {
        play();
    }

    @Override
    protected void onAudioDisable() {
        stop();
    }
    //========================================================

}
