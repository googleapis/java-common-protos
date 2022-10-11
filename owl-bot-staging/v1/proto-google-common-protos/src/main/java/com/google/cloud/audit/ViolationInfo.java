// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

/**
 * <pre>
 * Provides information about the Policy violation info for this request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.audit.ViolationInfo}
 */
public final class ViolationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.audit.ViolationInfo)
    ViolationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ViolationInfo.newBuilder() to construct.
  private ViolationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ViolationInfo() {
    constraint_ = "";
    errorMessage_ = "";
    checkedValue_ = "";
    policyType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ViolationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.audit.ViolationInfo.class, com.google.cloud.audit.ViolationInfo.Builder.class);
  }

  /**
   * <pre>
   * Policy Type enum
   * </pre>
   *
   * Protobuf enum {@code google.cloud.audit.ViolationInfo.PolicyType}
   */
  public enum PolicyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value. This value should not be used.
     * </pre>
     *
     * <code>POLICY_TYPE_UNSPECIFIED = 0;</code>
     */
    POLICY_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Indicates boolean policy constraint
     * </pre>
     *
     * <code>BOOLEAN_CONSTRAINT = 1;</code>
     */
    BOOLEAN_CONSTRAINT(1),
    /**
     * <pre>
     * Indicates list policy constraint
     * </pre>
     *
     * <code>LIST_CONSTRAINT = 2;</code>
     */
    LIST_CONSTRAINT(2),
    /**
     * <pre>
     * Indicates custom policy constraint
     * </pre>
     *
     * <code>CUSTOM_CONSTRAINT = 3;</code>
     */
    CUSTOM_CONSTRAINT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value. This value should not be used.
     * </pre>
     *
     * <code>POLICY_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int POLICY_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Indicates boolean policy constraint
     * </pre>
     *
     * <code>BOOLEAN_CONSTRAINT = 1;</code>
     */
    public static final int BOOLEAN_CONSTRAINT_VALUE = 1;
    /**
     * <pre>
     * Indicates list policy constraint
     * </pre>
     *
     * <code>LIST_CONSTRAINT = 2;</code>
     */
    public static final int LIST_CONSTRAINT_VALUE = 2;
    /**
     * <pre>
     * Indicates custom policy constraint
     * </pre>
     *
     * <code>CUSTOM_CONSTRAINT = 3;</code>
     */
    public static final int CUSTOM_CONSTRAINT_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PolicyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PolicyType forNumber(int value) {
      switch (value) {
        case 0: return POLICY_TYPE_UNSPECIFIED;
        case 1: return BOOLEAN_CONSTRAINT;
        case 2: return LIST_CONSTRAINT;
        case 3: return CUSTOM_CONSTRAINT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PolicyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PolicyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PolicyType>() {
            public PolicyType findValueByNumber(int number) {
              return PolicyType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.audit.ViolationInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final PolicyType[] VALUES = values();

    public static PolicyType valueOf(
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

    private PolicyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.audit.ViolationInfo.PolicyType)
  }

  public static final int CONSTRAINT_FIELD_NUMBER = 1;
  private volatile java.lang.Object constraint_;
  /**
   * <pre>
   * Optional. Constraint name
   * </pre>
   *
   * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The constraint.
   */
  @java.lang.Override
  public java.lang.String getConstraint() {
    java.lang.Object ref = constraint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      constraint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Constraint name
   * </pre>
   *
   * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for constraint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConstraintBytes() {
    java.lang.Object ref = constraint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      constraint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object errorMessage_;
  /**
   * <pre>
   * Optional. Error message that policy is indicating.
   * </pre>
   *
   * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The errorMessage.
   */
  @java.lang.Override
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Error message that policy is indicating.
   * </pre>
   *
   * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for errorMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECKED_VALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object checkedValue_;
  /**
   * <pre>
   * Optional. Value that is being checked for the policy.
   * This could be in encrypted form (if pii sensitive).
   * This field will only be emitted in LIST_POLICY types
   * </pre>
   *
   * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The checkedValue.
   */
  @java.lang.Override
  public java.lang.String getCheckedValue() {
    java.lang.Object ref = checkedValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkedValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Value that is being checked for the policy.
   * This could be in encrypted form (if pii sensitive).
   * This field will only be emitted in LIST_POLICY types
   * </pre>
   *
   * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for checkedValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCheckedValueBytes() {
    java.lang.Object ref = checkedValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkedValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_TYPE_FIELD_NUMBER = 4;
  private int policyType_;
  /**
   * <pre>
   * Optional. Indicates the type of the policy.
   * </pre>
   *
   * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for policyType.
   */
  @java.lang.Override public int getPolicyTypeValue() {
    return policyType_;
  }
  /**
   * <pre>
   * Optional. Indicates the type of the policy.
   * </pre>
   *
   * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The policyType.
   */
  @java.lang.Override public com.google.cloud.audit.ViolationInfo.PolicyType getPolicyType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.audit.ViolationInfo.PolicyType result = com.google.cloud.audit.ViolationInfo.PolicyType.valueOf(policyType_);
    return result == null ? com.google.cloud.audit.ViolationInfo.PolicyType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(constraint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, constraint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkedValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, checkedValue_);
    }
    if (policyType_ != com.google.cloud.audit.ViolationInfo.PolicyType.POLICY_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, policyType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(constraint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, constraint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkedValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, checkedValue_);
    }
    if (policyType_ != com.google.cloud.audit.ViolationInfo.PolicyType.POLICY_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, policyType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.audit.ViolationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.audit.ViolationInfo other = (com.google.cloud.audit.ViolationInfo) obj;

    if (!getConstraint()
        .equals(other.getConstraint())) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
    if (!getCheckedValue()
        .equals(other.getCheckedValue())) return false;
    if (policyType_ != other.policyType_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONSTRAINT_FIELD_NUMBER;
    hash = (53 * hash) + getConstraint().hashCode();
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (37 * hash) + CHECKED_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getCheckedValue().hashCode();
    hash = (37 * hash) + POLICY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + policyType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.audit.ViolationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.audit.ViolationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.ViolationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.ViolationInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.audit.ViolationInfo prototype) {
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
   * <pre>
   * Provides information about the Policy violation info for this request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.audit.ViolationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.audit.ViolationInfo)
      com.google.cloud.audit.ViolationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.audit.ViolationInfo.class, com.google.cloud.audit.ViolationInfo.Builder.class);
    }

    // Construct using com.google.cloud.audit.ViolationInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      constraint_ = "";

      errorMessage_ = "";

      checkedValue_ = "";

      policyType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.audit.ViolationInfo getDefaultInstanceForType() {
      return com.google.cloud.audit.ViolationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.audit.ViolationInfo build() {
      com.google.cloud.audit.ViolationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.audit.ViolationInfo buildPartial() {
      com.google.cloud.audit.ViolationInfo result = new com.google.cloud.audit.ViolationInfo(this);
      result.constraint_ = constraint_;
      result.errorMessage_ = errorMessage_;
      result.checkedValue_ = checkedValue_;
      result.policyType_ = policyType_;
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
      if (other instanceof com.google.cloud.audit.ViolationInfo) {
        return mergeFrom((com.google.cloud.audit.ViolationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.audit.ViolationInfo other) {
      if (other == com.google.cloud.audit.ViolationInfo.getDefaultInstance()) return this;
      if (!other.getConstraint().isEmpty()) {
        constraint_ = other.constraint_;
        onChanged();
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (!other.getCheckedValue().isEmpty()) {
        checkedValue_ = other.checkedValue_;
        onChanged();
      }
      if (other.policyType_ != 0) {
        setPolicyTypeValue(other.getPolicyTypeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              constraint_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              errorMessage_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              checkedValue_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 32: {
              policyType_ = input.readEnum();

              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object constraint_ = "";
    /**
     * <pre>
     * Optional. Constraint name
     * </pre>
     *
     * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The constraint.
     */
    public java.lang.String getConstraint() {
      java.lang.Object ref = constraint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        constraint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Constraint name
     * </pre>
     *
     * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for constraint.
     */
    public com.google.protobuf.ByteString
        getConstraintBytes() {
      java.lang.Object ref = constraint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        constraint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Constraint name
     * </pre>
     *
     * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The constraint to set.
     * @return This builder for chaining.
     */
    public Builder setConstraint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      constraint_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Constraint name
     * </pre>
     *
     * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearConstraint() {
      
      constraint_ = getDefaultInstance().getConstraint();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Constraint name
     * </pre>
     *
     * <code>string constraint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for constraint to set.
     * @return This builder for chaining.
     */
    public Builder setConstraintBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      constraint_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <pre>
     * Optional. Error message that policy is indicating.
     * </pre>
     *
     * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The errorMessage.
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Error message that policy is indicating.
     * </pre>
     *
     * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for errorMessage.
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Error message that policy is indicating.
     * </pre>
     *
     * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Error message that policy is indicating.
     * </pre>
     *
     * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Error message that policy is indicating.
     * </pre>
     *
     * <code>string error_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object checkedValue_ = "";
    /**
     * <pre>
     * Optional. Value that is being checked for the policy.
     * This could be in encrypted form (if pii sensitive).
     * This field will only be emitted in LIST_POLICY types
     * </pre>
     *
     * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The checkedValue.
     */
    public java.lang.String getCheckedValue() {
      java.lang.Object ref = checkedValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkedValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Value that is being checked for the policy.
     * This could be in encrypted form (if pii sensitive).
     * This field will only be emitted in LIST_POLICY types
     * </pre>
     *
     * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for checkedValue.
     */
    public com.google.protobuf.ByteString
        getCheckedValueBytes() {
      java.lang.Object ref = checkedValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkedValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Value that is being checked for the policy.
     * This could be in encrypted form (if pii sensitive).
     * This field will only be emitted in LIST_POLICY types
     * </pre>
     *
     * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The checkedValue to set.
     * @return This builder for chaining.
     */
    public Builder setCheckedValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkedValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Value that is being checked for the policy.
     * This could be in encrypted form (if pii sensitive).
     * This field will only be emitted in LIST_POLICY types
     * </pre>
     *
     * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearCheckedValue() {
      
      checkedValue_ = getDefaultInstance().getCheckedValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Value that is being checked for the policy.
     * This could be in encrypted form (if pii sensitive).
     * This field will only be emitted in LIST_POLICY types
     * </pre>
     *
     * <code>string checked_value = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for checkedValue to set.
     * @return This builder for chaining.
     */
    public Builder setCheckedValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkedValue_ = value;
      onChanged();
      return this;
    }

    private int policyType_ = 0;
    /**
     * <pre>
     * Optional. Indicates the type of the policy.
     * </pre>
     *
     * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The enum numeric value on the wire for policyType.
     */
    @java.lang.Override public int getPolicyTypeValue() {
      return policyType_;
    }
    /**
     * <pre>
     * Optional. Indicates the type of the policy.
     * </pre>
     *
     * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The enum numeric value on the wire for policyType to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyTypeValue(int value) {
      
      policyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Indicates the type of the policy.
     * </pre>
     *
     * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The policyType.
     */
    @java.lang.Override
    public com.google.cloud.audit.ViolationInfo.PolicyType getPolicyType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.audit.ViolationInfo.PolicyType result = com.google.cloud.audit.ViolationInfo.PolicyType.valueOf(policyType_);
      return result == null ? com.google.cloud.audit.ViolationInfo.PolicyType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. Indicates the type of the policy.
     * </pre>
     *
     * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The policyType to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyType(com.google.cloud.audit.ViolationInfo.PolicyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      policyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Indicates the type of the policy.
     * </pre>
     *
     * <code>.google.cloud.audit.ViolationInfo.PolicyType policy_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPolicyType() {
      
      policyType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.audit.ViolationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.audit.ViolationInfo)
  private static final com.google.cloud.audit.ViolationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.audit.ViolationInfo();
  }

  public static com.google.cloud.audit.ViolationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViolationInfo>
      PARSER = new com.google.protobuf.AbstractParser<ViolationInfo>() {
    @java.lang.Override
    public ViolationInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ViolationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ViolationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.audit.ViolationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

