package com.example.camilobaquero.customscopes.model;

public class Coffee {

    public enum Flavor {
        Latte, Americano, Espresso
    }

    public Flavor flavor = Flavor.Espresso;

    public Coffee(Flavor flavor) {
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
