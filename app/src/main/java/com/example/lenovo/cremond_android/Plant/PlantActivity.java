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
                case 0: cur_fragment = new PlantFragment("꽃","Hoa","Flower",R.raw.plant_flower_korean,R.raw.plant_flower_vietnamese,R.drawable.plant_flower); break;
                case 1: cur_fragment = new PlantFragment("나무","Cây","Tree",R.raw.plant_tree_korean,R.raw.plant_tree_vietnamese,R.drawable.plant_tree); break;
                case 2: cur_fragment = new PlantFragment("당근","Cà rốt","Carrot",R.raw.plant_carrot_korean,R.raw.plant_carrot_vietnamese,R.drawable.plant_carrot); break;
                case 3: cur_fragment = new PlantFragment("딸기","Dâu tây","Plant",R.raw.plant_strawberry_korean,R.raw.plant_strawberry_vietnamese,R.drawable.plant_strawberry); break;
                case 4: cur_fragment = new PlantFragment("바나나","Quả chuối","Banana",R.raw.plant_banana_korean,R.raw.plant_banana_vietnamese,R.drawable.plant_banana); break;
                case 5: cur_fragment = new PlantFragment("사과","Táo","Apple",R.raw.plant_apple_korean,R.raw.plant_apple_vietnamese,R.drawable.plant_apple); break;
                case 6: cur_fragment = new PlantFragment("수박","Dưa hấu","Watermelon",R.raw.plant_watermelon_korean,R.raw.plant_watermelon_vietnamse,R.drawable.plant_watermelon); break;
                case 7: cur_fragment = new PlantFragment("양파","Hành tây","Onion",R.raw.plant_onion_korean,R.raw.plant_onion_vietnamese,R.drawable.plant_onion); break;
                case 8: cur_fragment = new PlantFragment("참외","Dưa lê","KoreanMelon",R.raw.plant_koreanmelon_korean,R.raw.plant_koreanmelon_vietnamese,R.drawable.plant_koreanmelon); break;
                case 9: cur_fragment = new PlantFragment("토마토","Cà chua","Tomato",R.raw.plant_tomato_korean,R.raw.plant_tomato_vietnamese,R.drawable.plant_tomato); break;
                case 10: cur_fragment = new PlantFragment("파인애플","Quả dứa \n Trái thơm","Pineapple",R.raw.plant_pineapple_korean,R.raw.plant_pineapple_vietnamese,R.drawable.plant_pineapple); break;
                case 11: cur_fragment = new PlantFragment("포도","Quả nho","Grape",R.raw.plant_grape_korean,R.raw.plant_grape_vietnamese,R.drawable.plant_grape); break;
                case 12: cur_fragment = new PlantFragment("호박","Quả bí ngô","Pumpkin",R.raw.plant_pumpkin_korean,R.raw.plant_pumpkin_vietnamese,R.drawable.plant_pumpkin); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
