package com.example.androidclase3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydos);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
      /* String nombre= intent.getStringExtra(MainActivity.EXTRA);
       if(nombre != null){

        textView.setText("hola "+nombre);
       }*/

      Bundle bundle = intent.getExtras();
      String nombre = bundle.getString("MainActivity.EXTRA_NOMBRE",""); //llave , vlor por default
        textView.setText("hola "+nombre);

    }
}
