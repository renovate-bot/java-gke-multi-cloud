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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Configuration related to the cluster RBAC settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureAuthorization}
 */
public final class AzureAuthorization extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AzureAuthorization)
    AzureAuthorizationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AzureAuthorization.newBuilder() to construct.
  private AzureAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AzureAuthorization() {
    adminUsers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AzureAuthorization();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AzureAuthorization.class,
            com.google.cloud.gkemulticloud.v1.AzureAuthorization.Builder.class);
  }

  public static final int ADMIN_USERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterUser> adminUsers_;
  /**
   *
   *
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterUser> getAdminUsersList() {
    return adminUsers_;
  }
  /**
   *
   *
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder>
      getAdminUsersOrBuilderList() {
    return adminUsers_;
  }
  /**
   *
   *
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getAdminUsersCount() {
    return adminUsers_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureClusterUser getAdminUsers(int index) {
    return adminUsers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder getAdminUsersOrBuilder(
      int index) {
    return adminUsers_.get(index);
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
    for (int i = 0; i < adminUsers_.size(); i++) {
      output.writeMessage(1, adminUsers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < adminUsers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, adminUsers_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AzureAuthorization)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AzureAuthorization other =
        (com.google.cloud.gkemulticloud.v1.AzureAuthorization) obj;

    if (!getAdminUsersList().equals(other.getAdminUsersList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAdminUsersCount() > 0) {
      hash = (37 * hash) + ADMIN_USERS_FIELD_NUMBER;
      hash = (53 * hash) + getAdminUsersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AzureAuthorization prototype) {
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
   * Configuration related to the cluster RBAC settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureAuthorization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AzureAuthorization)
      com.google.cloud.gkemulticloud.v1.AzureAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AzureAuthorization.class,
              com.google.cloud.gkemulticloud.v1.AzureAuthorization.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AzureAuthorization.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (adminUsersBuilder_ == null) {
        adminUsers_ = java.util.Collections.emptyList();
      } else {
        adminUsers_ = null;
        adminUsersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureAuthorization_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureAuthorization getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AzureAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureAuthorization build() {
      com.google.cloud.gkemulticloud.v1.AzureAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureAuthorization buildPartial() {
      com.google.cloud.gkemulticloud.v1.AzureAuthorization result =
          new com.google.cloud.gkemulticloud.v1.AzureAuthorization(this);
      int from_bitField0_ = bitField0_;
      if (adminUsersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          adminUsers_ = java.util.Collections.unmodifiableList(adminUsers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.adminUsers_ = adminUsers_;
      } else {
        result.adminUsers_ = adminUsersBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AzureAuthorization) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AzureAuthorization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AzureAuthorization other) {
      if (other == com.google.cloud.gkemulticloud.v1.AzureAuthorization.getDefaultInstance())
        return this;
      if (adminUsersBuilder_ == null) {
        if (!other.adminUsers_.isEmpty()) {
          if (adminUsers_.isEmpty()) {
            adminUsers_ = other.adminUsers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdminUsersIsMutable();
            adminUsers_.addAll(other.adminUsers_);
          }
          onChanged();
        }
      } else {
        if (!other.adminUsers_.isEmpty()) {
          if (adminUsersBuilder_.isEmpty()) {
            adminUsersBuilder_.dispose();
            adminUsersBuilder_ = null;
            adminUsers_ = other.adminUsers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            adminUsersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAdminUsersFieldBuilder()
                    : null;
          } else {
            adminUsersBuilder_.addAllMessages(other.adminUsers_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.cloud.gkemulticloud.v1.AzureClusterUser m =
                    input.readMessage(
                        com.google.cloud.gkemulticloud.v1.AzureClusterUser.parser(),
                        extensionRegistry);
                if (adminUsersBuilder_ == null) {
                  ensureAdminUsersIsMutable();
                  adminUsers_.add(m);
                } else {
                  adminUsersBuilder_.addMessage(m);
                }
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterUser> adminUsers_ =
        java.util.Collections.emptyList();

    private void ensureAdminUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        adminUsers_ =
            new java.util.ArrayList<com.google.cloud.gkemulticloud.v1.AzureClusterUser>(
                adminUsers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AzureClusterUser,
            com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder,
            com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder>
        adminUsersBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterUser> getAdminUsersList() {
      if (adminUsersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(adminUsers_);
      } else {
        return adminUsersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getAdminUsersCount() {
      if (adminUsersBuilder_ == null) {
        return adminUsers_.size();
      } else {
        return adminUsersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureClusterUser getAdminUsers(int index) {
      if (adminUsersBuilder_ == null) {
        return adminUsers_.get(index);
      } else {
        return adminUsersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAdminUsers(
        int index, com.google.cloud.gkemulticloud.v1.AzureClusterUser value) {
      if (adminUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdminUsersIsMutable();
        adminUsers_.set(index, value);
        onChanged();
      } else {
        adminUsersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAdminUsers(
        int index, com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder builderForValue) {
      if (adminUsersBuilder_ == null) {
        ensureAdminUsersIsMutable();
        adminUsers_.set(index, builderForValue.build());
        onChanged();
      } else {
        adminUsersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAdminUsers(com.google.cloud.gkemulticloud.v1.AzureClusterUser value) {
      if (adminUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdminUsersIsMutable();
        adminUsers_.add(value);
        onChanged();
      } else {
        adminUsersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAdminUsers(
        int index, com.google.cloud.gkemulticloud.v1.AzureClusterUser value) {
      if (adminUsersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdminUsersIsMutable();
        adminUsers_.add(index, value);
        onChanged();
      } else {
        adminUsersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAdminUsers(
        com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder builderForValue) {
      if (adminUsersBuilder_ == null) {
        ensureAdminUsersIsMutable();
        adminUsers_.add(builderForValue.build());
        onChanged();
      } else {
        adminUsersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAdminUsers(
        int index, com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder builderForValue) {
      if (adminUsersBuilder_ == null) {
        ensureAdminUsersIsMutable();
        adminUsers_.add(index, builderForValue.build());
        onChanged();
      } else {
        adminUsersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllAdminUsers(
        java.lang.Iterable<? extends com.google.cloud.gkemulticloud.v1.AzureClusterUser> values) {
      if (adminUsersBuilder_ == null) {
        ensureAdminUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, adminUsers_);
        onChanged();
      } else {
        adminUsersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAdminUsers() {
      if (adminUsersBuilder_ == null) {
        adminUsers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        adminUsersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeAdminUsers(int index) {
      if (adminUsersBuilder_ == null) {
        ensureAdminUsersIsMutable();
        adminUsers_.remove(index);
        onChanged();
      } else {
        adminUsersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder getAdminUsersBuilder(
        int index) {
      return getAdminUsersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder getAdminUsersOrBuilder(
        int index) {
      if (adminUsersBuilder_ == null) {
        return adminUsers_.get(index);
      } else {
        return adminUsersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder>
        getAdminUsersOrBuilderList() {
      if (adminUsersBuilder_ != null) {
        return adminUsersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(adminUsers_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder addAdminUsersBuilder() {
      return getAdminUsersFieldBuilder()
          .addBuilder(com.google.cloud.gkemulticloud.v1.AzureClusterUser.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder addAdminUsersBuilder(
        int index) {
      return getAdminUsersFieldBuilder()
          .addBuilder(
              index, com.google.cloud.gkemulticloud.v1.AzureClusterUser.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Users that can perform operations as a cluster admin. A managed
     * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
     * to the users. Up to ten admin users can be provided.
     * For more info on RBAC, see
     * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * </pre>
     *
     * <code>
     * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder>
        getAdminUsersBuilderList() {
      return getAdminUsersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AzureClusterUser,
            com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder,
            com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder>
        getAdminUsersFieldBuilder() {
      if (adminUsersBuilder_ == null) {
        adminUsersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkemulticloud.v1.AzureClusterUser,
                com.google.cloud.gkemulticloud.v1.AzureClusterUser.Builder,
                com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder>(
                adminUsers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        adminUsers_ = null;
      }
      return adminUsersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AzureAuthorization)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AzureAuthorization)
  private static final com.google.cloud.gkemulticloud.v1.AzureAuthorization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AzureAuthorization();
  }

  public static com.google.cloud.gkemulticloud.v1.AzureAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureAuthorization> PARSER =
      new com.google.protobuf.AbstractParser<AzureAuthorization>() {
        @java.lang.Override
        public AzureAuthorization parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<AzureAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
