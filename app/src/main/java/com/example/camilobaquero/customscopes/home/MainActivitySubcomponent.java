package com.example.camilobaquero.customscopes.home;

import com.example.camilobaquero.customscopes.di.MainActivityScope;

import dagger.BindsInstance;
import dagger.Subcomponent;

@MainActivityScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent {

    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder mainActivityModule(MainActivityModule mainActivityModule);
        MainActivitySubcomponent build();
    }

}
