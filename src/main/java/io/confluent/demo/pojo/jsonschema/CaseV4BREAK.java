
package io.confluent.demo.pojo.jsonschema;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Case
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caseId",
    "firstName",
    "lastName",
    "email",
    "address",
    "immigrationStatus",
    "aNumber"
})
public class CaseV4BREAK {

    /**
     * The id of the case.
     * 
     */
    @JsonProperty("caseId")
    @JsonPropertyDescription("The id of the case.")
    private Double caseId;
    /**
     * The first name of the applicant.
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The first name of the applicant.")
    private String firstName;
    /**
     * The last name of the applicant.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The last name of the applicant.")
    private String lastName;
    /**
     * The email of the applicant.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email of the applicant.")
    private String email;
    /**
     * The address of the applicant.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The address of the applicant.")
    private String address;
    /**
     * The current immigration status.
     * 
     */
    @JsonProperty("immigrationStatus")
    @JsonPropertyDescription("The current immigration status.")
    private CaseV4BREAK.ImmigrationStatus immigrationStatus;
    /**
     * The A Number of the application.
     * 
     */
    @JsonProperty("aNumber")
    @JsonPropertyDescription("The A Number of the application.")
    private Double aNumber;

    /**
     * The id of the case.
     * 
     */
    @JsonProperty("caseId")
    public Double getCaseId() {
        return caseId;
    }

    /**
     * The id of the case.
     * 
     */
    @JsonProperty("caseId")
    public void setCaseId(Double caseId) {
        this.caseId = caseId;
    }

    /**
     * The first name of the applicant.
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * The first name of the applicant.
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The last name of the applicant.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * The last name of the applicant.
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * The email of the applicant.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * The email of the applicant.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The address of the applicant.
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * The address of the applicant.
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The current immigration status.
     * 
     */
    @JsonProperty("immigrationStatus")
    public CaseV4BREAK.ImmigrationStatus getImmigrationStatus() {
        return immigrationStatus;
    }

    /**
     * The current immigration status.
     * 
     */
    @JsonProperty("immigrationStatus")
    public void setImmigrationStatus(CaseV4BREAK.ImmigrationStatus immigrationStatus) {
        this.immigrationStatus = immigrationStatus;
    }

    /**
     * The A Number of the application.
     * 
     */
    @JsonProperty("aNumber")
    public Double getaNumber() {
        return aNumber;
    }

    /**
     * The A Number of the application.
     * 
     */
    @JsonProperty("aNumber")
    public void setaNumber(Double aNumber) {
        this.aNumber = aNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaseV4BREAK.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caseId");
        sb.append('=');
        sb.append(((this.caseId == null)?"<null>":this.caseId));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("immigrationStatus");
        sb.append('=');
        sb.append(((this.immigrationStatus == null)?"<null>":this.immigrationStatus));
        sb.append(',');
        sb.append("aNumber");
        sb.append('=');
        sb.append(((this.aNumber == null)?"<null>":this.aNumber));
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
        result = ((result* 31)+((this.aNumber == null)? 0 :this.aNumber.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.caseId == null)? 0 :this.caseId.hashCode()));
        result = ((result* 31)+((this.immigrationStatus == null)? 0 :this.immigrationStatus.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaseV4BREAK) == false) {
            return false;
        }
        CaseV4BREAK rhs = ((CaseV4BREAK) other);
        return ((((((((this.aNumber == rhs.aNumber)||((this.aNumber!= null)&&this.aNumber.equals(rhs.aNumber)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.caseId == rhs.caseId)||((this.caseId!= null)&&this.caseId.equals(rhs.caseId))))&&((this.immigrationStatus == rhs.immigrationStatus)||((this.immigrationStatus!= null)&&this.immigrationStatus.equals(rhs.immigrationStatus))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }


    /**
     * The current immigration status.
     * 
     */
    public enum ImmigrationStatus {

        E_3("E3"),
        H_1_B("H1B"),
        B_1("B1"),
        B_2("B2");
        private final String value;
        private final static Map<String, CaseV4BREAK.ImmigrationStatus> CONSTANTS = new HashMap<String, CaseV4BREAK.ImmigrationStatus>();

        static {
            for (CaseV4BREAK.ImmigrationStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ImmigrationStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CaseV4BREAK.ImmigrationStatus fromValue(String value) {
            CaseV4BREAK.ImmigrationStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
