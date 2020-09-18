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
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

public interface ServiceAccountDelegationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.ServiceAccountDelegationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * First party (Google) identity as the real authority.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipal first_party_principal = 1;
   * </code>
   *
   * @return Whether the firstPartyPrincipal field is set.
   */
  boolean hasFirstPartyPrincipal();
  /**
   *
   *
   * <pre>
   * First party (Google) identity as the real authority.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipal first_party_principal = 1;
   * </code>
   *
   * @return The firstPartyPrincipal.
   */
  com.google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipal getFirstPartyPrincipal();
  /**
   *
   *
   * <pre>
   * First party (Google) identity as the real authority.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipal first_party_principal = 1;
   * </code>
   */
  com.google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipalOrBuilder
      getFirstPartyPrincipalOrBuilder();

  /**
   *
   *
   * <pre>
   * Third party identity as the real authority.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipal third_party_principal = 2;
   * </code>
   *
   * @return Whether the thirdPartyPrincipal field is set.
   */
  boolean hasThirdPartyPrincipal();
  /**
   *
   *
   * <pre>
   * Third party identity as the real authority.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipal third_party_principal = 2;
   * </code>
   *
   * @return The thirdPartyPrincipal.
   */
  com.google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipal getThirdPartyPrincipal();
  /**
   *
   *
   * <pre>
   * Third party identity as the real authority.
   * </pre>
   *
   * <code>
   * .google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipal third_party_principal = 2;
   * </code>
   */
  com.google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipalOrBuilder
      getThirdPartyPrincipalOrBuilder();

  public com.google.cloud.audit.ServiceAccountDelegationInfo.AuthorityCase getAuthorityCase();
}
