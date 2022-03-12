package com.google.alpastpapers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class View2017ppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2019pp);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("bio2017pp.pdf").load();
    }
}