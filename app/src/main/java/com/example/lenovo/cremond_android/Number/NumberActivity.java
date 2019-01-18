package com.example.lenovo.cremond_android.Number;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class NumberActivity extends AppCompatActivity {

    int MAX_PAGE = 19;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ViewPager viewPager = (ViewPager)findViewById(R.id.number_viewpager);
        viewPager.setAdapter(new NumberAdapter(getSupportFragmentManager()));
    }

    private class NumberAdapter extends FragmentPagerAdapter {
        public NumberAdapter(FragmentManager fm){ super(fm); }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new NumberFragment("일","Một",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_one); break;
                case 1: cur_fragment = new NumberFragment("이","Hai",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_two); break;
                case 2: cur_fragment = new NumberFragment("삼","Ba",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_three); break;
                case 3: cur_fragment = new NumberFragment("사","Bốn",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_four); break;
                case 4: cur_fragment = new NumberFragment("오","Năm",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_five); break;
                case 5: cur_fragment = new NumberFragment("육","Sáu",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_six); break;
                case 6: cur_fragment = new NumberFragment("칠","Bảy",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.exnumber_seven); break;
                case 7: cur_fragment = new NumberFragment("팔","Tám",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_eight); break;
                case 8: cur_fragment = new NumberFragment("구","Chín",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_nine); break;
                case 9: cur_fragment = new NumberFragment("십","Mười",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_ten); break;
                case 10: cur_fragment = new NumberFragment("이십","Hai mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_twenty); break;
                case 11: cur_fragment = new NumberFragment("삼십","Ba mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_thirty); break;
                case 12: cur_fragment = new NumberFragment("사십","Bốn mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_fourty); break;
                case 13: cur_fragment = new NumberFragment("오십","Năm mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_fifty); break;
                case 14: cur_fragment = new NumberFragment("육십","Sáu mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_sixty); break;
                case 15: cur_fragment = new NumberFragment("칠십","Bảy mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_seventy); break;
                case 16: cur_fragment = new NumberFragment("팔십","Tám mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_eighty); break;
                case 17: cur_fragment = new NumberFragment("구십","Chín mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_ninety); break;
                case 18: cur_fragment = new NumberFragment("백","Một mươi",R.raw.animal_dog_korean,R.raw.animal_dog_vietnamese,R.drawable.number_hundred); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
