package com.example.lenovo.cremond_android.Plant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class PlantActivity extends AppCompatActivity {

    int MAX_PAGE = 13;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);

        ViewPager viewPager = (ViewPager)findViewById(R.id.plant_viewpager);
        viewPager.setAdapter(new PlantAdapter(getSupportFragmentManager()));
    }

    private class PlantAdapter extends FragmentPagerAdapter {
        public PlantAdapter(FragmentManager fm){ super(fm); }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new PlantFragment("꽃","flower",R.drawable.plant_flower); break;
                case 1: cur_fragment = new PlantFragment("나무","tree",R.drawable.plant_tree); break;
                case 2: cur_fragment = new PlantFragment("당근","carrot",R.drawable.plant_carrot); break;
                case 3: cur_fragment = new PlantFragment("딸기","strawberry",R.drawable.plant_strawberry); break;
                case 4: cur_fragment = new PlantFragment("바나나","banana",R.drawable.plant_banana); break;
                case 5: cur_fragment = new PlantFragment("사과","apple",R.drawable.plant_apple); break;
                case 6: cur_fragment = new PlantFragment("수박","watermelon",R.drawable.plant_watermelon); break;
                case 7: cur_fragment = new PlantFragment("양파","onion",R.drawable.plant_onion); break;
                case 8: cur_fragment = new PlantFragment("참외","koreaMelon",R.drawable.plant_koreanmelon); break;
                case 9: cur_fragment = new PlantFragment("토마토","tomato",R.drawable.plant_tomato); break;
                case 10: cur_fragment = new PlantFragment("파인애플","pineapple",R.drawable.plant_pineapple); break;
                case 11: cur_fragment = new PlantFragment("포도","grape",R.drawable.plant_grape); break;
                case 12: cur_fragment = new PlantFragment("호박","pumpkin",R.drawable.plant_pumpkin); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
