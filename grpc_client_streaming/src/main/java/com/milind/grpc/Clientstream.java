// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clientstream.proto

package com.milind.grpc;

public final class Clientstream {
  private Clientstream() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_milind_grpc_StreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_milind_grpc_StreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_milind_grpc_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_milind_grpc_StreamResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_milind_grpc_FileData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_milind_grpc_FileData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_milind_grpc_UploadStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_milind_grpc_UploadStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022clientstream.proto\022\017com.milind.grpc\"/\n" +
      "\rStreamRequest\022\017\n\007empName\030\001 \001(\t\022\r\n\005marks" +
      "\030\002 \001(\003\"I\n\016StreamResponse\022\017\n\007empList\030\001 \001(" +
      "\t\022\020\n\010totalEmp\030\002 \001(\003\022\024\n\014averageMarks\030\003 \001(" +
      "\003\"\033\n\010FileData\022\017\n\007content\030\001 \001(\014\"P\n\014Upload" +
      "Status\022\017\n\007Message\030\001 \001(\t\022/\n\004Code\030\002 \001(\0162!." +
      "com.milind.grpc.UploadStatusCode*3\n\020Uplo" +
      "adStatusCode\022\013\n\007Unknown\020\000\022\006\n\002Ok\020\001\022\n\n\006Fai" +
      "led\020\0022[\n\013MarkService\022L\n\007examine\022\036.com.mi" +
      "lind.grpc.StreamRequest\032\037.com.milind.grp",
      "c.StreamResponse(\0012W\n\rUploadService\022F\n\006u" +
      "pload\022\031.com.milind.grpc.FileData\032\035.com.m" +
      "ilind.grpc.UploadStatus\"\000(\001B\002P\001b\006proto3"
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
    internal_static_com_milind_grpc_StreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_milind_grpc_StreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_milind_grpc_StreamRequest_descriptor,
        new java.lang.String[] { "EmpName", "Marks", });
    internal_static_com_milind_grpc_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_milind_grpc_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_milind_grpc_StreamResponse_descriptor,
        new java.lang.String[] { "EmpList", "TotalEmp", "AverageMarks", });
    internal_static_com_milind_grpc_FileData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_milind_grpc_FileData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_milind_grpc_FileData_descriptor,
        new java.lang.String[] { "Content", });
    internal_static_com_milind_grpc_UploadStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_milind_grpc_UploadStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_milind_grpc_UploadStatus_descriptor,
        new java.lang.String[] { "Message", "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
