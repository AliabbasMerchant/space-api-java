// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.spaceuptech.space_api.proto;

public interface SignUpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SignUpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string email = 1;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 1;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string password = 3;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 3;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string role = 4;</code>
   */
  java.lang.String getRole();
  /**
   * <code>string role = 4;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>.proto.Meta meta = 5;</code>
   */
  boolean hasMeta();
  /**
   * <code>.proto.Meta meta = 5;</code>
   */
  com.spaceuptech.space_api.proto.Meta getMeta();
  /**
   * <code>.proto.Meta meta = 5;</code>
   */
  com.spaceuptech.space_api.proto.MetaOrBuilder getMetaOrBuilder();
}
