// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package HelloService;

public final class Hello {
  private Hello() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code HelloService.Sex}
   */
  public enum Sex
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BOY = 0;</code>
     */
    BOY(0),
    /**
     * <code>GIRL = 1;</code>
     */
    GIRL(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BOY = 0;</code>
     */
    public static final int BOY_VALUE = 0;
    /**
     * <code>GIRL = 1;</code>
     */
    public static final int GIRL_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Sex valueOf(int value) {
      return forNumber(value);
    }

    public static Sex forNumber(int value) {
      switch (value) {
        case 0: return BOY;
        case 1: return GIRL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Sex>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Sex> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Sex>() {
            public Sex findValueByNumber(int number) {
              return Sex.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return HelloService.Hello.getDescriptor().getEnumTypes().get(0);
    }

    private static final Sex[] VALUES = values();

    public static Sex valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Sex(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HelloService.Sex)
  }

  public interface HelloRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HelloService.HelloRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string age = 2;</code>
     */
    java.lang.String getAge();
    /**
     * <code>string age = 2;</code>
     */
    com.google.protobuf.ByteString
        getAgeBytes();

    /**
     * <code>.HelloService.Sex Sex = 3;</code>
     */
    int getSexValue();
    /**
     * <code>.HelloService.Sex Sex = 3;</code>
     */
    HelloService.Hello.Sex getSex();
  }
  /**
   * Protobuf type {@code HelloService.HelloRequest}
   */
  public  static final class HelloRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HelloService.HelloRequest)
      HelloRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloRequest.newBuilder() to construct.
    private HelloRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloRequest() {
      name_ = "";
      age_ = "";
      sex_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HelloRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloRequest(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              age_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              sex_ = rawValue;
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
      return HelloService.Hello.internal_static_HelloService_HelloRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HelloService.Hello.internal_static_HelloService_HelloRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HelloService.Hello.HelloRequest.class, HelloService.Hello.HelloRequest.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object age_;
    /**
     * <code>string age = 2;</code>
     */
    public java.lang.String getAge() {
      java.lang.Object ref = age_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        age_ = s;
        return s;
      }
    }
    /**
     * <code>string age = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAgeBytes() {
      java.lang.Object ref = age_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        age_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEX_FIELD_NUMBER = 3;
    private int sex_;
    /**
     * <code>.HelloService.Sex Sex = 3;</code>
     */
    public int getSexValue() {
      return sex_;
    }
    /**
     * <code>.HelloService.Sex Sex = 3;</code>
     */
    public HelloService.Hello.Sex getSex() {
      @SuppressWarnings("deprecation")
      HelloService.Hello.Sex result = HelloService.Hello.Sex.valueOf(sex_);
      return result == null ? HelloService.Hello.Sex.UNRECOGNIZED : result;
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getAgeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, age_);
      }
      if (sex_ != HelloService.Hello.Sex.BOY.getNumber()) {
        output.writeEnum(3, sex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getAgeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, age_);
      }
      if (sex_ != HelloService.Hello.Sex.BOY.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, sex_);
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
      if (!(obj instanceof HelloService.Hello.HelloRequest)) {
        return super.equals(obj);
      }
      HelloService.Hello.HelloRequest other = (HelloService.Hello.HelloRequest) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getAge()
          .equals(other.getAge())) return false;
      if (sex_ != other.sex_) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge().hashCode();
      hash = (37 * hash) + SEX_FIELD_NUMBER;
      hash = (53 * hash) + sex_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HelloService.Hello.HelloRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HelloService.Hello.HelloRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HelloService.Hello.HelloRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HelloService.Hello.HelloRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HelloService.Hello.HelloRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HelloService.Hello.HelloRequest parseFrom(
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
    public static Builder newBuilder(HelloService.Hello.HelloRequest prototype) {
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
     * Protobuf type {@code HelloService.HelloRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HelloService.HelloRequest)
        HelloService.Hello.HelloRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HelloService.Hello.internal_static_HelloService_HelloRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HelloService.Hello.internal_static_HelloService_HelloRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HelloService.Hello.HelloRequest.class, HelloService.Hello.HelloRequest.Builder.class);
      }

      // Construct using HelloService.Hello.HelloRequest.newBuilder()
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
        name_ = "";

        age_ = "";

        sex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HelloService.Hello.internal_static_HelloService_HelloRequest_descriptor;
      }

      @java.lang.Override
      public HelloService.Hello.HelloRequest getDefaultInstanceForType() {
        return HelloService.Hello.HelloRequest.getDefaultInstance();
      }

      @java.lang.Override
      public HelloService.Hello.HelloRequest build() {
        HelloService.Hello.HelloRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HelloService.Hello.HelloRequest buildPartial() {
        HelloService.Hello.HelloRequest result = new HelloService.Hello.HelloRequest(this);
        result.name_ = name_;
        result.age_ = age_;
        result.sex_ = sex_;
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
        if (other instanceof HelloService.Hello.HelloRequest) {
          return mergeFrom((HelloService.Hello.HelloRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HelloService.Hello.HelloRequest other) {
        if (other == HelloService.Hello.HelloRequest.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getAge().isEmpty()) {
          age_ = other.age_;
          onChanged();
        }
        if (other.sex_ != 0) {
          setSexValue(other.getSexValue());
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
        HelloService.Hello.HelloRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HelloService.Hello.HelloRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object age_ = "";
      /**
       * <code>string age = 2;</code>
       */
      public java.lang.String getAge() {
        java.lang.Object ref = age_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          age_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string age = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAgeBytes() {
        java.lang.Object ref = age_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          age_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string age = 2;</code>
       */
      public Builder setAge(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string age = 2;</code>
       */
      public Builder clearAge() {
        
        age_ = getDefaultInstance().getAge();
        onChanged();
        return this;
      }
      /**
       * <code>string age = 2;</code>
       */
      public Builder setAgeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        age_ = value;
        onChanged();
        return this;
      }

      private int sex_ = 0;
      /**
       * <code>.HelloService.Sex Sex = 3;</code>
       */
      public int getSexValue() {
        return sex_;
      }
      /**
       * <code>.HelloService.Sex Sex = 3;</code>
       */
      public Builder setSexValue(int value) {
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.HelloService.Sex Sex = 3;</code>
       */
      public HelloService.Hello.Sex getSex() {
        @SuppressWarnings("deprecation")
        HelloService.Hello.Sex result = HelloService.Hello.Sex.valueOf(sex_);
        return result == null ? HelloService.Hello.Sex.UNRECOGNIZED : result;
      }
      /**
       * <code>.HelloService.Sex Sex = 3;</code>
       */
      public Builder setSex(HelloService.Hello.Sex value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        sex_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.HelloService.Sex Sex = 3;</code>
       */
      public Builder clearSex() {
        
        sex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HelloService.HelloRequest)
    }

    // @@protoc_insertion_point(class_scope:HelloService.HelloRequest)
    private static final HelloService.Hello.HelloRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HelloService.Hello.HelloRequest();
    }

    public static HelloService.Hello.HelloRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloRequest>
        PARSER = new com.google.protobuf.AbstractParser<HelloRequest>() {
      @java.lang.Override
      public HelloRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HelloService.Hello.HelloRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloService_HelloRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloService_HelloRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\014HelloService\032\033google/prot" +
      "obuf/empty.proto\"I\n\014HelloRequest\022\014\n\004name" +
      "\030\001 \001(\t\022\013\n\003age\030\002 \001(\t\022\036\n\003Sex\030\003 \001(\0162\021.Hello" +
      "Service.Sex*\030\n\003Sex\022\007\n\003BOY\020\000\022\010\n\004GIRL\020\0012N\n" +
      "\014HelloService\022>\n\010SayHello\022\032.HelloService" +
      ".HelloRequest\032\026.google.protobuf.EmptyB\002P" +
      "\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_HelloService_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloService_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloService_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Age", "Sex", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}