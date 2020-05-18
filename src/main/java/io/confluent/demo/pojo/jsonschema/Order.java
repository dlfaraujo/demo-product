
package io.confluent.demo.pojo.jsonschema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Order
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order_id",
    "order_date",
    "order_amount",
    "products",
    "customer",
    "payment_method"
})
public class Order {

    /**
     * The id of the order
     * 
     */
    @JsonProperty("order_id")
    @JsonPropertyDescription("The id of the order")
    private Double orderId;
    /**
     * The order date.
     * 
     */
    @JsonProperty("order_date")
    @JsonPropertyDescription("The order date.")
    private String orderDate;
    /**
     * The total amount of the order.
     * 
     */
    @JsonProperty("order_amount")
    @JsonPropertyDescription("The total amount of the order.")
    private Double orderAmount;
    /**
     * The product details of the order.
     * 
     */
    @JsonProperty("products")
    @JsonPropertyDescription("The product details of the order.")
    private List<Product> products = new ArrayList<Product>();
    /**
     * Product
     * <p>
     * 
     * 
     */
    @JsonProperty("customer")
    private Customer customer;
    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment_method")
    private Payment paymentMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The id of the order
     * 
     */
    @JsonProperty("order_id")
    public Double getOrderId() {
        return orderId;
    }

    /**
     * The id of the order
     * 
     */
    @JsonProperty("order_id")
    public void setOrderId(Double orderId) {
        this.orderId = orderId;
    }

    /**
     * The order date.
     * 
     */
    @JsonProperty("order_date")
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * The order date.
     * 
     */
    @JsonProperty("order_date")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * The total amount of the order.
     * 
     */
    @JsonProperty("order_amount")
    public Double getOrderAmount() {
        return orderAmount;
    }

    /**
     * The total amount of the order.
     * 
     */
    @JsonProperty("order_amount")
    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * The product details of the order.
     * 
     */
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    /**
     * The product details of the order.
     * 
     */
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Product
     * <p>
     * 
     * 
     */
    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Product
     * <p>
     * 
     * 
     */
    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment_method")
    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Payment
     * <p>
     * 
     * 
     */
    @JsonProperty("payment_method")
    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("orderId");
        sb.append('=');
        sb.append(((this.orderId == null)?"<null>":this.orderId));
        sb.append(',');
        sb.append("orderDate");
        sb.append('=');
        sb.append(((this.orderDate == null)?"<null>":this.orderDate));
        sb.append(',');
        sb.append("orderAmount");
        sb.append('=');
        sb.append(((this.orderAmount == null)?"<null>":this.orderAmount));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("customer");
        sb.append('=');
        sb.append(((this.customer == null)?"<null>":this.customer));
        sb.append(',');
        sb.append("paymentMethod");
        sb.append('=');
        sb.append(((this.paymentMethod == null)?"<null>":this.paymentMethod));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.orderAmount == null)? 0 :this.orderAmount.hashCode()));
        result = ((result* 31)+((this.orderId == null)? 0 :this.orderId.hashCode()));
        result = ((result* 31)+((this.paymentMethod == null)? 0 :this.paymentMethod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.orderDate == null)? 0 :this.orderDate.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.customer == null)? 0 :this.customer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return ((((((((this.orderAmount == rhs.orderAmount)||((this.orderAmount!= null)&&this.orderAmount.equals(rhs.orderAmount)))&&((this.orderId == rhs.orderId)||((this.orderId!= null)&&this.orderId.equals(rhs.orderId))))&&((this.paymentMethod == rhs.paymentMethod)||((this.paymentMethod!= null)&&this.paymentMethod.equals(rhs.paymentMethod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.orderDate == rhs.orderDate)||((this.orderDate!= null)&&this.orderDate.equals(rhs.orderDate))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.customer == rhs.customer)||((this.customer!= null)&&this.customer.equals(rhs.customer))));
    }

}
