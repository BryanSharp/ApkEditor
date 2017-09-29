// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

public interface EnumValueOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.protobuf.EnumValue)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Enum value name.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();

    /**
     * <pre>
     * Enum value name.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <pre>
     * Enum value number.
     * </pre>
     * <p>
     * <code>optional int32 number = 2;</code>
     */
    int getNumber();

    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    java.util.List<com.google.protobuf.Option>
    getOptionsList();

    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    com.google.protobuf.Option getOptions(int index);

    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    int getOptionsCount();
}
