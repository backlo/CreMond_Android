package com.example.lenovo.cremond_android;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.cremond_android.Util.SpeechManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QRActivity extends AppCompatActivity {

    @BindView(R.id.qr_home_btn)
    ImageView qr_home;
    @BindView(R.id.qr_korean)
    TextView qr_text_korean;
    @BindView(R.id.qr_vietnamese)
    TextView qr_text_vietnamese;
    @BindView(R.id.qr_image)
    ImageView qr_image;

    int speechKorean, speechVietnamese;

    private long mLastClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        ButterKnife.bind(this);

        Intent i = getIntent();

//        qr_text_korean.setText(i.getExtras().getString("korean"));
//        qr_text_vietnamese.setText(i.getExtras().getString("vietnamese"));
//        qr_image.setImageResource(i.getExtras().getInt("image"));
//        speechKorean = i.getExtras().getInt("speechkorean");
//        speechVietnamese = i.getExtras().getInt("speechvietnamese");
    }

    @OnClick(R.id.vehiclefragment_home_btn)
    public void backButton(){
        onBackPressed();
    }

    @OnClick(R.id.vehiclefragment_korean)
    public void speechKorean(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        SpeechManager.getInstance().speechWord(speechKorean, QRActivity.this);
    }

    @OnClick(R.id.vehiclefragment_vietnamese)
    public void speechVietnamese(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        SpeechManager.getInstance().speechWord(speechVietnamese, QRActivity.this);
    }
}
