package com.yeungjin.clock_test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
    RadioButton rdoCal, rdoTime;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMinutes;
    TimePicker tPicker;
    DatePicker dPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약");


        chrono = (Chronometer) findViewById(R.id.chronometer1);

        rdoCal = (RadioButton) findViewById(R.id.rdoCal);
        rdoTime = (RadioButton) findViewById(R.id.rdoTime);

        dPicker = (DatePicker) findViewById(R.id.datePicker1);
        tPicker = (TimePicker) findViewById(R.id.timePicker1);

        tvYear = (TextView) findViewById(R.id.tvYear);
        tvMonth = (TextView) findViewById(R.id.tvMonth);
        tvDay = (TextView) findViewById(R.id.tvDay);
        tvHour = (TextView) findViewById(R.id.tvHour);
        tvMinutes = (TextView) findViewById(R.id.tvMinutes);

        dPicker.setVisibility(View.INVISIBLE);
        tPicker.setVisibility(View.INVISIBLE);
        rdoCal.setVisibility(View.INVISIBLE);
        rdoTime.setVisibility(View.INVISIBLE);



        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdoCal.setVisibility(View.VISIBLE);
                rdoTime.setVisibility(View.VISIBLE);

                // 크로노미터의 시간 단위를 시스템시계의 1초 단위와 같게 지정
                // 0으로 초기화
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.BLUE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dPicker.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.VISIBLE);
            }
        });

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dPicker.setVisibility(View.VISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
            }
        });

//        dPicker.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
//                selectYear = year;
//                selectMonth = month+1;
//                selectDay = day;
//
//            }
//        });

        tvYear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);

                tvYear.setText(Integer.toString(dPicker.getYear()));
                tvMonth.setText(Integer.toString(dPicker.getMonth()+1));
                tvDay.setText(Integer.toString(dPicker.getDayOfMonth()));
                tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
                tvMinutes.setText(Integer.toString(tPicker.getCurrentMinute()));


                dPicker.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
                rdoCal.setVisibility(View.INVISIBLE);
                rdoTime.setVisibility(View.INVISIBLE);
                return false;
            }
        });


    }

}