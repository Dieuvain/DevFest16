package com.example.dieuvainmusaghi.devfest16;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by Michelo on 22/10/2016.
 */

public class DevFest16Application extends Application {

    public static SharedPreferences prefs;


    @Override
    public void onCreate() {
        super.onCreate();
        prefs = getSharedPreferences("com.example.dieuvainmusaghi.devfest16",MODE_PRIVATE);

    }

}
