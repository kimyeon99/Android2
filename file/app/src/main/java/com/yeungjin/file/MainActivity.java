package com.yeungjin.file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnWrite;
    DatePicker dPicker;
    EditText edit;
    String fileName;
    String firstfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWrite = findViewById(R.id.btnWrite);
        dPicker = findViewById(R.id.dPicker);
        edit = findViewById(R.id.Edit);

        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH);
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        // 처음에 btnWrite를 Enable를 true로 해놨음
        fileName = Integer.toString(cYear) + "_" + Integer.toString(cMonth) +  "_" + Integer.toString(cDay) + ".txt";
        readDiary(fileName);

        dPicker.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int month, int dayOfMonth) {
                fileName = Integer.toString(year) + "_" + Integer.toString(month) +  "_" + Integer.toString(dayOfMonth) + ".txt";
                //readDiary는 파일 읽어들이는 메서드
                String str = readDiary(fileName);
                edit.setText(str);
                // btnWrite.setEnabled(true);
            }
        });

        btnWrite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream outFs = openFileOutput(fileName, Context.MODE_PRIVATE);
                    String str = edit.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(),fileName+" 이 저장됨", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    //공란
                }
            }
        });

    }
    String readDiary(String fileName){
        String diaryStr = null;
        FileInputStream inFs;
        try{
            inFs = openFileInput(fileName);
            byte[] txt = new byte[500];
            inFs.read(txt);
            inFs.close();
            diaryStr = (new String(txt)).trim();
            edit.setText(diaryStr);
            btnWrite.setText("수정하기");
        } catch (IOException e) {
            edit.setHint("일기 없음");
            btnWrite.setText("새로 저장");
        }
        return diaryStr;
    }
}