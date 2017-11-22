// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.AuthRoleGrantPermissionRequest}
 */
public  final class AuthRoleGrantPermissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AuthRoleGrantPermissionRequest)
    AuthRoleGrantPermissionRequestOrBuilder {
  public static final int NAME_FIELD_NUMBER = 1;
  public static final int PERM_FIELD_NUMBER = 2;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.AuthRoleGrantPermissionRequest)
  private static final AuthRoleGrantPermissionRequest DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<AuthRoleGrantPermissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthRoleGrantPermissionRequest>() {
    public AuthRoleGrantPermissionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthRoleGrantPermissionRequest(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new AuthRoleGrantPermissionRequest();
  }

  private volatile Object name_;
  private Permission perm_;
  private byte memoizedIsInitialized = -1;
  // Use AuthRoleGrantPermissionRequest.newBuilder() to construct.
  private AuthRoleGrantPermissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthRoleGrantPermissionRequest() {
    name_ = "";
  }

  private AuthRoleGrantPermissionRequest(
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
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            Permission.Builder subBuilder = null;
            if (perm_ != null) {
              subBuilder = perm_.toBuilder();
            }
            perm_ = input.readMessage(Permission.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(perm_);
              perm_ = subBuilder.buildPartial();
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
    return EtcdProto.internal_static_etcdserverpb_AuthRoleGrantPermissionRequest_descriptor;
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static AuthRoleGrantPermissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static AuthRoleGrantPermissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static AuthRoleGrantPermissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(AuthRoleGrantPermissionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static AuthRoleGrantPermissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<AuthRoleGrantPermissionRequest> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_AuthRoleGrantPermissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AuthRoleGrantPermissionRequest.class, Builder.class);
  }

  /**
   * <pre>
   * name is the name of the role which will be granted the permission.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   * <pre>
   * name is the name of the role which will be granted the permission.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <pre>
   * perm is the permission to grant to the role.
   * </pre>
   *
   * <code>.authpb.Permission perm = 2;</code>
   */
  public boolean hasPerm() {
    return perm_ != null;
  }

  /**
   * <pre>
   * perm is the permission to grant to the role.
   * </pre>
   *
   * <code>.authpb.Permission perm = 2;</code>
   */
  public Permission getPerm() {
    return perm_ == null ? Permission.getDefaultInstance() : perm_;
  }

  /**
   * <pre>
   * perm is the permission to grant to the role.
   * </pre>
   *
   * <code>.authpb.Permission perm = 2;</code>
   */
  public PermissionOrBuilder getPermOrBuilder() {
    return getPerm();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (perm_ != null) {
      output.writeMessage(2, getPerm());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (perm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPerm());
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
    if (!(obj instanceof AuthRoleGrantPermissionRequest)) {
      return super.equals(obj);
    }
    AuthRoleGrantPermissionRequest other = (AuthRoleGrantPermissionRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasPerm() == other.hasPerm());
    if (hasPerm()) {
      result = result && getPerm()
          .equals(other.getPerm());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPerm()) {
      hash = (37 * hash) + PERM_FIELD_NUMBER;
      hash = (53 * hash) + getPerm().hashCode();
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
  public com.google.protobuf.Parser<AuthRoleGrantPermissionRequest> getParserForType() {
    return PARSER;
  }

  public AuthRoleGrantPermissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code etcdserverpb.AuthRoleGrantPermissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AuthRoleGrantPermissionRequest)
      AuthRoleGrantPermissionRequestOrBuilder {
    private Object name_ = "";
    private Permission perm_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Permission, Permission.Builder, PermissionOrBuilder> permBuilder_;

    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.AuthRoleGrantPermissionRequest.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_AuthRoleGrantPermissionRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_AuthRoleGrantPermissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuthRoleGrantPermissionRequest.class, Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      name_ = "";

      if (permBuilder_ == null) {
        perm_ = null;
      } else {
        perm_ = null;
        permBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_AuthRoleGrantPermissionRequest_descriptor;
    }

    public AuthRoleGrantPermissionRequest getDefaultInstanceForType() {
      return AuthRoleGrantPermissionRequest.getDefaultInstance();
    }

    public AuthRoleGrantPermissionRequest build() {
      AuthRoleGrantPermissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AuthRoleGrantPermissionRequest buildPartial() {
      AuthRoleGrantPermissionRequest result = new AuthRoleGrantPermissionRequest(this);
      result.name_ = name_;
      if (permBuilder_ == null) {
        result.perm_ = perm_;
      } else {
        result.perm_ = permBuilder_.build();
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
      if (other instanceof AuthRoleGrantPermissionRequest) {
        return mergeFrom((AuthRoleGrantPermissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AuthRoleGrantPermissionRequest other) {
      if (other == AuthRoleGrantPermissionRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasPerm()) {
        mergePerm(other.getPerm());
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
      AuthRoleGrantPermissionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AuthRoleGrantPermissionRequest) e.getUnfinishedMessage();
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
     * name is the name of the role which will be granted the permission.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }

    /**
     * <pre>
     * name is the name of the role which will be granted the permission.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * name is the name of the role which will be granted the permission.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <pre>
     * name is the name of the role which will be granted the permission.
     * </pre>
     *
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

    /**
     * <pre>
     * name is the name of the role which will be granted the permission.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }

    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public boolean hasPerm() {
      return permBuilder_ != null || perm_ != null;
    }
    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public Permission getPerm() {
      if (permBuilder_ == null) {
        return perm_ == null ? Permission.getDefaultInstance() : perm_;
      } else {
        return permBuilder_.getMessage();
      }
    }

    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public Builder setPerm(
        Permission.Builder builderForValue) {
      if (permBuilder_ == null) {
        perm_ = builderForValue.build();
        onChanged();
      } else {
        permBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public Builder setPerm(Permission value) {
      if (permBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        perm_ = value;
        onChanged();
      } else {
        permBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public Builder mergePerm(Permission value) {
      if (permBuilder_ == null) {
        if (perm_ != null) {
          perm_ =
            Permission.newBuilder(perm_).mergeFrom(value).buildPartial();
        } else {
          perm_ = value;
        }
        onChanged();
      } else {
        permBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public Builder clearPerm() {
      if (permBuilder_ == null) {
        perm_ = null;
        onChanged();
      } else {
        perm_ = null;
        permBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public Permission.Builder getPermBuilder() {

      onChanged();
      return getPermFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    public PermissionOrBuilder getPermOrBuilder() {
      if (permBuilder_ != null) {
        return permBuilder_.getMessageOrBuilder();
      } else {
        return perm_ == null ?
            Permission.getDefaultInstance() : perm_;
      }
    }
    /**
     * <pre>
     * perm is the permission to grant to the role.
     * </pre>
     *
     * <code>.authpb.Permission perm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Permission, Permission.Builder, PermissionOrBuilder>
        getPermFieldBuilder() {
      if (permBuilder_ == null) {
        permBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Permission, Permission.Builder, PermissionOrBuilder>(
                getPerm(),
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AuthRoleGrantPermissionRequest)
  }

}

