package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class kabum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabum);
        String url9 = "https://www.kabum.com.br";


        WebView web = (WebView)findViewById(R.id.kabum);
        web.loadUrl(url9);
    }
}
