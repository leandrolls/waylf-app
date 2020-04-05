package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class magalu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magalu);
        String url6 = "https://www.magazineluiza.com.br/";


        WebView web = (WebView)findViewById(R.id.magalu);
        web.loadUrl(url6);
    }
}
