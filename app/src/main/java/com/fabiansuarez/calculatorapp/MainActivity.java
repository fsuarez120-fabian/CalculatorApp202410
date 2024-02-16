package com.fabiansuarez.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSumar;
        Button btnRestar, btnMultiplicar, btnDividir;
        EditText etNum1, etNum2;
        TextView tvResultado;
        
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);
        
        etNum1 = findViewById(R.id.edt_num_1);
        etNum2 = findViewById(R.id.edt_num_2);
        tvResultado = findViewById(R.id.txt_resultado);
    }
    
    
    public void clickSumar(View miViewcita){

        Toast.makeText(this, "LE DI CLICK A SUMAR", Toast.LENGTH_SHORT).show();
        
    }
    
}