package com.example.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        ImageView mImageView = (ImageView)findViewById(R.id.loading_img);
        Glide.with(this).load(R.raw.logo1).into(mImageView);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new SplashHandler(), 9000);
        Log.i("SplashAcitivty", "SplashAcitivty");
    }

    private class SplashHandler implements Runnable{

        @Override
        public void run() {
                startActivity(new Intent(getApplicationContext(), ReservationStatusActivity.class));
            OpeningActivity.this.finish();

//            // call LoginActivity
//            if(SaveSharedPreference.getUserName(SplashActivity.this).length() == 0) {
//                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
//                SplashActivity.this.finish();
//            } else {
//                // Call MapsActivity
//                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
//                SplashActivity.this.finish();
//            }
        }
    }
    @Override
    public void onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }
}
