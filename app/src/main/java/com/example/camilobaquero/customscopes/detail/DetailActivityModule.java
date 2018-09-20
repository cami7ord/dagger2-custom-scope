package com.example.camilobaquero.customscopes.detail;

import com.example.camilobaquero.customscopes.di.DetailActivityScope;
import com.example.camilobaquero.customscopes.model.Coffee;
import com.example.camilobaquero.customscopes.model.CoffeeBrewer;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailActivityModule {
    @Provides
    @DetailActivityScope
    Coffee provideCoffee(CoffeeBrewer coffeeBrewer) {
        return new Coffee(coffeeBrewer, Coffee.Flavor.Espresso);
    }
}
