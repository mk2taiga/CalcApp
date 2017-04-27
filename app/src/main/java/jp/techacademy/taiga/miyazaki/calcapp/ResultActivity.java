package jp.techacademy.taiga.miyazaki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int value = intent.getIntExtra("VALUE", 0);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(String.valueOf(value));

    }
}
