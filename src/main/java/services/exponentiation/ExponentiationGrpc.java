package services.exponentiation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: exponentiation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExponentiationGrpc {

  private ExponentiationGrpc() {}

  public static final String SERVICE_NAME = "Exponentiation.Exponentiation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<services.exponentiation.ExponentiationRequest,
      services.exponentiation.ExponentiationResponse> getExponentiateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exponentiate",
      requestType = services.exponentiation.ExponentiationRequest.class,
      responseType = services.exponentiation.ExponentiationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.exponentiation.ExponentiationRequest,
      services.exponentiation.ExponentiationResponse> getExponentiateMethod() {
    io.grpc.MethodDescriptor<services.exponentiation.ExponentiationRequest, services.exponentiation.ExponentiationResponse> getExponentiateMethod;
    if ((getExponentiateMethod = ExponentiationGrpc.getExponentiateMethod) == null) {
      synchronized (ExponentiationGrpc.class) {
        if ((getExponentiateMethod = ExponentiationGrpc.getExponentiateMethod) == null) {
          ExponentiationGrpc.getExponentiateMethod = getExponentiateMethod =
              io.grpc.MethodDescriptor.<services.exponentiation.ExponentiationRequest, services.exponentiation.ExponentiationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exponentiate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.exponentiation.ExponentiationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.exponentiation.ExponentiationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExponentiationMethodDescriptorSupplier("exponentiate"))
              .build();
        }
      }
    }
    return getExponentiateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExponentiationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExponentiationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExponentiationStub>() {
        @java.lang.Override
        public ExponentiationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExponentiationStub(channel, callOptions);
        }
      };
    return ExponentiationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExponentiationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExponentiationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExponentiationBlockingStub>() {
        @java.lang.Override
        public ExponentiationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExponentiationBlockingStub(channel, callOptions);
        }
      };
    return ExponentiationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExponentiationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExponentiationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExponentiationFutureStub>() {
        @java.lang.Override
        public ExponentiationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExponentiationFutureStub(channel, callOptions);
        }
      };
    return ExponentiationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExponentiationImplBase implements io.grpc.BindableService {

    /**
     */
    public void exponentiate(services.exponentiation.ExponentiationRequest request,
        io.grpc.stub.StreamObserver<services.exponentiation.ExponentiationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExponentiateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExponentiateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                services.exponentiation.ExponentiationRequest,
                services.exponentiation.ExponentiationResponse>(
                  this, METHODID_EXPONENTIATE)))
          .build();
    }
  }

  /**
   */
  public static final class ExponentiationStub extends io.grpc.stub.AbstractAsyncStub<ExponentiationStub> {
    private ExponentiationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExponentiationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExponentiationStub(channel, callOptions);
    }

    /**
     */
    public void exponentiate(services.exponentiation.ExponentiationRequest request,
        io.grpc.stub.StreamObserver<services.exponentiation.ExponentiationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExponentiateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExponentiationBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExponentiationBlockingStub> {
    private ExponentiationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExponentiationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExponentiationBlockingStub(channel, callOptions);
    }

    /**
     */
    public services.exponentiation.ExponentiationResponse exponentiate(services.exponentiation.ExponentiationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExponentiateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExponentiationFutureStub extends io.grpc.stub.AbstractFutureStub<ExponentiationFutureStub> {
    private ExponentiationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExponentiationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExponentiationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.exponentiation.ExponentiationResponse> exponentiate(
        services.exponentiation.ExponentiationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExponentiateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXPONENTIATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExponentiationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExponentiationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXPONENTIATE:
          serviceImpl.exponentiate((services.exponentiation.ExponentiationRequest) request,
              (io.grpc.stub.StreamObserver<services.exponentiation.ExponentiationResponse>) responseObserver);
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

  private static abstract class ExponentiationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExponentiationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return services.exponentiation.ExponentiationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Exponentiation");
    }
  }

  private static final class ExponentiationFileDescriptorSupplier
      extends ExponentiationBaseDescriptorSupplier {
    ExponentiationFileDescriptorSupplier() {}
  }

  private static final class ExponentiationMethodDescriptorSupplier
      extends ExponentiationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExponentiationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExponentiationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExponentiationFileDescriptorSupplier())
              .addMethod(getExponentiateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
