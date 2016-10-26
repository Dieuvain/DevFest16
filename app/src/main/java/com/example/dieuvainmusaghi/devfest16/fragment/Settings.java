package com.example.dieuvainmusaghi.devfest16.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dieuvainmusaghi.devfest16.R;

/**
 * 
 * Created by DieuvainMusaghi on 10/22/16.
 */

public class Settings extends Fragment {

    public Settings(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location, container, false);

        return rootView;
    }


}
