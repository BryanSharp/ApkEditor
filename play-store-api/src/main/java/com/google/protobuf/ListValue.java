// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package com.google.protobuf;

/**
 * <pre>
 * `ListValue` is a wrapper around a repeated field of values.
 * The JSON representation for `ListValue` is JSON array.
 * </pre>
 * <p>
 * Protobuf type {@code google.protobuf.ListValue}
 */
public final class ListValue extends
        com.google.protobuf.GeneratedMessageLite<
                ListValue, ListValue.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.ListValue)
        ListValueOrBuilder {
    public static final int VALUES_FIELD_NUMBER = 1;
    // @@protoc_insertion_point(class_scope:google.protobuf.ListValue)
    private static final com.google.protobuf.ListValue DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<ListValue> PARSER;

    static {
        DEFAULT_INSTANCE = new ListValue();
        DEFAULT_INSTANCE.makeImmutable();
    }

    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Value> values_;

    private ListValue() {
        values_ = emptyProtobufList();
    }

    public static com.google.protobuf.ListValue parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.ListValue parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.ListValue parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.ListValue parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.ListValue parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.ListValue parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.ListValue parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.google.protobuf.ListValue prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.google.protobuf.ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public java.util.List<com.google.protobuf.Value> getValuesList() {
        return values_;
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public java.util.List<? extends com.google.protobuf.ValueOrBuilder>
    getValuesOrBuilderList() {
        return values_;
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public int getValuesCount() {
        return values_.size();
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public com.google.protobuf.Value getValues(int index) {
        return values_.get(index);
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public com.google.protobuf.ValueOrBuilder getValuesOrBuilder(
            int index) {
        return values_.get(index);
    }

    private void ensureValuesIsMutable() {
        if (!values_.isModifiable()) {
            values_ =
                    com.google.protobuf.GeneratedMessageLite.mutableCopy(values_);
        }
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void setValues(
            int index, com.google.protobuf.Value value) {
        if (value == null) {
            throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void setValues(
            int index, com.google.protobuf.Value.Builder builderForValue) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addValues(com.google.protobuf.Value value) {
        if (value == null) {
            throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addValues(
            int index, com.google.protobuf.Value value) {
        if (value == null) {
            throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addValues(
            com.google.protobuf.Value.Builder builderForValue) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addValues(
            int index, com.google.protobuf.Value.Builder builderForValue) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addAllValues(
            java.lang.Iterable<? extends com.google.protobuf.Value> values) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(
                values, values_);
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void clearValues() {
        values_ = emptyProtobufList();
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     * <p>
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void removeValues(int index) {
        ensureValuesIsMutable();
        values_.remove(index);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        for (int i = 0; i < values_.size(); i++) {
            output.writeMessage(1, values_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < values_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, values_.get(i));
        }
        memoizedSerializedSize = size;
        return size;
    }

    protected final Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new com.google.protobuf.ListValue();
            }
            case IS_INITIALIZED: {
                return DEFAULT_INSTANCE;
            }
            case MAKE_IMMUTABLE: {
                values_.makeImmutable();
                return null;
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case VISIT: {
                Visitor visitor = (Visitor) arg0;
                com.google.protobuf.ListValue other = (com.google.protobuf.ListValue) arg1;
                values_ = visitor.visitList(values_, other.values_);
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
                            case 10: {
                                if (!values_.isModifiable()) {
                                    values_ =
                                            com.google.protobuf.GeneratedMessageLite.mutableCopy(values_);
                                }
                                values_.add(
                                        input.readMessage(com.google.protobuf.Value.parser(), extensionRegistry));
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
                    synchronized (com.google.protobuf.ListValue.class) {
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
     * `ListValue` is a wrapper around a repeated field of values.
     * The JSON representation for `ListValue` is JSON array.
     * </pre>
     * <p>
     * Protobuf type {@code google.protobuf.ListValue}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    com.google.protobuf.ListValue, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.ListValue)
            com.google.protobuf.ListValueOrBuilder {
        // Construct using com.google.protobuf.ListValue.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public java.util.List<com.google.protobuf.Value> getValuesList() {
            return java.util.Collections.unmodifiableList(
                    instance.getValuesList());
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public int getValuesCount() {
            return instance.getValuesCount();
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public com.google.protobuf.Value getValues(int index) {
            return instance.getValues(index);
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder setValues(
                int index, com.google.protobuf.Value value) {
            copyOnWrite();
            instance.setValues(index, value);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder setValues(
                int index, com.google.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            instance.setValues(index, builderForValue);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(com.google.protobuf.Value value) {
            copyOnWrite();
            instance.addValues(value);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(
                int index, com.google.protobuf.Value value) {
            copyOnWrite();
            instance.addValues(index, value);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(
                com.google.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            instance.addValues(builderForValue);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(
                int index, com.google.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            instance.addValues(index, builderForValue);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addAllValues(
                java.lang.Iterable<? extends com.google.protobuf.Value> values) {
            copyOnWrite();
            instance.addAllValues(values);
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder clearValues() {
            copyOnWrite();
            instance.clearValues();
            return this;
        }

        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         * <p>
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder removeValues(int index) {
            copyOnWrite();
            instance.removeValues(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.ListValue)
    }
}

