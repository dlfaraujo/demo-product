
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
 * Payment
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "payment_method_code",
    "card_number",
    "expiration_date",
    "cvv"
})
public class Payment {

    /**
     * The payment method id.
     * 
     */
    @JsonProperty("payment_method_code")
    @JsonPropertyDescription("The payment method id.")
    private Double paymentMethodCode;
    /**
     * The credit card number.
     * 
     */
    @JsonProperty("card_number")
    @JsonPropertyDescription("The credit card number.")
    private Double cardNumber;
    /**
     * The expiration of the credit card YY/MM.
     * 
     */
    @JsonProperty("expiration_date")
    @JsonPropertyDescription("The expiration of the credit card YY/MM.")
    private String expirationDate;
    /**
     * The cvv of the credit card.
     * 
     */
    @JsonProperty("cvv")
    @JsonPropertyDescription("The cvv of the credit card.")
    private Double cvv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The payment method id.
     * 
     */
    @JsonProperty("payment_method_code")
    public Double getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * The payment method id.
     * 
     */
    @JsonProperty("payment_method_code")
    public void setPaymentMethodCode(Double paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    /**
     * The credit card number.
     * 
     */
    @JsonProperty("card_number")
    public Double getCardNumber() {
        return cardNumber;
    }

    /**
     * The credit card number.
     * 
     */
    @JsonProperty("card_number")
    public void setCardNumber(Double cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * The expiration of the credit card YY/MM.
     * 
     */
    @JsonProperty("expiration_date")
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * The expiration of the credit card YY/MM.
     * 
     */
    @JsonProperty("expiration_date")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * The cvv of the credit card.
     * 
     */
    @JsonProperty("cvv")
    public Double getCvv() {
        return cvv;
    }

    /**
     * The cvv of the credit card.
     * 
     */
    @JsonProperty("cvv")
    public void setCvv(Double cvv) {
        this.cvv = cvv;
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
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentMethodCode");
        sb.append('=');
        sb.append(((this.paymentMethodCode == null)?"<null>":this.paymentMethodCode));
        sb.append(',');
        sb.append("cardNumber");
        sb.append('=');
        sb.append(((this.cardNumber == null)?"<null>":this.cardNumber));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("cvv");
        sb.append('=');
        sb.append(((this.cvv == null)?"<null>":this.cvv));
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
        result = ((result* 31)+((this.paymentMethodCode == null)? 0 :this.paymentMethodCode.hashCode()));
        result = ((result* 31)+((this.cvv == null)? 0 :this.cvv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cardNumber == null)? 0 :this.cardNumber.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment) == false) {
            return false;
        }
        Payment rhs = ((Payment) other);
        return ((((((this.paymentMethodCode == rhs.paymentMethodCode)||((this.paymentMethodCode!= null)&&this.paymentMethodCode.equals(rhs.paymentMethodCode)))&&((this.cvv == rhs.cvv)||((this.cvv!= null)&&this.cvv.equals(rhs.cvv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cardNumber == rhs.cardNumber)||((this.cardNumber!= null)&&this.cardNumber.equals(rhs.cardNumber))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
