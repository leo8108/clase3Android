package com.example.androidclase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

///INTENTOS EXPLICITOS
public class MainActivity extends AppCompatActivity {
    static String EXTRA = "MainActivity.EXTRA_NOMBRE";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
                intent.putExtra(EXTRA, "Leonardo");
                startActivity(intent);

            }
        });
    }
}