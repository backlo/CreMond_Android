package com.example.lenovo.cremond_android;

import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.cremond_android.Animal.AnimalActivity;
import com.example.lenovo.cremond_android.Body.BodyActivity;
import com.example.lenovo.cremond_android.Color.ColorActivity;
import com.example.lenovo.cremond_android.Job.JobActivity;
import com.example.lenovo.cremond_android.Number.NumberActivity;
import com.example.lenovo.cremond_android.Objects.ObjectsActivity;
import com.example.lenovo.cremond_android.Plant.PlantActivity;
import com.example.lenovo.cremond_android.Vehicle.VehicleActivity;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.animal_image) ImageView animal_image;
    @BindView(R.id.animal_text) TextView animal_text;
    @BindView(R.id.body_image) ImageView body_image;
    @BindView(R.id.body_text) TextView body_text;
    @BindView(R.id.color_image) ImageView color_image;
    @BindView(R.id.color_text) TextView color_text;
    @BindView(R.id.job_image) ImageView job_image;
    @BindView(R.id.job_text) TextView job_text;
    @BindView(R.id.number_image) ImageView number_image;
    @BindView(R.id.number_text) TextView number_text;
    @BindView(R.id.objects_image) ImageView objects_image;
    @BindView(R.id.objects_text) TextView objects_text;
    @BindView(R.id.plant_image) ImageView plant_image;
    @BindView(R.id.plant_text) TextView plant_text;
    @BindView(R.id.vehicle_image) ImageView vehicle_image;
    @BindView(R.id.vehicle_text) TextView vehicle_text;
    @BindView(R.id.qr_code) ImageView qr_code;

    private long mLastClickTime=0;
    private IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        qrScan = new IntentIntegrator(this);
        Intent i = new Intent(this, LoadingActivity.class);
        startActivity(i);

    }

    @OnClick({R.id.animal_text, R.id.animal_image})
    public void animalOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, AnimalActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.body_text, R.id.body_image})
    public void bodyOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, BodyActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.color_text, R.id.color_image})
    public void colorOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, ColorActivity.class);
        startActivity(i);

    }

    @OnClick({R.id.job_text, R.id.job_image})
    public void jobOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, JobActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.number_text, R.id.number_image})
    public void numberOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, NumberActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.objects_text, R.id.objects_image})
    public void objectsOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, ObjectsActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.plant_text, R.id.plant_image})
    public void plantOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, PlantActivity.class);
        startActivity(i);
    }

    @OnClick({R.id.vehicle_text, R.id.vehicle_image})
    public void vehicleOnClick(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        Intent i = new Intent(MainActivity.this, VehicleActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.qr_code)
    public void startQRCode(){
        //더블클릭 방지
        if (SystemClock.elapsedRealtime() - mLastClickTime < 2000) return;
        mLastClickTime = SystemClock.elapsedRealtime();

        qrScan.setPrompt("Scanning...");
        qrScan.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if(result != null){
            if(result.getContents() == null) {
                Toast.makeText(MainActivity.this, "Cancel..", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(MainActivity.this, "Scan Complete!!", Toast.LENGTH_SHORT).show();

                try {
                    JSONObject obj = new JSONObject(result.getContents());

                    String korean = obj.getString("korean");
                    String vietnamese = obj.getString("vietnamese");
//                    int image = obj.getInt("image");
//                    int speechkorean = obj.getInt("speechkorean");
//                    int speechvietnamese = obj.getInt("speechvietnamese");

                    Toast.makeText(getApplicationContext(), "한국어 : " + korean + ", 베트남어 : " + vietnamese + "\n 아직 개발중입니다...", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(MainActivity.this,  QRActivity.class);
//                    i.putExtra("korean",korean);
//                    i.putExtra("vietnamese", vietnamese);
//                    i.putExtra("image", image);
//                    i.putExtra("speechkorean", speechkorean);
//                    i.putExtra("speechvietnamese", speechvietnamese);

                    startActivity(i);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
