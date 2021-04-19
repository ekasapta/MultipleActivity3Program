package com.example.multipleactivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PythagorasActivity extends AppCompatActivity {

    Button btnHitung;
    EditText etPanjangAB, etPanjangAC, etPanjangBC;
    double hasil;
    String ab, ac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythagoras);

        btnHitung = (Button) findViewById(R.id.btnHitung);
        etPanjangAB = (EditText) findViewById(R.id.etPanjangAB);
        etPanjangAC = (EditText) findViewById(R.id.etPanjangAC);
        etPanjangBC = (EditText) findViewById(R.id.etPanjangBC);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ab = etPanjangAB.getText().toString();
                ac = etPanjangAC.getText().toString();

                //Validation
                if(ab.equals("")) {
                    Toast.makeText(PythagorasActivity.this, "Panjang AB tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Validation
                if(ac.equals("")) {
                    Toast.makeText(PythagorasActivity.this, "Panjang AC tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int nilaiAB = Integer.parseInt(ab);
                int nilaiAC = Integer.parseInt(ac);

                hasil = Math.sqrt(Math.pow(nilaiAB, 2) + Math.pow(nilaiAC, 2));
                etPanjangBC.setText(String.valueOf(hasil));
            }
        });
    }
}