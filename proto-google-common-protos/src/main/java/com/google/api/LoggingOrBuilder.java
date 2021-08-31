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
// source: google/api/logging.proto

package com.google.api;

public interface LoggingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Logging)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   */
  java.util.List<com.google.api.Logging.LoggingDestination> 
      getProducerDestinationsList();
  /**
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   */
  com.google.api.Logging.LoggingDestination getProducerDestinations(int index);
  /**
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   */
  int getProducerDestinationsCount();
  /**
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   */
  java.util.List<? extends com.google.api.Logging.LoggingDestinationOrBuilder> 
      getProducerDestinationsOrBuilderList();
  /**
   * <pre>
   * Logging configurations for sending logs to the producer project.
   * There can be multiple producer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one producer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination producer_destinations = 1;</code>
   */
  com.google.api.Logging.LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(
      int index);

  /**
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   */
  java.util.List<com.google.api.Logging.LoggingDestination> 
      getConsumerDestinationsList();
  /**
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   */
  com.google.api.Logging.LoggingDestination getConsumerDestinations(int index);
  /**
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   */
  int getConsumerDestinationsCount();
  /**
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   */
  java.util.List<? extends com.google.api.Logging.LoggingDestinationOrBuilder> 
      getConsumerDestinationsOrBuilderList();
  /**
   * <pre>
   * Logging configurations for sending logs to the consumer project.
   * There can be multiple consumer destinations, each one must have a
   * different monitored resource type. A log can be used in at most
   * one consumer destination.
   * </pre>
   *
   * <code>repeated .google.api.Logging.LoggingDestination consumer_destinations = 2;</code>
   */
  com.google.api.Logging.LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(
      int index);
}
