// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/client.proto

package com.google.api;

public interface ClientLibrarySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ClientLibrarySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of the API to apply these settings to.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Version of the API to apply these settings to.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Launch stage of this version of the API.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 2;</code>
   * @return The enum numeric value on the wire for launchStage.
   */
  int getLaunchStageValue();
  /**
   * <pre>
   * Launch stage of this version of the API.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 2;</code>
   * @return The launchStage.
   */
  com.google.api.LaunchStage getLaunchStage();

  /**
   * <pre>
   * When using transport=rest, the client request will encode enums as
   * numbers rather than strings.
   * </pre>
   *
   * <code>bool rest_numeric_enums = 3;</code>
   * @return The restNumericEnums.
   */
  boolean getRestNumericEnums();

  /**
   * <pre>
   * Settings for legacy Java features, supported in the Service YAML.
   * </pre>
   *
   * <code>.google.api.JavaSettings java_settings = 21;</code>
   * @return Whether the javaSettings field is set.
   */
  boolean hasJavaSettings();
  /**
   * <pre>
   * Settings for legacy Java features, supported in the Service YAML.
   * </pre>
   *
   * <code>.google.api.JavaSettings java_settings = 21;</code>
   * @return The javaSettings.
   */
  com.google.api.JavaSettings getJavaSettings();
  /**
   * <pre>
   * Settings for legacy Java features, supported in the Service YAML.
   * </pre>
   *
   * <code>.google.api.JavaSettings java_settings = 21;</code>
   */
  com.google.api.JavaSettingsOrBuilder getJavaSettingsOrBuilder();

  /**
   * <pre>
   * Settings for C++ client libraries.
   * </pre>
   *
   * <code>.google.api.CppSettings cpp_settings = 22;</code>
   * @return Whether the cppSettings field is set.
   */
  boolean hasCppSettings();
  /**
   * <pre>
   * Settings for C++ client libraries.
   * </pre>
   *
   * <code>.google.api.CppSettings cpp_settings = 22;</code>
   * @return The cppSettings.
   */
  com.google.api.CppSettings getCppSettings();
  /**
   * <pre>
   * Settings for C++ client libraries.
   * </pre>
   *
   * <code>.google.api.CppSettings cpp_settings = 22;</code>
   */
  com.google.api.CppSettingsOrBuilder getCppSettingsOrBuilder();

  /**
   * <pre>
   * Settings for PHP client libraries.
   * </pre>
   *
   * <code>.google.api.PhpSettings php_settings = 23;</code>
   * @return Whether the phpSettings field is set.
   */
  boolean hasPhpSettings();
  /**
   * <pre>
   * Settings for PHP client libraries.
   * </pre>
   *
   * <code>.google.api.PhpSettings php_settings = 23;</code>
   * @return The phpSettings.
   */
  com.google.api.PhpSettings getPhpSettings();
  /**
   * <pre>
   * Settings for PHP client libraries.
   * </pre>
   *
   * <code>.google.api.PhpSettings php_settings = 23;</code>
   */
  com.google.api.PhpSettingsOrBuilder getPhpSettingsOrBuilder();

  /**
   * <pre>
   * Settings for Python client libraries.
   * </pre>
   *
   * <code>.google.api.PythonSettings python_settings = 24;</code>
   * @return Whether the pythonSettings field is set.
   */
  boolean hasPythonSettings();
  /**
   * <pre>
   * Settings for Python client libraries.
   * </pre>
   *
   * <code>.google.api.PythonSettings python_settings = 24;</code>
   * @return The pythonSettings.
   */
  com.google.api.PythonSettings getPythonSettings();
  /**
   * <pre>
   * Settings for Python client libraries.
   * </pre>
   *
   * <code>.google.api.PythonSettings python_settings = 24;</code>
   */
  com.google.api.PythonSettingsOrBuilder getPythonSettingsOrBuilder();

  /**
   * <pre>
   * Settings for Node client libraries.
   * </pre>
   *
   * <code>.google.api.NodeSettings node_settings = 25;</code>
   * @return Whether the nodeSettings field is set.
   */
  boolean hasNodeSettings();
  /**
   * <pre>
   * Settings for Node client libraries.
   * </pre>
   *
   * <code>.google.api.NodeSettings node_settings = 25;</code>
   * @return The nodeSettings.
   */
  com.google.api.NodeSettings getNodeSettings();
  /**
   * <pre>
   * Settings for Node client libraries.
   * </pre>
   *
   * <code>.google.api.NodeSettings node_settings = 25;</code>
   */
  com.google.api.NodeSettingsOrBuilder getNodeSettingsOrBuilder();

  /**
   * <pre>
   * Settings for .NET client libraries.
   * </pre>
   *
   * <code>.google.api.DotnetSettings dotnet_settings = 26;</code>
   * @return Whether the dotnetSettings field is set.
   */
  boolean hasDotnetSettings();
  /**
   * <pre>
   * Settings for .NET client libraries.
   * </pre>
   *
   * <code>.google.api.DotnetSettings dotnet_settings = 26;</code>
   * @return The dotnetSettings.
   */
  com.google.api.DotnetSettings getDotnetSettings();
  /**
   * <pre>
   * Settings for .NET client libraries.
   * </pre>
   *
   * <code>.google.api.DotnetSettings dotnet_settings = 26;</code>
   */
  com.google.api.DotnetSettingsOrBuilder getDotnetSettingsOrBuilder();

  /**
   * <pre>
   * Settings for Ruby client libraries.
   * </pre>
   *
   * <code>.google.api.RubySettings ruby_settings = 27;</code>
   * @return Whether the rubySettings field is set.
   */
  boolean hasRubySettings();
  /**
   * <pre>
   * Settings for Ruby client libraries.
   * </pre>
   *
   * <code>.google.api.RubySettings ruby_settings = 27;</code>
   * @return The rubySettings.
   */
  com.google.api.RubySettings getRubySettings();
  /**
   * <pre>
   * Settings for Ruby client libraries.
   * </pre>
   *
   * <code>.google.api.RubySettings ruby_settings = 27;</code>
   */
  com.google.api.RubySettingsOrBuilder getRubySettingsOrBuilder();

  /**
   * <pre>
   * Settings for Go client libraries.
   * </pre>
   *
   * <code>.google.api.GoSettings go_settings = 28;</code>
   * @return Whether the goSettings field is set.
   */
  boolean hasGoSettings();
  /**
   * <pre>
   * Settings for Go client libraries.
   * </pre>
   *
   * <code>.google.api.GoSettings go_settings = 28;</code>
   * @return The goSettings.
   */
  com.google.api.GoSettings getGoSettings();
  /**
   * <pre>
   * Settings for Go client libraries.
   * </pre>
   *
   * <code>.google.api.GoSettings go_settings = 28;</code>
   */
  com.google.api.GoSettingsOrBuilder getGoSettingsOrBuilder();
}
