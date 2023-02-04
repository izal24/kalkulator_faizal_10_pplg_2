package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mytext;
    EditText ourtext;
    Button mybutton;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext=(EditText) findViewById(R.id.username);
        ourtext=(EditText) findViewById(R.id.password);
        mybutton=(Button) findViewById(R.id.btnlogin);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mytext.equals("admin")&&ourtext.equals("admin")) {
                    startActivity(new Intent(MainActivity.this,Kalkulator.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Gagal Login",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}