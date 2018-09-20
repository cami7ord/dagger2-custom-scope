package com.example.camilobaquero.customscopes.model;

public class Coffee {

    private final CoffeeBrewer coffeeBrewer;
    private final Flavor flavor;

    public enum Flavor {
        Latte, Americano, Espresso
    }

    public Coffee(CoffeeBrewer coffeeBrewer, Flavor flavor) {
        this.coffeeBrewer = coffeeBrewer;
        this.flavor = flavor;
    }

    public String getFlavor() {
        switch (flavor) {
            case Latte:
                return "Latte";
            case Americano:
                return "Americano";
            default:
                return "Espresso";
        }
    }

}
