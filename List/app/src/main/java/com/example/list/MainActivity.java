package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void button2(View view){

        EditText editText = (EditText)findViewById(R.id.editText1);
        EditText editText1 = (EditText) findViewById(R.id.Password1);
        int num1 = Integer.parseInt(editText.getText().toString());
        int num2 = Integer.parseInt(editText1.getText().toString());
        int myresult = num1+num2;
        Log.i("username", editText.getText().toString());
        Log.i("password", editText1.getText().toString());
        Toast.makeText(MainActivity.this, myresult+"", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
