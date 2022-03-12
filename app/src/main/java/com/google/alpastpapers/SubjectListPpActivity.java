package com.google.alpastpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SubjectListPpActivity extends AppCompatActivity {

   Button science;
   Button maths;
   Button commerce;
   Button arts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_list_pp);

        science = findViewById(R.id.science);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubjectListPpActivity.this,SciencePpActivity.class);
                startActivity(i);
            }
        });

        maths = findViewById(R.id.maths);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubjectListPpActivity.this,maths_pp.class);
                startActivity(i);
            }
        });

        commerce = findViewById(R.id.commerce);
        commerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubjectListPpActivity.this,commerce_pp.class);
                startActivity(i);
            }
        });


        arts = findViewById(R.id.arts);
        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubjectListPpActivity.this,arts_pp.class);
                startActivity(i);
            }
        });


    }
}