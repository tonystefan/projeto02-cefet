package com.example.projeto_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fibonacci extends AppCompatActivity {

    EditText v2;
    TextView resultado2;
    int num, num2, i, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        setTitle("Fibonacci");
        resultado2 = (TextView)findViewById(R.id.result2);
    }

    public void exFibo(View view) {
        v2 = (EditText) findViewById(R.id.valor2);
        num = Integer.parseInt(v2.getText().toString());
        fibonacci();
    }
    public void fibonacci(){
        int num1 = 1, num2 = 0;
        resultado2.setText("0 ");

        if( num == 1){
            resultado2.setText("Numero: 0");
        }else{
            for(int i = 1; i<num; i++){
                resultado2.setText(resultado2.getText() + Integer.toString(num1) + " ");
                num1 = num1 + num2;
                num2 = num1 - num2;
            }

        }
    }

}