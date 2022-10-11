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
// source: google/api/billing.proto

package com.google.api;

public final class BillingProto {
  private BillingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Billing_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Billing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Billing_BillingDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Billing_BillingDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/billing.proto\022\ngoogle.api\"\223"
          + "\001\n\007Billing\022E\n\025consumer_destinations\030\010 \003("
          + "\0132&.google.api.Billing.BillingDestinatio"
          + "n\032A\n\022BillingDestination\022\032\n\022monitored_res"
          + "ource\030\001 \001(\t\022\017\n\007metrics\030\002 \003(\tBn\n\016com.goog"
          + "le.apiB\014BillingProtoP\001ZEgoogle.golang.or"
          + "g/genproto/googleapis/api/serviceconfig;"
          + "serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_api_Billing_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Billing_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Billing_descriptor,
            new java.lang.String[] {
              "ConsumerDestinations",
            });
    internal_static_google_api_Billing_BillingDestination_descriptor =
        internal_static_google_api_Billing_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Billing_BillingDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Billing_BillingDestination_descriptor,
            new java.lang.String[] {
              "MonitoredResource", "Metrics",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
