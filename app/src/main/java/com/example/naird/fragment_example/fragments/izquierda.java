package com.example.naird.fragment_example.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.naird.fragment_example.EnviarMensaje;
import com.example.naird.fragment_example.R;

/**
 * Created by naird on 28/08/2016.
 */

public class izquierda extends Fragment {
    View rootView;
    EditText campo;
    Button boton;
    EnviarMensaje EM;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.izquierda,container,false);

        campo = (EditText) rootView.findViewById(R.id.campotxt);
        boton = (Button) rootView.findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                //hay reglas de comunicacion en los fragments, ellos no se pueden comunicar directamente

                String mensaje;
                mensaje = campo.getText().toString();

                EM.enviarDatos(mensaje);
            }
        });
        return rootView;
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            EM = (EnviarMensaje) activity;
        }catch(ClassCastException e){
            throw  new ClassCastException("Necesitas implementar");
        }
        //ciclos de vida del fragment
        //con esto nos obliga hacer la implementacion en el MainActivity
    }
}
