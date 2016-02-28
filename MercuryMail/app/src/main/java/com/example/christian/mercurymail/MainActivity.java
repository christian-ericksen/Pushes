package com.example.christian.mercurymail;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView) findViewById(R.id.title);
        Typeface font = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        txt.setTypeface(font);
    }
}
