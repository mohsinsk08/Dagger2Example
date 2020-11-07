package com.mohsin.dagger2basicsexample.models;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("Inject","Battery - Constructor");
    }
}
