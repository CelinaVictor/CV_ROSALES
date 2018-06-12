package com.example.pc.cv_rosales;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Crear extends AppCompatActivity {
//se utilizaron en el xml layout para formar un menu  que me sirva como guia los formularios que hay que llenar
    private TextView textcv;
    private Typeface Inked, Pacific;

    ImageButton dps, er,rp,rl;
    private TextView textdp, texter, textrp, textrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        String fuentecv ="fuente/Inked.ttf";
        this.Inked = Typeface.createFromAsset(getAssets(),fuentecv);
        textcv = (TextView) findViewById(R.id.tvcurriculum);
        textcv.setTypeface(Inked);

        //i DP
        String fuentedp ="fuente/Pacific.ttf";
        this.Pacific  = Typeface.createFromAsset(getAssets(),fuentedp);
        textdp = (TextView) findViewById(R.id.tvDP);
        textdp.setTypeface(Pacific);
        //imagen Datos personales
        dps = (ImageButton)findViewById(R.id.ImgDP);
        dps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dps = new Intent(Crear.this, DatosPerson.class);
                startActivity(dps);
            }
        });

        //iER
        String fuenteer ="fuente/Pacific.ttf";
        this.Pacific  = Typeface.createFromAsset(getAssets(),fuenteer);
        texter = (TextView) findViewById(R.id.tvER);
        texter.setTypeface(Pacific);

        //imagen Estudios Realizados
        er = (ImageButton)findViewById(R.id.ImgER);
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent er = new Intent(Crear.this, Est_realizados.class);
                startActivity(er);

            }
        });

        //RefPerson
        String fuenterp ="fuente/Pacific.ttf";
        this.Pacific  = Typeface.createFromAsset(getAssets(),fuenterp);
        textrp = (TextView) findViewById(R.id.tvRP);
        textrp.setTypeface(Pacific);

        //imagen Estudios Realizados
        rp = (ImageButton)findViewById(R.id.ImagRP);
        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rp = new Intent(Crear.this, RefPerson.class);
                startActivity(rp);
            }
        });

        //RefLab
        String fuenterl ="fuente/Pacific.ttf";
        this.Pacific  = Typeface.createFromAsset(getAssets(),fuenterl);
        textrl = (TextView) findViewById(R.id.tvRL);
        textrl.setTypeface(Pacific);

        //imagen Estudios Realizados
        rl = (ImageButton)findViewById(R.id.ImagRL);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rl = new Intent(Crear.this, RefLab.class);
                startActivity(rl);
            }
        });
    }
}
