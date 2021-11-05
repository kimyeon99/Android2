package com.yeungjin.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox check;
    RadioGroup group;
    RadioButton cat, dog;
    ImageView img;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        check = findViewById(R.id.check);
        group = findViewById(R.id.group);
        cat = findViewById(R.id.cat);
        dog = findViewById(R.id.dog);
        img = findViewById(R.id.img);
        ok = findViewById(R.id.ok);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (group.getCheckedRadioButtonId()){
                    case R.id.dog:
                        img.setImageResource(R.drawable.dog);
                }
            }
        });


       cat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
               if(isChecked){
                   group.setVisibility(android.view.View.VISIBLE);
                   text2.setVisibility(android.view.View.VISIBLE);
                   ok.setVisibility(android.view.View.VISIBLE);
               }else{
                   text2.setVisibility(view.INVISIBLE);
                   group.setVisibility(view.INVISIBLE);
                   ok.setVisibility(view.INVISIBLE);
                   img.setVisibility(view.INVISIBLE);
               }
           }
       });
    }
    public void checked(View view){
            boolean checked = ((CheckBox) view).isChecked();
            switch(view.getId()){
                case R.id.check:

                    break;
        }
    }
    public void clicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.dog:
                if(checked){

                }
        }
    }

}