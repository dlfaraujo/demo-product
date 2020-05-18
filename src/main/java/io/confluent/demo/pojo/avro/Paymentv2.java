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
public class Paymentv2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 497518036976934481L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Paymentv2\",\"namespace\":\"io.confluent.demo.pojo.avro\",\"fields\":[{\"name\":\"payment_method_code\",\"type\":\"int\"},{\"name\":\"card_number\",\"type\":\"long\"},{\"name\":\"expiration_date\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cvv\",\"type\":\"int\"},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Paymentv2> ENCODER =
      new BinaryMessageEncoder<Paymentv2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Paymentv2> DECODER =
      new BinaryMessageDecoder<Paymentv2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Paymentv2> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Paymentv2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Paymentv2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Paymentv2>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Paymentv2 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Paymentv2 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Paymentv2 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Paymentv2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int payment_method_code;
  @Deprecated public long card_number;
  @Deprecated public java.lang.String expiration_date;
  @Deprecated public int cvv;
  @Deprecated public java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Paymentv2() {}

  /**
   * All-args constructor.
   * @param payment_method_code The new value for payment_method_code
   * @param card_number The new value for card_number
   * @param expiration_date The new value for expiration_date
   * @param cvv The new value for cvv
   * @param description The new value for description
   */
  public Paymentv2(java.lang.Integer payment_method_code, java.lang.Long card_number, java.lang.String expiration_date, java.lang.Integer cvv, java.lang.String description) {
    this.payment_method_code = payment_method_code;
    this.card_number = card_number;
    this.expiration_date = expiration_date;
    this.cvv = cvv;
    this.description = description;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return payment_method_code;
    case 1: return card_number;
    case 2: return expiration_date;
    case 3: return cvv;
    case 4: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: payment_method_code = (java.lang.Integer)value$; break;
    case 1: card_number = (java.lang.Long)value$; break;
    case 2: expiration_date = (java.lang.String)value$; break;
    case 3: cvv = (java.lang.Integer)value$; break;
    case 4: description = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'payment_method_code' field.
   * @return The value of the 'payment_method_code' field.
   */
  public int getPaymentMethodCode() {
    return payment_method_code;
  }


  /**
   * Sets the value of the 'payment_method_code' field.
   * @param value the value to set.
   */
  public void setPaymentMethodCode(int value) {
    this.payment_method_code = value;
  }

  /**
   * Gets the value of the 'card_number' field.
   * @return The value of the 'card_number' field.
   */
  public long getCardNumber() {
    return card_number;
  }


  /**
   * Sets the value of the 'card_number' field.
   * @param value the value to set.
   */
  public void setCardNumber(long value) {
    this.card_number = value;
  }

  /**
   * Gets the value of the 'expiration_date' field.
   * @return The value of the 'expiration_date' field.
   */
  public java.lang.String getExpirationDate() {
    return expiration_date;
  }


  /**
   * Sets the value of the 'expiration_date' field.
   * @param value the value to set.
   */
  public void setExpirationDate(java.lang.String value) {
    this.expiration_date = value;
  }

  /**
   * Gets the value of the 'cvv' field.
   * @return The value of the 'cvv' field.
   */
  public int getCvv() {
    return cvv;
  }


  /**
   * Sets the value of the 'cvv' field.
   * @param value the value to set.
   */
  public void setCvv(int value) {
    this.cvv = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Creates a new Paymentv2 RecordBuilder.
   * @return A new Paymentv2 RecordBuilder
   */
  public static io.confluent.demo.pojo.avro.Paymentv2.Builder newBuilder() {
    return new io.confluent.demo.pojo.avro.Paymentv2.Builder();
  }

  /**
   * Creates a new Paymentv2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Paymentv2 RecordBuilder
   */
  public static io.confluent.demo.pojo.avro.Paymentv2.Builder newBuilder(io.confluent.demo.pojo.avro.Paymentv2.Builder other) {
    if (other == null) {
      return new io.confluent.demo.pojo.avro.Paymentv2.Builder();
    } else {
      return new io.confluent.demo.pojo.avro.Paymentv2.Builder(other);
    }
  }

  /**
   * Creates a new Paymentv2 RecordBuilder by copying an existing Paymentv2 instance.
   * @param other The existing instance to copy.
   * @return A new Paymentv2 RecordBuilder
   */
  public static io.confluent.demo.pojo.avro.Paymentv2.Builder newBuilder(io.confluent.demo.pojo.avro.Paymentv2 other) {
    if (other == null) {
      return new io.confluent.demo.pojo.avro.Paymentv2.Builder();
    } else {
      return new io.confluent.demo.pojo.avro.Paymentv2.Builder(other);
    }
  }

  /**
   * RecordBuilder for Paymentv2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Paymentv2>
    implements org.apache.avro.data.RecordBuilder<Paymentv2> {

    private int payment_method_code;
    private long card_number;
    private java.lang.String expiration_date;
    private int cvv;
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.demo.pojo.avro.Paymentv2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.payment_method_code)) {
        this.payment_method_code = data().deepCopy(fields()[0].schema(), other.payment_method_code);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.card_number)) {
        this.card_number = data().deepCopy(fields()[1].schema(), other.card_number);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.expiration_date)) {
        this.expiration_date = data().deepCopy(fields()[2].schema(), other.expiration_date);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.cvv)) {
        this.cvv = data().deepCopy(fields()[3].schema(), other.cvv);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Paymentv2 instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.demo.pojo.avro.Paymentv2 other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.payment_method_code)) {
        this.payment_method_code = data().deepCopy(fields()[0].schema(), other.payment_method_code);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.card_number)) {
        this.card_number = data().deepCopy(fields()[1].schema(), other.card_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.expiration_date)) {
        this.expiration_date = data().deepCopy(fields()[2].schema(), other.expiration_date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cvv)) {
        this.cvv = data().deepCopy(fields()[3].schema(), other.cvv);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'payment_method_code' field.
      * @return The value.
      */
    public int getPaymentMethodCode() {
      return payment_method_code;
    }


    /**
      * Sets the value of the 'payment_method_code' field.
      * @param value The value of 'payment_method_code'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder setPaymentMethodCode(int value) {
      validate(fields()[0], value);
      this.payment_method_code = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'payment_method_code' field has been set.
      * @return True if the 'payment_method_code' field has been set, false otherwise.
      */
    public boolean hasPaymentMethodCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'payment_method_code' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder clearPaymentMethodCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'card_number' field.
      * @return The value.
      */
    public long getCardNumber() {
      return card_number;
    }


    /**
      * Sets the value of the 'card_number' field.
      * @param value The value of 'card_number'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder setCardNumber(long value) {
      validate(fields()[1], value);
      this.card_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'card_number' field has been set.
      * @return True if the 'card_number' field has been set, false otherwise.
      */
    public boolean hasCardNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'card_number' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder clearCardNumber() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'expiration_date' field.
      * @return The value.
      */
    public java.lang.String getExpirationDate() {
      return expiration_date;
    }


    /**
      * Sets the value of the 'expiration_date' field.
      * @param value The value of 'expiration_date'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder setExpirationDate(java.lang.String value) {
      validate(fields()[2], value);
      this.expiration_date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'expiration_date' field has been set.
      * @return True if the 'expiration_date' field has been set, false otherwise.
      */
    public boolean hasExpirationDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'expiration_date' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder clearExpirationDate() {
      expiration_date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'cvv' field.
      * @return The value.
      */
    public int getCvv() {
      return cvv;
    }


    /**
      * Sets the value of the 'cvv' field.
      * @param value The value of 'cvv'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder setCvv(int value) {
      validate(fields()[3], value);
      this.cvv = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'cvv' field has been set.
      * @return True if the 'cvv' field has been set, false otherwise.
      */
    public boolean hasCvv() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'cvv' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder clearCvv() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder setDescription(java.lang.String value) {
      validate(fields()[4], value);
      this.description = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public io.confluent.demo.pojo.avro.Paymentv2.Builder clearDescription() {
      description = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Paymentv2 build() {
      try {
        Paymentv2 record = new Paymentv2();
        record.payment_method_code = fieldSetFlags()[0] ? this.payment_method_code : (java.lang.Integer) defaultValue(fields()[0]);
        record.card_number = fieldSetFlags()[1] ? this.card_number : (java.lang.Long) defaultValue(fields()[1]);
        record.expiration_date = fieldSetFlags()[2] ? this.expiration_date : (java.lang.String) defaultValue(fields()[2]);
        record.cvv = fieldSetFlags()[3] ? this.cvv : (java.lang.Integer) defaultValue(fields()[3]);
        record.description = fieldSetFlags()[4] ? this.description : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Paymentv2>
    WRITER$ = (org.apache.avro.io.DatumWriter<Paymentv2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Paymentv2>
    READER$ = (org.apache.avro.io.DatumReader<Paymentv2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.payment_method_code);

    out.writeLong(this.card_number);

    if (this.expiration_date == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.expiration_date);
    }

    out.writeInt(this.cvv);

    if (this.description == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.description);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.payment_method_code = in.readInt();

      this.card_number = in.readLong();

      if (in.readIndex() != 1) {
        in.readNull();
        this.expiration_date = null;
      } else {
        this.expiration_date = in.readString();
      }

      this.cvv = in.readInt();

      if (in.readIndex() != 1) {
        in.readNull();
        this.description = null;
      } else {
        this.description = in.readString();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.payment_method_code = in.readInt();
          break;

        case 1:
          this.card_number = in.readLong();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.expiration_date = null;
          } else {
            this.expiration_date = in.readString();
          }
          break;

        case 3:
          this.cvv = in.readInt();
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.description = null;
          } else {
            this.description = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









