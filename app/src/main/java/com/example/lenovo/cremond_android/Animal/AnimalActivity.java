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
                case 0: cur_fragment = new AnimalFragment("개","Con chó",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.animal_dog); break;
                case 1: cur_fragment = new AnimalFragment("고양이","Con Mèo",R.raw.animal_cat_korean,R.raw.animal_cat_vietnamese,R.drawable.animal_cat); break;
                case 2: cur_fragment = new AnimalFragment("기린","Hươu cao cổ",R.raw.animal_giraffe_korean,R.raw.animal_giraffe_vietnamese,R.drawable.animal_giraffe); break;
                case 3: cur_fragment = new AnimalFragment("다람쥐","Con sóc",R.raw.animal_squirrel_korean,R.raw.animal_squirrel_vietnamese,R.drawable.animal_squirrel); break;
                case 4: cur_fragment = new AnimalFragment("돼지","Con lợn \nCon heo",R.raw.animal_pig_korean,R.raw.animal_pig_vietnamese,R.drawable.animal_pig); break;
                case 5: cur_fragment = new AnimalFragment("말","Con Ngựa",R.raw.animal_horse_korean,R.raw.animal_horse_vietnamese,R.drawable.animal_horse); break;
                case 6: cur_fragment = new AnimalFragment("박쥐","Con dói",R.raw.animal_bat_korean,R.raw.animal_bat_vietnamese,R.drawable.animal_bat); break;
                case 7: cur_fragment = new AnimalFragment("사자","Sư tử",R.raw.animal_lion_korean,R.raw.animal_lion_vietnamese,R.drawable.animal_lion); break;
                case 8: cur_fragment = new AnimalFragment("악어","Cá sấu",R.raw.animal_alligator_korean,R.raw.animal_alligator_vietnamese,R.drawable.animal_alligator); break;
                case 9: cur_fragment = new AnimalFragment("앵무새","Con Vẹt",R.raw.animal_parrot_korean,R.raw.animal_parrot_vietnamese,R.drawable.animal_parrot); break;
                case 10: cur_fragment = new AnimalFragment("캥거루","Con căngguru",R.raw.animal_kangaroo_korean,R.raw.animal_kangaroo_vietnamese,R.drawable.animal_kangaroo); break;
                case 11: cur_fragment = new AnimalFragment("코끼리","Con voi",R.raw.animal_elephant_korean,R.raw.animal_elephant_vietnamese,R.drawable.animal_elephant); break;
                case 12: cur_fragment = new AnimalFragment("타조","đà điểu",R.raw.animal_ostrich_korean,R.raw.animal_ostrich_vietnamese,R.drawable.animal_ostrich); break;
                case 13: cur_fragment = new AnimalFragment("토끼","Con Thỏ",R.raw.animal_rabbit_korean,R.raw.animal_rabbit_vietnamese,R.drawable.animal_rabbit); break;
                case 14: cur_fragment = new AnimalFragment("펭귄","Chim cánh cụt",R.raw.animal_penguin_korean,R.raw.animal_penguin_vietnamese,R.drawable.animal_penguin); break;
                case 15: cur_fragment = new AnimalFragment("하마","Hà mã",R.raw.animal_hippo_korean,R.raw.animal_hippo_vietnamese,R.drawable.animal_hippo); break;
                case 16: cur_fragment = new AnimalFragment("호랑이","Con Hổ",R.raw.animal_tiger_korean,R.raw.animal_tiger_vietnamese,R.drawable.animal_tiger); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
