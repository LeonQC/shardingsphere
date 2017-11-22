// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.AuthRoleGetResponse}
 */
public  final class AuthRoleGetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AuthRoleGetResponse)
    AuthRoleGetResponseOrBuilder {
  public static final int HEADER_FIELD_NUMBER = 1;
  public static final int PERM_FIELD_NUMBER = 2;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.AuthRoleGetResponse)
  private static final AuthRoleGetResponse DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<AuthRoleGetResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuthRoleGetResponse>() {
    public AuthRoleGetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthRoleGetResponse(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new AuthRoleGetResponse();
  }

  private int bitField0_;
  private ResponseHeader header_;
  private java.util.List<Permission> perm_;
  private byte memoizedIsInitialized = -1;
  // Use AuthRoleGetResponse.newBuilder() to construct.
  private AuthRoleGetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthRoleGetResponse() {
    perm_ = java.util.Collections.emptyList();
  }
  private AuthRoleGetResponse(
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
              perm_ = new java.util.ArrayList<Permission>();
              mutable_bitField0_ |= 0x00000002;
            }
            perm_.add(
                input.readMessage(Permission.parser(), extensionRegistry));
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
        perm_ = java.util.Collections.unmodifiableList(perm_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EtcdProto.internal_static_etcdserverpb_AuthRoleGetResponse_descriptor;
  }

  public static AuthRoleGetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AuthRoleGetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AuthRoleGetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AuthRoleGetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AuthRoleGetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AuthRoleGetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AuthRoleGetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static AuthRoleGetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static AuthRoleGetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static AuthRoleGetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static AuthRoleGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static AuthRoleGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(AuthRoleGetResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static AuthRoleGetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<AuthRoleGetResponse> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_AuthRoleGetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AuthRoleGetResponse.class, Builder.class);
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
   * <code>repeated .authpb.Permission perm = 2;</code>
   */
  public java.util.List<Permission> getPermList() {
    return perm_;
  }

  /**
   * <code>repeated .authpb.Permission perm = 2;</code>
   */
  public java.util.List<? extends PermissionOrBuilder>
      getPermOrBuilderList() {
    return perm_;
  }

  /**
   * <code>repeated .authpb.Permission perm = 2;</code>
   */
  public int getPermCount() {
    return perm_.size();
  }

  /**
   * <code>repeated .authpb.Permission perm = 2;</code>
   */
  public Permission getPerm(int index) {
    return perm_.get(index);
  }

  /**
   * <code>repeated .authpb.Permission perm = 2;</code>
   */
  public PermissionOrBuilder getPermOrBuilder(
      int index) {
    return perm_.get(index);
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
    for (int i = 0; i < perm_.size(); i++) {
      output.writeMessage(2, perm_.get(i));
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
    for (int i = 0; i < perm_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, perm_.get(i));
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
    if (!(obj instanceof AuthRoleGetResponse)) {
      return super.equals(obj);
    }
    AuthRoleGetResponse other = (AuthRoleGetResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getPermList()
        .equals(other.getPermList());
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
    if (getPermCount() > 0) {
      hash = (37 * hash) + PERM_FIELD_NUMBER;
      hash = (53 * hash) + getPermList().hashCode();
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
  public com.google.protobuf.Parser<AuthRoleGetResponse> getParserForType() {
    return PARSER;
  }

  public AuthRoleGetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.AuthRoleGetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AuthRoleGetResponse)
      AuthRoleGetResponseOrBuilder {
    private int bitField0_;
    private ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHeader, ResponseHeader.Builder, ResponseHeaderOrBuilder> headerBuilder_;
    private java.util.List<Permission> perm_ =
      java.util.Collections.emptyList();
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Permission, Permission.Builder, PermissionOrBuilder> permBuilder_;
    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.AuthRoleGetResponse.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_AuthRoleGetResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_AuthRoleGetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuthRoleGetResponse.class, Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPermFieldBuilder();
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
      if (permBuilder_ == null) {
        perm_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        permBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_AuthRoleGetResponse_descriptor;
    }

    public AuthRoleGetResponse getDefaultInstanceForType() {
      return AuthRoleGetResponse.getDefaultInstance();
    }

    public AuthRoleGetResponse build() {
      AuthRoleGetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AuthRoleGetResponse buildPartial() {
      AuthRoleGetResponse result = new AuthRoleGetResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (permBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          perm_ = java.util.Collections.unmodifiableList(perm_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.perm_ = perm_;
      } else {
        result.perm_ = permBuilder_.build();
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
      if (other instanceof AuthRoleGetResponse) {
        return mergeFrom((AuthRoleGetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AuthRoleGetResponse other) {
      if (other == AuthRoleGetResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (permBuilder_ == null) {
        if (!other.perm_.isEmpty()) {
          if (perm_.isEmpty()) {
            perm_ = other.perm_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePermIsMutable();
            perm_.addAll(other.perm_);
          }
          onChanged();
        }
      } else {
        if (!other.perm_.isEmpty()) {
          if (permBuilder_.isEmpty()) {
            permBuilder_.dispose();
            permBuilder_ = null;
            perm_ = other.perm_;
            bitField0_ = (bitField0_ & ~0x00000002);
            permBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPermFieldBuilder() : null;
          } else {
            permBuilder_.addAllMessages(other.perm_);
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
      AuthRoleGetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AuthRoleGetResponse) e.getUnfinishedMessage();
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

    private void ensurePermIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        perm_ = new java.util.ArrayList<Permission>(perm_);
        bitField0_ |= 0x00000002;
       }
    }

    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public java.util.List<Permission> getPermList() {
      if (permBuilder_ == null) {
        return java.util.Collections.unmodifiableList(perm_);
      } else {
        return permBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public int getPermCount() {
      if (permBuilder_ == null) {
        return perm_.size();
      } else {
        return permBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Permission getPerm(int index) {
      if (permBuilder_ == null) {
        return perm_.get(index);
      } else {
        return permBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder setPerm(
        int index, Permission value) {
      if (permBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermIsMutable();
        perm_.set(index, value);
        onChanged();
      } else {
        permBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder setPerm(
        int index, Permission.Builder builderForValue) {
      if (permBuilder_ == null) {
        ensurePermIsMutable();
        perm_.set(index, builderForValue.build());
        onChanged();
      } else {
        permBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder addPerm(Permission value) {
      if (permBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermIsMutable();
        perm_.add(value);
        onChanged();
      } else {
        permBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder addPerm(
        int index, Permission value) {
      if (permBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermIsMutable();
        perm_.add(index, value);
        onChanged();
      } else {
        permBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder addPerm(
        Permission.Builder builderForValue) {
      if (permBuilder_ == null) {
        ensurePermIsMutable();
        perm_.add(builderForValue.build());
        onChanged();
      } else {
        permBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder addPerm(
        int index, Permission.Builder builderForValue) {
      if (permBuilder_ == null) {
        ensurePermIsMutable();
        perm_.add(index, builderForValue.build());
        onChanged();
      } else {
        permBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder addAllPerm(
        Iterable<? extends Permission> values) {
      if (permBuilder_ == null) {
        ensurePermIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, perm_);
        onChanged();
      } else {
        permBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder clearPerm() {
      if (permBuilder_ == null) {
        perm_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        permBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Builder removePerm(int index) {
      if (permBuilder_ == null) {
        ensurePermIsMutable();
        perm_.remove(index);
        onChanged();
      } else {
        permBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Permission.Builder getPermBuilder(
        int index) {
      return getPermFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public PermissionOrBuilder getPermOrBuilder(
        int index) {
      if (permBuilder_ == null) {
        return perm_.get(index);  } else {
        return permBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public java.util.List<? extends PermissionOrBuilder>
         getPermOrBuilderList() {
      if (permBuilder_ != null) {
        return permBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(perm_);
      }
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Permission.Builder addPermBuilder() {
      return getPermFieldBuilder().addBuilder(
          Permission.getDefaultInstance());
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public Permission.Builder addPermBuilder(
        int index) {
      return getPermFieldBuilder().addBuilder(
          index, Permission.getDefaultInstance());
    }
    /**
     * <code>repeated .authpb.Permission perm = 2;</code>
     */
    public java.util.List<Permission.Builder>
         getPermBuilderList() {
      return getPermFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Permission, Permission.Builder, PermissionOrBuilder>
        getPermFieldBuilder() {
      if (permBuilder_ == null) {
        permBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Permission, Permission.Builder, PermissionOrBuilder>(
                perm_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        perm_ = null;
      }
      return permBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AuthRoleGetResponse)
  }

}

