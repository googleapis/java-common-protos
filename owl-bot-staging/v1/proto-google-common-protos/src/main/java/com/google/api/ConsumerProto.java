// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package com.google.api;

public final class ConsumerProto {
  private ConsumerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_ProjectProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_ProjectProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Property_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Property_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/api/consumer.proto\022\ngoogle.api\"" +
      "=\n\021ProjectProperties\022(\n\nproperties\030\001 \003(\013" +
      "2\024.google.api.Property\"\254\001\n\010Property\022\014\n\004n" +
      "ame\030\001 \001(\t\022/\n\004type\030\002 \001(\0162!.google.api.Pro" +
      "perty.PropertyType\022\023\n\013description\030\003 \001(\t\"" +
      "L\n\014PropertyType\022\017\n\013UNSPECIFIED\020\000\022\t\n\005INT6" +
      "4\020\001\022\010\n\004BOOL\020\002\022\n\n\006STRING\020\003\022\n\n\006DOUBLE\020\004Bh\n" +
      "\016com.google.apiB\rConsumerProtoP\001ZEgoogle" +
      ".golang.org/genproto/googleapis/api/serv" +
      "iceconfig;serviceconfigb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_ProjectProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_ProjectProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_ProjectProperties_descriptor,
        new java.lang.String[] { "Properties", });
    internal_static_google_api_Property_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_Property_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Property_descriptor,
        new java.lang.String[] { "Name", "Type", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
