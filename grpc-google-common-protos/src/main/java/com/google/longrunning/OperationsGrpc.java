/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.longrunning;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/longrunning/operations.proto")
public final class OperationsGrpc {

  private OperationsGrpc() {}

  public static final String SERVICE_NAME = "google.longrunning.Operations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.longrunning.ListOperationsRequest,
          com.google.longrunning.ListOperationsResponse>
      getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = com.google.longrunning.ListOperationsRequest.class,
      responseType = com.google.longrunning.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.longrunning.ListOperationsRequest,
          com.google.longrunning.ListOperationsResponse>
      getListOperationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.longrunning.ListOperationsRequest,
            com.google.longrunning.ListOperationsResponse>
        getListOperationsMethod;
    if ((getListOperationsMethod = OperationsGrpc.getListOperationsMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getListOperationsMethod = OperationsGrpc.getListOperationsMethod) == null) {
          OperationsGrpc.getListOperationsMethod =
              getListOperationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.longrunning.ListOperationsRequest,
                          com.google.longrunning.ListOperationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.ListOperationsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.ListOperationsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("ListOperations"))
                      .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation>
      getGetOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperation",
      requestType = com.google.longrunning.GetOperationRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation>
      getGetOperationMethod() {
    io.grpc.MethodDescriptor<
            com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation>
        getGetOperationMethod;
    if ((getGetOperationMethod = OperationsGrpc.getGetOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getGetOperationMethod = OperationsGrpc.getGetOperationMethod) == null) {
          OperationsGrpc.getGetOperationMethod =
              getGetOperationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.longrunning.GetOperationRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.GetOperationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("GetOperation"))
                      .build();
        }
      }
    }
    return getGetOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.longrunning.DeleteOperationRequest, com.google.protobuf.Empty>
      getDeleteOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOperation",
      requestType = com.google.longrunning.DeleteOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.longrunning.DeleteOperationRequest, com.google.protobuf.Empty>
      getDeleteOperationMethod() {
    io.grpc.MethodDescriptor<
            com.google.longrunning.DeleteOperationRequest, com.google.protobuf.Empty>
        getDeleteOperationMethod;
    if ((getDeleteOperationMethod = OperationsGrpc.getDeleteOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getDeleteOperationMethod = OperationsGrpc.getDeleteOperationMethod) == null) {
          OperationsGrpc.getDeleteOperationMethod =
              getDeleteOperationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.longrunning.DeleteOperationRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOperation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.DeleteOperationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OperationsMethodDescriptorSupplier("DeleteOperation"))
                      .build();
        }
      }
    }
    return getDeleteOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.longrunning.CancelOperationRequest, com.google.protobuf.Empty>
      getCancelOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOperation",
      requestType = com.google.longrunning.CancelOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.longrunning.CancelOperationRequest, com.google.protobuf.Empty>
      getCancelOperationMethod() {
    io.grpc.MethodDescriptor<
            com.google.longrunning.CancelOperationRequest, com.google.protobuf.Empty>
        getCancelOperationMethod;
    if ((getCancelOperationMethod = OperationsGrpc.getCancelOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getCancelOperationMethod = OperationsGrpc.getCancelOperationMethod) == null) {
          OperationsGrpc.getCancelOperationMethod =
              getCancelOperationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.longrunning.CancelOperationRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOperation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.CancelOperationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new OperationsMethodDescriptorSupplier("CancelOperation"))
                      .build();
        }
      }
    }
    return getCancelOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.longrunning.WaitOperationRequest, com.google.longrunning.Operation>
      getWaitOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitOperation",
      requestType = com.google.longrunning.WaitOperationRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.longrunning.WaitOperationRequest, com.google.longrunning.Operation>
      getWaitOperationMethod() {
    io.grpc.MethodDescriptor<
            com.google.longrunning.WaitOperationRequest, com.google.longrunning.Operation>
        getWaitOperationMethod;
    if ((getWaitOperationMethod = OperationsGrpc.getWaitOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getWaitOperationMethod = OperationsGrpc.getWaitOperationMethod) == null) {
          OperationsGrpc.getWaitOperationMethod =
              getWaitOperationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.longrunning.WaitOperationRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitOperation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.WaitOperationRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("WaitOperation"))
                      .build();
        }
      }
    }
    return getWaitOperationMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static OperationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<OperationsStub>() {
          @java.lang.Override
          public OperationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new OperationsStub(channel, callOptions);
          }
        };
    return OperationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationsBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingStub>() {
          @java.lang.Override
          public OperationsBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new OperationsBlockingStub(channel, callOptions);
          }
        };
    return OperationsBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static OperationsFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<OperationsFutureStub>() {
          @java.lang.Override
          public OperationsFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new OperationsFutureStub(channel, callOptions);
          }
        };
    return OperationsFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class OperationsImplBase implements io.grpc.BindableService {

    /** */
    public void listOperations(
        com.google.longrunning.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.ListOperationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /** */
    public void getOperation(
        com.google.longrunning.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOperationMethod(), responseObserver);
    }

    /** */
    public void deleteOperation(
        com.google.longrunning.DeleteOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOperationMethod(), responseObserver);
    }

    /** */
    public void cancelOperation(
        com.google.longrunning.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelOperationMethod(), responseObserver);
    }

    /** */
    public void waitOperation(
        com.google.longrunning.WaitOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getWaitOperationMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListOperationsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.longrunning.ListOperationsRequest,
                      com.google.longrunning.ListOperationsResponse>(
                      this, METHODID_LIST_OPERATIONS)))
          .addMethod(
              getGetOperationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.longrunning.GetOperationRequest, com.google.longrunning.Operation>(
                      this, METHODID_GET_OPERATION)))
          .addMethod(
              getDeleteOperationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.longrunning.DeleteOperationRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_OPERATION)))
          .addMethod(
              getCancelOperationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.longrunning.CancelOperationRequest, com.google.protobuf.Empty>(
                      this, METHODID_CANCEL_OPERATION)))
          .addMethod(
              getWaitOperationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.longrunning.WaitOperationRequest,
                      com.google.longrunning.Operation>(this, METHODID_WAIT_OPERATION)))
          .build();
    }
  }

  /** */
  public static final class OperationsStub extends io.grpc.stub.AbstractAsyncStub<OperationsStub> {
    private OperationsStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsStub(channel, callOptions);
    }

    /** */
    public void listOperations(
        com.google.longrunning.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.ListOperationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getOperation(
        com.google.longrunning.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOperationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteOperation(
        com.google.longrunning.DeleteOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOperationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void cancelOperation(
        com.google.longrunning.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void waitOperation(
        com.google.longrunning.WaitOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWaitOperationMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class OperationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OperationsBlockingStub> {
    private OperationsBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.longrunning.ListOperationsResponse listOperations(
        com.google.longrunning.ListOperationsRequest request) {
      return blockingUnaryCall(getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation getOperation(
        com.google.longrunning.GetOperationRequest request) {
      return blockingUnaryCall(getChannel(), getGetOperationMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteOperation(
        com.google.longrunning.DeleteOperationRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteOperationMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty cancelOperation(
        com.google.longrunning.CancelOperationRequest request) {
      return blockingUnaryCall(getChannel(), getCancelOperationMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation waitOperation(
        com.google.longrunning.WaitOperationRequest request) {
      return blockingUnaryCall(getChannel(), getWaitOperationMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class OperationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<OperationsFutureStub> {
    private OperationsFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.longrunning.ListOperationsResponse>
        listOperations(com.google.longrunning.ListOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        getOperation(com.google.longrunning.GetOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOperationMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteOperation(com.google.longrunning.DeleteOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOperationMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        cancelOperation(com.google.longrunning.CancelOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        waitOperation(com.google.longrunning.WaitOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWaitOperationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_OPERATIONS = 0;
  private static final int METHODID_GET_OPERATION = 1;
  private static final int METHODID_DELETE_OPERATION = 2;
  private static final int METHODID_CANCEL_OPERATION = 3;
  private static final int METHODID_WAIT_OPERATION = 4;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations(
              (com.google.longrunning.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.ListOperationsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_OPERATION:
          serviceImpl.getOperation(
              (com.google.longrunning.GetOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_OPERATION:
          serviceImpl.deleteOperation(
              (com.google.longrunning.DeleteOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation(
              (com.google.longrunning.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_WAIT_OPERATION:
          serviceImpl.waitOperation(
              (com.google.longrunning.WaitOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private abstract static class OperationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.longrunning.OperationsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Operations");
    }
  }

  private static final class OperationsFileDescriptorSupplier
      extends OperationsBaseDescriptorSupplier {
    OperationsFileDescriptorSupplier() {}
  }

  private static final class OperationsMethodDescriptorSupplier
      extends OperationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OperationsMethodDescriptorSupplier(String methodName) {
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
      synchronized (OperationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new OperationsFileDescriptorSupplier())
                      .addMethod(getListOperationsMethod())
                      .addMethod(getGetOperationMethod())
                      .addMethod(getDeleteOperationMethod())
                      .addMethod(getCancelOperationMethod())
                      .addMethod(getWaitOperationMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
