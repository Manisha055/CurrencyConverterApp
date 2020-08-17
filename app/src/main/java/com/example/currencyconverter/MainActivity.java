package com.example.currencyconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void converterfunction(View view){

        EditText editText=findViewById(R.id.editText);
        String Number=editText.getText().toString();

       double d=Double.parseDouble(Number);
       double dollar=d*1.3;
       @SuppressLint("DefaultLocale") String converter=String.format("%.2f", dollar);
        Toast.makeText(this, ""+Number+" is $"+converter, Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
