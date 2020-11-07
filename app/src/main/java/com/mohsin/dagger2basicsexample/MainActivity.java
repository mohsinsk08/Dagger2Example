package com.mohsin.dagger2basicsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mohsin.dagger2basicsexample.component.DaggerMobileComponent;
import com.mohsin.dagger2basicsexample.component.MobileComponent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Processor processor = new Processor();
        Battery battery = new Battery();
        Mobile mobile = new Mobile(battery,processor);*/

      MobileComponent mobileComponent = DaggerMobileComponent.create();
      mobileComponent.getMobile().run();

    }
}