
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
 * MySchema
 * <p>
 * Sample schema to help you get started, refer to https://json-schema.org/learn/getting-started-step-by-step.html to learn more about JSON Schemas.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "myField1",
    "myField2",
    "myField3"
})
public class UiTemplateJson {

    /**
     * The integer type is used for integral numbers.
     * 
     */
    @JsonProperty("myField1")
    @JsonPropertyDescription("The integer type is used for integral numbers.")
    private Integer myField1;
    /**
     * The number type is used for any numeric type, either integers or floating point numbers.
     * 
     */
    @JsonProperty("myField2")
    @JsonPropertyDescription("The number type is used for any numeric type, either integers or floating point numbers.")
    private Double myField2;
    /**
     * The string type is used for strings of text.
     * 
     */
    @JsonProperty("myField3")
    @JsonPropertyDescription("The string type is used for strings of text.")
    private String myField3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The integer type is used for integral numbers.
     * 
     */
    @JsonProperty("myField1")
    public Integer getMyField1() {
        return myField1;
    }

    /**
     * The integer type is used for integral numbers.
     * 
     */
    @JsonProperty("myField1")
    public void setMyField1(Integer myField1) {
        this.myField1 = myField1;
    }

    /**
     * The number type is used for any numeric type, either integers or floating point numbers.
     * 
     */
    @JsonProperty("myField2")
    public Double getMyField2() {
        return myField2;
    }

    /**
     * The number type is used for any numeric type, either integers or floating point numbers.
     * 
     */
    @JsonProperty("myField2")
    public void setMyField2(Double myField2) {
        this.myField2 = myField2;
    }

    /**
     * The string type is used for strings of text.
     * 
     */
    @JsonProperty("myField3")
    public String getMyField3() {
        return myField3;
    }

    /**
     * The string type is used for strings of text.
     * 
     */
    @JsonProperty("myField3")
    public void setMyField3(String myField3) {
        this.myField3 = myField3;
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
        sb.append(UiTemplateJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("myField1");
        sb.append('=');
        sb.append(((this.myField1 == null)?"<null>":this.myField1));
        sb.append(',');
        sb.append("myField2");
        sb.append('=');
        sb.append(((this.myField2 == null)?"<null>":this.myField2));
        sb.append(',');
        sb.append("myField3");
        sb.append('=');
        sb.append(((this.myField3 == null)?"<null>":this.myField3));
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
        result = ((result* 31)+((this.myField2 == null)? 0 :this.myField2 .hashCode()));
        result = ((result* 31)+((this.myField3 == null)? 0 :this.myField3 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.myField1 == null)? 0 :this.myField1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UiTemplateJson) == false) {
            return false;
        }
        UiTemplateJson rhs = ((UiTemplateJson) other);
        return (((((this.myField2 == rhs.myField2)||((this.myField2 != null)&&this.myField2 .equals(rhs.myField2)))&&((this.myField3 == rhs.myField3)||((this.myField3 != null)&&this.myField3 .equals(rhs.myField3))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.myField1 == rhs.myField1)||((this.myField1 != null)&&this.myField1 .equals(rhs.myField1))));
    }

}
