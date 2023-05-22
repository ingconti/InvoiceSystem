package org.example;

import java.util.Date;

public class Invoice {
    private Date date;
    private Company sender;
    private Company buyer;

    private InvoiceRow[] invoiceRows;


    public Invoice(Date date, Company sender, Company buyer, InvoiceRow[] invoiceRows) {
        this.date = date;
        this.sender = sender;
        this.buyer = buyer;
        this.invoiceRows = invoiceRows;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        double tot = 0;
        for (InvoiceRow ir: this.invoiceRows) {
            tot+=ir.getCost();
        }
        return tot;
    }
    public Company getSender() {
        return sender;
    }

    public void setSender(Company sender) {
        this.sender = sender;
    }

    public Company getBuyer() {
        return buyer;
    }

    public void setBuyer(Company buyer) {
        this.buyer = buyer;
    }

    public InvoiceRow[] getInvoiceRows() {
        return invoiceRows;
    }

    public void setInvoiceRows(InvoiceRow[] invoiceRows) {
        this.invoiceRows = invoiceRows;
    }
}
