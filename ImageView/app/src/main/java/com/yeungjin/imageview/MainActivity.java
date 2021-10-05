package com.yeungjin.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    CheckBox startCheck;
    Button btn1;
    RadioButton RdoDog,RdoCat,RdoRabbit;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startCheck = (CheckBox) findViewById(R.id.startCheck);
        btn1 = (Button) findViewById(R.id.btn1);
        RdoDog = (RadioButton) findViewById(R.id.RdoDog);
        RdoCat = (RadioButton) findViewById(R.id.RdoCat);
        RdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);
        image = (ImageView) findViewById(R.id.image);

        startCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(startCheck.isChecked()){
                    btn1.setVisibility(View.VISIBLE);
                    RdoDog
                }
            }
        })
    }
}