package io.confluent.demo.events_generator.jsonschema;

import io.confluent.demo.pojo.jsonschema.Customer;
import io.confluent.demo.pojo.jsonschema.Order;
import io.confluent.demo.pojo.jsonschema.Payment;
import io.confluent.demo.pojo.jsonschema.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderGenerator {

    public static Order getNext(Random r) {

        // order
        Order order = new Order();
        order.setOrderId((double) r.nextLong());
        order.setOrderDate("030120");
        order.setOrderAmount(r.nextDouble());

        // products
        List<Product> listProducts = new ArrayList<Product>();
        int n = 0;

        while (n < 10) {
            Product product = new Product();
            long productId = r.nextLong();
            product.setProductId((double) productId);
            product.setProductName("product-" + productId);
            product.setProductPrice(r.nextDouble());
            listProducts.add(product);
            n++;
        }

        // payment method
        Payment paymentMethod = new Payment();
        paymentMethod.setPaymentMethodCode((double) 1);
        paymentMethod.setCardNumber((double) r.nextLong());
        paymentMethod.setCvv((double) r.nextInt());

        // customer
        Customer customer = new Customer();
        long customerId = r.nextLong();
        customer.setCustomerId((double) customerId);
        customer.setCustomerName("David Araujo " + customerId);
        customer.setCustomerAddress("Palo Alto " + customerId);
        customer.setCustomerEmail("araujo" + customerId + "@confluent.io");

        // add nested object to the Order
        order.setProducts(listProducts);
        order.setPaymentMethod(paymentMethod);
        order.setCustomer(customer);

        return order;
    }
}