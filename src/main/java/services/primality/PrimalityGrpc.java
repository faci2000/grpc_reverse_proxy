package services.primality;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: isPrime.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrimalityGrpc {

  private PrimalityGrpc() {}

  public static final String SERVICE_NAME = "Primality.Primality";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<services.primality.IsPrimeRequest,
      services.primality.IsPrimeResponse> getCheckIfNumberIsPrimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkIfNumberIsPrime",
      requestType = services.primality.IsPrimeRequest.class,
      responseType = services.primality.IsPrimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.primality.IsPrimeRequest,
      services.primality.IsPrimeResponse> getCheckIfNumberIsPrimeMethod() {
    io.grpc.MethodDescriptor<services.primality.IsPrimeRequest, services.primality.IsPrimeResponse> getCheckIfNumberIsPrimeMethod;
    if ((getCheckIfNumberIsPrimeMethod = PrimalityGrpc.getCheckIfNumberIsPrimeMethod) == null) {
      synchronized (PrimalityGrpc.class) {
        if ((getCheckIfNumberIsPrimeMethod = PrimalityGrpc.getCheckIfNumberIsPrimeMethod) == null) {
          PrimalityGrpc.getCheckIfNumberIsPrimeMethod = getCheckIfNumberIsPrimeMethod =
              io.grpc.MethodDescriptor.<services.primality.IsPrimeRequest, services.primality.IsPrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkIfNumberIsPrime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.primality.IsPrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.primality.IsPrimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimalityMethodDescriptorSupplier("checkIfNumberIsPrime"))
              .build();
        }
      }
    }
    return getCheckIfNumberIsPrimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimalityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimalityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimalityStub>() {
        @java.lang.Override
        public PrimalityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimalityStub(channel, callOptions);
        }
      };
    return PrimalityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimalityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimalityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimalityBlockingStub>() {
        @java.lang.Override
        public PrimalityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimalityBlockingStub(channel, callOptions);
        }
      };
    return PrimalityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimalityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimalityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimalityFutureStub>() {
        @java.lang.Override
        public PrimalityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimalityFutureStub(channel, callOptions);
        }
      };
    return PrimalityFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PrimalityImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkIfNumberIsPrime(services.primality.IsPrimeRequest request,
        io.grpc.stub.StreamObserver<services.primality.IsPrimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckIfNumberIsPrimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckIfNumberIsPrimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                services.primality.IsPrimeRequest,
                services.primality.IsPrimeResponse>(
                  this, METHODID_CHECK_IF_NUMBER_IS_PRIME)))
          .build();
    }
  }

  /**
   */
  public static final class PrimalityStub extends io.grpc.stub.AbstractAsyncStub<PrimalityStub> {
    private PrimalityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimalityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimalityStub(channel, callOptions);
    }

    /**
     */
    public void checkIfNumberIsPrime(services.primality.IsPrimeRequest request,
        io.grpc.stub.StreamObserver<services.primality.IsPrimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckIfNumberIsPrimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimalityBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrimalityBlockingStub> {
    private PrimalityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimalityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimalityBlockingStub(channel, callOptions);
    }

    /**
     */
    public services.primality.IsPrimeResponse checkIfNumberIsPrime(services.primality.IsPrimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckIfNumberIsPrimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimalityFutureStub extends io.grpc.stub.AbstractFutureStub<PrimalityFutureStub> {
    private PrimalityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimalityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimalityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.primality.IsPrimeResponse> checkIfNumberIsPrime(
        services.primality.IsPrimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckIfNumberIsPrimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_IF_NUMBER_IS_PRIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimalityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimalityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_IF_NUMBER_IS_PRIME:
          serviceImpl.checkIfNumberIsPrime((services.primality.IsPrimeRequest) request,
              (io.grpc.stub.StreamObserver<services.primality.IsPrimeResponse>) responseObserver);
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

  private static abstract class PrimalityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimalityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return services.primality.PrimalityProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Primality");
    }
  }

  private static final class PrimalityFileDescriptorSupplier
      extends PrimalityBaseDescriptorSupplier {
    PrimalityFileDescriptorSupplier() {}
  }

  private static final class PrimalityMethodDescriptorSupplier
      extends PrimalityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimalityMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimalityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimalityFileDescriptorSupplier())
              .addMethod(getCheckIfNumberIsPrimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
