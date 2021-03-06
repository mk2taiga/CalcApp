package jp.techacademy.taiga.miyazaki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //editTextのアクティビティ
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        //buttonのアクティビティとイベントリスナー
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Intentのインスタンス
        Intent intent = new Intent(this, ResultActivity.class);
        //EditTextの中身を取得する, int型に変換する
        String str1 = editText1.getText().toString();
        double num1 = Double.parseDouble(str1);
        String str2 = editText2.getText().toString();
        double num2 = Double.parseDouble(str2);
        //ボタンの条件分岐
        if (v.getId() == R.id.button1) {
             sum = num1 + num2;
            intent.putExtra("VALUE", sum);
        }else if (v.getId() == R.id.button2) {
            sum = num1 - num2;
            intent.putExtra("VALUE", sum);
        }else if (v.getId() == R.id.button3) {
            sum = num1 * num2;
            intent.putExtra("VALUE", sum);
        }else if (v.getId() == R.id.button4) {
            if (num1 != 0 && num2 != 0) {
                sum = num1 / num2;
                intent.putExtra("VALUE", sum);
            }
        }

        startActivity(intent);
    }
}
