package com.google.alpastpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class HomeActivity extends AppCompatActivity {

    Button pastpapers;
    Button Marking;
    Button taksalawa;
    Button about;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pastpapers= findViewById(R.id.pp);
        pastpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,SubjectListPpActivity.class);
                startActivity(i);

            }
        });

        Marking = findViewById(R.id.ms);
        Marking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,subject_list_ms.class);
                startActivity(i);
            }
        });

        taksalawa = findViewById(R.id.link);
        taksalawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.e-thaksalawa.moe.gov.lk/"));
                startActivity(i);
            }
        });

        about = findViewById(R.id.About_us_btn);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,AboutUsActivity.class);
                startActivity(i);
            }
        });

        exit = findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             finish();

            }
        });



    }
}