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
                case 0: cur_fragment = new VehicleFragment("헬리콥터","Máy bay trực thăng",R.raw.vehicle_helicopter_korean,R.raw.vehicle_helicopter_vietnamese,R.drawable.ex2); break;
                case 1: cur_fragment = new VehicleFragment("구급차","Xe cấp cứu",R.raw.vehicle_ambulance_korean,R.raw.vehicle_ambulance_vietnamese,R.drawable.vehicle_ambulance); break;
                case 2: cur_fragment = new VehicleFragment("버스","Xe buýt",R.raw.vehicle_bus_korean,R.raw.vehicle_bus_vietnamese,R.drawable.vehicle_bus); break;
                case 3: cur_fragment = new VehicleFragment("기차","xe lửa",R.raw.vehicle_train_korean,R.raw.vehicle_train_vietnamese,R.drawable.vehicle_train); break;
                case 4: cur_fragment = new VehicleFragment("자동차","xe ô tô",R.raw.vehicle_car_korean,R.raw.vehicle_car_vietnamese,R.drawable.vehicle_car); break;
                case 5: cur_fragment = new VehicleFragment("자전거","Xe đạp",R.raw.vehicle_bicycle_korean,R.raw.vehicle_bicycle_vietnamese,R.drawable.vehicle_bicycle); break;
                case 6: cur_fragment = new VehicleFragment("배","Tàu",R.raw.vehicle_ship_korean,R.raw.vehicle_ship_vietnamese,R.drawable.vehicle_ship); break;
                case 7: cur_fragment = new VehicleFragment("비행기","Máy bay",R.raw.vehicle_airplane_korean,R.raw.vehicle_airplane_vietnamese,R.drawable.vehicle_airplane); break;
                case 8: cur_fragment = new VehicleFragment("소방차","Xe cứu hỏa",R.raw.vehicle_fireengine_korean,R.raw.vehicle_fireengine_vietnamese,R.drawable.vehicle_fireengine); break;
                case 9: cur_fragment = new VehicleFragment("오토바이","Xe máy \nXe mô tô",R.raw.vehicle_motorcycle_korean,R.raw.vehicle_motorcycle_vietnamese,R.drawable.vehicle_motorcycle); break;
                case 10: cur_fragment = new VehicleFragment("택시","Xe taxi",R.raw.vehicle_taxi_korean,R.raw.vehicle_taxi_vietnamese,R.drawable.vehicle_taxi); break;
                case 11: cur_fragment = new VehicleFragment("유모차","Xe đẩy bé",R.raw.vehicle_stroller_korean,R.raw.vehicle_stroller_vietnamese,R.drawable.vehicle_stroller); break;
                case 12: cur_fragment = new VehicleFragment("우주선","Tàu vũ trụ",R.raw.vehicle_spaceship_korean,R.raw.vehicle_spaceship_vietnamese,R.drawable.vehicle_spaceship); break;
                case 13: cur_fragment = new VehicleFragment("경찰차","Xe cảnh sát",R.raw.vehicle_policecar_korean,R.raw.vehicle_policecar_vietnamese,R.drawable.vehicle_policecar); break;
                case 14: cur_fragment = new VehicleFragment("요트","Thuyền buồm",R.raw.vehicle_sailboat_korean,R.raw.vehicle_sailboat_vietnamese,R.drawable.vehicle_sailboat); break;
            }

            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
