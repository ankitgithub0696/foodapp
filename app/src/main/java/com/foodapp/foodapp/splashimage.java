package com.foodapp.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashimage extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashimage);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {

              startActivity(intent);
              finish();
          }
      },4000) ;

        intent=new Intent(splashimage.this, MainActivity.class);
    }
}