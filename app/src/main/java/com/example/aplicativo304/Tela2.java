package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toolbar;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        String url = "https://www.americanas.com.br";

        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);
    }
}

