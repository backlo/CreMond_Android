package com.example.lenovo.cremond_android.Color;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lenovo.cremond_android.R;

public class ColorActivity extends AppCompatActivity {

    int MAX_PAGE = 11;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ViewPager viewPager = (ViewPager) findViewById(R.id.color_viewpager);
        viewPager.setAdapter(new ColorAdapter(getSupportFragmentManager()));
    }

    private class ColorAdapter extends FragmentPagerAdapter{
        public ColorAdapter(FragmentManager fm){ super(fm); }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;

            switch (position) {
                case 0: cur_fragment = new ColorFragment("빨강","Màu đỏ",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_red); break;
                case 1: cur_fragment = new ColorFragment("주황","Màu da cam",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_orange); break;
                case 2: cur_fragment = new ColorFragment("노랑","Màu Vàng",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_yellow); break;
                case 3: cur_fragment = new ColorFragment("초록","Xanh lá",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_green); break;
                case 4: cur_fragment = new ColorFragment("파랑","Màu xanh dương",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_blue); break;
                case 5: cur_fragment = new ColorFragment("남색","Màu xanh lam",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_navy); break;
                case 6: cur_fragment = new ColorFragment("보라색","Màu tím",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_purple); break;
                case 7: cur_fragment = new ColorFragment("흰색","Màu trắng",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_white); break;
                case 8: cur_fragment = new ColorFragment("검은색","Màu đen",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_black); break;
                case 9: cur_fragment = new ColorFragment("갈색","Màu nâu",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_brown); break;
                case 10: cur_fragment = new ColorFragment("회색","Màu xám",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.color_gray); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
