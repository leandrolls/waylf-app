package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        String url2 = "https://www.buscape.com.br";


        WebView web = (WebView)findViewById(R.id.webView2);
        web.loadUrl(url2);
    }
}
