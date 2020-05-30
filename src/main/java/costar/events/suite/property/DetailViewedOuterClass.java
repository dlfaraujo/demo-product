// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DetailViewed.proto

package costar.events.suite.property;

public final class DetailViewedOuterClass {
  private DetailViewedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DetailViewedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:costar.events.suite.property.DetailViewed)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 property_id = 1;</code>
     * @return The propertyId.
     */
    int getPropertyId();

    /**
     * <code>string tab_name = 2;</code>
     * @return The tabName.
     */
    java.lang.String getTabName();
    /**
     * <code>string tab_name = 2;</code>
     * @return The bytes for tabName.
     */
    com.google.protobuf.ByteString
        getTabNameBytes();

    /**
     * <code>uint32 tab_id = 3;</code>
     * @return The tabId.
     */
    int getTabId();

    /**
     * <code>uint32 sub_tab_id = 4;</code>
     * @return The subTabId.
     */
    int getSubTabId();
  }
  /**
   * Protobuf type {@code costar.events.suite.property.DetailViewed}
   */
  public  static final class DetailViewed extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:costar.events.suite.property.DetailViewed)
      DetailViewedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DetailViewed.newBuilder() to construct.
    private DetailViewed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DetailViewed() {
      tabName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DetailViewed();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DetailViewed(
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

              propertyId_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              tabName_ = s;
              break;
            }
            case 24: {

              tabId_ = input.readUInt32();
              break;
            }
            case 32: {

              subTabId_ = input.readUInt32();
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
      return costar.events.suite.property.DetailViewedOuterClass.internal_static_costar_events_suite_property_DetailViewed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return costar.events.suite.property.DetailViewedOuterClass.internal_static_costar_events_suite_property_DetailViewed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              costar.events.suite.property.DetailViewedOuterClass.DetailViewed.class, costar.events.suite.property.DetailViewedOuterClass.DetailViewed.Builder.class);
    }

    public static final int PROPERTY_ID_FIELD_NUMBER = 1;
    private int propertyId_;
    /**
     * <code>uint32 property_id = 1;</code>
     * @return The propertyId.
     */
    public int getPropertyId() {
      return propertyId_;
    }

    public static final int TAB_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object tabName_;
    /**
     * <code>string tab_name = 2;</code>
     * @return The tabName.
     */
    public java.lang.String getTabName() {
      java.lang.Object ref = tabName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tabName_ = s;
        return s;
      }
    }
    /**
     * <code>string tab_name = 2;</code>
     * @return The bytes for tabName.
     */
    public com.google.protobuf.ByteString
        getTabNameBytes() {
      java.lang.Object ref = tabName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tabName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TAB_ID_FIELD_NUMBER = 3;
    private int tabId_;
    /**
     * <code>uint32 tab_id = 3;</code>
     * @return The tabId.
     */
    public int getTabId() {
      return tabId_;
    }

    public static final int SUB_TAB_ID_FIELD_NUMBER = 4;
    private int subTabId_;
    /**
     * <code>uint32 sub_tab_id = 4;</code>
     * @return The subTabId.
     */
    public int getSubTabId() {
      return subTabId_;
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
      if (propertyId_ != 0) {
        output.writeUInt32(1, propertyId_);
      }
      if (!getTabNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tabName_);
      }
      if (tabId_ != 0) {
        output.writeUInt32(3, tabId_);
      }
      if (subTabId_ != 0) {
        output.writeUInt32(4, subTabId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (propertyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, propertyId_);
      }
      if (!getTabNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tabName_);
      }
      if (tabId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, tabId_);
      }
      if (subTabId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, subTabId_);
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
      if (!(obj instanceof costar.events.suite.property.DetailViewedOuterClass.DetailViewed)) {
        return super.equals(obj);
      }
      costar.events.suite.property.DetailViewedOuterClass.DetailViewed other = (costar.events.suite.property.DetailViewedOuterClass.DetailViewed) obj;

      if (getPropertyId()
          != other.getPropertyId()) return false;
      if (!getTabName()
          .equals(other.getTabName())) return false;
      if (getTabId()
          != other.getTabId()) return false;
      if (getSubTabId()
          != other.getSubTabId()) return false;
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
      hash = (37 * hash) + PROPERTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyId();
      hash = (37 * hash) + TAB_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTabName().hashCode();
      hash = (37 * hash) + TAB_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTabId();
      hash = (37 * hash) + SUB_TAB_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubTabId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed parseFrom(
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
    public static Builder newBuilder(costar.events.suite.property.DetailViewedOuterClass.DetailViewed prototype) {
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
     * Protobuf type {@code costar.events.suite.property.DetailViewed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:costar.events.suite.property.DetailViewed)
        costar.events.suite.property.DetailViewedOuterClass.DetailViewedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return costar.events.suite.property.DetailViewedOuterClass.internal_static_costar_events_suite_property_DetailViewed_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return costar.events.suite.property.DetailViewedOuterClass.internal_static_costar_events_suite_property_DetailViewed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                costar.events.suite.property.DetailViewedOuterClass.DetailViewed.class, costar.events.suite.property.DetailViewedOuterClass.DetailViewed.Builder.class);
      }

      // Construct using costar.events.suite.property.DetailViewedOuterClass.DetailViewed.newBuilder()
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
        propertyId_ = 0;

        tabName_ = "";

        tabId_ = 0;

        subTabId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return costar.events.suite.property.DetailViewedOuterClass.internal_static_costar_events_suite_property_DetailViewed_descriptor;
      }

      @java.lang.Override
      public costar.events.suite.property.DetailViewedOuterClass.DetailViewed getDefaultInstanceForType() {
        return costar.events.suite.property.DetailViewedOuterClass.DetailViewed.getDefaultInstance();
      }

      @java.lang.Override
      public costar.events.suite.property.DetailViewedOuterClass.DetailViewed build() {
        costar.events.suite.property.DetailViewedOuterClass.DetailViewed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public costar.events.suite.property.DetailViewedOuterClass.DetailViewed buildPartial() {
        costar.events.suite.property.DetailViewedOuterClass.DetailViewed result = new costar.events.suite.property.DetailViewedOuterClass.DetailViewed(this);
        result.propertyId_ = propertyId_;
        result.tabName_ = tabName_;
        result.tabId_ = tabId_;
        result.subTabId_ = subTabId_;
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
        if (other instanceof costar.events.suite.property.DetailViewedOuterClass.DetailViewed) {
          return mergeFrom((costar.events.suite.property.DetailViewedOuterClass.DetailViewed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(costar.events.suite.property.DetailViewedOuterClass.DetailViewed other) {
        if (other == costar.events.suite.property.DetailViewedOuterClass.DetailViewed.getDefaultInstance()) return this;
        if (other.getPropertyId() != 0) {
          setPropertyId(other.getPropertyId());
        }
        if (!other.getTabName().isEmpty()) {
          tabName_ = other.tabName_;
          onChanged();
        }
        if (other.getTabId() != 0) {
          setTabId(other.getTabId());
        }
        if (other.getSubTabId() != 0) {
          setSubTabId(other.getSubTabId());
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
        costar.events.suite.property.DetailViewedOuterClass.DetailViewed parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (costar.events.suite.property.DetailViewedOuterClass.DetailViewed) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int propertyId_ ;
      /**
       * <code>uint32 property_id = 1;</code>
       * @return The propertyId.
       */
      public int getPropertyId() {
        return propertyId_;
      }
      /**
       * <code>uint32 property_id = 1;</code>
       * @param value The propertyId to set.
       * @return This builder for chaining.
       */
      public Builder setPropertyId(int value) {
        
        propertyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 property_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropertyId() {
        
        propertyId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object tabName_ = "";
      /**
       * <code>string tab_name = 2;</code>
       * @return The tabName.
       */
      public java.lang.String getTabName() {
        java.lang.Object ref = tabName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tabName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string tab_name = 2;</code>
       * @return The bytes for tabName.
       */
      public com.google.protobuf.ByteString
          getTabNameBytes() {
        java.lang.Object ref = tabName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tabName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tab_name = 2;</code>
       * @param value The tabName to set.
       * @return This builder for chaining.
       */
      public Builder setTabName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tabName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tab_name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTabName() {
        
        tabName_ = getDefaultInstance().getTabName();
        onChanged();
        return this;
      }
      /**
       * <code>string tab_name = 2;</code>
       * @param value The bytes for tabName to set.
       * @return This builder for chaining.
       */
      public Builder setTabNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tabName_ = value;
        onChanged();
        return this;
      }

      private int tabId_ ;
      /**
       * <code>uint32 tab_id = 3;</code>
       * @return The tabId.
       */
      public int getTabId() {
        return tabId_;
      }
      /**
       * <code>uint32 tab_id = 3;</code>
       * @param value The tabId to set.
       * @return This builder for chaining.
       */
      public Builder setTabId(int value) {
        
        tabId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tab_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTabId() {
        
        tabId_ = 0;
        onChanged();
        return this;
      }

      private int subTabId_ ;
      /**
       * <code>uint32 sub_tab_id = 4;</code>
       * @return The subTabId.
       */
      public int getSubTabId() {
        return subTabId_;
      }
      /**
       * <code>uint32 sub_tab_id = 4;</code>
       * @param value The subTabId to set.
       * @return This builder for chaining.
       */
      public Builder setSubTabId(int value) {
        
        subTabId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sub_tab_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubTabId() {
        
        subTabId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:costar.events.suite.property.DetailViewed)
    }

    // @@protoc_insertion_point(class_scope:costar.events.suite.property.DetailViewed)
    private static final costar.events.suite.property.DetailViewedOuterClass.DetailViewed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new costar.events.suite.property.DetailViewedOuterClass.DetailViewed();
    }

    public static costar.events.suite.property.DetailViewedOuterClass.DetailViewed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DetailViewed>
        PARSER = new com.google.protobuf.AbstractParser<DetailViewed>() {
      @java.lang.Override
      public DetailViewed parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DetailViewed(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DetailViewed> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DetailViewed> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public costar.events.suite.property.DetailViewedOuterClass.DetailViewed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_costar_events_suite_property_DetailViewed_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_costar_events_suite_property_DetailViewed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DetailViewed.proto\022\034costar.events.suit" +
      "e.property\"Y\n\014DetailViewed\022\023\n\013property_i" +
      "d\030\001 \001(\r\022\020\n\010tab_name\030\002 \001(\t\022\016\n\006tab_id\030\003 \001(" +
      "\r\022\022\n\nsub_tab_id\030\004 \001(\rB\037\252\002\034CoStar.Events." +
      "Suite.Propertyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_costar_events_suite_property_DetailViewed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_costar_events_suite_property_DetailViewed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_costar_events_suite_property_DetailViewed_descriptor,
        new java.lang.String[] { "PropertyId", "TabName", "TabId", "SubTabId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}