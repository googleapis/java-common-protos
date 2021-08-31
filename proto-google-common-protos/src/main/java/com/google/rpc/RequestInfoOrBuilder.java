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

public interface RequestInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.RequestInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   *
   * <code>string serving_data = 2;</code>
   * @return The servingData.
   */
  java.lang.String getServingData();
  /**
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   *
   * <code>string serving_data = 2;</code>
   * @return The bytes for servingData.
   */
  com.google.protobuf.ByteString
      getServingDataBytes();
}
