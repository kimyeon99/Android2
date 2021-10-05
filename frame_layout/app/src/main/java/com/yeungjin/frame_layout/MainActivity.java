package com.yeungjin.frame_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView dog1, dog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog1 = (ImageView) findViewById(R.id.dog1);
        dog2 = (ImageView) findViewById(R.id.dog2);

        dog2.setVisibility(View.INVISIBLE);
    }
    public void onClicked(View view){
        switch (view.getId()){
            case R.id.btn1:
                dog1.setVisibility(View.VISIBLE);
                dog2.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn2:
                dog1.setVisibility(View.INVISIBLE);
                dog2.setVisibility(View.VISIBLE);
                break;
        }
    }


}