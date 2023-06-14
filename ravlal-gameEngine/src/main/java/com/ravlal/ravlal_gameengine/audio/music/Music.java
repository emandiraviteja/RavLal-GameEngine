package com.ravlal.ravlal_gameengine.audio.music;

import android.media.MediaPlayer;

import com.ravlal.ravlal_gameengine.audio.BaseAudio;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class Music extends BaseAudio {

    private static final float DEFAULT_MUSIC_VOLUME = 1.0f;

    private MediaPlayer mMediaPlayer;
    private boolean mIsCurrentStream = true;
    private boolean mIsPause = false;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Music(MusicManager musicManager, MediaPlayer mediaPlayer) {
        super(musicManager);
        mMediaPlayer = mediaPlayer;
        setVolume(DEFAULT_MUSIC_VOLUME, DEFAULT_MUSIC_VOLUME);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public boolean isPlaying() {
        return mMediaPlayer.isPlaying();
    }

    public boolean isLooping() {
        return mMediaPlayer.isLooping();
    }

    public void setLooping(boolean isLooping) {
        mMediaPlayer.setLooping(isLooping);
    }

    public void setVolume(float leftVolume, float rightVolume) {
        mMediaPlayer.setVolume(leftVolume, rightVolume);
    }

    public boolean isCurrentStream() {
        return mIsCurrentStream;
    }

    public void setCurrentStream(boolean isCurrentStream) {
        mIsCurrentStream = isCurrentStream;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void play() {
        if (!getParent().isAudioEnable() || !mIsCurrentStream) {
            return;
        }
        if (!mMediaPlayer.isPlaying()) {
            mMediaPlayer.start();
        }
    }

    @Override
    public void stop() {
        if (!getParent().isAudioEnable()) {
            return;
        }
        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.pause();
        }
        mMediaPlayer.seekTo(0);
    }

    @Override
    public void pause() {
        if (!getParent().isAudioEnable()) {
            return;
        }
        if (mMediaPlayer.isPlaying() && !mIsPause) {
            mMediaPlayer.pause();
            mIsPause = true;
        }
    }

    @Override
    public void resume() {
        if (!getParent().isAudioEnable() || !mIsCurrentStream) {
            return;
        }
        if (!mMediaPlayer.isPlaying() && mIsPause) {
            mMediaPlayer.start();
            mIsPause = false;
        }
    }

    @Override
    public void release() {
        mMediaPlayer.stop();
        mMediaPlayer.release();
        mMediaPlayer = null;
        getParent().removeAudio(this);
    }

    @Override
    protected MusicManager getParent() {
        return (MusicManager) super.getParent();
    }
    //========================================================

}
