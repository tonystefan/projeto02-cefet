package com.example.projeto_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bFato, bFibo, bPrimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bFato=findViewById(R.id.butFato);
        bFibo=findViewById(R.id.butFibo);
        bPrimo=findViewById(R.id.butPrimo);

        bFato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fatorial = new Intent(getApplicationContext(),Fatorial.class);
                startActivity(fatorial);

            }
        });

        bFibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fibonacci = new Intent(getApplicationContext(),Fibonacci.class);
                startActivity(fibonacci);

            }
        });

        bPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent primo = new Intent(getApplicationContext(), NumPrimo.class);
                startActivity(primo);

            }
        });
    }
}