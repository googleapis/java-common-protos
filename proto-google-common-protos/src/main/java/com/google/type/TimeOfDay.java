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
// source: google/type/timeofday.proto

package com.google.type;

/**
 *
 *
 * <pre>
 * Represents a time of day. The date and time zone are either not significant
 * or are specified elsewhere. An API may choose to allow leap seconds. Related
 * types are [google.type.Date][google.type.Date] and `google.protobuf.Timestamp`.
 * </pre>
 *
 * Protobuf type {@code google.type.TimeOfDay}
 */
public final class TimeOfDay extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.type.TimeOfDay)
    TimeOfDayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimeOfDay.newBuilder() to construct.
  private TimeOfDay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimeOfDay() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TimeOfDay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TimeOfDay(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8:
            {
              hours_ = input.readInt32();
              break;
            }
          case 16:
            {
              minutes_ = input.readInt32();
              break;
            }
          case 24:
            {
              seconds_ = input.readInt32();
              break;
            }
          case 32:
            {
              nanos_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.type.TimeOfDayProto.internal_static_google_type_TimeOfDay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.TimeOfDayProto.internal_static_google_type_TimeOfDay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.TimeOfDay.class, com.google.type.TimeOfDay.Builder.class);
  }

  public static final int HOURS_FIELD_NUMBER = 1;
  private int hours_;
  /**
   *
   *
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>int32 hours = 1;</code>
   *
   * @return The hours.
   */
  @java.lang.Override
  public int getHours() {
    return hours_;
  }

  public static final int MINUTES_FIELD_NUMBER = 2;
  private int minutes_;
  /**
   *
   *
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2;</code>
   *
   * @return The minutes.
   */
  @java.lang.Override
  public int getMinutes() {
    return minutes_;
  }

  public static final int SECONDS_FIELD_NUMBER = 3;
  private int seconds_;
  /**
   *
   *
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>int32 seconds = 3;</code>
   *
   * @return The seconds.
   */
  @java.lang.Override
  public int getSeconds() {
    return seconds_;
  }

  public static final int NANOS_FIELD_NUMBER = 4;
  private int nanos_;
  /**
   *
   *
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4;</code>
   *
   * @return The nanos.
   */
  @java.lang.Override
  public int getNanos() {
    return nanos_;
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
    if (hours_ != 0) {
      output.writeInt32(1, hours_);
    }
    if (minutes_ != 0) {
      output.writeInt32(2, minutes_);
    }
    if (seconds_ != 0) {
      output.writeInt32(3, seconds_);
    }
    if (nanos_ != 0) {
      output.writeInt32(4, nanos_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hours_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, hours_);
    }
    if (minutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, minutes_);
    }
    if (seconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, seconds_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, nanos_);
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
    if (!(obj instanceof com.google.type.TimeOfDay)) {
      return super.equals(obj);
    }
    com.google.type.TimeOfDay other = (com.google.type.TimeOfDay) obj;

    if (getHours() != other.getHours()) return false;
    if (getMinutes() != other.getMinutes()) return false;
    if (getSeconds() != other.getSeconds()) return false;
    if (getNanos() != other.getNanos()) return false;
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
    hash = (37 * hash) + HOURS_FIELD_NUMBER;
    hash = (53 * hash) + getHours();
    hash = (37 * hash) + MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getMinutes();
    hash = (37 * hash) + SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getSeconds();
    hash = (37 * hash) + NANOS_FIELD_NUMBER;
    hash = (53 * hash) + getNanos();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.TimeOfDay parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.TimeOfDay parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.TimeOfDay parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.TimeOfDay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.type.TimeOfDay parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.type.TimeOfDay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.type.TimeOfDay parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.type.TimeOfDay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.type.TimeOfDay parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.type.TimeOfDay parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.type.TimeOfDay parseFrom(
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

  public static Builder newBuilder(com.google.type.TimeOfDay prototype) {
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
   * Represents a time of day. The date and time zone are either not significant
   * or are specified elsewhere. An API may choose to allow leap seconds. Related
   * types are [google.type.Date][google.type.Date] and `google.protobuf.Timestamp`.
   * </pre>
   *
   * Protobuf type {@code google.type.TimeOfDay}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.type.TimeOfDay)
      com.google.type.TimeOfDayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.type.TimeOfDayProto.internal_static_google_type_TimeOfDay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.TimeOfDayProto.internal_static_google_type_TimeOfDay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.TimeOfDay.class, com.google.type.TimeOfDay.Builder.class);
    }

    // Construct using com.google.type.TimeOfDay.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      hours_ = 0;

      minutes_ = 0;

      seconds_ = 0;

      nanos_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.type.TimeOfDayProto.internal_static_google_type_TimeOfDay_descriptor;
    }

    @java.lang.Override
    public com.google.type.TimeOfDay getDefaultInstanceForType() {
      return com.google.type.TimeOfDay.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.type.TimeOfDay build() {
      com.google.type.TimeOfDay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.type.TimeOfDay buildPartial() {
      com.google.type.TimeOfDay result = new com.google.type.TimeOfDay(this);
      result.hours_ = hours_;
      result.minutes_ = minutes_;
      result.seconds_ = seconds_;
      result.nanos_ = nanos_;
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
      if (other instanceof com.google.type.TimeOfDay) {
        return mergeFrom((com.google.type.TimeOfDay) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.TimeOfDay other) {
      if (other == com.google.type.TimeOfDay.getDefaultInstance()) return this;
      if (other.getHours() != 0) {
        setHours(other.getHours());
      }
      if (other.getMinutes() != 0) {
        setMinutes(other.getMinutes());
      }
      if (other.getSeconds() != 0) {
        setSeconds(other.getSeconds());
      }
      if (other.getNanos() != 0) {
        setNanos(other.getNanos());
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
      com.google.type.TimeOfDay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.type.TimeOfDay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hours_;
    /**
     *
     *
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>int32 hours = 1;</code>
     *
     * @return The hours.
     */
    @java.lang.Override
    public int getHours() {
      return hours_;
    }
    /**
     *
     *
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>int32 hours = 1;</code>
     *
     * @param value The hours to set.
     * @return This builder for chaining.
     */
    public Builder setHours(int value) {

      hours_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>int32 hours = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHours() {

      hours_ = 0;
      onChanged();
      return this;
    }

    private int minutes_;
    /**
     *
     *
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>int32 minutes = 2;</code>
     *
     * @return The minutes.
     */
    @java.lang.Override
    public int getMinutes() {
      return minutes_;
    }
    /**
     *
     *
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>int32 minutes = 2;</code>
     *
     * @param value The minutes to set.
     * @return This builder for chaining.
     */
    public Builder setMinutes(int value) {

      minutes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>int32 minutes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinutes() {

      minutes_ = 0;
      onChanged();
      return this;
    }

    private int seconds_;
    /**
     *
     *
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>int32 seconds = 3;</code>
     *
     * @return The seconds.
     */
    @java.lang.Override
    public int getSeconds() {
      return seconds_;
    }
    /**
     *
     *
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>int32 seconds = 3;</code>
     *
     * @param value The seconds to set.
     * @return This builder for chaining.
     */
    public Builder setSeconds(int value) {

      seconds_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>int32 seconds = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSeconds() {

      seconds_ = 0;
      onChanged();
      return this;
    }

    private int nanos_;
    /**
     *
     *
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>int32 nanos = 4;</code>
     *
     * @return The nanos.
     */
    @java.lang.Override
    public int getNanos() {
      return nanos_;
    }
    /**
     *
     *
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>int32 nanos = 4;</code>
     *
     * @param value The nanos to set.
     * @return This builder for chaining.
     */
    public Builder setNanos(int value) {

      nanos_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>int32 nanos = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNanos() {

      nanos_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.type.TimeOfDay)
  }

  // @@protoc_insertion_point(class_scope:google.type.TimeOfDay)
  private static final com.google.type.TimeOfDay DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.type.TimeOfDay();
  }

  public static com.google.type.TimeOfDay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeOfDay> PARSER =
      new com.google.protobuf.AbstractParser<TimeOfDay>() {
        @java.lang.Override
        public TimeOfDay parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TimeOfDay(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TimeOfDay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeOfDay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.type.TimeOfDay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
