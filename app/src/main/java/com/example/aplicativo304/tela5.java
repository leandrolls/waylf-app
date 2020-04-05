package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class tela5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        String url4 = "https://www.webmotors.com.br";

        WebView web = (WebView)findViewById(R.id.webView4);
        web.loadUrl(url4);

    }
}
