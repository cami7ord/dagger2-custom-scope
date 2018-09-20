package com.example.camilobaquero.customscopes.base;

import android.app.Application;
import android.content.Context;

import com.example.camilobaquero.customscopes.home.MainActivitySubcomponent;
import com.example.camilobaquero.customscopes.model.Water;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = MainActivitySubcomponent.class)
public class ApplicationModule {

    private final Application application;
    private final int waterQuantity;

    ApplicationModule(Application application, int waterQuantity) {
        this.application = application;
        this.waterQuantity = waterQuantity;
    }

    @Provides
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    public Water provideWater() {
        return new Water(waterQuantity);
    }
}
