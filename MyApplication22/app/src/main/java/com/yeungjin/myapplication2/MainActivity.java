package com.yeungjin.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    TextView text;
    ImageView image;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.edit1);
        text = findViewById(R.id.text);
        image = findViewById(R.id.imageView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();

        mInflater.inflate(R.menu.menu, menu);

        return true;
    }

    

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.rotation:
                image.setRotation(Integer.parseInt(edit.getText().toString()));
                return true;
            case R.id.dog:
                image.setImageResource(R.drawable.dog);
                return true;
            case R.id.cat:
                image.setImageResource(R.drawable.cat);
                return true;
            case R.id.rabiit:
                image.setImageResource(R.drawable.rabbit);
                return true;
        }
        return false;
    }
}