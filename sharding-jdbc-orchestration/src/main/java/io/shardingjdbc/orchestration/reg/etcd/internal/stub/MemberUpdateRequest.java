// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.MemberUpdateRequest}
 */
public  final class MemberUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.MemberUpdateRequest)
    MemberUpdateRequestOrBuilder {
  public static final int ID_FIELD_NUMBER = 1;
  public static final int PEERURLS_FIELD_NUMBER = 2;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.MemberUpdateRequest)
  private static final MemberUpdateRequest DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<MemberUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<MemberUpdateRequest>() {
    public MemberUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MemberUpdateRequest(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new MemberUpdateRequest();
  }

  private int bitField0_;
  private long iD_;
  private com.google.protobuf.LazyStringList peerURLs_;
  private byte memoizedIsInitialized = -1;
  // Use MemberUpdateRequest.newBuilder() to construct.
  private MemberUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MemberUpdateRequest() {
    iD_ = 0L;
    peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }
  private MemberUpdateRequest(
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

            iD_ = input.readUInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              peerURLs_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            peerURLs_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        peerURLs_ = peerURLs_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EtcdProto.internal_static_etcdserverpb_MemberUpdateRequest_descriptor;
  }

  public static MemberUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static MemberUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static MemberUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static MemberUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static MemberUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static MemberUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static MemberUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static MemberUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static MemberUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static MemberUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static MemberUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static MemberUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(MemberUpdateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static MemberUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<MemberUpdateRequest> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_MemberUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MemberUpdateRequest.class, Builder.class);
  }

  /**
   * <pre>
   * ID is the member ID of the member to update.
   * </pre>
   *
   * <code>uint64 ID = 1;</code>
   */
  public long getID() {
    return iD_;
  }

  /**
   * <pre>
   * peerURLs is the new list of URLs the member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPeerURLsList() {
    return peerURLs_;
  }

  /**
   * <pre>
   * peerURLs is the new list of URLs the member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 2;</code>
   */
  public int getPeerURLsCount() {
    return peerURLs_.size();
  }

  /**
   * <pre>
   * peerURLs is the new list of URLs the member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 2;</code>
   */
  public String getPeerURLs(int index) {
    return peerURLs_.get(index);
  }

  /**
   * <pre>
   * peerURLs is the new list of URLs the member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPeerURLsBytes(int index) {
    return peerURLs_.getByteString(index);
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
    if (iD_ != 0L) {
      output.writeUInt64(1, iD_);
    }
    for (int i = 0; i < peerURLs_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, peerURLs_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, iD_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < peerURLs_.size(); i++) {
        dataSize += computeStringSizeNoTag(peerURLs_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPeerURLsList().size();
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
    if (!(obj instanceof MemberUpdateRequest)) {
      return super.equals(obj);
    }
    MemberUpdateRequest other = (MemberUpdateRequest) obj;

    boolean result = true;
    result = result && (getID()
        == other.getID());
    result = result && getPeerURLsList()
        .equals(other.getPeerURLsList());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getID());
    if (getPeerURLsCount() > 0) {
      hash = (37 * hash) + PEERURLS_FIELD_NUMBER;
      hash = (53 * hash) + getPeerURLsList().hashCode();
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
  public com.google.protobuf.Parser<MemberUpdateRequest> getParserForType() {
    return PARSER;
  }

  public MemberUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.MemberUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.MemberUpdateRequest)
      MemberUpdateRequestOrBuilder {
    private int bitField0_;
    private long iD_ ;
    private com.google.protobuf.LazyStringList peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;

    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.MemberUpdateRequest.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_MemberUpdateRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_MemberUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MemberUpdateRequest.class, Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      iD_ = 0L;

      peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_MemberUpdateRequest_descriptor;
    }

    public MemberUpdateRequest getDefaultInstanceForType() {
      return MemberUpdateRequest.getDefaultInstance();
    }

    public MemberUpdateRequest build() {
      MemberUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public MemberUpdateRequest buildPartial() {
      MemberUpdateRequest result = new MemberUpdateRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.iD_ = iD_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        peerURLs_ = peerURLs_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.peerURLs_ = peerURLs_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof MemberUpdateRequest) {
        return mergeFrom((MemberUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MemberUpdateRequest other) {
      if (other == MemberUpdateRequest.getDefaultInstance()) return this;
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      if (!other.peerURLs_.isEmpty()) {
        if (peerURLs_.isEmpty()) {
          peerURLs_ = other.peerURLs_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePeerURLsIsMutable();
          peerURLs_.addAll(other.peerURLs_);
        }
        onChanged();
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
      MemberUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MemberUpdateRequest) e.getUnfinishedMessage();
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
     * ID is the member ID of the member to update.
     * </pre>
     *
     * <code>uint64 ID = 1;</code>
     */
    public long getID() {
      return iD_;
    }

    /**
     * <pre>
     * ID is the member ID of the member to update.
     * </pre>
     *
     * <code>uint64 ID = 1;</code>
     */
    public Builder setID(long value) {

      iD_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * ID is the member ID of the member to update.
     * </pre>
     *
     * <code>uint64 ID = 1;</code>
     */
    public Builder clearID() {

      iD_ = 0L;
      onChanged();
      return this;
    }

    private void ensurePeerURLsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        peerURLs_ = new com.google.protobuf.LazyStringArrayList(peerURLs_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPeerURLsList() {
      return peerURLs_.getUnmodifiableView();
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public int getPeerURLsCount() {
      return peerURLs_.size();
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public String getPeerURLs(int index) {
      return peerURLs_.get(index);
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPeerURLsBytes(int index) {
      return peerURLs_.getByteString(index);
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public Builder setPeerURLs(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePeerURLsIsMutable();
      peerURLs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public Builder addPeerURLs(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePeerURLsIsMutable();
      peerURLs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public Builder addAllPeerURLs(
        Iterable<String> values) {
      ensurePeerURLsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, peerURLs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public Builder clearPeerURLs() {
      peerURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * peerURLs is the new list of URLs the member will use to communicate with the cluster.
     * </pre>
     *
     * <code>repeated string peerURLs = 2;</code>
     */
    public Builder addPeerURLsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePeerURLsIsMutable();
      peerURLs_.add(value);
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.MemberUpdateRequest)
  }

}

