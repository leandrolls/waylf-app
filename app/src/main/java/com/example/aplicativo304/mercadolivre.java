package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class mercadolivre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercadolivre);

        String url8 = "https://www.mercadolivre.com.br";


        WebView web = (WebView)findViewById(R.id.mercadolivre);
        web.loadUrl(url8);
    }
}
