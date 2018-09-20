package com.example.camilobaquero.customscopes.home;

import com.example.camilobaquero.customscopes.di.MainActivityScope;
import com.example.camilobaquero.customscopes.model.CoffeeBrewer;
import com.example.camilobaquero.customscopes.model.Water;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    @MainActivityScope
    CoffeeBrewer provideCoffeeBrewer(Water water) {
        return new CoffeeBrewer(water);
    }

}
