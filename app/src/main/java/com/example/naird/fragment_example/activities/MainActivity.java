package com.example.naird.fragment_example.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.naird.fragment_example.fragments.derecha;
import com.example.naird.fragment_example.EnviarMensaje;
import com.example.naird.fragment_example.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        derecha Derecha = (derecha) getFragmentManager().findFragmentById(R.id.derecha);
        Derecha.ObtenerDatos(mensaje);
    }
}
