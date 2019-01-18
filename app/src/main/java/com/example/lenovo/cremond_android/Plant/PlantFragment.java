package com.example.lenovo.cremond_android.Plant;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.cremond_android.R;
import com.example.lenovo.cremond_android.Util.SpeechManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class PlantFragment extends Fragment {

    @BindView(R.id.plantfragment_korean) TextView korean;
    @BindView(R.id.plantfragment_vietnamese) TextView vietnamese;
    @BindView(R.id.plantfragment_image) ImageView image;

    String korean_name, vietnamese_name;
    int image_id, speechKorean, speechVietnamese;

    private long mLastClickTime = 0;

    public PlantFragment() {   }

    @SuppressLint("ValidFragment")
    public PlantFragment(String korean_name, String vietnamese_name, int speechKorean, int speechVietnamese, int image_id) {
        this.korean_name = korean_name;
        this.vietnamese_name = vietnamese_name;
        this.speechKorean = speechKorean;
        this.speechVietnamese = speechVietnamese;
        this.image_id = image_id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_plant, container, false);
        ButterKnife.bind(this, view);

        korean.setText(korean_name);
        vietnamese.setText(vietnamese_name);
        image.setImageResource(image_id);

        return view;
    }

    @OnClick(R.id.plantfragment_home_btn)
    public void backButton(){
        getActivity().onBackPressed();
    }

    @OnClick(R.id.plantfragment_korean)
    public void speechKorean(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        SpeechManager.getInstance().speechWord(speechKorean, getActivity());
    }

    @OnClick(R.id.plantfragment_vietnamese)
    public void speechVietnamese(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        SpeechManager.getInstance().speechWord(speechVietnamese, getActivity());
    }

}
