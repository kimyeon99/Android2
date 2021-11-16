package com.example.intentextras;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    RadioGroup rdoGroup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        rdoGroup = (RadioGroup) findViewById(R.id.rdoGroup);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
                EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);

                //★입력하기. 인텐트를 생성하고 두 값을 넣는다
                // 값을 돌려 받기 위해 startActivityForResult() 를 사용
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Num1",Integer.parseInt(edtNum1.getText().toString()));
                intent.putExtra("Num2",Integer.parseInt(edtNum2.getText().toString()));

                switch (rdoGroup.getCheckedRadioButtonId()){
                    case R.id.plus:
                        intent.putExtra("Calc", "+");
                        break;
                    case R.id.minus:
                        intent.putExtra("Calc", "-");
                        break;
                    case R.id.multiply:
                        intent.putExtra("Calc", "*");
                        break;
                    case R.id.division:
                        intent.putExtra("Calc", "/");
                        break;
                    default:
                        break;

                }

                startActivityForResult(intent, 0);

            }
        });
    }

    //★입력하기. 세컨트 액티비티에서 setResult() 로 값을 돌려주면,  onActivityResult()가 실행
    // setResult()가 보낸 값이 RESULT_OK이면 인텐트에서 돌려 받은 값을 토스트 메시지로 출력
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            int hap = data.getIntExtra("Hap", 0);
            Toast.makeText(getApplicationContext(),"합계: " + hap, Toast.LENGTH_SHORT).show();
        }
    }

}
