package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceRowTest {

    @Test
    void getSoldQty() {
        InvoiceRow ir = new InvoiceRow( new Product("apple", 100, 0.4), 20);
        assertEquals(20, ir.getSoldQty());

    }

    @Test
    void getCost() {
        InvoiceRow ir = new InvoiceRow( new Product("apple", 100, 0.4), 20);
        assertEquals(8, ir.getCost());

    }
}