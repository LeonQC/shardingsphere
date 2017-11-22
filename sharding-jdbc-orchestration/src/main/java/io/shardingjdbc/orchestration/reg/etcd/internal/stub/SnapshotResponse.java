// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.SnapshotResponse}
 */
public  final class SnapshotResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.SnapshotResponse)
    SnapshotResponseOrBuilder {
  public static final int HEADER_FIELD_NUMBER = 1;
  public static final int REMAINING_BYTES_FIELD_NUMBER = 2;
  public static final int BLOB_FIELD_NUMBER = 3;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.SnapshotResponse)
  private static final SnapshotResponse DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<SnapshotResponse>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotResponse>() {
    public SnapshotResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SnapshotResponse(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new SnapshotResponse();
  }

  private ResponseHeader header_;
  private long remainingBytes_;
  private com.google.protobuf.ByteString blob_;
  private byte memoizedIsInitialized = -1;
  // Use SnapshotResponse.newBuilder() to construct.
  private SnapshotResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SnapshotResponse() {
    remainingBytes_ = 0L;
    blob_ = com.google.protobuf.ByteString.EMPTY;
  }
  private SnapshotResponse(
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
          case 16: {

            remainingBytes_ = input.readUInt64();
            break;
          }
          case 26: {

            blob_ = input.readBytes();
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
    return EtcdProto.internal_static_etcdserverpb_SnapshotResponse_descriptor;
  }

  public static SnapshotResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static SnapshotResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static SnapshotResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static SnapshotResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static SnapshotResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static SnapshotResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static SnapshotResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static SnapshotResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static SnapshotResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static SnapshotResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static SnapshotResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static SnapshotResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SnapshotResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static SnapshotResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<SnapshotResponse> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_SnapshotResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SnapshotResponse.class, Builder.class);
  }

  /**
   * <pre>
   * header has the current key-value store information. The first header in the snapshot
   * stream indicates the point in time of the snapshot.
   * </pre>
   *
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }

  /**
   * <pre>
   * header has the current key-value store information. The first header in the snapshot
   * stream indicates the point in time of the snapshot.
   * </pre>
   *
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public ResponseHeader getHeader() {
    return header_ == null ? ResponseHeader.getDefaultInstance() : header_;
  }

  /**
   * <pre>
   * header has the current key-value store information. The first header in the snapshot
   * stream indicates the point in time of the snapshot.
   * </pre>
   *
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  /**
   * <pre>
   * remaining_bytes is the number of blob bytes to be sent after this message
   * </pre>
   *
   * <code>uint64 remaining_bytes = 2;</code>
   */
  public long getRemainingBytes() {
    return remainingBytes_;
  }

  /**
   * <pre>
   * blob contains the next chunk of the snapshot in the snapshot stream.
   * </pre>
   *
   * <code>bytes blob = 3;</code>
   */
  public com.google.protobuf.ByteString getBlob() {
    return blob_;
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
    if (remainingBytes_ != 0L) {
      output.writeUInt64(2, remainingBytes_);
    }
    if (!blob_.isEmpty()) {
      output.writeBytes(3, blob_);
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
    if (remainingBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, remainingBytes_);
    }
    if (!blob_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, blob_);
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
    if (!(obj instanceof SnapshotResponse)) {
      return super.equals(obj);
    }
    SnapshotResponse other = (SnapshotResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (getRemainingBytes()
        == other.getRemainingBytes());
    result = result && getBlob()
        .equals(other.getBlob());
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
    hash = (37 * hash) + REMAINING_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRemainingBytes());
    hash = (37 * hash) + BLOB_FIELD_NUMBER;
    hash = (53 * hash) + getBlob().hashCode();
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
  public com.google.protobuf.Parser<SnapshotResponse> getParserForType() {
    return PARSER;
  }

  public SnapshotResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.SnapshotResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.SnapshotResponse)
      SnapshotResponseOrBuilder {
    private ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHeader, ResponseHeader.Builder, ResponseHeaderOrBuilder> headerBuilder_;
    private long remainingBytes_ ;
    private com.google.protobuf.ByteString blob_ = com.google.protobuf.ByteString.EMPTY;
    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.SnapshotResponse.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_SnapshotResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_SnapshotResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SnapshotResponse.class, Builder.class);
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
      remainingBytes_ = 0L;

      blob_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_SnapshotResponse_descriptor;
    }

    public SnapshotResponse getDefaultInstanceForType() {
      return SnapshotResponse.getDefaultInstance();
    }

    public SnapshotResponse build() {
      SnapshotResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SnapshotResponse buildPartial() {
      SnapshotResponse result = new SnapshotResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.remainingBytes_ = remainingBytes_;
      result.blob_ = blob_;
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
      if (other instanceof SnapshotResponse) {
        return mergeFrom((SnapshotResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SnapshotResponse other) {
      if (other == SnapshotResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getRemainingBytes() != 0L) {
        setRemainingBytes(other.getRemainingBytes());
      }
      if (other.getBlob() != com.google.protobuf.ByteString.EMPTY) {
        setBlob(other.getBlob());
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
      SnapshotResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SnapshotResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }

    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public ResponseHeader.Builder getHeaderBuilder() {

      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }

    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
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
     * remaining_bytes is the number of blob bytes to be sent after this message
     * </pre>
     *
     * <code>uint64 remaining_bytes = 2;</code>
     */
    public long getRemainingBytes() {
      return remainingBytes_;
    }

    /**
     * <pre>
     * remaining_bytes is the number of blob bytes to be sent after this message
     * </pre>
     *
     * <code>uint64 remaining_bytes = 2;</code>
     */
    public Builder setRemainingBytes(long value) {

      remainingBytes_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * remaining_bytes is the number of blob bytes to be sent after this message
     * </pre>
     *
     * <code>uint64 remaining_bytes = 2;</code>
     */
    public Builder clearRemainingBytes() {

      remainingBytes_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * blob contains the next chunk of the snapshot in the snapshot stream.
     * </pre>
     *
     * <code>bytes blob = 3;</code>
     */
    public com.google.protobuf.ByteString getBlob() {
      return blob_;
    }
    /**
     * <pre>
     * blob contains the next chunk of the snapshot in the snapshot stream.
     * </pre>
     *
     * <code>bytes blob = 3;</code>
     */
    public Builder setBlob(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }

      blob_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * blob contains the next chunk of the snapshot in the snapshot stream.
     * </pre>
     *
     * <code>bytes blob = 3;</code>
     */
    public Builder clearBlob() {

      blob_ = getDefaultInstance().getBlob();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.SnapshotResponse)
  }

}

