package com.example.grpc.board.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: boardSaveInterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BoardSaveGrpc {

  private BoardSaveGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BoardSave";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.board.lib.BoardSaveRequest,
      com.example.grpc.board.lib.BoardSaveResponse> getBoardSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boardSave",
      requestType = com.example.grpc.board.lib.BoardSaveRequest.class,
      responseType = com.example.grpc.board.lib.BoardSaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.board.lib.BoardSaveRequest,
      com.example.grpc.board.lib.BoardSaveResponse> getBoardSaveMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.board.lib.BoardSaveRequest, com.example.grpc.board.lib.BoardSaveResponse> getBoardSaveMethod;
    if ((getBoardSaveMethod = BoardSaveGrpc.getBoardSaveMethod) == null) {
      synchronized (BoardSaveGrpc.class) {
        if ((getBoardSaveMethod = BoardSaveGrpc.getBoardSaveMethod) == null) {
          BoardSaveGrpc.getBoardSaveMethod = getBoardSaveMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.board.lib.BoardSaveRequest, com.example.grpc.board.lib.BoardSaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "boardSave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.board.lib.BoardSaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.board.lib.BoardSaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardSaveMethodDescriptorSupplier("boardSave"))
              .build();
        }
      }
    }
    return getBoardSaveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BoardSaveStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BoardSaveStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BoardSaveStub>() {
        @java.lang.Override
        public BoardSaveStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BoardSaveStub(channel, callOptions);
        }
      };
    return BoardSaveStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BoardSaveBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BoardSaveBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BoardSaveBlockingStub>() {
        @java.lang.Override
        public BoardSaveBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BoardSaveBlockingStub(channel, callOptions);
        }
      };
    return BoardSaveBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BoardSaveFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BoardSaveFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BoardSaveFutureStub>() {
        @java.lang.Override
        public BoardSaveFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BoardSaveFutureStub(channel, callOptions);
        }
      };
    return BoardSaveFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void boardSave(com.example.grpc.board.lib.BoardSaveRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.board.lib.BoardSaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBoardSaveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BoardSave.
   */
  public static abstract class BoardSaveImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BoardSaveGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BoardSave.
   */
  public static final class BoardSaveStub
      extends io.grpc.stub.AbstractAsyncStub<BoardSaveStub> {
    private BoardSaveStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardSaveStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BoardSaveStub(channel, callOptions);
    }

    /**
     */
    public void boardSave(com.example.grpc.board.lib.BoardSaveRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.board.lib.BoardSaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBoardSaveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BoardSave.
   */
  public static final class BoardSaveBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BoardSaveBlockingStub> {
    private BoardSaveBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardSaveBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BoardSaveBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.board.lib.BoardSaveResponse boardSave(com.example.grpc.board.lib.BoardSaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBoardSaveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BoardSave.
   */
  public static final class BoardSaveFutureStub
      extends io.grpc.stub.AbstractFutureStub<BoardSaveFutureStub> {
    private BoardSaveFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardSaveFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BoardSaveFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.board.lib.BoardSaveResponse> boardSave(
        com.example.grpc.board.lib.BoardSaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBoardSaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOARD_SAVE = 0;

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
        case METHODID_BOARD_SAVE:
          serviceImpl.boardSave((com.example.grpc.board.lib.BoardSaveRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.board.lib.BoardSaveResponse>) responseObserver);
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
          getBoardSaveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.board.lib.BoardSaveRequest,
              com.example.grpc.board.lib.BoardSaveResponse>(
                service, METHODID_BOARD_SAVE)))
        .build();
  }

  private static abstract class BoardSaveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BoardSaveBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.board.lib.boardSaveProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BoardSave");
    }
  }

  private static final class BoardSaveFileDescriptorSupplier
      extends BoardSaveBaseDescriptorSupplier {
    BoardSaveFileDescriptorSupplier() {}
  }

  private static final class BoardSaveMethodDescriptorSupplier
      extends BoardSaveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BoardSaveMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BoardSaveGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BoardSaveFileDescriptorSupplier())
              .addMethod(getBoardSaveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
