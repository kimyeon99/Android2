package com.yeungjin.practice_chapter5_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {
    CalendarView calView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calView = findViewById(R.id.calView);

        tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayofMonth) {
                selectYear = year;
                selectMonth = month + 1;
                selectDay = dayofMonth;
            }
        });
    }
}