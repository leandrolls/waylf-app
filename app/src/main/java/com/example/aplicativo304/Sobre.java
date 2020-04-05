package com.example.aplicativo304;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Sobre extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);


        String info2 = "Leandro Lima Santos \nRM: 85386 \nAplicativo desenvolvido para a disciplina de desenvolvimento mobile e internet of things ";

        TextView texto = (TextView)findViewById(R.id.textView2);
        texto.setText(info2);

    }
}
