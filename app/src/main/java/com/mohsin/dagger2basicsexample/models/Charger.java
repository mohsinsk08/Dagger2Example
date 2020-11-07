package com.mohsin.dagger2basicsexample.models;

import android.util.Log;

import javax.inject.Inject;

public class Charger {

    @Inject
    public Charger() {
    }

    void setCharger(Mobile mobile){
        Log.i("Inject", "Charger - Method Inject");
    }
}
