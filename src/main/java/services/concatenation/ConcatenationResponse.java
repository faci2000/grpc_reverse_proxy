// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: concatenation.proto

package services.concatenation;

/**
 * Protobuf type {@code Concatenation.ConcatenationResponse}
 */
public final class ConcatenationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Concatenation.ConcatenationResponse)
    ConcatenationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConcatenationResponse.newBuilder() to construct.
  private ConcatenationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConcatenationResponse() {
    concatenatedText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConcatenationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConcatenationResponse(
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

            concatenatedText_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return services.concatenation.ConcatenationProto.internal_static_Concatenation_ConcatenationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return services.concatenation.ConcatenationProto.internal_static_Concatenation_ConcatenationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            services.concatenation.ConcatenationResponse.class, services.concatenation.ConcatenationResponse.Builder.class);
  }

  public static final int CONCATENATEDTEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object concatenatedText_;
  /**
   * <code>string concatenatedText = 1;</code>
   * @return The concatenatedText.
   */
  @java.lang.Override
  public java.lang.String getConcatenatedText() {
    java.lang.Object ref = concatenatedText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      concatenatedText_ = s;
      return s;
    }
  }
  /**
   * <code>string concatenatedText = 1;</code>
   * @return The bytes for concatenatedText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConcatenatedTextBytes() {
    java.lang.Object ref = concatenatedText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      concatenatedText_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(concatenatedText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, concatenatedText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(concatenatedText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, concatenatedText_);
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
    if (!(obj instanceof services.concatenation.ConcatenationResponse)) {
      return super.equals(obj);
    }
    services.concatenation.ConcatenationResponse other = (services.concatenation.ConcatenationResponse) obj;

    if (!getConcatenatedText()
        .equals(other.getConcatenatedText())) return false;
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
    hash = (37 * hash) + CONCATENATEDTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getConcatenatedText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static services.concatenation.ConcatenationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static services.concatenation.ConcatenationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static services.concatenation.ConcatenationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static services.concatenation.ConcatenationResponse parseFrom(
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
  public static Builder newBuilder(services.concatenation.ConcatenationResponse prototype) {
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
   * Protobuf type {@code Concatenation.ConcatenationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Concatenation.ConcatenationResponse)
      services.concatenation.ConcatenationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return services.concatenation.ConcatenationProto.internal_static_Concatenation_ConcatenationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return services.concatenation.ConcatenationProto.internal_static_Concatenation_ConcatenationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              services.concatenation.ConcatenationResponse.class, services.concatenation.ConcatenationResponse.Builder.class);
    }

    // Construct using services.concatenation.ConcatenationResponse.newBuilder()
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
      concatenatedText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return services.concatenation.ConcatenationProto.internal_static_Concatenation_ConcatenationResponse_descriptor;
    }

    @java.lang.Override
    public services.concatenation.ConcatenationResponse getDefaultInstanceForType() {
      return services.concatenation.ConcatenationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public services.concatenation.ConcatenationResponse build() {
      services.concatenation.ConcatenationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public services.concatenation.ConcatenationResponse buildPartial() {
      services.concatenation.ConcatenationResponse result = new services.concatenation.ConcatenationResponse(this);
      result.concatenatedText_ = concatenatedText_;
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
      if (other instanceof services.concatenation.ConcatenationResponse) {
        return mergeFrom((services.concatenation.ConcatenationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(services.concatenation.ConcatenationResponse other) {
      if (other == services.concatenation.ConcatenationResponse.getDefaultInstance()) return this;
      if (!other.getConcatenatedText().isEmpty()) {
        concatenatedText_ = other.concatenatedText_;
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
      services.concatenation.ConcatenationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (services.concatenation.ConcatenationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object concatenatedText_ = "";
    /**
     * <code>string concatenatedText = 1;</code>
     * @return The concatenatedText.
     */
    public java.lang.String getConcatenatedText() {
      java.lang.Object ref = concatenatedText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        concatenatedText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string concatenatedText = 1;</code>
     * @return The bytes for concatenatedText.
     */
    public com.google.protobuf.ByteString
        getConcatenatedTextBytes() {
      java.lang.Object ref = concatenatedText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        concatenatedText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string concatenatedText = 1;</code>
     * @param value The concatenatedText to set.
     * @return This builder for chaining.
     */
    public Builder setConcatenatedText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      concatenatedText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string concatenatedText = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConcatenatedText() {
      
      concatenatedText_ = getDefaultInstance().getConcatenatedText();
      onChanged();
      return this;
    }
    /**
     * <code>string concatenatedText = 1;</code>
     * @param value The bytes for concatenatedText to set.
     * @return This builder for chaining.
     */
    public Builder setConcatenatedTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      concatenatedText_ = value;
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


    // @@protoc_insertion_point(builder_scope:Concatenation.ConcatenationResponse)
  }

  // @@protoc_insertion_point(class_scope:Concatenation.ConcatenationResponse)
  private static final services.concatenation.ConcatenationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new services.concatenation.ConcatenationResponse();
  }

  public static services.concatenation.ConcatenationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConcatenationResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConcatenationResponse>() {
    @java.lang.Override
    public ConcatenationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConcatenationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConcatenationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConcatenationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public services.concatenation.ConcatenationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

