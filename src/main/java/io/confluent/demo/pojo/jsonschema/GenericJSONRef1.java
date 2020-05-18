
package io.confluent.demo.pojo.jsonschema;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Ref1
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref1_1",
    "ref1_2"
})
public class GenericJSONRef1 {

    @JsonProperty("ref1_1")
    private Double ref11;
    @JsonProperty("ref1_2")
    private String ref12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref1_1")
    public Double getRef11() {
        return ref11;
    }

    @JsonProperty("ref1_1")
    public void setRef11(Double ref11) {
        this.ref11 = ref11;
    }

    @JsonProperty("ref1_2")
    public String getRef12() {
        return ref12;
    }

    @JsonProperty("ref1_2")
    public void setRef12(String ref12) {
        this.ref12 = ref12;
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
        sb.append(GenericJSONRef1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref11");
        sb.append('=');
        sb.append(((this.ref11 == null)?"<null>":this.ref11));
        sb.append(',');
        sb.append("ref12");
        sb.append('=');
        sb.append(((this.ref12 == null)?"<null>":this.ref12));
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
        result = ((result* 31)+((this.ref12 == null)? 0 :this.ref12 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ref11 == null)? 0 :this.ref11 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenericJSONRef1) == false) {
            return false;
        }
        GenericJSONRef1 rhs = ((GenericJSONRef1) other);
        return ((((this.ref12 == rhs.ref12)||((this.ref12 != null)&&this.ref12 .equals(rhs.ref12)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ref11 == rhs.ref11)||((this.ref11 != null)&&this.ref11 .equals(rhs.ref11))));
    }

}
