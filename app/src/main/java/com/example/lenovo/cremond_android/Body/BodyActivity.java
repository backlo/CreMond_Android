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
                case 0: cur_fragment = new BodyFragment("눈","eyes",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_eyes); break;
                case 1: cur_fragment = new BodyFragment("코","nose",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_nose); break;
                case 2: cur_fragment = new BodyFragment("어깨","shoulder",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_shoulder); break;
                case 3: cur_fragment = new BodyFragment("손","hands",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_hands); break;
                case 4: cur_fragment = new BodyFragment("무릎","knee",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_knee); break;
                case 5: cur_fragment = new BodyFragment("입","mouth",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_mouth); break;
                case 6: cur_fragment = new BodyFragment("팔","arm",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_arm); break;
                case 7: cur_fragment = new BodyFragment("발","foot",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_foot); break;
                case 8: cur_fragment = new BodyFragment("귀","ear",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.body_ear); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
