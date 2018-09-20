package com.example.camilobaquero.customscopes.model;

public class Water {
    public int quantity;
    private boolean isHeated = false;

    public Water(int quantity) {
        this.quantity = quantity;
    }

    public void heat() {
        this.isHeated = true;
    }

    public boolean isWaterHot() {
        return isHeated;
    }
}