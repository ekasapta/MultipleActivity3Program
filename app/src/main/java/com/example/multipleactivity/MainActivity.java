package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalculator, btnMinMax, btnPythagoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator   = (Button) findViewById(R.id.btnCalculator);
        btnMinMax       = (Button) findViewById(R.id.btnMinMax);
        btnPythagoras   = (Button) findViewById(R.id.btnPythagoras);

        //Button Calculator
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CalculatorActivity = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(CalculatorActivity);
            }
        });

        //Button Min/Max
        btnMinMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MinMaxActivity = new Intent(MainActivity.this, MinMaxActivity.class);
                startActivity(MinMaxActivity);
            }
        });

        //Button Pythagoras
        btnPythagoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PythagorasActivity = new Intent(MainActivity.this, PythagorasActivity.class);
                startActivity(PythagorasActivity);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }
}