package com.keyin;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShoppingCartEmptyTest {
    
    private void assertArrayEquals(Item[] items, Object items2) {
    }

    @Test
    public void isEmpty() {
        ShoppingCart cart = new ShoppingCart(new ArrayList<Item>());
        assertArrayEquals(new Item[] {}, cart.getItems());
        System.out.println(cart.getItems());
        System.out.println(cart.getTotal());
        System.out.println(cart.addItem(new Item(1.0, 1)));
    }

    @Test
    public void isNotEmpty() {
        ShoppingCart cart = new ShoppingCart(Arrays.asList(new Item(100.0, 1)));
        assertArrayEquals(new Item[] {new Item(100.0, 1)}, cart.getItems());
    }

    @Test
    public void isNotEmptyWithQuantityTwo() {
        ShoppingCart cart = new ShoppingCart(Arrays.asList(new Item(100.0, 2)));
        assertArrayEquals(new Item[] {new Item(100.0, 2)}, cart.getItems());
    }

}
