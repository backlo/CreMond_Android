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
                case 0: cur_fragment = new ColorFragment("빨강","Màu đỏ","Red",R.raw.color_red_korean,R.raw.color_red_vietnamese,R.drawable.color_red); break;
                case 1: cur_fragment = new ColorFragment("주황","Màu da cam","Orange",R.raw.color_orange_korean,R.raw.color_orange_vietnamese,R.drawable.color_orange); break;
                case 2: cur_fragment = new ColorFragment("노랑","Màu vàng","Yellow",R.raw.color_yellow_korean,R.raw.color_yellow_vietnamese,R.drawable.color_yellow); break;
                case 3: cur_fragment = new ColorFragment("초록","Xanh lá","Green",R.raw.color_green_korean,R.raw.color_green_vietnamese,R.drawable.color_green); break;
                case 4: cur_fragment = new ColorFragment("파랑","Màu xanh dương","Blue",R.raw.color_blue_korean,R.raw.color_blue_vietnamese,R.drawable.color_blue); break;
                case 5: cur_fragment = new ColorFragment("남색","Màu xanh lam","Navy",R.raw.color_navy_korean,R.raw.color_navy_vietnamese,R.drawable.color_navy); break;
                case 6: cur_fragment = new ColorFragment("보라색","Màu tím","Purple",R.raw.color_purple_korean,R.raw.color_purple_vietnamese,R.drawable.color_purple); break;
                case 7: cur_fragment = new ColorFragment("흰색","Màu trắng","White",R.raw.color_white_korean,R.raw.color_white_vietnamese,R.drawable.color_white); break;
                case 8: cur_fragment = new ColorFragment("검은색","Màu đen","Black",R.raw.color_black_korean,R.raw.color_black_vietnamese,R.drawable.color_black); break;
                case 9: cur_fragment = new ColorFragment("갈색","Màu nâu","Brown",R.raw.color_brown_korean,R.raw.color_brown_vietnamese,R.drawable.color_brown); break;
                case 10: cur_fragment = new ColorFragment("회색","Màu xám","Gray",R.raw.color_gray_korean,R.raw.color_gray_vietnamese,R.drawable.color_gray); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
