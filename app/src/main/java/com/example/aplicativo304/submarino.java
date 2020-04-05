package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class submarino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submarino);
        String url7 = "https://www.submarino.com.br";


        WebView web = (WebView)findViewById(R.id.submarino);
        web.loadUrl(url7);
}
}
