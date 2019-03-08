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
                case 0: cur_fragment = new NumberFragment("일","Một","One",R.raw.number_one_korean,R.raw.number_one_vietnamese,R.drawable.number_one); break;
                case 1: cur_fragment = new NumberFragment("이","Hai","Two",R.raw.number_two_korean,R.raw.number_two_vietnamese,R.drawable.number_two); break;
                case 2: cur_fragment = new NumberFragment("삼","Ba","Three",R.raw.number_three_korean,R.raw.number_three_vietnamese,R.drawable.number_three); break;
                case 3: cur_fragment = new NumberFragment("사","Bốn","Four",R.raw.number_four_korean,R.raw.number_four_vietnamese,R.drawable.number_four); break;
                case 4: cur_fragment = new NumberFragment("오","Năm","Five",R.raw.number_five_korean,R.raw.number_five_vietnamese,R.drawable.number_five); break;
                case 5: cur_fragment = new NumberFragment("육","Sáu","Six",R.raw.number_six_korean,R.raw.number_six_vietnamese,R.drawable.number_six); break;
                case 6: cur_fragment = new NumberFragment("칠","Bảy","Seven",R.raw.number_seven_korean,R.raw.number_seven_vietnamese,R.drawable.number_seven); break;
                case 7: cur_fragment = new NumberFragment("팔","Tám","Eight",R.raw.number_eight_korean,R.raw.number_eight_vietnamese,R.drawable.number_eight); break;
                case 8: cur_fragment = new NumberFragment("구","Chín","Nine",R.raw.number_nine_korean,R.raw.number_nine_vietnamese,R.drawable.number_nine); break;
                case 9: cur_fragment = new NumberFragment("십","Mười","Ten",R.raw.number_ten_korean,R.raw.number_ten_vietnamese,R.drawable.number_ten); break;
                case 10: cur_fragment = new NumberFragment("이십","Hai mươi","Twenty",R.raw.number_twenty_korean,R.raw.number_twenty_vietnamese,R.drawable.number_twenty); break;
                case 11: cur_fragment = new NumberFragment("삼십","Ba mươi","Thirty",R.raw.number_thirty_korean,R.raw.number_thirty_vietnamese,R.drawable.number_thirty); break;
                case 12: cur_fragment = new NumberFragment("사십","Bốn mươi","Forty",R.raw.number_forty_korean,R.raw.number_forty_vietnamese,R.drawable.number_forty); break;
                case 13: cur_fragment = new NumberFragment("오십","Năm mươi","Fifty",R.raw.number_fifty_korean,R.raw.number_fifty_vietnamese,R.drawable.number_fifty); break;
                case 14: cur_fragment = new NumberFragment("육십","Sáu mươi","Sixty",R.raw.number_sixty_korean,R.raw.number_sixty_vietnamese,R.drawable.number_sixty); break;
                case 15: cur_fragment = new NumberFragment("칠십","Bảy mươi","Seventy",R.raw.number_seventy_korean,R.raw.number_seventy_vietnamese,R.drawable.number_seventy); break;
                case 16: cur_fragment = new NumberFragment("팔십","Tám mươi","Eighty",R.raw.number_eighty_korean,R.raw.number_eighty_vietnamese,R.drawable.number_eighty); break;
                case 17: cur_fragment = new NumberFragment("구십","Chín mươi","Ninety",R.raw.number_ninety_korean,R.raw.number_ninety_vietnamese,R.drawable.number_ninety); break;
                case 18: cur_fragment = new NumberFragment("백","Một mươi","Hundred",R.raw.number_hundred_korean,R.raw.number_hundred_vietnamese,R.drawable.number_hundred); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
