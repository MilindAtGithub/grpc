// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validation.proto

package com.milind.grpc;

public final class Validation {
  private Validation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_milind_grpc_ValidationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_milind_grpc_ValidationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_milind_grpc_ValidationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_milind_grpc_ValidationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020validation.proto\022\017com.milind.grpc\"V\n\021V" +
      "alidationRequest\022\023\n\013accountName\030\001 \001(\t\022\025\n" +
      "\raccountNumber\030\002 \001(\t\022\025\n\rroutingNumber\030\003 " +
      "\001(\t\"f\n\022ValidationResponse\022\030\n\020accountName" +
      "Error\030\001 \001(\t\022\032\n\022accountNumberError\030\002 \001(\t\022" +
      "\032\n\022routingNumberError\030\003 \001(\t2h\n\021Validatio" +
      "nService\022S\n\010validate\022\".com.milind.grpc.V" +
      "alidationRequest\032#.com.milind.grpc.Valid" +
      "ationResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_milind_grpc_ValidationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_milind_grpc_ValidationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_milind_grpc_ValidationRequest_descriptor,
        new java.lang.String[] { "AccountName", "AccountNumber", "RoutingNumber", });
    internal_static_com_milind_grpc_ValidationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_milind_grpc_ValidationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_milind_grpc_ValidationResponse_descriptor,
        new java.lang.String[] { "AccountNameError", "AccountNumberError", "RoutingNumberError", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
