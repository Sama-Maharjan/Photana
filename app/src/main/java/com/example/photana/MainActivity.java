package com.example.photana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout relativeLayout1, relativeLayout2;
Handler handler=new Handler();
Runnable runnable =new Runnable() {
    @Override
    public void run() {
        relativeLayout1.setVisibility(View.VISIBLE);
        relativeLayout2.setVisibility(View.VISIBLE);
    }
};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout1=(RelativeLayout)findViewById(R.id.relativeLayout1);
        relativeLayout2=(RelativeLayout)findViewById(R.id.relativeLayout2);
        handler.postDelayed(runnable,3000);
    }
}
