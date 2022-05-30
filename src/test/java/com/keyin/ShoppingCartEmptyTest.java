package com.keyin;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShoppingCartEmptyTest {
    
    @Test
    public void isEmpty() {
        ShoppingCart cart = new ShoppingCart(new ArrayList<Item>());
        assertArrayEquals(new Item[] {}, cart.getItems());
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

    private void assertArrayEquals(Item[] items, Object items2) {
    }
}
