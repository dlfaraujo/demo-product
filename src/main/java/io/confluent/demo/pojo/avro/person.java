/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.demo.pojo.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4991113119007892948L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"person\",\"namespace\":\"io.confluent.demo.pojo.avro\",\"fields\":[{\"name\":\"firstname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"address\",\"type\":{\"type\":\"record\",\"name\":\"AddressUSRecord\",\"fields\":[{\"name\":\"streetaddress\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"city\",\"type\":{\"type\":\"record\",\"name\":\"cityinUS\",\"fields\":[{\"name\":\"city1\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"city2\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<person> ENCODER =
      new BinaryMessageEncoder<person>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<person> DECODER =
      new BinaryMessageDecoder<person>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<person> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<person> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<person> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<person>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this person to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a person from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a person instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static person fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String firstname;
  @Deprecated public java.lang.String lastname;
  @Deprecated public io.confluent.demo.pojo.avro.AddressUSRecord address;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public person() {}

  /**
   * All-args constructor.
   * @param firstname The new value for firstname
   * @param lastname The new value for lastname
   * @param address The new value for address
   */
  public person(java.lang.String firstname, java.lang.String lastname, io.confluent.demo.pojo.avro.AddressUSRecord address) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstname;
    case 1: return lastname;
    case 2: return address;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstname = (java.lang.String)value$; break;
    case 1: lastname = (java.lang.String)value$; break;
    case 2: address = (io.confluent.demo.pojo.avro.AddressUSRecord)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstname' field.
   * @return The value of the 'firstname' field.
   */
  public java.lang.String getFirstname() {
    return firstname;
  }


  /**
   * Sets the value of the 'firstname' field.
   * @param value the value to set.
   */
  public void setFirstname(java.lang.String value) {
    this.firstname = value;
  }

  /**
   * Gets the value of the 'lastname' field.
   * @return The value of the 'lastname' field.
   */
  public java.lang.String getLastname() {
    return lastname;
  }


  /**
   * Sets the value of the 'lastname' field.
   * @param value the value to set.
   */
  public void setLastname(java.lang.String value) {
    this.lastname = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public io.confluent.demo.pojo.avro.AddressUSRecord getAddress() {
    return address;
  }


  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(io.confluent.demo.pojo.avro.AddressUSRecord value) {
    this.address = value;
  }

  /**
   * Creates a new person RecordBuilder.
   * @return A new person RecordBuilder
   */
  public static io.confluent.demo.pojo.avro.person.Builder newBuilder() {
    return new io.confluent.demo.pojo.avro.person.Builder();
  }

  /**
   * Creates a new person RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new person RecordBuilder
   */
  public static io.confluent.demo.pojo.avro.person.Builder newBuilder(io.confluent.demo.pojo.avro.person.Builder other) {
    if (other == null) {
      return new io.confluent.demo.pojo.avro.person.Builder();
    } else {
      return new io.confluent.demo.pojo.avro.person.Builder(other);
    }
  }

  /**
   * Creates a new person RecordBuilder by copying an existing person instance.
   * @param other The existing instance to copy.
   * @return A new person RecordBuilder
   */
  public static io.confluent.demo.pojo.avro.person.Builder newBuilder(io.confluent.demo.pojo.avro.person other) {
    if (other == null) {
      return new io.confluent.demo.pojo.avro.person.Builder();
    } else {
      return new io.confluent.demo.pojo.avro.person.Builder(other);
    }
  }

  /**
   * RecordBuilder for person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<person>
    implements org.apache.avro.data.RecordBuilder<person> {

    private java.lang.String firstname;
    private java.lang.String lastname;
    private io.confluent.demo.pojo.avro.AddressUSRecord address;
    private io.confluent.demo.pojo.avro.AddressUSRecord.Builder addressBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.demo.pojo.avro.person.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstname)) {
        this.firstname = data().deepCopy(fields()[0].schema(), other.firstname);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lastname)) {
        this.lastname = data().deepCopy(fields()[1].schema(), other.lastname);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.address)) {
        this.address = data().deepCopy(fields()[2].schema(), other.address);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasAddressBuilder()) {
        this.addressBuilder = io.confluent.demo.pojo.avro.AddressUSRecord.newBuilder(other.getAddressBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing person instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.demo.pojo.avro.person other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstname)) {
        this.firstname = data().deepCopy(fields()[0].schema(), other.firstname);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastname)) {
        this.lastname = data().deepCopy(fields()[1].schema(), other.lastname);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.address)) {
        this.address = data().deepCopy(fields()[2].schema(), other.address);
        fieldSetFlags()[2] = true;
      }
      this.addressBuilder = null;
    }

    /**
      * Gets the value of the 'firstname' field.
      * @return The value.
      */
    public java.lang.String getFirstname() {
      return firstname;
    }


    /**
      * Sets the value of the 'firstname' field.
      * @param value The value of 'firstname'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.person.Builder setFirstname(java.lang.String value) {
      validate(fields()[0], value);
      this.firstname = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstname' field has been set.
      * @return True if the 'firstname' field has been set, false otherwise.
      */
    public boolean hasFirstname() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstname' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.person.Builder clearFirstname() {
      firstname = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastname' field.
      * @return The value.
      */
    public java.lang.String getLastname() {
      return lastname;
    }


    /**
      * Sets the value of the 'lastname' field.
      * @param value The value of 'lastname'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.person.Builder setLastname(java.lang.String value) {
      validate(fields()[1], value);
      this.lastname = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastname' field has been set.
      * @return True if the 'lastname' field has been set, false otherwise.
      */
    public boolean hasLastname() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastname' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.person.Builder clearLastname() {
      lastname = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public io.confluent.demo.pojo.avro.AddressUSRecord getAddress() {
      return address;
    }


    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.person.Builder setAddress(io.confluent.demo.pojo.avro.AddressUSRecord value) {
      validate(fields()[2], value);
      this.addressBuilder = null;
      this.address = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'address' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.confluent.demo.pojo.avro.AddressUSRecord.Builder getAddressBuilder() {
      if (addressBuilder == null) {
        if (hasAddress()) {
          setAddressBuilder(io.confluent.demo.pojo.avro.AddressUSRecord.newBuilder(address));
        } else {
          setAddressBuilder(io.confluent.demo.pojo.avro.AddressUSRecord.newBuilder());
        }
      }
      return addressBuilder;
    }

    /**
     * Sets the Builder instance for the 'address' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.confluent.demo.pojo.avro.person.Builder setAddressBuilder(io.confluent.demo.pojo.avro.AddressUSRecord.Builder value) {
      clearAddress();
      addressBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'address' field has an active Builder instance
     * @return True if the 'address' field has an active Builder instance
     */
    public boolean hasAddressBuilder() {
      return addressBuilder != null;
    }

    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.person.Builder clearAddress() {
      address = null;
      addressBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public person build() {
      try {
        person record = new person();
        record.firstname = fieldSetFlags()[0] ? this.firstname : (java.lang.String) defaultValue(fields()[0]);
        record.lastname = fieldSetFlags()[1] ? this.lastname : (java.lang.String) defaultValue(fields()[1]);
        if (addressBuilder != null) {
          try {
            record.address = this.addressBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("address"));
            throw e;
          }
        } else {
          record.address = fieldSetFlags()[2] ? this.address : (io.confluent.demo.pojo.avro.AddressUSRecord) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<person>
    WRITER$ = (org.apache.avro.io.DatumWriter<person>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<person>
    READER$ = (org.apache.avro.io.DatumReader<person>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.firstname);

    out.writeString(this.lastname);

    this.address.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.firstname = in.readString();

      this.lastname = in.readString();

      if (this.address == null) {
        this.address = new io.confluent.demo.pojo.avro.AddressUSRecord();
      }
      this.address.customDecode(in);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.firstname = in.readString();
          break;

        case 1:
          this.lastname = in.readString();
          break;

        case 2:
          if (this.address == null) {
            this.address = new io.confluent.demo.pojo.avro.AddressUSRecord();
          }
          this.address.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









