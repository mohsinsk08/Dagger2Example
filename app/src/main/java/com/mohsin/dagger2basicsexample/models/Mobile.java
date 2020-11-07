package com.mohsin.dagger2basicsexample.models;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    private Battery battery;
    private Processor processor;

    @Inject
    public Mobile(Battery battery,Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.i("Inject","Mobile - Constructor");
    }

    public void run(){
        Log.i("Inject","Mobile - Run method");
    }
}
