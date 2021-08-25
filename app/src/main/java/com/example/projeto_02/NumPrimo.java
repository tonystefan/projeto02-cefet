package com.example.projeto_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NumPrimo extends AppCompatActivity {

    EditText v3;
    TextView resultado3;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_primo);
        setTitle("Número Primo");
        resultado3 = (TextView)findViewById(R.id.result2);
    }

    public void teste(View view) {
        v3 = findViewById(R.id.valor3);
        num = Integer.parseInt(v3.getText().toString());
        primo();
    }

    public void primo(){
        int div = 0;

        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            resultado3.setText("Sim!");
        } else {
            resultado3.setText("Não!");
        }
    }

}