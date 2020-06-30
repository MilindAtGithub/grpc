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
public class MarkServiceGrpc {

  private MarkServiceGrpc() {}

  public static final String SERVICE_NAME = "com.milind.grpc.MarkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.milind.grpc.StreamRequest,
      com.milind.grpc.StreamResponse> METHOD_EXAMINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "com.milind.grpc.MarkService", "examine"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.milind.grpc.StreamRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.milind.grpc.StreamResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MarkServiceStub newStub(io.grpc.Channel channel) {
    return new MarkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MarkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MarkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MarkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MarkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MarkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.milind.grpc.StreamRequest> examine(
        io.grpc.stub.StreamObserver<com.milind.grpc.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_EXAMINE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EXAMINE,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.milind.grpc.StreamRequest,
                com.milind.grpc.StreamResponse>(
                  this, METHODID_EXAMINE)))
          .build();
    }
  }

  /**
   */
  public static final class MarkServiceStub extends io.grpc.stub.AbstractStub<MarkServiceStub> {
    private MarkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarkServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.milind.grpc.StreamRequest> examine(
        io.grpc.stub.StreamObserver<com.milind.grpc.StreamResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_EXAMINE, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MarkServiceBlockingStub extends io.grpc.stub.AbstractStub<MarkServiceBlockingStub> {
    private MarkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarkServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class MarkServiceFutureStub extends io.grpc.stub.AbstractStub<MarkServiceFutureStub> {
    private MarkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarkServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EXAMINE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MarkServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MarkServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_EXAMINE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.examine(
              (io.grpc.stub.StreamObserver<com.milind.grpc.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_EXAMINE);
  }

}
