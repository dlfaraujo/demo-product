
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
 * RefsParent
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref1",
    "ref2"
})
public class GenericJSONRefMain {

    /**
     * Ref1
     * <p>
     * 
     * 
     */
    @JsonProperty("ref1")
    private GenericJSONRef1 ref1;
    /**
     * Ref2
     * <p>
     * 
     * 
     */
    @JsonProperty("ref2")
    private GenericJSONRef2 ref2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ref1
     * <p>
     * 
     * 
     */
    @JsonProperty("ref1")
    public GenericJSONRef1 getRef1() {
        return ref1;
    }

    /**
     * Ref1
     * <p>
     * 
     * 
     */
    @JsonProperty("ref1")
    public void setRef1(GenericJSONRef1 ref1) {
        this.ref1 = ref1;
    }

    /**
     * Ref2
     * <p>
     * 
     * 
     */
    @JsonProperty("ref2")
    public GenericJSONRef2 getRef2() {
        return ref2;
    }

    /**
     * Ref2
     * <p>
     * 
     * 
     */
    @JsonProperty("ref2")
    public void setRef2(GenericJSONRef2 ref2) {
        this.ref2 = ref2;
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
        sb.append(GenericJSONRefMain.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref1");
        sb.append('=');
        sb.append(((this.ref1 == null)?"<null>":this.ref1));
        sb.append(',');
        sb.append("ref2");
        sb.append('=');
        sb.append(((this.ref2 == null)?"<null>":this.ref2));
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
        result = ((result* 31)+((this.ref2 == null)? 0 :this.ref2 .hashCode()));
        result = ((result* 31)+((this.ref1 == null)? 0 :this.ref1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenericJSONRefMain) == false) {
            return false;
        }
        GenericJSONRefMain rhs = ((GenericJSONRefMain) other);
        return ((((this.ref2 == rhs.ref2)||((this.ref2 != null)&&this.ref2 .equals(rhs.ref2)))&&((this.ref1 == rhs.ref1)||((this.ref1 != null)&&this.ref1 .equals(rhs.ref1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
