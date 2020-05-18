// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentEventV1.proto

package io.confluent.demo.pojo.protobuf;

public final class PaymentEventV1 {
  private PaymentEventV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PaymentEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.confluent.demo.pojo.protobuf.PaymentEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>int64 epoch = 2;</code>
     * @return The epoch.
     */
    long getEpoch();

    /**
     * <code>bool success = 3;</code>
     * @return The success.
     */
    boolean getSuccess();

    /**
     * <code>double amount = 4;</code>
     * @return The amount.
     */
    double getAmount();

    /**
     * <code>string paymentType = 5;</code>
     * @return The paymentType.
     */
    java.lang.String getPaymentType();
    /**
     * <code>string paymentType = 5;</code>
     * @return The bytes for paymentType.
     */
    com.google.protobuf.ByteString
        getPaymentTypeBytes();
  }
  /**
   * Protobuf type {@code io.confluent.demo.pojo.protobuf.PaymentEvent}
   */
  public  static final class PaymentEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.confluent.demo.pojo.protobuf.PaymentEvent)
      PaymentEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PaymentEvent.newBuilder() to construct.
    private PaymentEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PaymentEvent() {
      paymentType_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PaymentEvent();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PaymentEvent(
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

              id_ = input.readInt64();
              break;
            }
            case 16: {

              epoch_ = input.readInt64();
              break;
            }
            case 24: {

              success_ = input.readBool();
              break;
            }
            case 33: {

              amount_ = input.readDouble();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              paymentType_ = s;
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
      return io.confluent.demo.pojo.protobuf.PaymentEventV1.internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.demo.pojo.protobuf.PaymentEventV1.internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.class, io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }

    public static final int EPOCH_FIELD_NUMBER = 2;
    private long epoch_;
    /**
     * <code>int64 epoch = 2;</code>
     * @return The epoch.
     */
    public long getEpoch() {
      return epoch_;
    }

    public static final int SUCCESS_FIELD_NUMBER = 3;
    private boolean success_;
    /**
     * <code>bool success = 3;</code>
     * @return The success.
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int AMOUNT_FIELD_NUMBER = 4;
    private double amount_;
    /**
     * <code>double amount = 4;</code>
     * @return The amount.
     */
    public double getAmount() {
      return amount_;
    }

    public static final int PAYMENTTYPE_FIELD_NUMBER = 5;
    private volatile java.lang.Object paymentType_;
    /**
     * <code>string paymentType = 5;</code>
     * @return The paymentType.
     */
    public java.lang.String getPaymentType() {
      java.lang.Object ref = paymentType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentType_ = s;
        return s;
      }
    }
    /**
     * <code>string paymentType = 5;</code>
     * @return The bytes for paymentType.
     */
    public com.google.protobuf.ByteString
        getPaymentTypeBytes() {
      java.lang.Object ref = paymentType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (epoch_ != 0L) {
        output.writeInt64(2, epoch_);
      }
      if (success_ != false) {
        output.writeBool(3, success_);
      }
      if (amount_ != 0D) {
        output.writeDouble(4, amount_);
      }
      if (!getPaymentTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, paymentType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (epoch_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, epoch_);
      }
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, success_);
      }
      if (amount_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, amount_);
      }
      if (!getPaymentTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, paymentType_);
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
      if (!(obj instanceof io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent)) {
        return super.equals(obj);
      }
      io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent other = (io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent) obj;

      if (getId()
          != other.getId()) return false;
      if (getEpoch()
          != other.getEpoch()) return false;
      if (getSuccess()
          != other.getSuccess()) return false;
      if (java.lang.Double.doubleToLongBits(getAmount())
          != java.lang.Double.doubleToLongBits(
              other.getAmount())) return false;
      if (!getPaymentType()
          .equals(other.getPaymentType())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + EPOCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEpoch());
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuccess());
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAmount()));
      hash = (37 * hash) + PAYMENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPaymentType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parseFrom(
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
    public static Builder newBuilder(io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent prototype) {
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
     * Protobuf type {@code io.confluent.demo.pojo.protobuf.PaymentEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.confluent.demo.pojo.protobuf.PaymentEvent)
        io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.demo.pojo.protobuf.PaymentEventV1.internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.demo.pojo.protobuf.PaymentEventV1.internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.class, io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.Builder.class);
      }

      // Construct using io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.newBuilder()
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
        id_ = 0L;

        epoch_ = 0L;

        success_ = false;

        amount_ = 0D;

        paymentType_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.demo.pojo.protobuf.PaymentEventV1.internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_descriptor;
      }

      @java.lang.Override
      public io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent getDefaultInstanceForType() {
        return io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent build() {
        io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent buildPartial() {
        io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent result = new io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent(this);
        result.id_ = id_;
        result.epoch_ = epoch_;
        result.success_ = success_;
        result.amount_ = amount_;
        result.paymentType_ = paymentType_;
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
        if (other instanceof io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent) {
          return mergeFrom((io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent other) {
        if (other == io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getEpoch() != 0L) {
          setEpoch(other.getEpoch());
        }
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (other.getAmount() != 0D) {
          setAmount(other.getAmount());
        }
        if (!other.getPaymentType().isEmpty()) {
          paymentType_ = other.paymentType_;
          onChanged();
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
        io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private long epoch_ ;
      /**
       * <code>int64 epoch = 2;</code>
       * @return The epoch.
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <code>int64 epoch = 2;</code>
       * @param value The epoch to set.
       * @return This builder for chaining.
       */
      public Builder setEpoch(long value) {
        
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 epoch = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEpoch() {
        
        epoch_ = 0L;
        onChanged();
        return this;
      }

      private boolean success_ ;
      /**
       * <code>bool success = 3;</code>
       * @return The success.
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>bool success = 3;</code>
       * @param value The success to set.
       * @return This builder for chaining.
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool success = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }

      private double amount_ ;
      /**
       * <code>double amount = 4;</code>
       * @return The amount.
       */
      public double getAmount() {
        return amount_;
      }
      /**
       * <code>double amount = 4;</code>
       * @param value The amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmount(double value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double amount = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAmount() {
        
        amount_ = 0D;
        onChanged();
        return this;
      }

      private java.lang.Object paymentType_ = "";
      /**
       * <code>string paymentType = 5;</code>
       * @return The paymentType.
       */
      public java.lang.String getPaymentType() {
        java.lang.Object ref = paymentType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          paymentType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string paymentType = 5;</code>
       * @return The bytes for paymentType.
       */
      public com.google.protobuf.ByteString
          getPaymentTypeBytes() {
        java.lang.Object ref = paymentType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          paymentType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string paymentType = 5;</code>
       * @param value The paymentType to set.
       * @return This builder for chaining.
       */
      public Builder setPaymentType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        paymentType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string paymentType = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPaymentType() {
        
        paymentType_ = getDefaultInstance().getPaymentType();
        onChanged();
        return this;
      }
      /**
       * <code>string paymentType = 5;</code>
       * @param value The bytes for paymentType to set.
       * @return This builder for chaining.
       */
      public Builder setPaymentTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        paymentType_ = value;
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


      // @@protoc_insertion_point(builder_scope:io.confluent.demo.pojo.protobuf.PaymentEvent)
    }

    // @@protoc_insertion_point(class_scope:io.confluent.demo.pojo.protobuf.PaymentEvent)
    private static final io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent();
    }

    public static io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PaymentEvent>
        PARSER = new com.google.protobuf.AbstractParser<PaymentEvent>() {
      @java.lang.Override
      public PaymentEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaymentEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PaymentEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PaymentEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.demo.pojo.protobuf.PaymentEventV1.PaymentEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024PaymentEventV1.proto\022\037io.confluent.dem" +
      "o.pojo.protobuf\"_\n\014PaymentEvent\022\n\n\002id\030\001 " +
      "\001(\003\022\r\n\005epoch\030\002 \001(\003\022\017\n\007success\030\003 \001(\010\022\016\n\006a" +
      "mount\030\004 \001(\001\022\023\n\013paymentType\030\005 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_confluent_demo_pojo_protobuf_PaymentEvent_descriptor,
        new java.lang.String[] { "Id", "Epoch", "Success", "Amount", "PaymentType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
