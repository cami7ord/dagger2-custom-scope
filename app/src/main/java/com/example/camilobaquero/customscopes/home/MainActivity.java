package com.example.camilobaquero.customscopes.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.camilobaquero.customscopes.R;
import com.example.camilobaquero.customscopes.base.ApplicationComponent;
import com.example.camilobaquero.customscopes.base.DaggerApplicationComponent;
import com.example.camilobaquero.customscopes.base.MyApplication;
import com.example.camilobaquero.customscopes.model.CoffeeBrewer;
import com.example.camilobaquero.customscopes.model.Water;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    private MainActivitySubcomponent component;

    @Inject Water waterA;
    @Inject Water waterB;
    @Inject Water waterC;
    @Inject Water waterD;
    @Inject CoffeeBrewer coffeeBrewerA;
    @Inject CoffeeBrewer coffeeBrewerB;
    @Inject CoffeeBrewer coffeeBrewerC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = ((MyApplication) getApplication()).getApplicationComponent().mainComponentBuilder().mainActivityModule(new MainActivityModule()).build();
        component.inject(this);

        Log.e("WaterA", "" + waterA);
        Log.e("WaterB", "" + waterB);
        Log.e("WaterC", "" + waterC);
        Log.e("WaterD", "" + waterD);
        Log.e("CoffeeBrewerA", "" + coffeeBrewerA);
        Log.e("CoffeeBrewerA", "" + coffeeBrewerB);
        Log.e("CoffeeBrewerA", "" + coffeeBrewerC);
    }
}
