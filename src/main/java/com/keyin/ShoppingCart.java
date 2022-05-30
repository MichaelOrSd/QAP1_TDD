/*
 * QAP1.
 * @author Michael O'Reilly
 * 
 */

package com.keyin;

import java.util.List;

public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(item -> item.getSubtotal()).sum();
    }

    public Object getItems() {
        return null;
    }

    public boolean addItem(Item item) {
        return false;
    }
    
}
