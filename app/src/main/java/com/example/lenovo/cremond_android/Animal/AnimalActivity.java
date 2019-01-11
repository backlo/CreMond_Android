package com.example.lenovo.cremond_android.Animal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class AnimalActivity extends AppCompatActivity {

    int MAX_PAGE = 17;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        ViewPager viewPager = (ViewPager) findViewById(R.id.animal_viewpager);
        viewPager.setAdapter(new AnimalAdapter(getSupportFragmentManager()));
    }

    private class AnimalAdapter extends FragmentPagerAdapter {
        public AnimalAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new AnimalFragment("개","dog",R.drawable.animal_dog); break;
                case 1: cur_fragment = new AnimalFragment("고양이","cat",R.drawable.animal_cat); break;
                case 2: cur_fragment = new AnimalFragment("기린","giraffe",R.drawable.animal_giraffe); break;
                case 3: cur_fragment = new AnimalFragment("다람쥐","squirrel",R.drawable.animal_squirrel); break;
                case 4: cur_fragment = new AnimalFragment("돼지","pig",R.drawable.animal_pig); break;
                case 5: cur_fragment = new AnimalFragment("말","horse",R.drawable.animal_horse); break;
                case 6: cur_fragment = new AnimalFragment("박쥐","bat",R.drawable.animal_bat); break;
                case 7: cur_fragment = new AnimalFragment("사자","lion",R.drawable.animal_lion); break;
                case 8: cur_fragment = new AnimalFragment("악어","alligator",R.drawable.animal_alligator); break;
                case 9: cur_fragment = new AnimalFragment("앵무새","parrot",R.drawable.animal_parrot); break;
                case 10: cur_fragment = new AnimalFragment("캥거루","kangaroo",R.drawable.animal_kangaroo); break;
                case 11: cur_fragment = new AnimalFragment("코끼리","elephant",R.drawable.animal_elephant); break;
                case 12: cur_fragment = new AnimalFragment("타조","ostrich",R.drawable.animal_ostrich); break;
                case 13: cur_fragment = new AnimalFragment("토끼","rabbit",R.drawable.animal_rabbit); break;
                case 14: cur_fragment = new AnimalFragment("펭귄","penguin",R.drawable.animal_penguin); break;
                case 15: cur_fragment = new AnimalFragment("하마","hippo",R.drawable.animal_hippo); break;
                case 16: cur_fragment = new AnimalFragment("호랑이","tiger",R.drawable.animal_tiger); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
