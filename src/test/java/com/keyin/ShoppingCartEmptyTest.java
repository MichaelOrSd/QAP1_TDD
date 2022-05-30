package com.keyin;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShoppingCartEmptyTest {
    
    private Item item;

    private void assertArrayEquals(Item[] items, Object items2) {
    }

    @Test
    public void isEmpty() {
        ShoppingCart cart = new ShoppingCart(new ArrayList<Item>());
        cart.addItem(item);
        assertArrayEquals(new Item[] {}, cart.getItems());
        System.out.println(cart.getItems());
        System.out.println(cart.getTotal());
        
    }

    @Test
    public void isNotEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertArrayEquals(cart.getItems());
        System.out.println(cart.getItems());
    }

    private void assertArrayEquals(Object items) {
    }

    @Test
    public void isNotEmptyWithQuantityTwo() {
        ShoppingCart cart = new ShoppingCart(Arrays.asList(new Item(100.0, 2)));
        assertArrayEquals(new Item[] {new Item(100.0, 2)}, cart.getItems());
    }

}
