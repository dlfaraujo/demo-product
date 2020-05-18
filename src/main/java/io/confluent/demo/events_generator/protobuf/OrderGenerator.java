package io.confluent.demo.events_generator.protobuf;


import io.confluent.demo.pojo.protobuf.CustomerImpl;
import io.confluent.demo.pojo.protobuf.OrderImpl;
import io.confluent.demo.pojo.protobuf.PaymentImpl;
import io.confluent.demo.pojo.protobuf.ProductImpl;

import java.util.Date;
import java.util.Random;

public class OrderGenerator {

    public static OrderImpl.Order getNext(Random r) {

        // order
        OrderImpl.Order.Builder order = OrderImpl.Order.newBuilder();

        order.setOrderId(r.nextInt());
        order.setOrderDate(new Date().toString());
        order.setOrderAmount(r.nextInt());

        // products
        int n = 0;

        while (n < 10) {
            ProductImpl.Product.Builder product = ProductImpl.Product.newBuilder();
            long productId = r.nextLong();
            product.setProductId(productId);
            product.setProductName("product-" + productId);
            product.setProductPrice(r.nextFloat());
            order.addProducts(product);
            n++;
        }

        // payment method
        PaymentImpl.Payment.Builder paymentMethod = PaymentImpl.Payment.newBuilder();
        paymentMethod.setPaymentMethodCode(1);
        paymentMethod.setCardNumber(r.nextLong());
        paymentMethod.setCvv(r.nextInt());

        // customer
        CustomerImpl.Customer.Builder customer = CustomerImpl.Customer.newBuilder();
        long customerId = r.nextLong();
        customer.setCustomerId(customerId);
        customer.setCustomerName("David Araujo " + customerId);
        customer.setCustomerAddress("Palo Alto " + customerId);
        customer.setCustomerEmail("araujo" + customerId + "@confluent.io");

        // add nested object to the Order
        order.setPaymentMethod(paymentMethod);
        order.setCustomer(customer);

        return order.build();
    }
}