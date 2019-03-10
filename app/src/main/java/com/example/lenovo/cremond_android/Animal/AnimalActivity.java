package com.example.lenovo.cremond_android.Animal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.lenovo.cremond_android.R;
import com.example.lenovo.cremond_android.Util.Event.ConfEvent;
import com.example.lenovo.cremond_android.Util.Event.TTSEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AnimalActivity extends AppCompatActivity {

    @BindView(R.id.animal_viewpager)
    ViewPager viewPager;

    int MAX_PAGE = 17;
    Fragment cur_fragment = new Fragment();

    private boolean isLand = false;
    private boolean isPort = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //EventBus.getDefault().register(this);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animal);
        ButterKnife.bind(this);

        viewPager.setAdapter( new AnimalAdapter(getSupportFragmentManager()));



        //test landscape
//        Configuration config = getResources().getConfiguration();
//        if(config.orientation == Configuration.ORIENTATION_PORTRAIT){
//            viewPager.setAdapter( new AnimalAdapter(getSupportFragmentManager()));
//        }
//        else if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
//            ViewPager viewPager_land = (ViewPager) findViewById(R.id.animal_viewpager_land);
//            viewPager_land.setAdapter(new AnimalAdapter(getSupportFragmentManager()));
//        }

    }



    private class AnimalAdapter extends FragmentPagerAdapter {
        public AnimalAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;
            switch (position) {
                case 0: cur_fragment = new AnimalFragment("개", "Con chó", "Dog", R.raw.animal_dog_korean, R.raw.animal_dog_vietnamese, R.drawable.animal_dog);break;
                case 1: cur_fragment = new AnimalFragment("고양이", "Con Mèo", "Cat", R.raw.animal_cat_korean, R.raw.animal_cat_vietnamese, R.drawable.animal_cat);break;
                case 2: cur_fragment = new AnimalFragment("기린", "Hươu cao cổ", "Giraffe", R.raw.animal_giraffe_korean, R.raw.animal_giraffe_vietnamese, R.drawable.animal_giraffe);break;
                case 3: cur_fragment = new AnimalFragment("다람쥐", "Con sóc", "Squirrel", R.raw.animal_squirrel_korean, R.raw.animal_squirrel_vietnamese, R.drawable.animal_squirrel);break;
                case 4: cur_fragment = new AnimalFragment("돼지", "Con lợn \n Con heo", "Pig", R.raw.animal_pig_korean, R.raw.animal_pig_vietnamese, R.drawable.animal_pig);break;
                case 5: cur_fragment = new AnimalFragment("말", "Con Ngựa", "Horse", R.raw.animal_horse_korean, R.raw.animal_horse_vietnamese, R.drawable.animal_horse);break;
                case 6: cur_fragment = new AnimalFragment("박쥐", "Con dói", "Bat", R.raw.animal_bat_korean, R.raw.animal_bat_vietnamese, R.drawable.animal_bat);break;
                case 7: cur_fragment = new AnimalFragment("사자", "Sư tử", "Lion", R.raw.animal_lion_korean, R.raw.animal_lion_vietnamese, R.drawable.animal_lion);break;
                case 8: cur_fragment = new AnimalFragment("악어", "Cá sấu", "Alligator", R.raw.animal_alligator_korean, R.raw.animal_alligator_vietnamese, R.drawable.animal_alligator);break;
                case 9: cur_fragment = new AnimalFragment("앵무새", "Con Vẹt", "Parrot", R.raw.animal_parrot_korean, R.raw.animal_parrot_vietnamese, R.drawable.animal_parrot);break;
                case 10: cur_fragment = new AnimalFragment("캥거루", "Con căngguru", "Kangaroo", R.raw.animal_kangaroo_korean, R.raw.animal_kangaroo_vietnamese, R.drawable.animal_kangaroo);break;
                case 11: cur_fragment = new AnimalFragment("코끼리", "Con voi", "Elephant", R.raw.animal_elephant_korean, R.raw.animal_elephant_vietnamese, R.drawable.animal_elephant);break;
                case 12: cur_fragment = new AnimalFragment("타조", "đà điểu", "Ostrich", R.raw.animal_ostrich_korean, R.raw.animal_ostrich_vietnamese, R.drawable.animal_ostrich);break;
                case 13: cur_fragment = new AnimalFragment("토끼", "Con Thỏ", "Rabbit", R.raw.animal_rabbit_korean, R.raw.animal_rabbit_vietnamese, R.drawable.animal_rabbit);break;
                case 14: cur_fragment = new AnimalFragment("펭귄", "Chim cánh cụt", "Penguin", R.raw.animal_penguin_korean, R.raw.animal_penguin_vietnamese, R.drawable.animal_penguin);break;
                case 15: cur_fragment = new AnimalFragment("하마", "Hà mã", "Hippo", R.raw.animal_hippo_korean, R.raw.animal_hippo_vietnamese, R.drawable.animal_hippo);break;
                case 16: cur_fragment = new AnimalFragment("호랑이", "Con Hổ", "Tiger", R.raw.animal_tiger_korean, R.raw.animal_tiger_vietnamese, R.drawable.animal_tiger);break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }

    }

    //test land
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        //세로
//        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
////            EventBus.getDefault().post(new ConfEvent(""));
//            if(isPort = false){
//                setContentView(R.layout.activity_animal);
//                isPort = true;
//                ViewPager viewPager = (ViewPager) findViewById(R.id.animal_viewpager);
//                viewPager.setAdapter(new AnimalAdapter(getSupportFragmentManager()));
//            }
//
//        }
//
//        //가로
//        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//
//            if (isLand == false) {
//                setContentView(R.layout.activity_animal);
//                isLand = true;
//                ViewPager viewPager_land = (ViewPager) findViewById(R.id.animal_viewpager_land);
//                viewPager_land.setAdapter(new AnimalAdapter(getSupportFragmentManager()));
//
//            }
//
//        }
//    }

//      @Override
//      protected void onStop() {
//            super.onStop();
//          EventBus.getDefault().unregister(this);
//       }
//
//      @Subscribe(threadMode = ThreadMode.MAIN)
//      public void onEvent(ConfEvent event) { }


}
