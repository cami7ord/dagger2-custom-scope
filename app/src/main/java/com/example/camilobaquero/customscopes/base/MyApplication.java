package com.example.camilobaquero.customscopes.base;

import android.app.Application;

public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this, 20))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return component;
    }
}
