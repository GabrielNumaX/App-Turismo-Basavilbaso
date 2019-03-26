package com.practicas.tecnicaturautnbasavilbaso.turismobasavilbaso;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AtractivosActivity extends AppCompatActivity {

    ImageButton callTermas;
    ImageButton callCircuito;
    ImageButton callMusFerro;
    ImageButton callMusHist;
    ImageButton callCasaMuseo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atractivos);


        callTermas=(ImageButton)findViewById(R.id.btnCallTermas);
        callCircuito=(ImageButton)findViewById(R.id.btnCallCircuito);
        callMusFerro=(ImageButton)findViewById(R.id.btnCallMusFerro);
        callMusHist=(ImageButton)findViewById(R.id.btnCallMusHist);
        callCasaMuseo=(ImageButton)findViewById(R.id.btnCallCasaMuseo);
    }

    public void llamarTermas (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445482375"));

        startActivity(intent);
    }

    public void llamarCircuito (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445535567"));

        startActivity(intent);
    }

    public void llamarMusFerro (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481109"));

        startActivity(intent);
    }

    public void llamarMusHist (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481306"));

        startActivity(intent);
    }

    public void llamarCasaMuseo (View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+543445481701"));

        startActivity(intent);
    }
}
