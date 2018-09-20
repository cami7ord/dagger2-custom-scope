package com.example.camilobaquero.customscopes.home;

import com.example.camilobaquero.customscopes.di.ActivityAScope;

import dagger.Subcomponent;

@ActivityAScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent {

    MainActivity inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        MainActivitySubcomponent.Builder mainActivityModule(MainActivityModule mainActivityModule);
        MainActivitySubcomponent build();
    }

}
