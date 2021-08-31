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
// source: google/api/documentation.proto

package com.google.api;

public interface PageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Page)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path}
   * ==&amp;#41;&lt;/code&gt; to include content from a Markdown file.
   * </pre>
   *
   * <code>string content = 2;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path}
   * ==&amp;#41;&lt;/code&gt; to include content from a Markdown file.
   * </pre>
   *
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  java.util.List<com.google.api.Page> 
      getSubpagesList();
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  com.google.api.Page getSubpages(int index);
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  int getSubpagesCount();
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  java.util.List<? extends com.google.api.PageOrBuilder> 
      getSubpagesOrBuilderList();
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  com.google.api.PageOrBuilder getSubpagesOrBuilder(
      int index);
}
