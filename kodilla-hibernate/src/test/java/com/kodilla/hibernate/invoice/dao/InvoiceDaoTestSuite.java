package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product book = new Product("book");
        Product newspaper = new Product("newspaper");
        Product pencil = new Product("pencil");
        Item item1 = new Item(book,new BigDecimal(34.99),1);
        Item item2 = new Item(newspaper , new BigDecimal(5.99), 2);
        Item item3 = new Item(pencil, new BigDecimal(1.99),5);

        Invoice invoice = new Invoice("001/08/2019");

        book.getItems().add(item1);
        item1.setProduct(book);
        invoice.getItems().add(item1);

        newspaper.getItems().add(item2);
        item2.setProduct(newspaper);
        invoice.getItems().add(item2);

        pencil.getItems().add(item3);
        item3.setProduct(pencil);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.deleteById(id);
        }catch (Exception e) {
            //do nothing
        }
    }
}
