package com.example.pc.cv_rosales;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Est_realizados extends AppCompatActivity {
    private TextView textER;
    private Typeface Inked;

    Button dt, gr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_est_realizados);
//cambio de tipo de fuente
        String fuenteer ="fuente/Inked.ttf";
        this.Inked = Typeface.createFromAsset(getAssets(),fuenteer);
        textER = (TextView) findViewById(R.id.tvEst);
        textER.setTypeface(Inked);

        dt = (Button)findViewById(R.id.bttvolve);
        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dt = new Intent(Est_realizados.this, Crear.class);
                startActivity(dt);
            }
        });
        gr = (Button)findViewById(R.id.bttguarda);
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gr = new Intent(Est_realizados.this, RefPerson.class);
                startActivity(gr);
            }
        });
    }
}
