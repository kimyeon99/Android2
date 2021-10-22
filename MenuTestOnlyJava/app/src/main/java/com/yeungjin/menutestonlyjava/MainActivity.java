package com.yeungjin.menutestonlyjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.yeungjin.menutestonlyjava.R;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    LinearLayout baselayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baselayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        registerForContextMenu(button1);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);


        if(v == button1){
            menu.add(0, 1, 0, "빨강");
            menu.add(0, 2, 0, "초록");
            menu.add(0, 3, 0, "파랑");
        }
        if(v == button2){
            menu.add(0,4,0, "45도회전");
            menu.add(0,5,0, "2배");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                baselayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
                baselayout.setBackgroundColor(Color.BLUE);
                return true;
            case 3:
                baselayout.setBackgroundColor(Color.GREEN);
                return true;
            case 4:
                button2.setRotation(45);
                return true;
            case 5:
                button2.setScaleX(2);
                return true;

        }
        return false;
    }
}
