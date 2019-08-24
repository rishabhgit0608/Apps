package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SevondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevond);
        Button button = (Button) findViewById(R.id.button2_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView  text1 = (TextView) findViewById(R.id.TextView1);
                TextView  text2 = (TextView) findViewById(R.id.TextView2);
                TextView result = (TextView) findViewById(R.id.textView);

                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());
                int result3 =num1+num2;
                result.setText(result3 +" ");
            }

        });
        Button button2 = (Button) findViewById(R.id.button2_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView  text1 = (TextView) findViewById(R.id.TextView1);
                TextView  text2 = (TextView) findViewById(R.id.TextView2);
                TextView result = (TextView) findViewById(R.id.textView);

                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());
                int result3 =num1-num2;
                result.setText(result3 +" ");
            }
        });
     }
}
