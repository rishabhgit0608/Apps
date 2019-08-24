package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =  new Intent(getApplicationContext(),SevondActivity.class);
                startActivity(intent);
            }
        });
        Button button2  =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mygit =  "https://codingblocks.com/classroom-courses/machine-learning-with-deep-learning.html";
                Uri Webadd = Uri.parse(mygit);
                Intent ADD  = new Intent(Intent.ACTION_VIEW , Webadd);
                if(ADD.resolveActivity(getPackageManager())!=null){
                    startActivity(ADD);
                }
            }
        });
    }
}
