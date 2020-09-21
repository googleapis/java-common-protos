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
// source: google/api/source_info.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * Source information used to create a Service Config
 * </pre>
 *
 * Protobuf type {@code google.api.SourceInfo}
 */
public final class SourceInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.SourceInfo)
    SourceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceInfo.newBuilder() to construct.
  private SourceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceInfo() {
    sourceFiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SourceInfo(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sourceFiles_ = new java.util.ArrayList<com.google.protobuf.Any>();
                mutable_bitField0_ |= 0x00000001;
              }
              sourceFiles_.add(
                  input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        sourceFiles_ = java.util.Collections.unmodifiableList(sourceFiles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.SourceInfo.class, com.google.api.SourceInfo.Builder.class);
  }

  public static final int SOURCE_FILES_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.Any> sourceFiles_;
  /**
   *
   *
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getSourceFilesList() {
    return sourceFiles_;
  }
  /**
   *
   *
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> getSourceFilesOrBuilderList() {
    return sourceFiles_;
  }
  /**
   *
   *
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  @java.lang.Override
  public int getSourceFilesCount() {
    return sourceFiles_.size();
  }
  /**
   *
   *
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getSourceFiles(int index) {
    return sourceFiles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getSourceFilesOrBuilder(int index) {
    return sourceFiles_.get(index);
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
    for (int i = 0; i < sourceFiles_.size(); i++) {
      output.writeMessage(1, sourceFiles_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sourceFiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, sourceFiles_.get(i));
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
    if (!(obj instanceof com.google.api.SourceInfo)) {
      return super.equals(obj);
    }
    com.google.api.SourceInfo other = (com.google.api.SourceInfo) obj;

    if (!getSourceFilesList().equals(other.getSourceFilesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSourceFilesCount() > 0) {
      hash = (37 * hash) + SOURCE_FILES_FIELD_NUMBER;
      hash = (53 * hash) + getSourceFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.SourceInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.SourceInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.SourceInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.SourceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.SourceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.SourceInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.SourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.SourceInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.SourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.SourceInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.SourceInfo parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.SourceInfo parseFrom(
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

  public static Builder newBuilder(com.google.api.SourceInfo prototype) {
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
   * Source information used to create a Service Config
   * </pre>
   *
   * Protobuf type {@code google.api.SourceInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.SourceInfo)
      com.google.api.SourceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.SourceInfo.class, com.google.api.SourceInfo.Builder.class);
    }

    // Construct using com.google.api.SourceInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSourceFilesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sourceFilesBuilder_ == null) {
        sourceFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sourceFilesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.api.SourceInfo getDefaultInstanceForType() {
      return com.google.api.SourceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.SourceInfo build() {
      com.google.api.SourceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.SourceInfo buildPartial() {
      com.google.api.SourceInfo result = new com.google.api.SourceInfo(this);
      int from_bitField0_ = bitField0_;
      if (sourceFilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sourceFiles_ = java.util.Collections.unmodifiableList(sourceFiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sourceFiles_ = sourceFiles_;
      } else {
        result.sourceFiles_ = sourceFilesBuilder_.build();
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
      if (other instanceof com.google.api.SourceInfo) {
        return mergeFrom((com.google.api.SourceInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.SourceInfo other) {
      if (other == com.google.api.SourceInfo.getDefaultInstance()) return this;
      if (sourceFilesBuilder_ == null) {
        if (!other.sourceFiles_.isEmpty()) {
          if (sourceFiles_.isEmpty()) {
            sourceFiles_ = other.sourceFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSourceFilesIsMutable();
            sourceFiles_.addAll(other.sourceFiles_);
          }
          onChanged();
        }
      } else {
        if (!other.sourceFiles_.isEmpty()) {
          if (sourceFilesBuilder_.isEmpty()) {
            sourceFilesBuilder_.dispose();
            sourceFilesBuilder_ = null;
            sourceFiles_ = other.sourceFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sourceFilesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSourceFilesFieldBuilder()
                    : null;
          } else {
            sourceFilesBuilder_.addAllMessages(other.sourceFiles_);
          }
        }
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
      com.google.api.SourceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.SourceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.protobuf.Any> sourceFiles_ =
        java.util.Collections.emptyList();

    private void ensureSourceFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sourceFiles_ = new java.util.ArrayList<com.google.protobuf.Any>(sourceFiles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any,
            com.google.protobuf.Any.Builder,
            com.google.protobuf.AnyOrBuilder>
        sourceFilesBuilder_;

    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public java.util.List<com.google.protobuf.Any> getSourceFilesList() {
      if (sourceFilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sourceFiles_);
      } else {
        return sourceFilesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public int getSourceFilesCount() {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.size();
      } else {
        return sourceFilesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public com.google.protobuf.Any getSourceFiles(int index) {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.get(index);
      } else {
        return sourceFilesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder setSourceFiles(int index, com.google.protobuf.Any value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.set(index, value);
        onChanged();
      } else {
        sourceFilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder setSourceFiles(int index, com.google.protobuf.Any.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(com.google.protobuf.Any value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.add(value);
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(int index, com.google.protobuf.Any value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.add(index, value);
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(com.google.protobuf.Any.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.add(builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(int index, com.google.protobuf.Any.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addAllSourceFiles(java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, sourceFiles_);
        onChanged();
      } else {
        sourceFilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder clearSourceFiles() {
      if (sourceFilesBuilder_ == null) {
        sourceFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sourceFilesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder removeSourceFiles(int index) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.remove(index);
        onChanged();
      } else {
        sourceFilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public com.google.protobuf.Any.Builder getSourceFilesBuilder(int index) {
      return getSourceFilesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public com.google.protobuf.AnyOrBuilder getSourceFilesOrBuilder(int index) {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.get(index);
      } else {
        return sourceFilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder>
        getSourceFilesOrBuilderList() {
      if (sourceFilesBuilder_ != null) {
        return sourceFilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sourceFiles_);
      }
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public com.google.protobuf.Any.Builder addSourceFilesBuilder() {
      return getSourceFilesFieldBuilder().addBuilder(com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public com.google.protobuf.Any.Builder addSourceFilesBuilder(int index) {
      return getSourceFilesFieldBuilder()
          .addBuilder(index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> getSourceFilesBuilderList() {
      return getSourceFilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any,
            com.google.protobuf.Any.Builder,
            com.google.protobuf.AnyOrBuilder>
        getSourceFilesFieldBuilder() {
      if (sourceFilesBuilder_ == null) {
        sourceFilesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.protobuf.Any,
                com.google.protobuf.Any.Builder,
                com.google.protobuf.AnyOrBuilder>(
                sourceFiles_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        sourceFiles_ = null;
      }
      return sourceFilesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.SourceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.api.SourceInfo)
  private static final com.google.api.SourceInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.SourceInfo();
  }

  public static com.google.api.SourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceInfo> PARSER =
      new com.google.protobuf.AbstractParser<SourceInfo>() {
        @java.lang.Override
        public SourceInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SourceInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SourceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.SourceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
