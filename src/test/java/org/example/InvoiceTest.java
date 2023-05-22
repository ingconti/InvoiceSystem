package org.example;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @org.junit.jupiter.api.Test
    void getInvoiceRows() {

        Product p2 = new Product("orange", 200, 0.5);

        InvoiceRow[] rows = {
                new InvoiceRow( new Product("apple", 100, 0.4), 20),
                new InvoiceRow( p2, 10),
        };

        Invoice i = new Invoice( new Date(),
                new Company("Jetbrains", "Kavčí Hory Office Park, Na Hřebenech II 1718/8"),
                new Company("Microsoft", "555 California, Suite 200"),
                rows
                );

        double invoiceTotal = i.getTotal();
        assertEquals(13, invoiceTotal);

    }

    @org.junit.jupiter.api.Test
    void setInvoiceRows() {
    }
}