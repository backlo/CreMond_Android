package com.example.lenovo.cremond_android.Job;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.cremond_android.R;
import com.example.lenovo.cremond_android.Util.Event.TTSEvent;
import com.example.lenovo.cremond_android.Util.SpeechManager;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class JobFragment extends Fragment {

    @BindView(R.id.jobfragment_korean) TextView korean;
    @BindView(R.id.jobfragment_vietnamese) TextView vietnamese;
    @BindView(R.id.jobfragment_image) ImageView image;
    @BindView(R.id.jobfragment_english) TextView english;


    String korean_name, vietnamese_name, english_name;
    int image_id, speechKorean, speechVietnamese;

    private long mLastClickTime = 0;

    TextToSpeech tts = null;
    private final int ACT_CHECK_TTS_DATA = 1000;

    public JobFragment() {   }

    @SuppressLint("ValidFragment")
    public JobFragment(String korean_name, String vietnamese_name, String english_name, int speechKorean, int speechVietnamese, int image_id) {
        this.korean_name = korean_name;
        this.vietnamese_name = vietnamese_name;
        this.english_name = english_name;
        this.speechKorean = speechKorean;
        this.speechVietnamese = speechVietnamese;
        this.image_id = image_id;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_job, container, false);
        ButterKnife.bind(this, view);

        Intent ttsIntent = new Intent();
        ttsIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(ttsIntent, ACT_CHECK_TTS_DATA);

        korean.setText(korean_name);
        vietnamese.setText(vietnamese_name);
        image.setImageResource(image_id);
        english.setText(english_name);

        return view;
    }

    @OnClick(R.id.jobfragment_home_btn)
    public void backButton(){
        getActivity().onBackPressed();
    }

    @OnClick(R.id.jobfragment_korean)
    public void speechKorean(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        SpeechManager.getInstance().speechWord(speechKorean, getActivity());
    }

    @OnClick(R.id.jobfragment_vietnamese)
    public void speechVietnamese(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        SpeechManager.getInstance().speechWord(speechVietnamese, getActivity());
    }

    @OnClick(R.id.jobfragment_english)
    public void speechEnglish(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        EventBus.getDefault().post(new TTSEvent(""));
        tts = new TextToSpeech(getActivity().getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    if (tts != null) {
                        int result = tts.setLanguage(Locale.US);
                        if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                            Toast.makeText(getContext(), "TTS language is not supported", Toast.LENGTH_LONG).show();
                        } else {
                            tts.speak(english_name,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                } else {
                    Toast.makeText(getContext(), "TTS initialization failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(TTSEvent event) { }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ACT_CHECK_TTS_DATA) {
            if (resultCode != TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                Intent installIntent = new Intent();
                installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installIntent);
            }
        }
    }

}
