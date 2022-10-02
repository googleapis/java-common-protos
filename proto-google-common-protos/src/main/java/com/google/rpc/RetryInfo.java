/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 *
 *
 * <pre>
 * Describes when the clients can retry a failed request. Clients could ignore
 * the recommendation here or retry when this information is missing from error
 * responses.
 * It's always recommended that clients should use exponential backoff when
 * retrying.
 * Clients should wait until `retry_delay` amount of time has passed since
 * receiving the error response before retrying.  If retrying requests also
 * fail, clients should use an exponential backoff scheme to gradually increase
 * the delay between retries based on `retry_delay`, until either a maximum
 * number of retries have been reached or a maximum retry delay cap has been
 * reached.
 * </pre>
 *
 * Protobuf type {@code google.rpc.RetryInfo}
 */
public final class RetryInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.rpc.RetryInfo)
    RetryInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetryInfo.newBuilder() to construct.
  private RetryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetryInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetryInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.rpc.RetryInfo.class, com.google.rpc.RetryInfo.Builder.class);
  }

  public static final int RETRY_DELAY_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retryDelay_;
  /**
   *
   *
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   *
   * @return Whether the retryDelay field is set.
   */
  @java.lang.Override
  public boolean hasRetryDelay() {
    return retryDelay_ != null;
  }
  /**
   *
   *
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   *
   * @return The retryDelay.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   *
   *
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
    return getRetryDelay();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (retryDelay_ != null) {
      output.writeMessage(1, getRetryDelay());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retryDelay_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRetryDelay());
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
    if (!(obj instanceof com.google.rpc.RetryInfo)) {
      return super.equals(obj);
    }
    com.google.rpc.RetryInfo other = (com.google.rpc.RetryInfo) obj;

    if (hasRetryDelay() != other.hasRetryDelay()) return false;
    if (hasRetryDelay()) {
      if (!getRetryDelay().equals(other.getRetryDelay())) return false;
    }
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
    if (hasRetryDelay()) {
      hash = (37 * hash) + RETRY_DELAY_FIELD_NUMBER;
      hash = (53 * hash) + getRetryDelay().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.rpc.RetryInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.rpc.RetryInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.rpc.RetryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.rpc.RetryInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.rpc.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.rpc.RetryInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.rpc.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.rpc.RetryInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.rpc.RetryInfo parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.rpc.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.rpc.RetryInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Describes when the clients can retry a failed request. Clients could ignore
   * the recommendation here or retry when this information is missing from error
   * responses.
   * It's always recommended that clients should use exponential backoff when
   * retrying.
   * Clients should wait until `retry_delay` amount of time has passed since
   * receiving the error response before retrying.  If retrying requests also
   * fail, clients should use an exponential backoff scheme to gradually increase
   * the delay between retries based on `retry_delay`, until either a maximum
   * number of retries have been reached or a maximum retry delay cap has been
   * reached.
   * </pre>
   *
   * Protobuf type {@code google.rpc.RetryInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.rpc.RetryInfo)
      com.google.rpc.RetryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.rpc.ErrorDetailsProto
          .internal_static_google_rpc_RetryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.rpc.RetryInfo.class, com.google.rpc.RetryInfo.Builder.class);
    }

    // Construct using com.google.rpc.RetryInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
    }

    @java.lang.Override
    public com.google.rpc.RetryInfo getDefaultInstanceForType() {
      return com.google.rpc.RetryInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.rpc.RetryInfo build() {
      com.google.rpc.RetryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.rpc.RetryInfo buildPartial() {
      com.google.rpc.RetryInfo result = new com.google.rpc.RetryInfo(this);
      if (retryDelayBuilder_ == null) {
        result.retryDelay_ = retryDelay_;
      } else {
        result.retryDelay_ = retryDelayBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.rpc.RetryInfo) {
        return mergeFrom((com.google.rpc.RetryInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.rpc.RetryInfo other) {
      if (other == com.google.rpc.RetryInfo.getDefaultInstance()) return this;
      if (other.hasRetryDelay()) {
        mergeRetryDelay(other.getRetryDelay());
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
            case 10:
              {
                input.readMessage(getRetryDelayFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            default:
              {
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

    private com.google.protobuf.Duration retryDelay_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        retryDelayBuilder_;
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     *
     * @return Whether the retryDelay field is set.
     */
    public boolean hasRetryDelay() {
      return retryDelayBuilder_ != null || retryDelay_ != null;
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     *
     * @return The retryDelay.
     */
    public com.google.protobuf.Duration getRetryDelay() {
      if (retryDelayBuilder_ == null) {
        return retryDelay_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : retryDelay_;
      } else {
        return retryDelayBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retryDelay_ = value;
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(com.google.protobuf.Duration.Builder builderForValue) {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = builderForValue.build();
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder mergeRetryDelay(com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (retryDelay_ != null) {
          retryDelay_ =
              com.google.protobuf.Duration.newBuilder(retryDelay_).mergeFrom(value).buildPartial();
        } else {
          retryDelay_ = value;
        }
        onChanged();
      } else {
        retryDelayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder clearRetryDelay() {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
        onChanged();
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getRetryDelayBuilder() {

      onChanged();
      return getRetryDelayFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
      if (retryDelayBuilder_ != null) {
        return retryDelayBuilder_.getMessageOrBuilder();
      } else {
        return retryDelay_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : retryDelay_;
      }
    }
    /**
     *
     *
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getRetryDelayFieldBuilder() {
      if (retryDelayBuilder_ == null) {
        retryDelayBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getRetryDelay(), getParentForChildren(), isClean());
        retryDelay_ = null;
      }
      return retryDelayBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.rpc.RetryInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.RetryInfo)
  private static final com.google.rpc.RetryInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.rpc.RetryInfo();
  }

  public static com.google.rpc.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetryInfo> PARSER =
      new com.google.protobuf.AbstractParser<RetryInfo>() {
        @java.lang.Override
        public RetryInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetryInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.rpc.RetryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
