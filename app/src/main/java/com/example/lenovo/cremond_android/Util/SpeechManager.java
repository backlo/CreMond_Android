package com.example.lenovo.cremond_android.Util;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

public class SpeechManager {

    private static SpeechManager instance = new SpeechManager();
    MediaPlayer mediaPlayer;
    AudioManager audioManager;

    public static SpeechManager getInstance(){
        return instance;
    }

    public void speechWord(int speechName, Activity mActivity) {
        if(mediaPlayer != null){
            mediaPlayer.release();
        }

        audioManager = (AudioManager) mActivity.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 3, 0);

        mediaPlayer = MediaPlayer.create(mActivity, speechName);
        mediaPlayer.start();

    }

}
