package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MinMaxActivity extends AppCompatActivity {

    EditText etNumber1,
            etNumber2,
            etNumber3,
            etNumber4,
            etNumber5,
            etNumber6,
            etNumber7,
            etNumber8,
            hasil;

    Button btnMin, btnMax;
    String etA, etB, etC, etD, etE, etF, etG, etH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_max);

        etNumber1 = (EditText) findViewById(R.id.etNumber1);
        etNumber2 = (EditText) findViewById(R.id.etNumber2);
        etNumber3 = (EditText) findViewById(R.id.etNumber3);
        etNumber4 = (EditText) findViewById(R.id.etNumber4);
        etNumber5 = (EditText) findViewById(R.id.etNumber5);
        etNumber6 = (EditText) findViewById(R.id.etNumber6);
        etNumber7 = (EditText) findViewById(R.id.etNumber7);
        etNumber8 = (EditText) findViewById(R.id.etNumber8);

        hasil = (EditText) findViewById(R.id.etHasil);

        btnMin = (Button) findViewById(R.id.btnMin);
        btnMax = (Button) findViewById(R.id.btnMax);

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etA = etNumber1.getText().toString();
                etB = etNumber2.getText().toString();
                etC = etNumber3.getText().toString();
                etD = etNumber4.getText().toString();
                etE = etNumber5.getText().toString();
                etF = etNumber6.getText().toString();
                etG = etNumber7.getText().toString();
                etH = etNumber8.getText().toString();

                //Validation
                if(etA.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input A tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etB.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input B tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etC.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input C tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etD.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input D tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etE.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input E tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etF.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input F tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etG.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input G tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etH.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input H tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int nilaiA = Integer.parseInt(etA);
                int nilaiB = Integer.parseInt(etB);
                int nilaiC = Integer.parseInt(etC);
                int nilaiD = Integer.parseInt(etD);
                int nilaiE = Integer.parseInt(etE);
                int nilaiF = Integer.parseInt(etF);
                int nilaiG = Integer.parseInt(etG);
                int nilaiH = Integer.parseInt(etH);

                int min = 999999;

                if(min > nilaiA) {
                    min = nilaiA;
                }
                if(min > nilaiB) {
                    min = nilaiB;
                }
                if(min > nilaiC) {
                    min = nilaiC;
                }
                if(min > nilaiD) {
                    min = nilaiD;
                }
                if(min > nilaiE) {
                    min = nilaiE;
                }
                if(min > nilaiF) {
                    min = nilaiF;
                }
                if(min > nilaiG) {
                    min = nilaiG;
                }
                if(min > nilaiH) {
                    min = nilaiH;
                }

                hasil.setText(String.valueOf(min));
            }
        });

        btnMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etA = etNumber1.getText().toString();
                etB = etNumber2.getText().toString();
                etC = etNumber3.getText().toString();
                etD = etNumber4.getText().toString();
                etE = etNumber5.getText().toString();
                etF = etNumber6.getText().toString();
                etG = etNumber7.getText().toString();
                etH = etNumber8.getText().toString();

                //Validation
                if(etA.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input A tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etB.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input B tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etC.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input C tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etD.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input D tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etE.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input E tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etF.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input F tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etG.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input G tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(etH.equals("")) {
                    Toast.makeText(MinMaxActivity.this, "Input H tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int nilaiA = Integer.parseInt(etA);
                int nilaiB = Integer.parseInt(etB);
                int nilaiC = Integer.parseInt(etC);
                int nilaiD = Integer.parseInt(etD);
                int nilaiE = Integer.parseInt(etE);
                int nilaiF = Integer.parseInt(etF);
                int nilaiG = Integer.parseInt(etG);
                int nilaiH = Integer.parseInt(etH);

                int max = -100000;

                if(max < nilaiA) {
                    max = nilaiA;
                }
                if(max < nilaiB) {
                    max = nilaiB;
                }
                if(max < nilaiC) {
                    max = nilaiC;
                }
                if(max < nilaiD) {
                    max = nilaiD;
                }
                if(max < nilaiE) {
                    max = nilaiE;
                }
                if(max < nilaiF) {
                    max = nilaiF;
                }
                if(max < nilaiG) {
                    max = nilaiG;
                }
                if(max < nilaiH) {
                    max = nilaiH;
                }

                hasil.setText(String.valueOf(max));
            }
        });
    }
}