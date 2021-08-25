package com.example.projeto_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.io.CharArrayWriter;
import java.util.Scanner;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fatorial extends AppCompatActivity {

    EditText v1;
    EditText v2;
    TextView resultado;
    int num;
    String mostrar = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);
        setTitle("Fatorial");
        resultado = (TextView)findViewById(R.id.result);
    }

    public void exibir(View view){
        v1 = (EditText)findViewById(R.id.valor1);
        num = Integer.parseInt(v1.getText().toString());
        fatorial();
    }

    public void fatorial(){
        int fato = 1;
        for(int i=num; i>1; i--){
            fato = fato * i;
        }
        mostrar = mostrar + Integer.toString(fato);
        resultado.setText(mostrar);
    }
}