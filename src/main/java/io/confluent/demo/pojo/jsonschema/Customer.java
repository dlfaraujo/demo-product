
package io.confluent.demo.pojo.jsonschema;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Product
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customer_id",
    "customer_name",
    "customer_email",
    "customer_address"
})
public class Customer {

    /**
     * The id of the customer.
     * 
     */
    @JsonProperty("customer_id")
    @JsonPropertyDescription("The id of the customer.")
    private Double customerId;
    /**
     * The name of the customer.
     * 
     */
    @JsonProperty("customer_name")
    @JsonPropertyDescription("The name of the customer.")
    private String customerName;
    /**
     * The email of the customer.
     * 
     */
    @JsonProperty("customer_email")
    @JsonPropertyDescription("The email of the customer.")
    private String customerEmail;
    /**
     * The address of the customer.
     * 
     */
    @JsonProperty("customer_address")
    @JsonPropertyDescription("The address of the customer.")
    private String customerAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The id of the customer.
     * 
     */
    @JsonProperty("customer_id")
    public Double getCustomerId() {
        return customerId;
    }

    /**
     * The id of the customer.
     * 
     */
    @JsonProperty("customer_id")
    public void setCustomerId(Double customerId) {
        this.customerId = customerId;
    }

    /**
     * The name of the customer.
     * 
     */
    @JsonProperty("customer_name")
    public String getCustomerName() {
        return customerName;
    }

    /**
     * The name of the customer.
     * 
     */
    @JsonProperty("customer_name")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * The email of the customer.
     * 
     */
    @JsonProperty("customer_email")
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * The email of the customer.
     * 
     */
    @JsonProperty("customer_email")
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * The address of the customer.
     * 
     */
    @JsonProperty("customer_address")
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * The address of the customer.
     * 
     */
    @JsonProperty("customer_address")
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
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
        sb.append(Customer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("customerName");
        sb.append('=');
        sb.append(((this.customerName == null)?"<null>":this.customerName));
        sb.append(',');
        sb.append("customerEmail");
        sb.append('=');
        sb.append(((this.customerEmail == null)?"<null>":this.customerEmail));
        sb.append(',');
        sb.append("customerAddress");
        sb.append('=');
        sb.append(((this.customerAddress == null)?"<null>":this.customerAddress));
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
        result = ((result* 31)+((this.customerId == null)? 0 :this.customerId.hashCode()));
        result = ((result* 31)+((this.customerAddress == null)? 0 :this.customerAddress.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customerName == null)? 0 :this.customerName.hashCode()));
        result = ((result* 31)+((this.customerEmail == null)? 0 :this.customerEmail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customer) == false) {
            return false;
        }
        Customer rhs = ((Customer) other);
        return ((((((this.customerId == rhs.customerId)||((this.customerId!= null)&&this.customerId.equals(rhs.customerId)))&&((this.customerAddress == rhs.customerAddress)||((this.customerAddress!= null)&&this.customerAddress.equals(rhs.customerAddress))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customerName == rhs.customerName)||((this.customerName!= null)&&this.customerName.equals(rhs.customerName))))&&((this.customerEmail == rhs.customerEmail)||((this.customerEmail!= null)&&this.customerEmail.equals(rhs.customerEmail))));
    }

}
