// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.spaceuptech.api.core.proto;

/**
 * Protobuf type {@code proto.DeleteRequest}
 */
public  final class DeleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.DeleteRequest)
    DeleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRequest.newBuilder() to construct.
  private DeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRequest() {
    find_ = com.google.protobuf.ByteString.EMPTY;
    operation_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            find_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            operation_ = s;
            break;
          }
          case 26: {
            com.spaceuptech.api.core.proto.Meta.Builder subBuilder = null;
            if (meta_ != null) {
              subBuilder = meta_.toBuilder();
            }
            meta_ = input.readMessage(com.spaceuptech.api.core.proto.Meta.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(meta_);
              meta_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.spaceuptech.api.core.proto.SpaceCloudProto.internal_static_proto_DeleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.spaceuptech.api.core.proto.SpaceCloudProto.internal_static_proto_DeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.spaceuptech.api.core.proto.DeleteRequest.class, com.spaceuptech.api.core.proto.DeleteRequest.Builder.class);
  }

  public static final int FIND_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString find_;
  /**
   * <code>bytes find = 1;</code>
   */
  public com.google.protobuf.ByteString getFind() {
    return find_;
  }

  public static final int OPERATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object operation_;
  /**
   * <code>string operation = 2;</code>
   */
  public java.lang.String getOperation() {
    java.lang.Object ref = operation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operation_ = s;
      return s;
    }
  }
  /**
   * <code>string operation = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOperationBytes() {
    java.lang.Object ref = operation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int META_FIELD_NUMBER = 3;
  private com.spaceuptech.api.core.proto.Meta meta_;
  /**
   * <code>.proto.Meta meta = 3;</code>
   */
  public boolean hasMeta() {
    return meta_ != null;
  }
  /**
   * <code>.proto.Meta meta = 3;</code>
   */
  public com.spaceuptech.api.core.proto.Meta getMeta() {
    return meta_ == null ? com.spaceuptech.api.core.proto.Meta.getDefaultInstance() : meta_;
  }
  /**
   * <code>.proto.Meta meta = 3;</code>
   */
  public com.spaceuptech.api.core.proto.MetaOrBuilder getMetaOrBuilder() {
    return getMeta();
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
    if (!find_.isEmpty()) {
      output.writeBytes(1, find_);
    }
    if (!getOperationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operation_);
    }
    if (meta_ != null) {
      output.writeMessage(3, getMeta());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!find_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, find_);
    }
    if (!getOperationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operation_);
    }
    if (meta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMeta());
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
    if (!(obj instanceof com.spaceuptech.api.core.proto.DeleteRequest)) {
      return super.equals(obj);
    }
    com.spaceuptech.api.core.proto.DeleteRequest other = (com.spaceuptech.api.core.proto.DeleteRequest) obj;

    boolean result = true;
    result = result && getFind()
        .equals(other.getFind());
    result = result && getOperation()
        .equals(other.getOperation());
    result = result && (hasMeta() == other.hasMeta());
    if (hasMeta()) {
      result = result && getMeta()
          .equals(other.getMeta());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIND_FIELD_NUMBER;
    hash = (53 * hash) + getFind().hashCode();
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + getOperation().hashCode();
    if (hasMeta()) {
      hash = (37 * hash) + META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.spaceuptech.api.core.proto.DeleteRequest parseFrom(
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
  public static Builder newBuilder(com.spaceuptech.api.core.proto.DeleteRequest prototype) {
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
   * Protobuf type {@code proto.DeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.DeleteRequest)
      com.spaceuptech.api.core.proto.DeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.spaceuptech.api.core.proto.SpaceCloudProto.internal_static_proto_DeleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spaceuptech.api.core.proto.SpaceCloudProto.internal_static_proto_DeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spaceuptech.api.core.proto.DeleteRequest.class, com.spaceuptech.api.core.proto.DeleteRequest.Builder.class);
    }

    // Construct using com.spaceuptech.api.core.proto.DeleteRequest.newBuilder()
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
      find_ = com.google.protobuf.ByteString.EMPTY;

      operation_ = "";

      if (metaBuilder_ == null) {
        meta_ = null;
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.spaceuptech.api.core.proto.SpaceCloudProto.internal_static_proto_DeleteRequest_descriptor;
    }

    @java.lang.Override
    public com.spaceuptech.api.core.proto.DeleteRequest getDefaultInstanceForType() {
      return com.spaceuptech.api.core.proto.DeleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.spaceuptech.api.core.proto.DeleteRequest build() {
      com.spaceuptech.api.core.proto.DeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.spaceuptech.api.core.proto.DeleteRequest buildPartial() {
      com.spaceuptech.api.core.proto.DeleteRequest result = new com.spaceuptech.api.core.proto.DeleteRequest(this);
      result.find_ = find_;
      result.operation_ = operation_;
      if (metaBuilder_ == null) {
        result.meta_ = meta_;
      } else {
        result.meta_ = metaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.spaceuptech.api.core.proto.DeleteRequest) {
        return mergeFrom((com.spaceuptech.api.core.proto.DeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.spaceuptech.api.core.proto.DeleteRequest other) {
      if (other == com.spaceuptech.api.core.proto.DeleteRequest.getDefaultInstance()) return this;
      if (other.getFind() != com.google.protobuf.ByteString.EMPTY) {
        setFind(other.getFind());
      }
      if (!other.getOperation().isEmpty()) {
        operation_ = other.operation_;
        onChanged();
      }
      if (other.hasMeta()) {
        mergeMeta(other.getMeta());
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
      com.spaceuptech.api.core.proto.DeleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.spaceuptech.api.core.proto.DeleteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString find_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes find = 1;</code>
     */
    public com.google.protobuf.ByteString getFind() {
      return find_;
    }
    /**
     * <code>bytes find = 1;</code>
     */
    public Builder setFind(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      find_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes find = 1;</code>
     */
    public Builder clearFind() {
      
      find_ = getDefaultInstance().getFind();
      onChanged();
      return this;
    }

    private java.lang.Object operation_ = "";
    /**
     * <code>string operation = 2;</code>
     */
    public java.lang.String getOperation() {
      java.lang.Object ref = operation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operation = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOperationBytes() {
      java.lang.Object ref = operation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operation = 2;</code>
     */
    public Builder setOperation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string operation = 2;</code>
     */
    public Builder clearOperation() {
      
      operation_ = getDefaultInstance().getOperation();
      onChanged();
      return this;
    }
    /**
     * <code>string operation = 2;</code>
     */
    public Builder setOperationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operation_ = value;
      onChanged();
      return this;
    }

    private com.spaceuptech.api.core.proto.Meta meta_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.spaceuptech.api.core.proto.Meta, com.spaceuptech.api.core.proto.Meta.Builder, com.spaceuptech.api.core.proto.MetaOrBuilder> metaBuilder_;
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public boolean hasMeta() {
      return metaBuilder_ != null || meta_ != null;
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public com.spaceuptech.api.core.proto.Meta getMeta() {
      if (metaBuilder_ == null) {
        return meta_ == null ? com.spaceuptech.api.core.proto.Meta.getDefaultInstance() : meta_;
      } else {
        return metaBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public Builder setMeta(com.spaceuptech.api.core.proto.Meta value) {
      if (metaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        meta_ = value;
        onChanged();
      } else {
        metaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public Builder setMeta(
        com.spaceuptech.api.core.proto.Meta.Builder builderForValue) {
      if (metaBuilder_ == null) {
        meta_ = builderForValue.build();
        onChanged();
      } else {
        metaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public Builder mergeMeta(com.spaceuptech.api.core.proto.Meta value) {
      if (metaBuilder_ == null) {
        if (meta_ != null) {
          meta_ =
            com.spaceuptech.api.core.proto.Meta.newBuilder(meta_).mergeFrom(value).buildPartial();
        } else {
          meta_ = value;
        }
        onChanged();
      } else {
        metaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public Builder clearMeta() {
      if (metaBuilder_ == null) {
        meta_ = null;
        onChanged();
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public com.spaceuptech.api.core.proto.Meta.Builder getMetaBuilder() {
      
      onChanged();
      return getMetaFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    public com.spaceuptech.api.core.proto.MetaOrBuilder getMetaOrBuilder() {
      if (metaBuilder_ != null) {
        return metaBuilder_.getMessageOrBuilder();
      } else {
        return meta_ == null ?
            com.spaceuptech.api.core.proto.Meta.getDefaultInstance() : meta_;
      }
    }
    /**
     * <code>.proto.Meta meta = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.spaceuptech.api.core.proto.Meta, com.spaceuptech.api.core.proto.Meta.Builder, com.spaceuptech.api.core.proto.MetaOrBuilder> 
        getMetaFieldBuilder() {
      if (metaBuilder_ == null) {
        metaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.spaceuptech.api.core.proto.Meta, com.spaceuptech.api.core.proto.Meta.Builder, com.spaceuptech.api.core.proto.MetaOrBuilder>(
                getMeta(),
                getParentForChildren(),
                isClean());
        meta_ = null;
      }
      return metaBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.DeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.DeleteRequest)
  private static final com.spaceuptech.api.core.proto.DeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.spaceuptech.api.core.proto.DeleteRequest();
  }

  public static com.spaceuptech.api.core.proto.DeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRequest>() {
    @java.lang.Override
    public DeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.spaceuptech.api.core.proto.DeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

