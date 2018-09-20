package com.example.camilobaquero.customscopes.home;

import com.example.camilobaquero.customscopes.di.ActivityAScope;

import dagger.Subcomponent;

@ActivityAScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent {

    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder mainActivityModule(MainActivityModule mainActivityModule);
        MainActivitySubcomponent build();
    }

}
