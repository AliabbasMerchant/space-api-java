// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.spaceuptech.space_api.proto;

public interface ProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.proto.Meta meta = 2;</code>
   */
  boolean hasMeta();
  /**
   * <code>.proto.Meta meta = 2;</code>
   */
  com.spaceuptech.space_api.proto.Meta getMeta();
  /**
   * <code>.proto.Meta meta = 2;</code>
   */
  com.spaceuptech.space_api.proto.MetaOrBuilder getMetaOrBuilder();
}