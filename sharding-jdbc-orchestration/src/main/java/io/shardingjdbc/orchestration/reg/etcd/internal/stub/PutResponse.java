// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.PutResponse}
 */
public  final class PutResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.PutResponse)
    PutResponseOrBuilder {
  public static final int HEADER_FIELD_NUMBER = 1;
  public static final int PREV_KV_FIELD_NUMBER = 2;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.PutResponse)
  private static final PutResponse DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<PutResponse>
      PARSER = new com.google.protobuf.AbstractParser<PutResponse>() {
    public PutResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PutResponse(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new PutResponse();
  }

  private ResponseHeader header_;
  private KeyValue prevKv_;
  private byte memoizedIsInitialized = -1;
  // Use PutResponse.newBuilder() to construct.
  private PutResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PutResponse() {
  }
  private PutResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            KeyValue.Builder subBuilder = null;
            if (prevKv_ != null) {
              subBuilder = prevKv_.toBuilder();
            }
            prevKv_ = input.readMessage(KeyValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prevKv_);
              prevKv_ = subBuilder.buildPartial();
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
    return EtcdProto.internal_static_etcdserverpb_PutResponse_descriptor;
  }

  public static PutResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static PutResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static PutResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static PutResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static PutResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static PutResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static PutResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static PutResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static PutResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static PutResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static PutResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static PutResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PutResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static PutResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<PutResponse> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_PutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PutResponse.class, Builder.class);
  }

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public ResponseHeader getHeader() {
    return header_ == null ? ResponseHeader.getDefaultInstance() : header_;
  }

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  public boolean hasPrevKv() {
    return prevKv_ != null;
  }

  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  public KeyValue getPrevKv() {
    return prevKv_ == null ? KeyValue.getDefaultInstance() : prevKv_;
  }

  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  public KeyValueOrBuilder getPrevKvOrBuilder() {
    return getPrevKv();
  }

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (prevKv_ != null) {
      output.writeMessage(2, getPrevKv());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (prevKv_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPrevKv());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof PutResponse)) {
      return super.equals(obj);
    }
    PutResponse other = (PutResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (hasPrevKv() == other.hasPrevKv());
    if (hasPrevKv()) {
      result = result && getPrevKv()
          .equals(other.getPrevKv());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasPrevKv()) {
      hash = (37 * hash) + PREV_KV_FIELD_NUMBER;
      hash = (53 * hash) + getPrevKv().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public Builder newBuilderForType() { return newBuilder(); }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  @Override
  public com.google.protobuf.Parser<PutResponse> getParserForType() {
    return PARSER;
  }

  public PutResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.PutResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.PutResponse)
      PutResponseOrBuilder {
    private ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHeader, ResponseHeader.Builder, ResponseHeaderOrBuilder> headerBuilder_;
    private KeyValue prevKv_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        KeyValue, KeyValue.Builder, KeyValueOrBuilder> prevKvBuilder_;
    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.PutResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }
    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EtcdProto.internal_static_etcdserverpb_PutResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_PutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PutResponse.class, Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (prevKvBuilder_ == null) {
        prevKv_ = null;
      } else {
        prevKv_ = null;
        prevKvBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_PutResponse_descriptor;
    }

    public PutResponse getDefaultInstanceForType() {
      return PutResponse.getDefaultInstance();
    }

    public PutResponse build() {
      PutResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public PutResponse buildPartial() {
      PutResponse result = new PutResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (prevKvBuilder_ == null) {
        result.prevKv_ = prevKv_;
      } else {
        result.prevKv_ = prevKvBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return super.clone();
    }

    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }

    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof PutResponse) {
        return mergeFrom((PutResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PutResponse other) {
      if (other == PutResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasPrevKv()) {
        mergePrevKv(other.getPrevKv());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      PutResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PutResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public ResponseHeader.Builder getHeaderBuilder() {

      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            ResponseHeader.getDefaultInstance() : header_;
      }
    }

    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHeader, ResponseHeader.Builder, ResponseHeaderOrBuilder>
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ResponseHeader, ResponseHeader.Builder, ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public boolean hasPrevKv() {
      return prevKvBuilder_ != null || prevKv_ != null;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public KeyValue getPrevKv() {
      if (prevKvBuilder_ == null) {
        return prevKv_ == null ? KeyValue.getDefaultInstance() : prevKv_;
      } else {
        return prevKvBuilder_.getMessage();
      }
    }

    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public Builder setPrevKv(
        KeyValue.Builder builderForValue) {
      if (prevKvBuilder_ == null) {
        prevKv_ = builderForValue.build();
        onChanged();
      } else {
        prevKvBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public Builder setPrevKv(KeyValue value) {
      if (prevKvBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prevKv_ = value;
        onChanged();
      } else {
        prevKvBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public Builder mergePrevKv(KeyValue value) {
      if (prevKvBuilder_ == null) {
        if (prevKv_ != null) {
          prevKv_ =
            KeyValue.newBuilder(prevKv_).mergeFrom(value).buildPartial();
        } else {
          prevKv_ = value;
        }
        onChanged();
      } else {
        prevKvBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public Builder clearPrevKv() {
      if (prevKvBuilder_ == null) {
        prevKv_ = null;
        onChanged();
      } else {
        prevKv_ = null;
        prevKvBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public KeyValue.Builder getPrevKvBuilder() {

      onChanged();
      return getPrevKvFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    public KeyValueOrBuilder getPrevKvOrBuilder() {
      if (prevKvBuilder_ != null) {
        return prevKvBuilder_.getMessageOrBuilder();
      } else {
        return prevKv_ == null ?
            KeyValue.getDefaultInstance() : prevKv_;
      }
    }
    /**
     * <pre>
     * if prev_kv is set in the request, the previous key-value pair will be returned.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        KeyValue, KeyValue.Builder, KeyValueOrBuilder>
        getPrevKvFieldBuilder() {
      if (prevKvBuilder_ == null) {
        prevKvBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            KeyValue, KeyValue.Builder, KeyValueOrBuilder>(
                getPrevKv(),
                getParentForChildren(),
                isClean());
        prevKv_ = null;
      }
      return prevKvBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.PutResponse)
  }

}

