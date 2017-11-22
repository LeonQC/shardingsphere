// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.ResponseHeader}
 */
public  final class ResponseHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.ResponseHeader)
    ResponseHeaderOrBuilder {
  public static final int CLUSTER_ID_FIELD_NUMBER = 1;
  public static final int MEMBER_ID_FIELD_NUMBER = 2;
  public static final int REVISION_FIELD_NUMBER = 3;
  public static final int RAFT_TERM_FIELD_NUMBER = 4;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.ResponseHeader)
  private static final ResponseHeader DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<ResponseHeader>
      PARSER = new com.google.protobuf.AbstractParser<ResponseHeader>() {
    public ResponseHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseHeader(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new ResponseHeader();
  }

  private long clusterId_;
  private long memberId_;
  private long revision_;
  private long raftTerm_;
  private byte memoizedIsInitialized = -1;

  // Use ResponseHeader.newBuilder() to construct.
  private ResponseHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseHeader() {
    clusterId_ = 0L;
    memberId_ = 0L;
    revision_ = 0L;
    raftTerm_ = 0L;
  }
  private ResponseHeader(
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
          case 8: {

            clusterId_ = input.readUInt64();
            break;
          }
          case 16: {

            memberId_ = input.readUInt64();
            break;
          }
          case 24: {

            revision_ = input.readInt64();
            break;
          }
          case 32: {

            raftTerm_ = input.readUInt64();
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
    return EtcdProto.internal_static_etcdserverpb_ResponseHeader_descriptor;
  }

  public static ResponseHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static ResponseHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static ResponseHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static ResponseHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static ResponseHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static ResponseHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static ResponseHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static ResponseHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ResponseHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ResponseHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static ResponseHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static ResponseHeader parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ResponseHeader prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static ResponseHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<ResponseHeader> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_ResponseHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ResponseHeader.class, Builder.class);
  }

  /**
   * <pre>
   * cluster_id is the ID of the cluster which sent the response.
   * </pre>
   *
   * <code>uint64 cluster_id = 1;</code>
   */
  public long getClusterId() {
    return clusterId_;
  }

  /**
   * <pre>
   * member_id is the ID of the member which sent the response.
   * </pre>
   *
   * <code>uint64 member_id = 2;</code>
   */
  public long getMemberId() {
    return memberId_;
  }

  /**
   * <pre>
   * revision is the key-value store revision when the request was applied.
   * </pre>
   *
   * <code>int64 revision = 3;</code>
   */
  public long getRevision() {
    return revision_;
  }

  /**
   * <pre>
   * raft_term is the raft term when the request was applied.
   * </pre>
   *
   * <code>uint64 raft_term = 4;</code>
   */
  public long getRaftTerm() {
    return raftTerm_;
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
    if (clusterId_ != 0L) {
      output.writeUInt64(1, clusterId_);
    }
    if (memberId_ != 0L) {
      output.writeUInt64(2, memberId_);
    }
    if (revision_ != 0L) {
      output.writeInt64(3, revision_);
    }
    if (raftTerm_ != 0L) {
      output.writeUInt64(4, raftTerm_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clusterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, clusterId_);
    }
    if (memberId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, memberId_);
    }
    if (revision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, revision_);
    }
    if (raftTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, raftTerm_);
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
    if (!(obj instanceof ResponseHeader)) {
      return super.equals(obj);
    }
    ResponseHeader other = (ResponseHeader) obj;

    boolean result = true;
    result = result && (getClusterId()
        == other.getClusterId());
    result = result && (getMemberId()
        == other.getMemberId());
    result = result && (getRevision()
        == other.getRevision());
    result = result && (getRaftTerm()
        == other.getRaftTerm());
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
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClusterId());
    hash = (37 * hash) + MEMBER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemberId());
    hash = (37 * hash) + REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevision());
    hash = (37 * hash) + RAFT_TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRaftTerm());
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
  public com.google.protobuf.Parser<ResponseHeader> getParserForType() {
    return PARSER;
  }

  public ResponseHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.ResponseHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.ResponseHeader)
      ResponseHeaderOrBuilder {
    private long clusterId_ ;
    private long memberId_ ;
    private long revision_ ;
    private long raftTerm_ ;
    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.ResponseHeader.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_ResponseHeader_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_ResponseHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseHeader.class, Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      clusterId_ = 0L;

      memberId_ = 0L;

      revision_ = 0L;

      raftTerm_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_ResponseHeader_descriptor;
    }

    public ResponseHeader getDefaultInstanceForType() {
      return ResponseHeader.getDefaultInstance();
    }

    public ResponseHeader build() {
      ResponseHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ResponseHeader buildPartial() {
      ResponseHeader result = new ResponseHeader(this);
      result.clusterId_ = clusterId_;
      result.memberId_ = memberId_;
      result.revision_ = revision_;
      result.raftTerm_ = raftTerm_;
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
      if (other instanceof ResponseHeader) {
        return mergeFrom((ResponseHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ResponseHeader other) {
      if (other == ResponseHeader.getDefaultInstance()) return this;
      if (other.getClusterId() != 0L) {
        setClusterId(other.getClusterId());
      }
      if (other.getMemberId() != 0L) {
        setMemberId(other.getMemberId());
      }
      if (other.getRevision() != 0L) {
        setRevision(other.getRevision());
      }
      if (other.getRaftTerm() != 0L) {
        setRaftTerm(other.getRaftTerm());
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
      ResponseHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ResponseHeader) e.getUnfinishedMessage();
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
     * cluster_id is the ID of the cluster which sent the response.
     * </pre>
     *
     * <code>uint64 cluster_id = 1;</code>
     */
    public long getClusterId() {
      return clusterId_;
    }

    /**
     * <pre>
     * cluster_id is the ID of the cluster which sent the response.
     * </pre>
     *
     * <code>uint64 cluster_id = 1;</code>
     */
    public Builder setClusterId(long value) {

      clusterId_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * cluster_id is the ID of the cluster which sent the response.
     * </pre>
     *
     * <code>uint64 cluster_id = 1;</code>
     */
    public Builder clearClusterId() {

      clusterId_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * member_id is the ID of the member which sent the response.
     * </pre>
     *
     * <code>uint64 member_id = 2;</code>
     */
    public long getMemberId() {
      return memberId_;
    }

    /**
     * <pre>
     * member_id is the ID of the member which sent the response.
     * </pre>
     *
     * <code>uint64 member_id = 2;</code>
     */
    public Builder setMemberId(long value) {

      memberId_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * member_id is the ID of the member which sent the response.
     * </pre>
     *
     * <code>uint64 member_id = 2;</code>
     */
    public Builder clearMemberId() {

      memberId_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * revision is the key-value store revision when the request was applied.
     * </pre>
     *
     * <code>int64 revision = 3;</code>
     */
    public long getRevision() {
      return revision_;
    }

    /**
     * <pre>
     * revision is the key-value store revision when the request was applied.
     * </pre>
     *
     * <code>int64 revision = 3;</code>
     */
    public Builder setRevision(long value) {

      revision_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * revision is the key-value store revision when the request was applied.
     * </pre>
     *
     * <code>int64 revision = 3;</code>
     */
    public Builder clearRevision() {

      revision_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * raft_term is the raft term when the request was applied.
     * </pre>
     *
     * <code>uint64 raft_term = 4;</code>
     */
    public long getRaftTerm() {
      return raftTerm_;
    }
    /**
     * <pre>
     * raft_term is the raft term when the request was applied.
     * </pre>
     *
     * <code>uint64 raft_term = 4;</code>
     */
    public Builder setRaftTerm(long value) {

      raftTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * raft_term is the raft term when the request was applied.
     * </pre>
     *
     * <code>uint64 raft_term = 4;</code>
     */
    public Builder clearRaftTerm() {

      raftTerm_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.ResponseHeader)
  }

}

