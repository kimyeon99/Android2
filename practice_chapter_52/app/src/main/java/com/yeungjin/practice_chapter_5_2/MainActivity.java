package com.yeungjin.practice_chapter_5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btn6;
    String num1, num2;
    Integer result;
    int i;
    int index = i;
    Button[] buttons = new Button[5];
    Integer[] btnIDs = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(i=0; i<btnIDs.length; i++){
            buttons[i] = findViewById(btnIDs[i]);
        }

        for(i = 0; i < btnIDs.length; i++){
         final int index;
         index = i;
        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.isFocused()){
                    num1 = edit1.getText().toString() + buttons[index].toString();
                    edit1.setText(num1);
                }else if(edit2.isFocused()){
                    num2 = edit2.getText().toString() + buttons[index].toString();
                    edit2.setText(num2);
                }else{
                    Toast.makeText(getApplicationContext(),"잘못",Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
    }
}