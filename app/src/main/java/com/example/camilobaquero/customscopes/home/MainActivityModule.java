package com.example.camilobaquero.customscopes.home;

import com.example.camilobaquero.customscopes.di.ActivityAScope;
import com.example.camilobaquero.customscopes.model.CoffeeBrewer;
import com.example.camilobaquero.customscopes.model.Water;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    @ActivityAScope
    CoffeeBrewer provideCoffeeBrewer(Water water) {
        return new CoffeeBrewer(water);
    }

}
