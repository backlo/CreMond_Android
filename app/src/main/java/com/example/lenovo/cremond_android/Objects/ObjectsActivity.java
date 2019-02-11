package com.example.lenovo.cremond_android.Objects;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class ObjectsActivity extends AppCompatActivity {

    int MAX_PAGE = 21;
    Fragment cur_fragment = new Fragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objects);

        ViewPager viewPager = (ViewPager)findViewById(R.id.objects_viewpager);
        viewPager.setAdapter(new ObjectsAdapter(getSupportFragmentManager()));
    }

    private class ObjectsAdapter extends FragmentPagerAdapter {
        public ObjectsAdapter(FragmentManager fm){ super(fm); }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new ObjectsFragment("모자","Mũ",R.raw.objects_hat_korean,R.raw.objects_hat_vietnamese,R.drawable.objects_hat); break;
                case 1: cur_fragment = new ObjectsFragment("가방","Túi",R.raw.objects_bag_korean,R.raw.objects_bag_vietnamese,R.drawable.objects_bag); break;
                case 2: cur_fragment = new ObjectsFragment("가위","Cái kéo",R.raw.objects_scissor_korean,R.raw.objects_scissor_vietnamese,R.drawable.objects_scissors); break;
                case 3: cur_fragment = new ObjectsFragment("냉장고","Tủ lạnh",R.raw.objects_refrigerator_korean,R.raw.objects_refrigerator_vietnamese,R.drawable.objects_refrigerator); break;
                case 4: cur_fragment = new ObjectsFragment("신발","Giày",R.raw.objects_shoes_korean,R.raw.objects_shoes_vietnamese,R.drawable.objects_shoe); break;
                case 5: cur_fragment = new ObjectsFragment("라면","Mì gói",R.raw.objects_ramen_korean,R.raw.objects_ramen_vietnamese,R.drawable.objects_ramen); break;
                case 6: cur_fragment = new ObjectsFragment("라디오","Ra-đi-ô",R.raw.objects_radio_korean,R.raw.objects_radio_vietnamese,R.drawable.objects_radio); break;
                case 7: cur_fragment = new ObjectsFragment("로봇","Rô bốt",R.raw.objects_robot_korean,R.raw.objects_robot_vietnamese,R.drawable.objects_robot); break;
                case 8: cur_fragment = new ObjectsFragment("우산","Cây dù",R.raw.objects_umbrella_korean,R.raw.objects_umbrella_vietnamese,R.drawable.objects_umbrella); break;
                case 9: cur_fragment = new ObjectsFragment("연필","Bút chì",R.raw.objects_pencil_korean,R.raw.objects_pencil_vietnamese,R.drawable.objects_pencil); break;
                case 10: cur_fragment = new ObjectsFragment("지우개","Cục tẩy",R.raw.objects_eraser_korean,R.raw.objects_eraser_vietnamese,R.drawable.objects_eraser); break;
                case 11: cur_fragment = new ObjectsFragment("칫솔","Bàn chải đánh răng",R.raw.objects_toothbrush_korean,R.raw.objects_toothbrush_vietnamese,R.drawable.objects_toothbrush); break;
                case 12: cur_fragment = new ObjectsFragment("치마","Váy",R.raw.objects_skirt_korean,R.raw.objects_skirt_vietnamese,R.drawable.objects_skirt); break;
                case 13: cur_fragment = new ObjectsFragment("침대","Giường",R.raw.objects_bed_korean,R.raw.objects_bed_vietnamese,R.drawable.objects_bed); break;
                case 14: cur_fragment = new ObjectsFragment("케이크","Bánh",R.raw.objects_cake_kroean,R.raw.objects_cake_vietnamese,R.drawable.objects_cake); break;
                case 15: cur_fragment = new ObjectsFragment("의자","Ghế",R.raw.objects_chair_korean,R.raw.objects_chair_vietnamese,R.drawable.objects_chair); break;
                case 16: cur_fragment = new ObjectsFragment("풍선","Bóng bay",R.raw.objects_balloon_korean,R.raw.objects_balloon_vietnamese,R.drawable.objects_balloon); break;
                case 17: cur_fragment = new ObjectsFragment("칼","Dao",R.raw.objects_knife_korean,R.raw.objects_knife_vietnamese,R.drawable.objects_knife); break;
                case 18: cur_fragment = new ObjectsFragment("책","Sách",R.raw.objects_book_korean,R.raw.objects_book_vietnamese,R.drawable.objects_book); break;
                case 19: cur_fragment = new ObjectsFragment("바지","Cái quần",R.raw.objects_pant_korean,R.raw.objects_pant_vietnamese,R.drawable.objects_pants); break;
                case 20: cur_fragment = new ObjectsFragment("크레파스","Bút chì màu",R.raw.objects_crayon_korean,R.raw.objects_crayon_vietnamese,R.drawable.objects_crayon); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
