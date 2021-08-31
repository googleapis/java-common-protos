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
// source: google/api/usage.proto

package com.google.api;

public final class UsageProto {
  private UsageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Usage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Usage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_UsageRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_UsageRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/api/usage.proto\022\ngoogle.api\"j\n\005" +
      "Usage\022\024\n\014requirements\030\001 \003(\t\022$\n\005rules\030\006 \003" +
      "(\0132\025.google.api.UsageRule\022%\n\035producer_no" +
      "tification_channel\030\007 \001(\t\"]\n\tUsageRule\022\020\n" +
      "\010selector\030\001 \001(\t\022 \n\030allow_unregistered_ca" +
      "lls\030\002 \001(\010\022\034\n\024skip_service_control\030\003 \001(\010B" +
      "l\n\016com.google.apiB\nUsageProtoP\001ZEgoogle." +
      "golang.org/genproto/googleapis/api/servi" +
      "ceconfig;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_Usage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Usage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Usage_descriptor,
        new java.lang.String[] { "Requirements", "Rules", "ProducerNotificationChannel", });
    internal_static_google_api_UsageRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_UsageRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_UsageRule_descriptor,
        new java.lang.String[] { "Selector", "AllowUnregisteredCalls", "SkipServiceControl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
