package com.google.alpastpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subject_list_ms extends AppCompatActivity {

 Button science;
 Button maths;
 Button commerce;
 Button arts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list_ms);

        science = findViewById(R.id.science);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(subject_list_ms.this,science_ms.class);
                startActivity(i);
            }
        });


        maths = findViewById(R.id.maths);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(subject_list_ms.this,maths_ms.class);
                startActivity(i);
            }
        });


        commerce = findViewById(R.id.commerce);
        commerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(subject_list_ms.this,commerce_ms.class);
                startActivity(i);
            }
        });

        arts = findViewById(R.id.arts);
        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(subject_list_ms.this,arts_ms.class);
                startActivity(i);
            }
        });

    }
}