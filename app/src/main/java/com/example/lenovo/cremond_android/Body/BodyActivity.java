package com.example.lenovo.cremond_android.Body;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class BodyActivity extends AppCompatActivity {

    int MAX_PAGE = 9;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        ViewPager viewPager = (ViewPager) findViewById(R.id.body_viewpager);
        viewPager.setAdapter(new BodyAdapter(getSupportFragmentManager()));
    }

    private class BodyAdapter extends FragmentPagerAdapter {
        public BodyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new BodyFragment("눈","Mắt","Eye",R.raw.body_eye_korean,R.raw.body_eye_vietnamese,R.drawable.body_eyes); break;
                case 1: cur_fragment = new BodyFragment("코","Mũi","Nose",R.raw.body_nose_korean,R.raw.body_nose_vietnamese,R.drawable.body_nose); break;
                case 2: cur_fragment = new BodyFragment("어깨","Vai","Shoulder",R.raw.body_shoulder_korean,R.raw.body_shoulder_vietnamese,R.drawable.body_shoulder); break;
                case 3: cur_fragment = new BodyFragment("손","Bán tay","Hand",R.raw.body_hand_korean,R.raw.body_hand_vietnamese,R.drawable.body_hands); break;
                case 4: cur_fragment = new BodyFragment("무릎","đầu gối","Knee",R.raw.body_knee_korean,R.raw.body_knee_vietnamese,R.drawable.body_knee); break;
                case 5: cur_fragment = new BodyFragment("입","Miệng","Mouth",R.raw.body_mouth_korean,R.raw.body_mouth_vietnamese,R.drawable.body_mouth); break;
                case 6: cur_fragment = new BodyFragment("팔","Cánh tay","Arm",R.raw.body_arm_korean,R.raw.body_arm_vietnamese,R.drawable.body_arm); break;
                case 7: cur_fragment = new BodyFragment("발","Bán chân","Foot",R.raw.body_foot_korean,R.raw.body_foot_vietnamese,R.drawable.body_foot); break;
                case 8: cur_fragment = new BodyFragment("귀","Tai","Ear",R.raw.body_ear_korean,R.raw.body_ear_vietnamese,R.drawable.body_ear); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
