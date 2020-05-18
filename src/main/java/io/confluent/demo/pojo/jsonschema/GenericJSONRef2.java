
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
 * Ref2
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref2_1",
    "ref2_2"
})
public class GenericJSONRef2 {

    @JsonProperty("ref2_1")
    private Double ref21;
    @JsonProperty("ref2_2")
    private String ref22;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref2_1")
    public Double getRef21() {
        return ref21;
    }

    @JsonProperty("ref2_1")
    public void setRef21(Double ref21) {
        this.ref21 = ref21;
    }

    @JsonProperty("ref2_2")
    public String getRef22() {
        return ref22;
    }

    @JsonProperty("ref2_2")
    public void setRef22(String ref22) {
        this.ref22 = ref22;
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
        sb.append(GenericJSONRef2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref21");
        sb.append('=');
        sb.append(((this.ref21 == null)?"<null>":this.ref21));
        sb.append(',');
        sb.append("ref22");
        sb.append('=');
        sb.append(((this.ref22 == null)?"<null>":this.ref22));
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
        result = ((result* 31)+((this.ref22 == null)? 0 :this.ref22 .hashCode()));
        result = ((result* 31)+((this.ref21 == null)? 0 :this.ref21 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenericJSONRef2) == false) {
            return false;
        }
        GenericJSONRef2 rhs = ((GenericJSONRef2) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ref22 == rhs.ref22)||((this.ref22 != null)&&this.ref22 .equals(rhs.ref22))))&&((this.ref21 == rhs.ref21)||((this.ref21 != null)&&this.ref21 .equals(rhs.ref21))));
    }

}
