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
    comments = "Source: validation.proto")
public class ValidationServiceGrpc {

  private ValidationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.milind.grpc.ValidationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.milind.grpc.ValidationRequest,
      com.milind.grpc.ValidationResponse> METHOD_VALIDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.milind.grpc.ValidationService", "validate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.milind.grpc.ValidationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.milind.grpc.ValidationResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidationServiceStub newStub(io.grpc.Channel channel) {
    return new ValidationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ValidationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ValidationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ValidationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ValidationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void validate(com.milind.grpc.ValidationRequest request,
        io.grpc.stub.StreamObserver<com.milind.grpc.ValidationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VALIDATE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_VALIDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.milind.grpc.ValidationRequest,
                com.milind.grpc.ValidationResponse>(
                  this, METHODID_VALIDATE)))
          .build();
    }
  }

  /**
   */
  public static final class ValidationServiceStub extends io.grpc.stub.AbstractStub<ValidationServiceStub> {
    private ValidationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidationServiceStub(channel, callOptions);
    }

    /**
     */
    public void validate(com.milind.grpc.ValidationRequest request,
        io.grpc.stub.StreamObserver<com.milind.grpc.ValidationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VALIDATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ValidationServiceBlockingStub extends io.grpc.stub.AbstractStub<ValidationServiceBlockingStub> {
    private ValidationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.milind.grpc.ValidationResponse validate(com.milind.grpc.ValidationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VALIDATE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValidationServiceFutureStub extends io.grpc.stub.AbstractStub<ValidationServiceFutureStub> {
    private ValidationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.milind.grpc.ValidationResponse> validate(
        com.milind.grpc.ValidationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VALIDATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValidationServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ValidationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE:
          serviceImpl.validate((com.milind.grpc.ValidationRequest) request,
              (io.grpc.stub.StreamObserver<com.milind.grpc.ValidationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_VALIDATE);
  }

}
