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

public interface SourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.SourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getSourceFilesList();
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  com.google.protobuf.Any getSourceFiles(int index);
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  int getSourceFilesCount();
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getSourceFilesOrBuilderList();
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getSourceFilesOrBuilder(
      int index);
}
