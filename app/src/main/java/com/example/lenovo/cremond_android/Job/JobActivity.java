package com.example.lenovo.cremond_android.Job;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.cremond_android.R;

public class JobActivity extends AppCompatActivity {

    int MAX_PAGE = 15;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        ViewPager viewPager = (ViewPager)findViewById(R.id.job_viewpager);
        viewPager.setAdapter(new JobAdapter(getSupportFragmentManager()));
    }

    private class JobAdapter extends FragmentPagerAdapter {
        public JobAdapter(FragmentManager fm){ super(fm); }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new JobFragment("의사","Bác sĩ","Doctor",R.raw.job_doctor_korean,R.raw.job_doctor_vietnamese,R.drawable.job_doctor); break;
                case 1: cur_fragment = new JobFragment("간호사","Y tá","Nurse",R.raw.job_nurse_korean,R.raw.job_nurse_vietnamese,R.drawable.job_nurse); break;
                case 2: cur_fragment = new JobFragment("소방관","Lính cứu hỏa","FireFighter",R.raw.job_firefighter_korean,R.raw.job_firefighter_vietnamese,R.drawable.job_firefighter); break;
                case 3: cur_fragment = new JobFragment("경찰관","Cảnh sát","PoliceOfficer",R.raw.job_policeofficer_korean,R.raw.job_policeofficer_vietnamese,R.drawable.job_policeofficer); break;
                case 4: cur_fragment = new JobFragment("선생님","Giáo viên","Teacher",R.raw.job_teacher_korean,R.raw.job_teacher_vietnamese,R.drawable.job_teacher); break;
                case 5: cur_fragment = new JobFragment("과학자","Nhà khoa học","Scientist",R.raw.job_scientist_korean,R.raw.job_scientist_vietnamese,R.drawable.job_scientist); break;
                case 6: cur_fragment = new JobFragment("군인","Người lính","Soldier",R.raw.job_soldier_korean,R.raw.job_soldier_vietnamese,R.drawable.job_soldier); break;
                case 7: cur_fragment = new JobFragment("운동선수","Vận động viên","Athlete",R.raw.job_athlete_korean,R.raw.job_athlete_vietnamese,R.drawable.job_athlete); break;
                case 8: cur_fragment = new JobFragment("요리사","Đầu bếp","Cook",R.raw.job_cook_korean,R.raw.job_cook_vietnamese,R.drawable.job_cook); break;
                case 9: cur_fragment = new JobFragment("화가","Họa sĩ","Artist",R.raw.job_artist_korean,R.raw.job_artist_vietnamese,R.drawable.job_artist); break;
                case 10: cur_fragment = new JobFragment("파일럿","Phi công","Pilot",R.raw.job_pilot_korean,R.raw.job_pilot_vietnamese,R.drawable.job_pilot); break;
                case 11: cur_fragment = new JobFragment("운전사","Tài xế","Driver",R.raw.job_driver_korean,R.raw.job_driver_vietnamese,R.drawable.job_driver); break;
                case 12: cur_fragment = new JobFragment("건축가","Kiến trúc sư","Architect",R.raw.job_architect_korean,R.raw.job_architect_vietnamese,R.drawable.job_architect); break;
                case 13: cur_fragment = new JobFragment("가수","Ca sĩ","Singer",R.raw.job_singer_korean,R.raw.job_singer_vietnamese,R.drawable.job_singer); break;
                case 14: cur_fragment = new JobFragment("사진사","Nhiếp ảnh gia","Photographer",R.raw.job_photographer_korean,R.raw.job_photographer_vietnamese,R.drawable.job_photographer); break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
