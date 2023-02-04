package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Kalkulator2 extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    Button plusButton;
    Button minusButton;
    Button timeButton;
    Button divideButton;
    double number1, number2, hasil;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator2);

        editText1 = findViewById(R.id.angka1);
        editText2 = findViewById(R.id.angka2);
        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
        timeButton = findViewById(R.id.times);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numText1 = editText1.getText().toString();
                String numText2 = editText2.getText().toString();

                int number1 = Integer.parseInt(numText1);
                int number2 = Integer.parseInt(numText2);

                int hasil = number1 + number2;
                Toast.makeText(getApplicationContext(),"Hasil : " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numText1 = editText1.getText().toString();
                String numText2 = editText2.getText().toString();

                int number1 = Integer.parseInt(numText1);
                int number2 = Integer.parseInt(numText2);

                int hasil = number1 - number2;
                Toast.makeText(getApplicationContext(),"Hasil : " +  hasil, Toast.LENGTH_SHORT).show();
            }
        });

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numText1 = editText1.getText().toString();
                String numText2 = editText2.getText().toString();

                int number1 = Integer.parseInt(numText1);
                int number2 = Integer.parseInt(numText2);

                int hasil = number1 * number2;
                Toast.makeText(getApplicationContext(),"Hasil : " +  hasil, Toast.LENGTH_SHORT).show();
            }
        });

        divideButton = findViewById(R.id.divided);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numText1 = editText1.getText().toString();
                String numText2 = editText2.getText().toString();
                if ((editText1.getText().length()>0) && editText2.getText().length()>0){
                    number1 = Integer.parseInt(numText1);
                    number2 = Integer.parseInt(numText2);
                    hasil = number1 / number2;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Tolong Masukan Angka", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}