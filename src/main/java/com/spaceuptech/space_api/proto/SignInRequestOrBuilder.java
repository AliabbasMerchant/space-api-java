// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.spaceuptech.space_api.proto;

public interface SignInRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SignInRequest)
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
   * <code>string password = 2;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>.proto.Meta meta = 3;</code>
   */
  boolean hasMeta();
  /**
   * <code>.proto.Meta meta = 3;</code>
   */
  com.spaceuptech.space_api.proto.Meta getMeta();
  /**
   * <code>.proto.Meta meta = 3;</code>
   */
  com.spaceuptech.space_api.proto.MetaOrBuilder getMetaOrBuilder();
}
