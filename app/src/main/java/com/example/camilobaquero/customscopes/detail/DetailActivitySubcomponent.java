package com.example.camilobaquero.customscopes.detail;

import com.example.camilobaquero.customscopes.di.DetailActivityScope;

import dagger.BindsInstance;
import dagger.Subcomponent;

@DetailActivityScope
@Subcomponent(modules = DetailActivityModule.class)
public interface DetailActivitySubcomponent {

    void inject(DetailActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder detailActivityModule(DetailActivityModule detailActivityModule);
        DetailActivitySubcomponent build();
    }

}
