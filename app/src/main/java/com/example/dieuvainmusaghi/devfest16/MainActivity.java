package com.example.dieuvainmusaghi.devfest16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView mapicon, fuelicon, usericon, helpicon, settingsicon;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        mapicon=(ImageView)findViewById(R.id.mapicon);
        fuelicon=(ImageView)findViewById(R.id.fuelicon);
        usericon=(ImageView)findViewById(R.id.usericon);
        helpicon=(ImageView)findViewById(R.id.helpicon);
        settingsicon=(ImageView)findViewById(R.id.settingsicon);


        //Click Listener sur chaque imageview
        // 1. Bouton location
        mapicon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //v.getId() will give you the image id
            }
        });

        // 2. Bouton Fuel
        fuelicon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //v.getId() will give you the image id
            }
        });

        // 3. Bouton User
        usericon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //v.getId() will give you the image id
            }
        });

        // 4. Bouton Help
        helpicon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //v.getId() will give you the image id
            }
        });

        // 5. Bouton Setting
        settingsicon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //v.getId() will give you the image id
            }
        });

    }
}
