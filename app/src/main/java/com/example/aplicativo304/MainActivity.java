package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void americanas (View v){
        Intent intent = new Intent (this, Tela2.class);
        startActivity(intent);
    }

    public void buscape (View v1){
        Intent intent2 = new Intent (this, Tela3.class);
        startActivity(intent2);
    }

    public void fastshop (View v2){
        Intent intent3 = new Intent (this, tela4.class);
        startActivity(intent3);
    }
    public void icarros (View v3){
        Intent intent4 = new Intent (this, tela5.class);
        startActivity(intent4);
    }
    public void sobre (View v4){
        Intent intent5 = new Intent (this, Sobre.class);
        startActivity(intent5);
    }
    public void zoom (View v5){
        Intent intent6 = new Intent (this, zoom.class);
        startActivity(intent6);
    }
    public void magalu (View v7){
        Intent intent7 = new Intent (this, magalu.class);
        startActivity(intent7);
    }
    public void submarino (View v8){
        Intent intent8 = new Intent (this, submarino.class);
        startActivity(intent8);
    }
    public void mercadolivre (View v9){
        Intent intent9 = new Intent (this, mercadolivre.class);
        startActivity(intent9);
    }
    public void kabum (View v10){
        Intent intent10 = new Intent (this, kabum.class);
        startActivity(intent10);
    }
}
