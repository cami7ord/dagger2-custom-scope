package com.example.camilobaquero.customscopes.model;

public class CoffeeBrewer {
    private Water water;
    private Coffee coffee;
    //private WaterHeater waterHeater;

    public CoffeeBrewer(Water water) {
        this.water = water;
        //waterHeater = new WaterHeater(this.water);
    }

    /*
    public void brewCoffee() {
        waterHeater.on();
        waterHeater.off();
        Timber.d("Brewing %s coffee with %s flavor", water.isWaterHot() ? "Hot" : "Cold",
                coffee.getFlavor());
        Timber.d("----------- Coffee is ready to be served ---------------------");
    }*/
}
