package com.keyin;

public class Item {

    private final double unitPrice;
    private int quantity;

    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    double getSubtotal() {
        return unitPrice * (double) quantity;
    }
}
