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
                case 0: cur_fragment = new ObjectsFragment("모자","hat",R.drawable.objects_hat); break;
                case 1: cur_fragment = new ObjectsFragment("가방","bag",R.drawable.objects_bag); break;
                case 2: cur_fragment = new ObjectsFragment("가위","scissors",R.drawable.objects_scissors); break;
                case 3: cur_fragment = new ObjectsFragment("냉장고","refrigerator",R.drawable.objects_refrigerator); break;
                case 4: cur_fragment = new ObjectsFragment("신발","shoe",R.drawable.objects_shoe); break;
                case 5: cur_fragment = new ObjectsFragment("라면","ramen",R.drawable.objects_ramen); break;
                case 6: cur_fragment = new ObjectsFragment("라디오","radio",R.drawable.objects_radio); break;
                case 7: cur_fragment = new ObjectsFragment("로봇","robot",R.drawable.objects_robot); break;
                case 8: cur_fragment = new ObjectsFragment("우산","umbrella",R.drawable.objects_umbrella); break;
                case 9: cur_fragment = new ObjectsFragment("연필","pencil",R.drawable.objects_pencil); break;
                case 10: cur_fragment = new ObjectsFragment("지우개","eraser",R.drawable.objects_eraser); break;
                case 11: cur_fragment = new ObjectsFragment("칫솔","toothbrush",R.drawable.objects_toothbrush); break;
                case 12: cur_fragment = new ObjectsFragment("치마","skirt",R.drawable.objects_skirt); break;
                case 13: cur_fragment = new ObjectsFragment("침대","bed",R.drawable.objects_bed); break;
                case 14: cur_fragment = new ObjectsFragment("케이크","cake",R.drawable.objects_cake); break;
                case 15: cur_fragment = new ObjectsFragment("의자","chair",R.drawable.objects_chair); break;
                case 16: cur_fragment = new ObjectsFragment("풍선","balloon",R.drawable.objects_balloon); break;
                case 17: cur_fragment = new ObjectsFragment("칼","knife",R.drawable.objects_knife); break;
                case 18: cur_fragment = new ObjectsFragment("책","book",R.drawable.objects_book); break;
                case 19: cur_fragment = new ObjectsFragment("바지","pants",R.drawable.objects_pants); break;
                case 20: cur_fragment = new ObjectsFragment("크레파스","crayon",R.drawable.objects_crayon); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
