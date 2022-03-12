package com.google.alpastpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class science_ms extends AppCompatActivity {

    Button PP2019;
    Button PP2018;
    Button PP2017;
    Button PP2016;
    Button PP2015;
    Button PP2014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_ms);

        PP2019= findViewById(R.id.pp2019);
        PP2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( science_ms.this,view2019ms.class);
                startActivity(intent);

            }
        });

        PP2018= findViewById(R.id.pp2018);
        PP2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( science_ms.this,view2019ms.class);
                startActivity(intent);

            }
        });

        PP2017= findViewById(R.id.pp2017);
        PP2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( science_ms.this,view2018ms.class);
                startActivity(intent);

            }
        });

        PP2016= findViewById(R.id.pp2016);
        PP2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( science_ms.this,view2019ms.class);
                startActivity(intent);

            }
        });

        PP2015= findViewById(R.id.pp2015);
        PP2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( science_ms.this,view2015ms.class);
                startActivity(intent);

            }
        });

        PP2014= findViewById(R.id.pp2014);
        PP2014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( science_ms.this,view2014ms.class);
                startActivity(intent);

            }
        });



    }
}