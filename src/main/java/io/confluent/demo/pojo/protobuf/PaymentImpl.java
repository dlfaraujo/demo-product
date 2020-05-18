// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package io.confluent.demo.pojo.protobuf;

public final class PaymentImpl {
  private PaymentImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PaymentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.confluent.demo.pojo.protobuf.Payment)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 payment_method_code = 1;</code>
     * @return The paymentMethodCode.
     */
    int getPaymentMethodCode();

    /**
     * <code>int64 card_number = 2;</code>
     * @return The cardNumber.
     */
    long getCardNumber();

    /**
     * <code>string expiration_date = 3;</code>
     * @return The expirationDate.
     */
    java.lang.String getExpirationDate();
    /**
     * <code>string expiration_date = 3;</code>
     * @return The bytes for expirationDate.
     */
    com.google.protobuf.ByteString
        getExpirationDateBytes();

    /**
     * <code>int32 cvv = 4;</code>
     * @return The cvv.
     */
    int getCvv();
  }
  /**
   * Protobuf type {@code io.confluent.demo.pojo.protobuf.Payment}
   */
  public  static final class Payment extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.confluent.demo.pojo.protobuf.Payment)
      PaymentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Payment.newBuilder() to construct.
    private Payment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Payment() {
      expirationDate_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Payment();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Payment(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              paymentMethodCode_ = input.readInt32();
              break;
            }
            case 16: {

              cardNumber_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              expirationDate_ = s;
              break;
            }
            case 32: {

              cvv_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.demo.pojo.protobuf.PaymentImpl.internal_static_io_confluent_demo_pojo_protobuf_Payment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.demo.pojo.protobuf.PaymentImpl.internal_static_io_confluent_demo_pojo_protobuf_Payment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.class, io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.Builder.class);
    }

    public static final int PAYMENT_METHOD_CODE_FIELD_NUMBER = 1;
    private int paymentMethodCode_;
    /**
     * <code>int32 payment_method_code = 1;</code>
     * @return The paymentMethodCode.
     */
    public int getPaymentMethodCode() {
      return paymentMethodCode_;
    }

    public static final int CARD_NUMBER_FIELD_NUMBER = 2;
    private long cardNumber_;
    /**
     * <code>int64 card_number = 2;</code>
     * @return The cardNumber.
     */
    public long getCardNumber() {
      return cardNumber_;
    }

    public static final int EXPIRATION_DATE_FIELD_NUMBER = 3;
    private volatile java.lang.Object expirationDate_;
    /**
     * <code>string expiration_date = 3;</code>
     * @return The expirationDate.
     */
    public java.lang.String getExpirationDate() {
      java.lang.Object ref = expirationDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expirationDate_ = s;
        return s;
      }
    }
    /**
     * <code>string expiration_date = 3;</code>
     * @return The bytes for expirationDate.
     */
    public com.google.protobuf.ByteString
        getExpirationDateBytes() {
      java.lang.Object ref = expirationDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expirationDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CVV_FIELD_NUMBER = 4;
    private int cvv_;
    /**
     * <code>int32 cvv = 4;</code>
     * @return The cvv.
     */
    public int getCvv() {
      return cvv_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (paymentMethodCode_ != 0) {
        output.writeInt32(1, paymentMethodCode_);
      }
      if (cardNumber_ != 0L) {
        output.writeInt64(2, cardNumber_);
      }
      if (!getExpirationDateBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, expirationDate_);
      }
      if (cvv_ != 0) {
        output.writeInt32(4, cvv_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (paymentMethodCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, paymentMethodCode_);
      }
      if (cardNumber_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, cardNumber_);
      }
      if (!getExpirationDateBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, expirationDate_);
      }
      if (cvv_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, cvv_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.demo.pojo.protobuf.PaymentImpl.Payment)) {
        return super.equals(obj);
      }
      io.confluent.demo.pojo.protobuf.PaymentImpl.Payment other = (io.confluent.demo.pojo.protobuf.PaymentImpl.Payment) obj;

      if (getPaymentMethodCode()
          != other.getPaymentMethodCode()) return false;
      if (getCardNumber()
          != other.getCardNumber()) return false;
      if (!getExpirationDate()
          .equals(other.getExpirationDate())) return false;
      if (getCvv()
          != other.getCvv()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PAYMENT_METHOD_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getPaymentMethodCode();
      hash = (37 * hash) + CARD_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCardNumber());
      hash = (37 * hash) + EXPIRATION_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getExpirationDate().hashCode();
      hash = (37 * hash) + CVV_FIELD_NUMBER;
      hash = (53 * hash) + getCvv();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.demo.pojo.protobuf.PaymentImpl.Payment prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code io.confluent.demo.pojo.protobuf.Payment}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.confluent.demo.pojo.protobuf.Payment)
        io.confluent.demo.pojo.protobuf.PaymentImpl.PaymentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.demo.pojo.protobuf.PaymentImpl.internal_static_io_confluent_demo_pojo_protobuf_Payment_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.demo.pojo.protobuf.PaymentImpl.internal_static_io_confluent_demo_pojo_protobuf_Payment_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.class, io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.Builder.class);
      }

      // Construct using io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        paymentMethodCode_ = 0;

        cardNumber_ = 0L;

        expirationDate_ = "";

        cvv_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.demo.pojo.protobuf.PaymentImpl.internal_static_io_confluent_demo_pojo_protobuf_Payment_descriptor;
      }

      @java.lang.Override
      public io.confluent.demo.pojo.protobuf.PaymentImpl.Payment getDefaultInstanceForType() {
        return io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.demo.pojo.protobuf.PaymentImpl.Payment build() {
        io.confluent.demo.pojo.protobuf.PaymentImpl.Payment result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.demo.pojo.protobuf.PaymentImpl.Payment buildPartial() {
        io.confluent.demo.pojo.protobuf.PaymentImpl.Payment result = new io.confluent.demo.pojo.protobuf.PaymentImpl.Payment(this);
        result.paymentMethodCode_ = paymentMethodCode_;
        result.cardNumber_ = cardNumber_;
        result.expirationDate_ = expirationDate_;
        result.cvv_ = cvv_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.demo.pojo.protobuf.PaymentImpl.Payment) {
          return mergeFrom((io.confluent.demo.pojo.protobuf.PaymentImpl.Payment)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.demo.pojo.protobuf.PaymentImpl.Payment other) {
        if (other == io.confluent.demo.pojo.protobuf.PaymentImpl.Payment.getDefaultInstance()) return this;
        if (other.getPaymentMethodCode() != 0) {
          setPaymentMethodCode(other.getPaymentMethodCode());
        }
        if (other.getCardNumber() != 0L) {
          setCardNumber(other.getCardNumber());
        }
        if (!other.getExpirationDate().isEmpty()) {
          expirationDate_ = other.expirationDate_;
          onChanged();
        }
        if (other.getCvv() != 0) {
          setCvv(other.getCvv());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.confluent.demo.pojo.protobuf.PaymentImpl.Payment parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.demo.pojo.protobuf.PaymentImpl.Payment) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int paymentMethodCode_ ;
      /**
       * <code>int32 payment_method_code = 1;</code>
       * @return The paymentMethodCode.
       */
      public int getPaymentMethodCode() {
        return paymentMethodCode_;
      }
      /**
       * <code>int32 payment_method_code = 1;</code>
       * @param value The paymentMethodCode to set.
       * @return This builder for chaining.
       */
      public Builder setPaymentMethodCode(int value) {
        
        paymentMethodCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 payment_method_code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPaymentMethodCode() {
        
        paymentMethodCode_ = 0;
        onChanged();
        return this;
      }

      private long cardNumber_ ;
      /**
       * <code>int64 card_number = 2;</code>
       * @return The cardNumber.
       */
      public long getCardNumber() {
        return cardNumber_;
      }
      /**
       * <code>int64 card_number = 2;</code>
       * @param value The cardNumber to set.
       * @return This builder for chaining.
       */
      public Builder setCardNumber(long value) {
        
        cardNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 card_number = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardNumber() {
        
        cardNumber_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object expirationDate_ = "";
      /**
       * <code>string expiration_date = 3;</code>
       * @return The expirationDate.
       */
      public java.lang.String getExpirationDate() {
        java.lang.Object ref = expirationDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          expirationDate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string expiration_date = 3;</code>
       * @return The bytes for expirationDate.
       */
      public com.google.protobuf.ByteString
          getExpirationDateBytes() {
        java.lang.Object ref = expirationDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          expirationDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string expiration_date = 3;</code>
       * @param value The expirationDate to set.
       * @return This builder for chaining.
       */
      public Builder setExpirationDate(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        expirationDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string expiration_date = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearExpirationDate() {
        
        expirationDate_ = getDefaultInstance().getExpirationDate();
        onChanged();
        return this;
      }
      /**
       * <code>string expiration_date = 3;</code>
       * @param value The bytes for expirationDate to set.
       * @return This builder for chaining.
       */
      public Builder setExpirationDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        expirationDate_ = value;
        onChanged();
        return this;
      }

      private int cvv_ ;
      /**
       * <code>int32 cvv = 4;</code>
       * @return The cvv.
       */
      public int getCvv() {
        return cvv_;
      }
      /**
       * <code>int32 cvv = 4;</code>
       * @param value The cvv to set.
       * @return This builder for chaining.
       */
      public Builder setCvv(int value) {
        
        cvv_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cvv = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCvv() {
        
        cvv_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:io.confluent.demo.pojo.protobuf.Payment)
    }

    // @@protoc_insertion_point(class_scope:io.confluent.demo.pojo.protobuf.Payment)
    private static final io.confluent.demo.pojo.protobuf.PaymentImpl.Payment DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.demo.pojo.protobuf.PaymentImpl.Payment();
    }

    public static io.confluent.demo.pojo.protobuf.PaymentImpl.Payment getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Payment>
        PARSER = new com.google.protobuf.AbstractParser<Payment>() {
      @java.lang.Override
      public Payment parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Payment(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Payment> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Payment> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.demo.pojo.protobuf.PaymentImpl.Payment getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_confluent_demo_pojo_protobuf_Payment_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_confluent_demo_pojo_protobuf_Payment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpayment.proto\022\037io.confluent.demo.pojo." +
      "protobuf\"a\n\007Payment\022\033\n\023payment_method_co" +
      "de\030\001 \001(\005\022\023\n\013card_number\030\002 \001(\003\022\027\n\017expirat" +
      "ion_date\030\003 \001(\t\022\013\n\003cvv\030\004 \001(\005B\rB\013PaymentIm" +
      "plb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_confluent_demo_pojo_protobuf_Payment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_confluent_demo_pojo_protobuf_Payment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_confluent_demo_pojo_protobuf_Payment_descriptor,
        new java.lang.String[] { "PaymentMethodCode", "CardNumber", "ExpirationDate", "Cvv", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
