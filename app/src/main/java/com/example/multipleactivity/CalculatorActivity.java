package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText etBilangan1, etBilangan2, etHasil;
    Button btnTambah, btnPengurangan, btnPerkalian, btnPembagian, btnModulo, btnAkar;
    double hasil, bilangan1, bilangan2;
    String nilaiBilangan1, nilaiBilangan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Edit Text
        etBilangan1 = (EditText) findViewById(R.id.etBilangan1);
        etBilangan2 = (EditText) findViewById(R.id.etBilangan2);
        etHasil     = (EditText) findViewById(R.id.etHasil);

        // Button
        btnTambah = (Button) findViewById(R.id.btnPenjumlahan);
        btnPengurangan = (Button) findViewById(R.id.btnPengurangan);
        btnPerkalian = (Button) findViewById(R.id.btnPerkalian);
        btnPembagian = (Button) findViewById(R.id.btnPembagian);
        btnModulo = (Button) findViewById(R.id.btnModulo);
        btnAkar = (Button) findViewById(R.id.btnAkar);

        // Tombol klik untuk penjumlahan
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBilangan1 = etBilangan1.getText().toString();
                nilaiBilangan2 = etBilangan2.getText().toString();

                //Validation
                if(nilaiBilangan1.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 1 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(nilaiBilangan2.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 2 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                bilangan1 = Double.parseDouble(nilaiBilangan1);
                bilangan2 = Double.parseDouble(nilaiBilangan2);

                hasil = bilangan1 + bilangan2;
                etHasil.setText(Double.toString(hasil));
            }
        });

        // Tombol klik untuk pengurangan
        btnPengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBilangan1 = etBilangan1.getText().toString();
                nilaiBilangan2 = etBilangan2.getText().toString();

                //Validation
                if(nilaiBilangan1.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 1 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(nilaiBilangan2.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 2 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                bilangan1 = Double.parseDouble(nilaiBilangan1);
                bilangan2 = Double.parseDouble(nilaiBilangan2);

                hasil = bilangan1 - bilangan2;
                etHasil.setText(Double.toString(hasil));
            }
        });

        // Tombol klik untuk perkalian
        btnPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBilangan1 = etBilangan1.getText().toString();
                nilaiBilangan2 = etBilangan2.getText().toString();

                //Validation
                if(nilaiBilangan1.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 1 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(nilaiBilangan2.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 2 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                bilangan1 = Double.parseDouble(nilaiBilangan1);
                bilangan2 = Double.parseDouble(nilaiBilangan2);

                hasil = bilangan1 * bilangan2;
                etHasil.setText(Double.toString(hasil));
            }
        });

        // Tombol klik untuk pembagian
        btnPembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBilangan1 = etBilangan1.getText().toString();
                nilaiBilangan2 = etBilangan2.getText().toString();

                //Validation
                if(nilaiBilangan1.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 1 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(nilaiBilangan2.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 2 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                bilangan1 = Double.parseDouble(nilaiBilangan1);
                bilangan2 = Double.parseDouble(nilaiBilangan2);

                hasil = bilangan1 / bilangan2;
                etHasil.setText(Double.toString(hasil));
            }
        });

        // Tombol klik untuk modulo
        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBilangan1 = etBilangan1.getText().toString();
                nilaiBilangan2 = etBilangan2.getText().toString();

                //Validation
                if(nilaiBilangan1.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 1 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(nilaiBilangan2.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 2 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                bilangan1 = Double.parseDouble(nilaiBilangan1);
                bilangan2 = Double.parseDouble(nilaiBilangan2);

                hasil = bilangan1 % bilangan2;
                etHasil.setText(Double.toString(hasil));
            }
        });

        // Tombol klik untuk pangkat
        btnAkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiBilangan1 = etBilangan1.getText().toString();
                nilaiBilangan2 = etBilangan2.getText().toString();

                //Validation
                if(nilaiBilangan1.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 1 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(nilaiBilangan2.equals("")) {
                    Toast.makeText(CalculatorActivity.this, "Bilangan 2 tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                bilangan1 = Double.parseDouble(nilaiBilangan1);
                bilangan2 = Double.parseDouble(nilaiBilangan2);

                hasil = Math.pow(bilangan1, bilangan2);
                etHasil.setText(Double.toString(hasil));
            }
        });
    }
}