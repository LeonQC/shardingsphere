// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.MemberListResponse}
 */
public  final class MemberListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.MemberListResponse)
    MemberListResponseOrBuilder {
  public static final int HEADER_FIELD_NUMBER = 1;
  public static final int MEMBERS_FIELD_NUMBER = 2;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.MemberListResponse)
  private static final MemberListResponse DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<MemberListResponse>
      PARSER = new com.google.protobuf.AbstractParser<MemberListResponse>() {
    public MemberListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MemberListResponse(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new MemberListResponse();
  }

  private int bitField0_;
  private ResponseHeader header_;
  private java.util.List<Member> members_;
  private byte memoizedIsInitialized = -1;
  // Use MemberListResponse.newBuilder() to construct.
  private MemberListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemberListResponse() {
    members_ = java.util.Collections.emptyList();
  }
  private MemberListResponse(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              members_ = new java.util.ArrayList<Member>();
              mutable_bitField0_ |= 0x00000002;
            }
            members_.add(
                input.readMessage(Member.parser(), extensionRegistry));
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
        members_ = java.util.Collections.unmodifiableList(members_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EtcdProto.internal_static_etcdserverpb_MemberListResponse_descriptor;
  }

  public static MemberListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static MemberListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static MemberListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static MemberListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static MemberListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static MemberListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static MemberListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static MemberListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static MemberListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static MemberListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static MemberListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static MemberListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(MemberListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static MemberListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<MemberListResponse> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_MemberListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MemberListResponse.class, Builder.class);
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
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public java.util.List<Member> getMembersList() {
    return members_;
  }

  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public java.util.List<? extends MemberOrBuilder>
      getMembersOrBuilderList() {
    return members_;
  }

  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public int getMembersCount() {
    return members_.size();
  }

  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public Member getMembers(int index) {
    return members_.get(index);
  }

  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public MemberOrBuilder getMembersOrBuilder(
      int index) {
    return members_.get(index);
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
    for (int i = 0; i < members_.size(); i++) {
      output.writeMessage(2, members_.get(i));
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
    for (int i = 0; i < members_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, members_.get(i));
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
    if (!(obj instanceof MemberListResponse)) {
      return super.equals(obj);
    }
    MemberListResponse other = (MemberListResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getMembersList()
        .equals(other.getMembersList());
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
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
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
  public com.google.protobuf.Parser<MemberListResponse> getParserForType() {
    return PARSER;
  }

  public MemberListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.MemberListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.MemberListResponse)
      MemberListResponseOrBuilder {
    private int bitField0_;
    private ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHeader, ResponseHeader.Builder, ResponseHeaderOrBuilder> headerBuilder_;
    private java.util.List<Member> members_ =
      java.util.Collections.emptyList();
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Member, Member.Builder, MemberOrBuilder> membersBuilder_;
    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.MemberListResponse.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_MemberListResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_MemberListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MemberListResponse.class, Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMembersFieldBuilder();
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
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        membersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_MemberListResponse_descriptor;
    }

    public MemberListResponse getDefaultInstanceForType() {
      return MemberListResponse.getDefaultInstance();
    }

    public MemberListResponse build() {
      MemberListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public MemberListResponse buildPartial() {
      MemberListResponse result = new MemberListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (membersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          members_ = java.util.Collections.unmodifiableList(members_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.members_ = members_;
      } else {
        result.members_ = membersBuilder_.build();
      }
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
      if (other instanceof MemberListResponse) {
        return mergeFrom((MemberListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MemberListResponse other) {
      if (other == MemberListResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (membersBuilder_ == null) {
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
      } else {
        if (!other.members_.isEmpty()) {
          if (membersBuilder_.isEmpty()) {
            membersBuilder_.dispose();
            membersBuilder_ = null;
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
            membersBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMembersFieldBuilder() : null;
          } else {
            membersBuilder_.addAllMessages(other.members_);
          }
        }
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
      MemberListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MemberListResponse) e.getUnfinishedMessage();
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

    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        members_ = new java.util.ArrayList<Member>(members_);
        bitField0_ |= 0x00000002;
       }
    }

    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<Member> getMembersList() {
      if (membersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(members_);
      } else {
        return membersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public int getMembersCount() {
      if (membersBuilder_ == null) {
        return members_.size();
      } else {
        return membersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Member getMembers(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder setMembers(
        int index, Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
      } else {
        membersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder setMembers(
        int index, Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.set(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
      } else {
        membersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        int index, Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(index, value);
        onChanged();
      } else {
        membersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        int index, Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addAllMembers(
        Iterable<? extends Member> values) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, members_);
        onChanged();
      } else {
        membersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder clearMembers() {
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        membersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder removeMembers(int index) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.remove(index);
        onChanged();
      } else {
        membersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Member.Builder getMembersBuilder(
        int index) {
      return getMembersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public MemberOrBuilder getMembersOrBuilder(
        int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);  } else {
        return membersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<? extends MemberOrBuilder>
         getMembersOrBuilderList() {
      if (membersBuilder_ != null) {
        return membersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(members_);
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Member.Builder addMembersBuilder() {
      return getMembersFieldBuilder().addBuilder(
          Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Member.Builder addMembersBuilder(
        int index) {
      return getMembersFieldBuilder().addBuilder(
          index, Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<Member.Builder>
         getMembersBuilderList() {
      return getMembersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Member, Member.Builder, MemberOrBuilder>
        getMembersFieldBuilder() {
      if (membersBuilder_ == null) {
        membersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Member, Member.Builder, MemberOrBuilder>(
                members_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        members_ = null;
      }
      return membersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.MemberListResponse)
  }

}

