package com.example.comp1.mensajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mostrar_mensaje(View view){

        Toast toast1 = Toast.makeText(getApplicationContext(), "Este es un mensaje", Toast.LENGTH_SHORT);
        toast1.show();

    }
}
