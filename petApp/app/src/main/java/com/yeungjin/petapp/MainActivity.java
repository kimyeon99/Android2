package com.yeungjin.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Switch switchStart;
    RadioGroup rGroup1;
    RadioButton rdoPie, rdoQ, rdoR;
    ImageView imgVer;
    Button btnExit, btnGoToFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);

        switchStart = (Switch) findViewById(R.id.SwitchStart);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoPie = (RadioButton) findViewById(R.id.RdoPie);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        rdoR = (RadioButton) findViewById(R.id.RdoR);

        imgVer = (ImageView) findViewById(R.id.ImgVer);
        btnGoToFirst = (Button) findViewById(R.id.BtnGoToFirst);
        btnExit = (Button) findViewById(R.id.BtnExit);


        switchStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switchStart.isChecked() == true){
                    // 버튼,이미지,텍스트 등을 보이게 한다.
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgVer.setVisibility(android.view.View.VISIBLE);
                    btnExit.setVisibility(android.view.View.VISIBLE);
                    btnGoToFirst.setVisibility(android.view.View.VISIBLE);
                } else{
                    // 버튼,이미지,텍스트 등을 원 상태로 돌린다.
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgVer.setVisibility(android.view.View.INVISIBLE);
                    btnExit.setVisibility(android.view.View.INVISIBLE);
                    btnGoToFirst.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        //앱 종료 버튼
        btnExit.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View view) {
                //메세지 출력 후 종료
                Toast.makeText(getApplicationContext(),"앱을 종료합니다.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        //처음으로 가는 버튼
        btnGoToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼,이미지,텍스트를 원 상태로 돌린다.
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup1.setVisibility(android.view.View.INVISIBLE);
                imgVer.setVisibility(android.view.View.INVISIBLE);
                btnExit.setVisibility(android.view.View.INVISIBLE);
                btnGoToFirst.setVisibility(android.view.View.INVISIBLE);
                // 시작하기 버튼도 처음으로 돌린다.
                switchStart.setChecked(false);
                // 체크했던 안드로이드 버전도 처음으로 돌린다.
                rdoPie.setChecked(false);
                rdoR.setChecked(false);
                rdoQ.setChecked(false);
                // 이미지도 원래대로 아무것도 보이지 않는 상태로 돌린다.
                imgVer.setImageResource(0);

            }
        });

        rdoPie.setOnClickListener(radio_listener);
        rdoQ.setOnClickListener(radio_listener);
        rdoR.setOnClickListener(radio_listener);

    }

    View.OnClickListener radio_listener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch(rGroup1.getCheckedRadioButtonId()) {
                case R.id.RdoPie:
                    imgVer.setImageResource(R.drawable.pie);
                    break;
                case R.id.RdoQ:
                    imgVer.setImageResource(R.drawable.q10);
                    break;
                case R.id.RdoR:
                    imgVer.setImageResource(R.drawable.r11);
                    break;
                default:
                    Toast.makeText(getApplicationContext(),"안드로이드 버전 먼저 선택하세용", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}


