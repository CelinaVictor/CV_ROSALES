package com.example.pc.cv_rosales;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RefLab extends AppCompatActivity {
//letra 
    private TextView textRl;
    private Typeface Inked;
//botones
    Button dtl, grl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ref_lab);
//fuente del textview
        String fuenteRefl ="fuente/Inked.ttf";
        this.Inked = Typeface.createFromAsset(getAssets(),fuenteRefl);
        textRl = (TextView) findViewById(R.id.tvREFLab);
        textRl.setTypeface(Inked);

        dtl = (Button)findViewById(R.id.bttvol);
        dtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dtl = new Intent(RefLab.this, Crear.class);
                startActivity(dtl);
            }
        });
        grl = (Button)findViewById(R.id.bttguar);
        grl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grl = new Intent(RefLab.this, Crear.class);
                Toast.makeText(RefLab.this, "TERMINO DE LLENAR DATOS",Toast.LENGTH_SHORT).show();
                startActivity(grl);
            }
        });
    }
}
