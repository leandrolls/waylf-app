package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class zoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        String url5 = "https://www.zoom.com.br";


        WebView web = (WebView)findViewById(R.id.zoom);
        web.loadUrl(url5);
    }
}
