package com.example.lenovo.cremond_android.Util;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

public class SpeechManager {

    private static SpeechManager instance = new SpeechManager();
    MediaPlayer mediaPlayer;

    public static SpeechManager getInstance(){
        return instance;
    }

    public void speechWord(int speechName, Activity mActivity) {
        if(mediaPlayer != null){
            mediaPlayer.release();
        }

        mediaPlayer = MediaPlayer.create(mActivity, speechName);
        mediaPlayer.start();

    }

}
