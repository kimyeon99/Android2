package com.yeungjin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2,btn3;
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        MyListenerClass lis = new MyListenerClass();

        btn2.setOnClickListener(lis);

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"클릭 후3", Toast.LENGTH_SHORT).show();

            }
        });
    }

    class MyListenerClass implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"클릭 후2", Toast.LENGTH_SHORT).show();
        }
    }

    public void test(View view){
        Toast.makeText(getApplicationContext(),"클릭 후1", Toast.LENGTH_SHORT).show();
   }

}