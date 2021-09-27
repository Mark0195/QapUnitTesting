package Qap;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {

    @Test
    public void TestGetTotal() {
        Invoice invoiceUnderTest = new Invoice("1", "N64", 14, 50.00);
        Assert.assertTrue(invoiceUnderTest.getTotal() == 50.00 * 14);
    }

}
