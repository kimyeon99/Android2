package com.yeungjin.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    EditText etID, etPassword;
    Button btnLogin;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("명시적 인텐트 데이터 전달");

        etID = findViewById(R.id.etID);;
        etPassword = findViewById(R.id.etPassword);
        btnLogin= findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("id", etID.getText().toString());
                intent.putExtra("password", Integer.parseInt(etPassword.getText().toString()));

                startActivity(intent);
            }
        });




    }

}
