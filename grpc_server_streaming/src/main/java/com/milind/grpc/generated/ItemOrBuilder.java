// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serverside-streaming.proto

package com.milind.grpc.generated;

public interface ItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.milind.grpc.generated.Item)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 itemId = 1;</code>
   */
  int getItemId();

  /**
   * <code>optional string itemDesc = 2;</code>
   */
  java.lang.String getItemDesc();
  /**
   * <code>optional string itemDesc = 2;</code>
   */
  com.google.protobuf.ByteString
      getItemDescBytes();

  /**
   * <code>optional double price = 3;</code>
   */
  double getPrice();
}
