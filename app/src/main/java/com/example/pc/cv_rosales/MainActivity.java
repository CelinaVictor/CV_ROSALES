package com.example.pc.cv_rosales;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto1;
    private Typeface fresty;

    Button sgteCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fuente1 ="fuente/fresty.ttf";
        this.fresty = Typeface.createFromAsset(getAssets(),fuente1);
        texto1 = (TextView) findViewById(R.id.tvbinv);
        texto1.setTypeface(fresty);

        sgteCV = (Button)findViewById(R.id.buttonCrear);
        sgteCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sgteCV = new Intent(MainActivity.this, Crear.class);
                startActivity(sgteCV);
            }
        });


    }
}
