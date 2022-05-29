package services.concatenation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: concatenation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConcatenationGrpc {

  private ConcatenationGrpc() {}

  public static final String SERVICE_NAME = "Concatenation.Concatenation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<services.concatenation.ConcatenationRequest,
      services.concatenation.ConcatenationResponse> getConcatenateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "concatenate",
      requestType = services.concatenation.ConcatenationRequest.class,
      responseType = services.concatenation.ConcatenationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.concatenation.ConcatenationRequest,
      services.concatenation.ConcatenationResponse> getConcatenateMethod() {
    io.grpc.MethodDescriptor<services.concatenation.ConcatenationRequest, services.concatenation.ConcatenationResponse> getConcatenateMethod;
    if ((getConcatenateMethod = ConcatenationGrpc.getConcatenateMethod) == null) {
      synchronized (ConcatenationGrpc.class) {
        if ((getConcatenateMethod = ConcatenationGrpc.getConcatenateMethod) == null) {
          ConcatenationGrpc.getConcatenateMethod = getConcatenateMethod =
              io.grpc.MethodDescriptor.<services.concatenation.ConcatenationRequest, services.concatenation.ConcatenationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "concatenate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.concatenation.ConcatenationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.concatenation.ConcatenationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConcatenationMethodDescriptorSupplier("concatenate"))
              .build();
        }
      }
    }
    return getConcatenateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConcatenationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConcatenationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConcatenationStub>() {
        @java.lang.Override
        public ConcatenationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConcatenationStub(channel, callOptions);
        }
      };
    return ConcatenationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConcatenationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConcatenationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConcatenationBlockingStub>() {
        @java.lang.Override
        public ConcatenationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConcatenationBlockingStub(channel, callOptions);
        }
      };
    return ConcatenationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConcatenationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConcatenationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConcatenationFutureStub>() {
        @java.lang.Override
        public ConcatenationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConcatenationFutureStub(channel, callOptions);
        }
      };
    return ConcatenationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConcatenationImplBase implements io.grpc.BindableService {

    /**
     */
    public void concatenate(services.concatenation.ConcatenationRequest request,
        io.grpc.stub.StreamObserver<services.concatenation.ConcatenationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConcatenateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConcatenateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                services.concatenation.ConcatenationRequest,
                services.concatenation.ConcatenationResponse>(
                  this, METHODID_CONCATENATE)))
          .build();
    }
  }

  /**
   */
  public static final class ConcatenationStub extends io.grpc.stub.AbstractAsyncStub<ConcatenationStub> {
    private ConcatenationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConcatenationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConcatenationStub(channel, callOptions);
    }

    /**
     */
    public void concatenate(services.concatenation.ConcatenationRequest request,
        io.grpc.stub.StreamObserver<services.concatenation.ConcatenationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConcatenateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConcatenationBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConcatenationBlockingStub> {
    private ConcatenationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConcatenationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConcatenationBlockingStub(channel, callOptions);
    }

    /**
     */
    public services.concatenation.ConcatenationResponse concatenate(services.concatenation.ConcatenationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConcatenateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConcatenationFutureStub extends io.grpc.stub.AbstractFutureStub<ConcatenationFutureStub> {
    private ConcatenationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConcatenationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConcatenationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.concatenation.ConcatenationResponse> concatenate(
        services.concatenation.ConcatenationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConcatenateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONCATENATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConcatenationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConcatenationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONCATENATE:
          serviceImpl.concatenate((services.concatenation.ConcatenationRequest) request,
              (io.grpc.stub.StreamObserver<services.concatenation.ConcatenationResponse>) responseObserver);
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

  private static abstract class ConcatenationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConcatenationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return services.concatenation.ConcatenationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Concatenation");
    }
  }

  private static final class ConcatenationFileDescriptorSupplier
      extends ConcatenationBaseDescriptorSupplier {
    ConcatenationFileDescriptorSupplier() {}
  }

  private static final class ConcatenationMethodDescriptorSupplier
      extends ConcatenationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConcatenationMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConcatenationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConcatenationFileDescriptorSupplier())
              .addMethod(getConcatenateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
