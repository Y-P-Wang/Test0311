package com.example.test0311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String  bmi = getIntent().getStringExtra("BMI");
        TextView showbmi = findViewById(R.id.tvShow);
        showbmi.setText(bmi);


    }
}