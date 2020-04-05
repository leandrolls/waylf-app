package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class tela4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        String ur3 = "https://www.fastshop.com.br/web/";

        WebView web = (WebView)findViewById(R.id.webView3);
        web.loadUrl(ur3);
    }
}
