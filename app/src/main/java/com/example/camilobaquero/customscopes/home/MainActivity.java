package com.example.camilobaquero.customscopes.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.camilobaquero.customscopes.R;
import com.example.camilobaquero.customscopes.base.MyApplication;
import com.example.camilobaquero.customscopes.detail.DetailActivity;
import com.example.camilobaquero.customscopes.model.CoffeeBrewer;
import com.example.camilobaquero.customscopes.model.Water;

import javax.inject.Inject;

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

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        Log.e("WaterA", "" + waterA);
        Log.e("WaterB", "" + waterB);
        Log.e("WaterC", "" + waterC);
        Log.e("WaterD", "" + waterD);
        Log.e("CoffeeBrewerA", "" + coffeeBrewerA);
        Log.e("CoffeeBrewerA", "" + coffeeBrewerB);
        Log.e("CoffeeBrewerA", "" + coffeeBrewerC);
    }

}
