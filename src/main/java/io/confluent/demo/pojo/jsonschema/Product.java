
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
    "product_id",
    "product_name",
    "product_price"
})
public class Product {

    /**
     * The id of the product.
     * 
     */
    @JsonProperty("product_id")
    @JsonPropertyDescription("The id of the product.")
    private Double productId;
    /**
     * The name of the product.
     * 
     */
    @JsonProperty("product_name")
    @JsonPropertyDescription("The name of the product.")
    private String productName;
    /**
     * The price of the product.
     * 
     */
    @JsonProperty("product_price")
    @JsonPropertyDescription("The price of the product.")
    private Double productPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The id of the product.
     * 
     */
    @JsonProperty("product_id")
    public Double getProductId() {
        return productId;
    }

    /**
     * The id of the product.
     * 
     */
    @JsonProperty("product_id")
    public void setProductId(Double productId) {
        this.productId = productId;
    }

    /**
     * The name of the product.
     * 
     */
    @JsonProperty("product_name")
    public String getProductName() {
        return productName;
    }

    /**
     * The name of the product.
     * 
     */
    @JsonProperty("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * The price of the product.
     * 
     */
    @JsonProperty("product_price")
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * The price of the product.
     * 
     */
    @JsonProperty("product_price")
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
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
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productId");
        sb.append('=');
        sb.append(((this.productId == null)?"<null>":this.productId));
        sb.append(',');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("productPrice");
        sb.append('=');
        sb.append(((this.productPrice == null)?"<null>":this.productPrice));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.productPrice == null)? 0 :this.productPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.productPrice == rhs.productPrice)||((this.productPrice!= null)&&this.productPrice.equals(rhs.productPrice))));
    }

}
