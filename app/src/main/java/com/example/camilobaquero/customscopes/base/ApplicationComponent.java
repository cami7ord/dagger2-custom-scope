package com.example.camilobaquero.customscopes.base;

import com.example.camilobaquero.customscopes.home.MainActivitySubcomponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication myApplication);

    MainActivitySubcomponent.Builder mainComponentBuilder();

}
