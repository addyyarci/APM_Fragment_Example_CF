package com.example.naird.fragment_example.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naird.fragment_example.R;

/**
 * Created by naird on 28/08/2016.
 */

public class derecha extends Fragment {

    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        rootView = inflater.inflate(R.layout.derecha,container,false);

        return rootView;
    }
}
