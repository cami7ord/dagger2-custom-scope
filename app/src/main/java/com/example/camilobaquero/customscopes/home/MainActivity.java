package com.example.camilobaquero.customscopes.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.camilobaquero.customscopes.R;
import com.example.camilobaquero.customscopes.base.ApplicationComponent;
import com.example.camilobaquero.customscopes.base.MyApplication;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).getApplicationComponent();
    }
}
