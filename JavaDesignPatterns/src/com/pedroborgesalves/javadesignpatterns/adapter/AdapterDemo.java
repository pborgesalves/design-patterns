package com.pedroborgesalves.javadesignpatterns.adapter;

/**
 * <h1>The Adapter Pattern</h1>
 * <p>The Adapter pattern should be used when</p>
 * <p>- There is an existing class, and its interface does not match the one you need.</p>
 * <p>- You want to create a reusable class that cooperates with unrelated or 
 * unforeseen classes, that is, classes that don’t necessarily have 
 * compatible interfaces.</p>
 * <p>- There are several existing subclasses to be use, but it’s impractical to 
 * adapt their interface by sub-classing every one. An object adapter can adapt 
 * the interface of its parent class.</p>
 * 
 */
public class AdapterDemo {

    public static void main(String[] args) {
        // Object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
