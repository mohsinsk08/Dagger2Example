package com.mohsin.dagger2basicsexample.component;

import com.mohsin.dagger2basicsexample.MainActivity;
import com.mohsin.dagger2basicsexample.models.Mobile;

import dagger.Component;


@Component
public interface MobileComponent {

    Mobile getMobile();

    void inject(MainActivity activity);
}
