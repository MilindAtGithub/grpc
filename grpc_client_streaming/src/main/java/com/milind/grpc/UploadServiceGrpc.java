package com.milind.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: clientstream.proto")
public class UploadServiceGrpc {

  private UploadServiceGrpc() {}

  public static final String SERVICE_NAME = "com.milind.grpc.UploadService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.milind.grpc.FileData,
      com.milind.grpc.UploadStatus> METHOD_UPLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "com.milind.grpc.UploadService", "upload"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.milind.grpc.FileData.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.milind.grpc.UploadStatus.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploadServiceStub newStub(io.grpc.Channel channel) {
    return new UploadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UploadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UploadServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UploadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.milind.grpc.FileData> upload(
        io.grpc.stub.StreamObserver<com.milind.grpc.UploadStatus> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_UPLOAD, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_UPLOAD,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.milind.grpc.FileData,
                com.milind.grpc.UploadStatus>(
                  this, METHODID_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class UploadServiceStub extends io.grpc.stub.AbstractStub<UploadServiceStub> {
    private UploadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UploadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UploadServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.milind.grpc.FileData> upload(
        io.grpc.stub.StreamObserver<com.milind.grpc.UploadStatus> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_UPLOAD, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UploadServiceBlockingStub extends io.grpc.stub.AbstractStub<UploadServiceBlockingStub> {
    private UploadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UploadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UploadServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class UploadServiceFutureStub extends io.grpc.stub.AbstractStub<UploadServiceFutureStub> {
    private UploadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UploadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UploadServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_UPLOAD = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UploadServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<com.milind.grpc.UploadStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_UPLOAD);
  }

}
