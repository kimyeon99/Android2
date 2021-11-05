package com.yeungjin.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    EditText edit1, edit2;
    TextView text;
    String n1, n2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.BtnAdd);
        btn2 = findViewById(R.id.BtnSub);
        btn3 = findViewById(R.id.BtnMul);
        btn4 = findViewById(R.id.BtnDiv);
        btn5 = findViewById(R.id.BtnNa);

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);

        text = findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("") ){
                    Toast.makeText(getApplicationContext(),'ㅇ',Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(n1) + Double.parseDouble(n2);
                    text.setText(result.toString());
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                result = Double.parseDouble(n1) - Double.parseDouble(n2);
                text.setText(result.toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                result = Double.parseDouble(n1) * Double.parseDouble(n2);
                text.setText(result.toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                if(n1.trim().equals("") || n2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"dsa",Toast.LENGTH_SHORT).show();
                }else if(n2.trim().equals('0')){
                    Toast.makeText(getApplicationContext(),"sda",Toast.LENGTH_SHORT).show();
                }
                else{
                    result = Double.parseDouble(n1) / Double.parseDouble(n2);
                    text.setText(result.toString());
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = edit1.getText().toString();
                n2 = edit2.getText().toString();
                result = Double.parseDouble(n1) % Double.parseDouble(n2);
                text.setText(result.toString());
            }
        });
    }
}