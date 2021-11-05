package com.yeungjin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn, btn2, btn3;
        class Click implements View.OnClickListener{
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"click!", Toast.LENGTH_SHORT).show();
            }
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        Click click = new Click();
        btn3.setOnClickListener(click);

        // 익명 클래스 방법
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"안녕",Toast.LENGTH_LONG).show();
            }
        });

    }

    //onClicked 방법
    public void clicked(View view){ // View view 주의할 것.
        Toast.makeText(getApplicationContext(),"onClicked!",Toast.LENGTH_LONG).show();
    }



}

