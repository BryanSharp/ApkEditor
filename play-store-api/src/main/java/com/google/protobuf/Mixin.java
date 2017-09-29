// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package com.google.protobuf;

/**
 * <pre>
 * Declares an API to be included in this API. The including API must
 * redeclare all the methods from the included API, but documentation
 * and options are inherited as follows:
 * - If after comment and whitespace stripping, the documentation
 *   string of the redeclared method is empty, it will be inherited
 *   from the original method.
 * - Each annotation belonging to the service config (http,
 *   visibility) which is not set in the redeclared method will be
 *   inherited.
 * - If an http annotation is inherited, the path pattern will be
 *   modified as follows. Any version prefix will be replaced by the
 *   version of the including API plus the [root][] path if specified.
 * Example of a simple mixin:
 *     package google.acl.v1;
 *     service AccessControl {
 *       // Get the underlying ACL object.
 *       rpc GetAcl(GetAclRequest) returns (Acl) {
 *         option (google.api.http).get = "/v1/{resource=**}:getAcl";
 *       }
 *     }
 *     package google.storage.v2;
 *     service Storage {
 *       rpc GetAcl(GetAclRequest) returns (Acl);
 *       // Get a data record.
 *       rpc GetData(GetDataRequest) returns (Data) {
 *         option (google.api.http).get = "/v2/{resource=**}";
 *       }
 *     }
 * Example of a mixin configuration:
 *     apis:
 *     - name: google.storage.v2.Storage
 *       mixins:
 *       - name: google.acl.v1.AccessControl
 * The mixin construct implies that all methods in `AccessControl` are
 * also declared with same name and request/response types in
 * `Storage`. A documentation generator or annotation processor will
 * see the effective `Storage.GetAcl` method after inherting
 * documentation and annotations as follows:
 *     service Storage {
 *       // Get the underlying ACL object.
 *       rpc GetAcl(GetAclRequest) returns (Acl) {
 *         option (google.api.http).get = "/v2/{resource=**}:getAcl";
 *       }
 *       ...
 *     }
 * Note how the version in the path pattern changed from `v1` to `v2`.
 * If the `root` field in the mixin is specified, it should be a
 * relative path under which inherited HTTP paths are placed. Example:
 *     apis:
 *     - name: google.storage.v2.Storage
 *       mixins:
 *       - name: google.acl.v1.AccessControl
 *         root: acls
 * This implies the following inherited HTTP annotation:
 *     service Storage {
 *       // Get the underlying ACL object.
 *       rpc GetAcl(GetAclRequest) returns (Acl) {
 *         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
 *       }
 *       ...
 *     }
 * </pre>
 * <p>
 * Protobuf type {@code google.protobuf.Mixin}
 */
public final class Mixin extends
        com.google.protobuf.GeneratedMessageLite<
                Mixin, Mixin.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.Mixin)
        MixinOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ROOT_FIELD_NUMBER = 2;
    // @@protoc_insertion_point(class_scope:google.protobuf.Mixin)
    private static final com.google.protobuf.Mixin DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<Mixin> PARSER;

    static {
        DEFAULT_INSTANCE = new Mixin();
        DEFAULT_INSTANCE.makeImmutable();
    }

    private java.lang.String name_;
    private java.lang.String root_;

    private Mixin() {
        name_ = "";
        root_ = "";
    }

    public static com.google.protobuf.Mixin parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Mixin parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Mixin parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Mixin parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Mixin parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Mixin parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Mixin parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Mixin parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Mixin parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Mixin parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.google.protobuf.Mixin prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.google.protobuf.Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<Mixin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
        return name_;
    }

    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    private void setName(
            java.lang.String value) {
        if (value == null) {
            throw new NullPointerException();
        }

        name_ = value;
    }

    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
    getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }

    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    private void setNameBytes(
            com.google.protobuf.ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        name_ = value.toStringUtf8();
    }

    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     * <p>
     * <code>optional string name = 1;</code>
     */
    private void clearName() {

        name_ = getDefaultInstance().getName();
    }

    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     * <p>
     * <code>optional string root = 2;</code>
     */
    public java.lang.String getRoot() {
        return root_;
    }

    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     * <p>
     * <code>optional string root = 2;</code>
     */
    private void setRoot(
            java.lang.String value) {
        if (value == null) {
            throw new NullPointerException();
        }

        root_ = value;
    }

    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     * <p>
     * <code>optional string root = 2;</code>
     */
    public com.google.protobuf.ByteString
    getRootBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(root_);
    }

    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     * <p>
     * <code>optional string root = 2;</code>
     */
    private void setRootBytes(
            com.google.protobuf.ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        root_ = value.toStringUtf8();
    }

    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     * <p>
     * <code>optional string root = 2;</code>
     */
    private void clearRoot() {

        root_ = getDefaultInstance().getRoot();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!name_.isEmpty()) {
            output.writeString(1, getName());
        }
        if (!root_.isEmpty()) {
            output.writeString(2, getRoot());
        }
    }

    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (!name_.isEmpty()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeStringSize(1, getName());
        }
        if (!root_.isEmpty()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeStringSize(2, getRoot());
        }
        memoizedSerializedSize = size;
        return size;
    }

    protected final Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new com.google.protobuf.Mixin();
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
                com.google.protobuf.Mixin other = (com.google.protobuf.Mixin) arg1;
                name_ = visitor.visitString(!name_.isEmpty(), name_,
                        !other.name_.isEmpty(), other.name_);
                root_ = visitor.visitString(!root_.isEmpty(), root_,
                        !other.root_.isEmpty(), other.root_);
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
                                String s = input.readStringRequireUtf8();

                                name_ = s;
                                break;
                            }
                            case 18: {
                                String s = input.readStringRequireUtf8();

                                root_ = s;
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
                    synchronized (com.google.protobuf.Mixin.class) {
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
     * Declares an API to be included in this API. The including API must
     * redeclare all the methods from the included API, but documentation
     * and options are inherited as follows:
     * - If after comment and whitespace stripping, the documentation
     *   string of the redeclared method is empty, it will be inherited
     *   from the original method.
     * - Each annotation belonging to the service config (http,
     *   visibility) which is not set in the redeclared method will be
     *   inherited.
     * - If an http annotation is inherited, the path pattern will be
     *   modified as follows. Any version prefix will be replaced by the
     *   version of the including API plus the [root][] path if specified.
     * Example of a simple mixin:
     *     package google.acl.v1;
     *     service AccessControl {
     *       // Get the underlying ACL object.
     *       rpc GetAcl(GetAclRequest) returns (Acl) {
     *         option (google.api.http).get = "/v1/{resource=**}:getAcl";
     *       }
     *     }
     *     package google.storage.v2;
     *     service Storage {
     *       rpc GetAcl(GetAclRequest) returns (Acl);
     *       // Get a data record.
     *       rpc GetData(GetDataRequest) returns (Data) {
     *         option (google.api.http).get = "/v2/{resource=**}";
     *       }
     *     }
     * Example of a mixin configuration:
     *     apis:
     *     - name: google.storage.v2.Storage
     *       mixins:
     *       - name: google.acl.v1.AccessControl
     * The mixin construct implies that all methods in `AccessControl` are
     * also declared with same name and request/response types in
     * `Storage`. A documentation generator or annotation processor will
     * see the effective `Storage.GetAcl` method after inherting
     * documentation and annotations as follows:
     *     service Storage {
     *       // Get the underlying ACL object.
     *       rpc GetAcl(GetAclRequest) returns (Acl) {
     *         option (google.api.http).get = "/v2/{resource=**}:getAcl";
     *       }
     *       ...
     *     }
     * Note how the version in the path pattern changed from `v1` to `v2`.
     * If the `root` field in the mixin is specified, it should be a
     * relative path under which inherited HTTP paths are placed. Example:
     *     apis:
     *     - name: google.storage.v2.Storage
     *       mixins:
     *       - name: google.acl.v1.AccessControl
     *         root: acls
     * This implies the following inherited HTTP annotation:
     *     service Storage {
     *       // Get the underlying ACL object.
     *       rpc GetAcl(GetAclRequest) returns (Acl) {
     *         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
     *       }
     *       ...
     *     }
     * </pre>
     * <p>
     * Protobuf type {@code google.protobuf.Mixin}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    com.google.protobuf.Mixin, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.Mixin)
            com.google.protobuf.MixinOrBuilder {
        // Construct using com.google.protobuf.Mixin.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The fully qualified name of the API which is included.
         * </pre>
         * <p>
         * <code>optional string name = 1;</code>
         */
        public java.lang.String getName() {
            return instance.getName();
        }

        /**
         * <pre>
         * The fully qualified name of the API which is included.
         * </pre>
         * <p>
         * <code>optional string name = 1;</code>
         */
        public Builder setName(
                java.lang.String value) {
            copyOnWrite();
            instance.setName(value);
            return this;
        }

        /**
         * <pre>
         * The fully qualified name of the API which is included.
         * </pre>
         * <p>
         * <code>optional string name = 1;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            return instance.getNameBytes();
        }

        /**
         * <pre>
         * The fully qualified name of the API which is included.
         * </pre>
         * <p>
         * <code>optional string name = 1;</code>
         */
        public Builder setNameBytes(
                com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setNameBytes(value);
            return this;
        }

        /**
         * <pre>
         * The fully qualified name of the API which is included.
         * </pre>
         * <p>
         * <code>optional string name = 1;</code>
         */
        public Builder clearName() {
            copyOnWrite();
            instance.clearName();
            return this;
        }

        /**
         * <pre>
         * If non-empty specifies a path under which inherited HTTP paths
         * are rooted.
         * </pre>
         * <p>
         * <code>optional string root = 2;</code>
         */
        public java.lang.String getRoot() {
            return instance.getRoot();
        }

        /**
         * <pre>
         * If non-empty specifies a path under which inherited HTTP paths
         * are rooted.
         * </pre>
         * <p>
         * <code>optional string root = 2;</code>
         */
        public Builder setRoot(
                java.lang.String value) {
            copyOnWrite();
            instance.setRoot(value);
            return this;
        }

        /**
         * <pre>
         * If non-empty specifies a path under which inherited HTTP paths
         * are rooted.
         * </pre>
         * <p>
         * <code>optional string root = 2;</code>
         */
        public com.google.protobuf.ByteString
        getRootBytes() {
            return instance.getRootBytes();
        }

        /**
         * <pre>
         * If non-empty specifies a path under which inherited HTTP paths
         * are rooted.
         * </pre>
         * <p>
         * <code>optional string root = 2;</code>
         */
        public Builder setRootBytes(
                com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setRootBytes(value);
            return this;
        }

        /**
         * <pre>
         * If non-empty specifies a path under which inherited HTTP paths
         * are rooted.
         * </pre>
         * <p>
         * <code>optional string root = 2;</code>
         */
        public Builder clearRoot() {
            copyOnWrite();
            instance.clearRoot();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.Mixin)
    }
}

