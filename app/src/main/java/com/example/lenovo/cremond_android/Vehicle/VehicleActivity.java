package com.example.lenovo.cremond_android.Vehicle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class VehicleActivity extends AppCompatActivity {

    int MAX_PAGE = 15;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        ViewPager viewPager = (ViewPager)findViewById(R.id.vehicle_viewpager);
        viewPager.setAdapter(new VehicleAdapter(getSupportFragmentManager()));
    }

    private class VehicleAdapter extends FragmentPagerAdapter {
        public VehicleAdapter(FragmentManager fm){ super(fm); }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new VehicleFragment("헬리콥터","helicopter",R.drawable.vehicle_helicopter); break;
                case 1: cur_fragment = new VehicleFragment("구급차","ambulance",R.drawable.vehicle_ambulance); break;
                case 2: cur_fragment = new VehicleFragment("버스","bus",R.drawable.vehicle_bus); break;
                case 3: cur_fragment = new VehicleFragment("기차","train",R.drawable.vehicle_train); break;
                case 4: cur_fragment = new VehicleFragment("자동차","car",R.drawable.vehicle_car); break;
                case 5: cur_fragment = new VehicleFragment("자전거","bicycle",R.drawable.vehicle_bicycle); break;
                case 6: cur_fragment = new VehicleFragment("배","ship",R.drawable.vehicle_ship); break;
                case 7: cur_fragment = new VehicleFragment("비행기","airplane",R.drawable.vehicle_airplane); break;
                case 8: cur_fragment = new VehicleFragment("소방차","fireEngine",R.drawable.vehicle_fireengine); break;
                case 9: cur_fragment = new VehicleFragment("오토바이","motorcycle",R.drawable.vehicle_motorcycle); break;
                case 10: cur_fragment = new VehicleFragment("택시","taxi",R.drawable.vehicle_taxi); break;
                case 11: cur_fragment = new VehicleFragment("유모차","stroller",R.drawable.vehicle_stroller); break;
                case 12: cur_fragment = new VehicleFragment("우주선","spaceship",R.drawable.vehicle_spaceship); break;
                case 13: cur_fragment = new VehicleFragment("경찰차","policeCar",R.drawable.vehicle_policecar); break;
                case 14: cur_fragment = new VehicleFragment("요트","sailboat",R.drawable.vehicle_sailboat); break;
            }

            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
