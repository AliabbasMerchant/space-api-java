// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package com.spaceuptech.api.core.proto;

public interface BatchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.BatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.AllRequest batchrequest = 1;</code>
   */
  java.util.List<com.spaceuptech.api.core.proto.AllRequest> 
      getBatchrequestList();
  /**
   * <code>repeated .proto.AllRequest batchrequest = 1;</code>
   */
  com.spaceuptech.api.core.proto.AllRequest getBatchrequest(int index);
  /**
   * <code>repeated .proto.AllRequest batchrequest = 1;</code>
   */
  int getBatchrequestCount();
  /**
   * <code>repeated .proto.AllRequest batchrequest = 1;</code>
   */
  java.util.List<? extends com.spaceuptech.api.core.proto.AllRequestOrBuilder> 
      getBatchrequestOrBuilderList();
  /**
   * <code>repeated .proto.AllRequest batchrequest = 1;</code>
   */
  com.spaceuptech.api.core.proto.AllRequestOrBuilder getBatchrequestOrBuilder(
      int index);

  /**
   * <code>.proto.Meta meta = 2;</code>
   */
  boolean hasMeta();
  /**
   * <code>.proto.Meta meta = 2;</code>
   */
  com.spaceuptech.api.core.proto.Meta getMeta();
  /**
   * <code>.proto.Meta meta = 2;</code>
   */
  com.spaceuptech.api.core.proto.MetaOrBuilder getMetaOrBuilder();
}
