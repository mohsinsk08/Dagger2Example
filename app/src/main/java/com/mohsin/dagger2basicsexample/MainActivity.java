package com.mohsin.dagger2basicsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mohsin.dagger2basicsexample.component.DaggerMobileComponent;
import com.mohsin.dagger2basicsexample.component.MobileComponent;
import com.mohsin.dagger2basicsexample.models.Mobile;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      MobileComponent mobileComponent = DaggerMobileComponent.create();
//      mobileComponent.getMobile().run();
        mobileComponent.inject(this);
        mobile.run();

    }
}