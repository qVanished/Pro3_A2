package com.example.demo.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SlaughterHouseGrpc {

  private SlaughterHouseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "slaughterhouse.SlaughterHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.generated.AnimalRequest,
      com.example.demo.generated.AnimalRes> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = com.example.demo.generated.AnimalRequest.class,
      responseType = com.example.demo.generated.AnimalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.generated.AnimalRequest,
      com.example.demo.generated.AnimalRes> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.example.demo.generated.AnimalRequest, com.example.demo.generated.AnimalRes> getFindByIdMethod;
    if ((getFindByIdMethod = SlaughterHouseGrpc.getFindByIdMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getFindByIdMethod = SlaughterHouseGrpc.getFindByIdMethod) == null) {
          SlaughterHouseGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.example.demo.generated.AnimalRequest, com.example.demo.generated.AnimalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.AnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.AnimalRes.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.generated.DateRequest,
      com.example.demo.generated.AnimalListResponse> getFindByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByDate",
      requestType = com.example.demo.generated.DateRequest.class,
      responseType = com.example.demo.generated.AnimalListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.generated.DateRequest,
      com.example.demo.generated.AnimalListResponse> getFindByDateMethod() {
    io.grpc.MethodDescriptor<com.example.demo.generated.DateRequest, com.example.demo.generated.AnimalListResponse> getFindByDateMethod;
    if ((getFindByDateMethod = SlaughterHouseGrpc.getFindByDateMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getFindByDateMethod = SlaughterHouseGrpc.getFindByDateMethod) == null) {
          SlaughterHouseGrpc.getFindByDateMethod = getFindByDateMethod =
              io.grpc.MethodDescriptor.<com.example.demo.generated.DateRequest, com.example.demo.generated.AnimalListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.DateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.AnimalListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("FindByDate"))
              .build();
        }
      }
    }
    return getFindByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.generated.OriginRequest,
      com.example.demo.generated.AnimalListResponse> getFindByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByOrigin",
      requestType = com.example.demo.generated.OriginRequest.class,
      responseType = com.example.demo.generated.AnimalListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.generated.OriginRequest,
      com.example.demo.generated.AnimalListResponse> getFindByOriginMethod() {
    io.grpc.MethodDescriptor<com.example.demo.generated.OriginRequest, com.example.demo.generated.AnimalListResponse> getFindByOriginMethod;
    if ((getFindByOriginMethod = SlaughterHouseGrpc.getFindByOriginMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getFindByOriginMethod = SlaughterHouseGrpc.getFindByOriginMethod) == null) {
          SlaughterHouseGrpc.getFindByOriginMethod = getFindByOriginMethod =
              io.grpc.MethodDescriptor.<com.example.demo.generated.OriginRequest, com.example.demo.generated.AnimalListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.OriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.AnimalListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("FindByOrigin"))
              .build();
        }
      }
    }
    return getFindByOriginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.generated.ProductRequest,
      com.example.demo.generated.AnimalListResponse> getGetAnimalsByProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsByProduct",
      requestType = com.example.demo.generated.ProductRequest.class,
      responseType = com.example.demo.generated.AnimalListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.generated.ProductRequest,
      com.example.demo.generated.AnimalListResponse> getGetAnimalsByProductMethod() {
    io.grpc.MethodDescriptor<com.example.demo.generated.ProductRequest, com.example.demo.generated.AnimalListResponse> getGetAnimalsByProductMethod;
    if ((getGetAnimalsByProductMethod = SlaughterHouseGrpc.getGetAnimalsByProductMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetAnimalsByProductMethod = SlaughterHouseGrpc.getGetAnimalsByProductMethod) == null) {
          SlaughterHouseGrpc.getGetAnimalsByProductMethod = getGetAnimalsByProductMethod =
              io.grpc.MethodDescriptor.<com.example.demo.generated.ProductRequest, com.example.demo.generated.AnimalListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalsByProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.AnimalListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetAnimalsByProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsByProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.generated.AnimalRequest,
      com.example.demo.generated.ProductListResponse> getGetProductsByAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByAnimal",
      requestType = com.example.demo.generated.AnimalRequest.class,
      responseType = com.example.demo.generated.ProductListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.generated.AnimalRequest,
      com.example.demo.generated.ProductListResponse> getGetProductsByAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.demo.generated.AnimalRequest, com.example.demo.generated.ProductListResponse> getGetProductsByAnimalMethod;
    if ((getGetProductsByAnimalMethod = SlaughterHouseGrpc.getGetProductsByAnimalMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetProductsByAnimalMethod = SlaughterHouseGrpc.getGetProductsByAnimalMethod) == null) {
          SlaughterHouseGrpc.getGetProductsByAnimalMethod = getGetProductsByAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.demo.generated.AnimalRequest, com.example.demo.generated.ProductListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.AnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.generated.ProductListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetProductsByAnimal"))
              .build();
        }
      }
    }
    return getGetProductsByAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub>() {
        @java.lang.Override
        public SlaughterHouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseStub(channel, callOptions);
        }
      };
    return SlaughterHouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SlaughterHouseBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingV2Stub>() {
        @java.lang.Override
        public SlaughterHouseBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseBlockingV2Stub(channel, callOptions);
        }
      };
    return SlaughterHouseBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub>() {
        @java.lang.Override
        public SlaughterHouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub>() {
        @java.lang.Override
        public SlaughterHouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterHouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findById(com.example.demo.generated.AnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    default void findByDate(com.example.demo.generated.DateRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByDateMethod(), responseObserver);
    }

    /**
     */
    default void findByOrigin(com.example.demo.generated.OriginRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByOriginMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalsByProduct(com.example.demo.generated.ProductRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByProductMethod(), responseObserver);
    }

    /**
     */
    default void getProductsByAnimal(com.example.demo.generated.AnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.ProductListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByAnimalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SlaughterHouse.
   */
  public static abstract class SlaughterHouseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SlaughterHouseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SlaughterHouse.
   */
  public static final class SlaughterHouseStub
      extends io.grpc.stub.AbstractAsyncStub<SlaughterHouseStub> {
    private SlaughterHouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseStub(channel, callOptions);
    }

    /**
     */
    public void findById(com.example.demo.generated.AnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDate(com.example.demo.generated.DateRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByOrigin(com.example.demo.generated.OriginRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByOriginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByProduct(com.example.demo.generated.ProductRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByAnimal(com.example.demo.generated.AnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.generated.ProductListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SlaughterHouse.
   */
  public static final class SlaughterHouseBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SlaughterHouseBlockingV2Stub> {
    private SlaughterHouseBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.generated.AnimalRes findById(com.example.demo.generated.AnimalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.AnimalListResponse findByDate(com.example.demo.generated.DateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFindByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.AnimalListResponse findByOrigin(com.example.demo.generated.OriginRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFindByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.AnimalListResponse getAnimalsByProduct(com.example.demo.generated.ProductRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAnimalsByProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.ProductListResponse getProductsByAnimal(com.example.demo.generated.AnimalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProductsByAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SlaughterHouse.
   */
  public static final class SlaughterHouseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SlaughterHouseBlockingStub> {
    private SlaughterHouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.generated.AnimalRes findById(com.example.demo.generated.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.AnimalListResponse findByDate(com.example.demo.generated.DateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.AnimalListResponse findByOrigin(com.example.demo.generated.OriginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.AnimalListResponse getAnimalsByProduct(com.example.demo.generated.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.generated.ProductListResponse getProductsByAnimal(com.example.demo.generated.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SlaughterHouse.
   */
  public static final class SlaughterHouseFutureStub
      extends io.grpc.stub.AbstractFutureStub<SlaughterHouseFutureStub> {
    private SlaughterHouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.generated.AnimalRes> findById(
        com.example.demo.generated.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.generated.AnimalListResponse> findByDate(
        com.example.demo.generated.DateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.generated.AnimalListResponse> findByOrigin(
        com.example.demo.generated.OriginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByOriginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.generated.AnimalListResponse> getAnimalsByProduct(
        com.example.demo.generated.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.generated.ProductListResponse> getProductsByAnimal(
        com.example.demo.generated.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_FIND_BY_DATE = 1;
  private static final int METHODID_FIND_BY_ORIGIN = 2;
  private static final int METHODID_GET_ANIMALS_BY_PRODUCT = 3;
  private static final int METHODID_GET_PRODUCTS_BY_ANIMAL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.example.demo.generated.AnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalRes>) responseObserver);
          break;
        case METHODID_FIND_BY_DATE:
          serviceImpl.findByDate((com.example.demo.generated.DateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ORIGIN:
          serviceImpl.findByOrigin((com.example.demo.generated.OriginRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_PRODUCT:
          serviceImpl.getAnimalsByProduct((com.example.demo.generated.ProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.generated.AnimalListResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_ANIMAL:
          serviceImpl.getProductsByAnimal((com.example.demo.generated.AnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.generated.ProductListResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.generated.AnimalRequest,
              com.example.demo.generated.AnimalRes>(
                service, METHODID_FIND_BY_ID)))
        .addMethod(
          getFindByDateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.generated.DateRequest,
              com.example.demo.generated.AnimalListResponse>(
                service, METHODID_FIND_BY_DATE)))
        .addMethod(
          getFindByOriginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.generated.OriginRequest,
              com.example.demo.generated.AnimalListResponse>(
                service, METHODID_FIND_BY_ORIGIN)))
        .addMethod(
          getGetAnimalsByProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.generated.ProductRequest,
              com.example.demo.generated.AnimalListResponse>(
                service, METHODID_GET_ANIMALS_BY_PRODUCT)))
        .addMethod(
          getGetProductsByAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.demo.generated.AnimalRequest,
              com.example.demo.generated.ProductListResponse>(
                service, METHODID_GET_PRODUCTS_BY_ANIMAL)))
        .build();
  }

  private static abstract class SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.generated.SlaughterHouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse");
    }
  }

  private static final class SlaughterHouseFileDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier {
    SlaughterHouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterHouseMethodDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SlaughterHouseMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SlaughterHouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouseFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindByDateMethod())
              .addMethod(getFindByOriginMethod())
              .addMethod(getGetAnimalsByProductMethod())
              .addMethod(getGetProductsByAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
