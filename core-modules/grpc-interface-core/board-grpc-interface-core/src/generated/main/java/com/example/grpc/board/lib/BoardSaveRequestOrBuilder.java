// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boardSaveInterface.proto

package com.example.grpc.board.lib;

public interface BoardSaveRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BoardSaveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string content = 2;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>.google.protobuf.Timestamp uploadDatetime = 3;</code>
   * @return Whether the uploadDatetime field is set.
   */
  boolean hasUploadDatetime();
  /**
   * <code>.google.protobuf.Timestamp uploadDatetime = 3;</code>
   * @return The uploadDatetime.
   */
  com.google.protobuf.Timestamp getUploadDatetime();
  /**
   * <code>.google.protobuf.Timestamp uploadDatetime = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUploadDatetimeOrBuilder();
}
