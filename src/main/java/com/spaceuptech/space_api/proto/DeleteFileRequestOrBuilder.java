// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.spaceuptech.space_api.proto;

public interface DeleteFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.DeleteFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full path, including the file name and extension
   * </pre>
   *
   * <code>string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Full path, including the file name and extension
   * </pre>
   *
   * <code>string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

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
