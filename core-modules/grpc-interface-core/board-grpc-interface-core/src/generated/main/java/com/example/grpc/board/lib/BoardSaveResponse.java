// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boardSaveInterface.proto

package com.example.grpc.board.lib;

/**
 * Protobuf type {@code BoardSaveResponse}
 */
public final class BoardSaveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BoardSaveResponse)
    BoardSaveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoardSaveResponse.newBuilder() to construct.
  private BoardSaveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoardSaveResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoardSaveResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.board.lib.boardSaveProtobuf.internal_static_BoardSaveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.board.lib.boardSaveProtobuf.internal_static_BoardSaveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.board.lib.BoardSaveResponse.class, com.example.grpc.board.lib.BoardSaveResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESPONSE_FIELD_NUMBER = 1;
  private com.example.grpc.board.lib.BoardSaveRequest response_;
  /**
   * <code>.BoardSaveRequest response = 1;</code>
   * @return Whether the response field is set.
   */
  @java.lang.Override
  public boolean hasResponse() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.BoardSaveRequest response = 1;</code>
   * @return The response.
   */
  @java.lang.Override
  public com.example.grpc.board.lib.BoardSaveRequest getResponse() {
    return response_ == null ? com.example.grpc.board.lib.BoardSaveRequest.getDefaultInstance() : response_;
  }
  /**
   * <code>.BoardSaveRequest response = 1;</code>
   */
  @java.lang.Override
  public com.example.grpc.board.lib.BoardSaveRequestOrBuilder getResponseOrBuilder() {
    return response_ == null ? com.example.grpc.board.lib.BoardSaveRequest.getDefaultInstance() : response_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getResponse());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.board.lib.BoardSaveResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.board.lib.BoardSaveResponse other = (com.example.grpc.board.lib.BoardSaveResponse) obj;

    if (hasResponse() != other.hasResponse()) return false;
    if (hasResponse()) {
      if (!getResponse()
          .equals(other.getResponse())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.grpc.board.lib.BoardSaveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.grpc.board.lib.BoardSaveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.board.lib.BoardSaveResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.board.lib.BoardSaveResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code BoardSaveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BoardSaveResponse)
      com.example.grpc.board.lib.BoardSaveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.board.lib.boardSaveProtobuf.internal_static_BoardSaveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.board.lib.boardSaveProtobuf.internal_static_BoardSaveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.board.lib.BoardSaveResponse.class, com.example.grpc.board.lib.BoardSaveResponse.Builder.class);
    }

    // Construct using com.example.grpc.board.lib.BoardSaveResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResponseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.board.lib.boardSaveProtobuf.internal_static_BoardSaveResponse_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.board.lib.BoardSaveResponse getDefaultInstanceForType() {
      return com.example.grpc.board.lib.BoardSaveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.board.lib.BoardSaveResponse build() {
      com.example.grpc.board.lib.BoardSaveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.board.lib.BoardSaveResponse buildPartial() {
      com.example.grpc.board.lib.BoardSaveResponse result = new com.example.grpc.board.lib.BoardSaveResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.grpc.board.lib.BoardSaveResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.response_ = responseBuilder_ == null
            ? response_
            : responseBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.board.lib.BoardSaveResponse) {
        return mergeFrom((com.example.grpc.board.lib.BoardSaveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.board.lib.BoardSaveResponse other) {
      if (other == com.example.grpc.board.lib.BoardSaveResponse.getDefaultInstance()) return this;
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.example.grpc.board.lib.BoardSaveRequest response_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.board.lib.BoardSaveRequest, com.example.grpc.board.lib.BoardSaveRequest.Builder, com.example.grpc.board.lib.BoardSaveRequestOrBuilder> responseBuilder_;
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     * @return The response.
     */
    public com.example.grpc.board.lib.BoardSaveRequest getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? com.example.grpc.board.lib.BoardSaveRequest.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    public Builder setResponse(com.example.grpc.board.lib.BoardSaveRequest value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    public Builder setResponse(
        com.example.grpc.board.lib.BoardSaveRequest.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    public Builder mergeResponse(com.example.grpc.board.lib.BoardSaveRequest value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          response_ != null &&
          response_ != com.example.grpc.board.lib.BoardSaveRequest.getDefaultInstance()) {
          getResponseBuilder().mergeFrom(value);
        } else {
          response_ = value;
        }
      } else {
        responseBuilder_.mergeFrom(value);
      }
      if (response_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    public Builder clearResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    public com.example.grpc.board.lib.BoardSaveRequest.Builder getResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    public com.example.grpc.board.lib.BoardSaveRequestOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ?
            com.example.grpc.board.lib.BoardSaveRequest.getDefaultInstance() : response_;
      }
    }
    /**
     * <code>.BoardSaveRequest response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.board.lib.BoardSaveRequest, com.example.grpc.board.lib.BoardSaveRequest.Builder, com.example.grpc.board.lib.BoardSaveRequestOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.board.lib.BoardSaveRequest, com.example.grpc.board.lib.BoardSaveRequest.Builder, com.example.grpc.board.lib.BoardSaveRequestOrBuilder>(
                getResponse(),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BoardSaveResponse)
  }

  // @@protoc_insertion_point(class_scope:BoardSaveResponse)
  private static final com.example.grpc.board.lib.BoardSaveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.board.lib.BoardSaveResponse();
  }

  public static com.example.grpc.board.lib.BoardSaveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoardSaveResponse>
      PARSER = new com.google.protobuf.AbstractParser<BoardSaveResponse>() {
    @java.lang.Override
    public BoardSaveResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BoardSaveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoardSaveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.board.lib.BoardSaveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

