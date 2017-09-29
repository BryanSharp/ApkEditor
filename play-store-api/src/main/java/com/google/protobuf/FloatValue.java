// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/wrappers.proto

package com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `float`.
 * The JSON representation for `FloatValue` is JSON number.
 * </pre>
 * <p>
 * Protobuf type {@code google.protobuf.FloatValue}
 */
public final class FloatValue extends
        com.google.protobuf.GeneratedMessageLite<
                FloatValue, FloatValue.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.FloatValue)
        FloatValueOrBuilder {
    public static final int VALUE_FIELD_NUMBER = 1;
    // @@protoc_insertion_point(class_scope:google.protobuf.FloatValue)
    private static final com.google.protobuf.FloatValue DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<FloatValue> PARSER;

    static {
        DEFAULT_INSTANCE = new FloatValue();
        DEFAULT_INSTANCE.makeImmutable();
    }

    private float value_;

    private FloatValue() {
    }

    public static com.google.protobuf.FloatValue parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.FloatValue parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.FloatValue parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.FloatValue parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.FloatValue parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.FloatValue parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.FloatValue parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.FloatValue parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.FloatValue parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.FloatValue parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.google.protobuf.FloatValue prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.google.protobuf.FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<FloatValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /**
     * <pre>
     * The float value.
     * </pre>
     * <p>
     * <code>optional float value = 1;</code>
     */
    public float getValue() {
        return value_;
    }

    /**
     * <pre>
     * The float value.
     * </pre>
     * <p>
     * <code>optional float value = 1;</code>
     */
    private void setValue(float value) {

        value_ = value;
    }

    /**
     * <pre>
     * The float value.
     * </pre>
     * <p>
     * <code>optional float value = 1;</code>
     */
    private void clearValue() {

        value_ = 0F;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (value_ != 0F) {
            output.writeFloat(1, value_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (value_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(1, value_);
        }
        memoizedSerializedSize = size;
        return size;
    }

    protected final Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new com.google.protobuf.FloatValue();
            }
            case IS_INITIALIZED: {
                return DEFAULT_INSTANCE;
            }
            case MAKE_IMMUTABLE: {
                return null;
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case VISIT: {
                Visitor visitor = (Visitor) arg0;
                com.google.protobuf.FloatValue other = (com.google.protobuf.FloatValue) arg1;
                value_ = visitor.visitFloat(value_ != 0F, value_,
                        other.value_ != 0F, other.value_);
                if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
                        .INSTANCE) {
                }
                return this;
            }
            case MERGE_FROM_STREAM: {
                com.google.protobuf.CodedInputStream input =
                        (com.google.protobuf.CodedInputStream) arg0;
                com.google.protobuf.ExtensionRegistryLite extensionRegistry =
                        (com.google.protobuf.ExtensionRegistryLite) arg1;
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!input.skipField(tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 13: {

                                value_ = input.readFloat();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw new RuntimeException(e.setUnfinishedMessage(this));
                } catch (java.io.IOException e) {
                    throw new RuntimeException(
                            new com.google.protobuf.InvalidProtocolBufferException(
                                    e.getMessage()).setUnfinishedMessage(this));
                } finally {
                }
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                if (PARSER == null) {
                    synchronized (com.google.protobuf.FloatValue.class) {
                        if (PARSER == null) {
                            PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            }
        }
        throw new UnsupportedOperationException();
    }

    /**
     * <pre>
     * Wrapper message for `float`.
     * The JSON representation for `FloatValue` is JSON number.
     * </pre>
     * <p>
     * Protobuf type {@code google.protobuf.FloatValue}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    com.google.protobuf.FloatValue, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.FloatValue)
            com.google.protobuf.FloatValueOrBuilder {
        // Construct using com.google.protobuf.FloatValue.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The float value.
         * </pre>
         * <p>
         * <code>optional float value = 1;</code>
         */
        public float getValue() {
            return instance.getValue();
        }

        /**
         * <pre>
         * The float value.
         * </pre>
         * <p>
         * <code>optional float value = 1;</code>
         */
        public Builder setValue(float value) {
            copyOnWrite();
            instance.setValue(value);
            return this;
        }

        /**
         * <pre>
         * The float value.
         * </pre>
         * <p>
         * <code>optional float value = 1;</code>
         */
        public Builder clearValue() {
            copyOnWrite();
            instance.clearValue();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.FloatValue)
    }
}

