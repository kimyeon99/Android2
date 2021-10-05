package com.yeungjin.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // CheckBox mycheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checking(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.meat:
                if(checked){
                    Toast.makeText(getApplicationContext(), "고기를 선택했읍니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "고기를 선택 해제",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.cheese:
                if(checked){
                    Toast.makeText(getApplicationContext(), "치즈를 선택했읍니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "치즈 선택 해제.",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}