package com.mohsin.dagger2basicsexample.models;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    @Inject
    public Processor() {
        Log.i("Inject","Processor - Constructor");
    }
}
