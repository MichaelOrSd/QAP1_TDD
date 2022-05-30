/*
 * QAP1.
 * @author Michael O'Reilly
 * 
 */

package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public void ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public ShoppingCart() {
    }

    public double getTotal() {
        return items.stream().mapToDouble(item -> item.getSubtotal()).sum();
    }

    public Object getItems() {
        if (items == null) {
            return "Empty";
        } else {
            return "Not Empty";
        }
    }

    public boolean addItem(Item item) {
        if (item == null) {
            return false;
        } else {
            items.add(item);
            return true;
        }
    }
}
