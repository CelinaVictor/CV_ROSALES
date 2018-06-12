package com.example.pc.cv_rosales;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RefPerson extends AppCompatActivity {
//se creo para el xml para guardar los datos de la referencia personales
    private TextView textRp;
    private Typeface Inked;

    Button dt, gr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ref_person);

        String fuenteRefp ="fuente/Inked.ttf";
        this.Inked = Typeface.createFromAsset(getAssets(),fuenteRefp);
        textRp = (TextView) findViewById(R.id.tvREFP);
        textRp.setTypeface(Inked);

        dt = (Button)findViewById(R.id.bttvolv);
        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dt = new Intent(RefPerson.this, Crear.class);
                startActivity(dt);
            }
        });
        gr = (Button)findViewById(R.id.bttguard);
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gr = new Intent(RefPerson.this, RefLab.class);
                startActivity(gr);
            }
        });
    }
}
