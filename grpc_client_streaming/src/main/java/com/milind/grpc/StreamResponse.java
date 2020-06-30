// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clientstream.proto

package com.milind.grpc;

/**
 * Protobuf type {@code com.milind.grpc.StreamResponse}
 */
public  final class StreamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.milind.grpc.StreamResponse)
    StreamResponseOrBuilder {
  // Use StreamResponse.newBuilder() to construct.
  private StreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamResponse() {
    empList_ = "";
    totalEmp_ = 0L;
    averageMarks_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StreamResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            empList_ = s;
            break;
          }
          case 16: {

            totalEmp_ = input.readInt64();
            break;
          }
          case 24: {

            averageMarks_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.milind.grpc.Clientstream.internal_static_com_milind_grpc_StreamResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.milind.grpc.Clientstream.internal_static_com_milind_grpc_StreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.milind.grpc.StreamResponse.class, com.milind.grpc.StreamResponse.Builder.class);
  }

  public static final int EMPLIST_FIELD_NUMBER = 1;
  private volatile java.lang.Object empList_;
  /**
   * <code>optional string empList = 1;</code>
   */
  public java.lang.String getEmpList() {
    java.lang.Object ref = empList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      empList_ = s;
      return s;
    }
  }
  /**
   * <code>optional string empList = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEmpListBytes() {
    java.lang.Object ref = empList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      empList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTALEMP_FIELD_NUMBER = 2;
  private long totalEmp_;
  /**
   * <code>optional int64 totalEmp = 2;</code>
   */
  public long getTotalEmp() {
    return totalEmp_;
  }

  public static final int AVERAGEMARKS_FIELD_NUMBER = 3;
  private long averageMarks_;
  /**
   * <code>optional int64 averageMarks = 3;</code>
   */
  public long getAverageMarks() {
    return averageMarks_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getEmpListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, empList_);
    }
    if (totalEmp_ != 0L) {
      output.writeInt64(2, totalEmp_);
    }
    if (averageMarks_ != 0L) {
      output.writeInt64(3, averageMarks_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEmpListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, empList_);
    }
    if (totalEmp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalEmp_);
    }
    if (averageMarks_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, averageMarks_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.milind.grpc.StreamResponse)) {
      return super.equals(obj);
    }
    com.milind.grpc.StreamResponse other = (com.milind.grpc.StreamResponse) obj;

    boolean result = true;
    result = result && getEmpList()
        .equals(other.getEmpList());
    result = result && (getTotalEmp()
        == other.getTotalEmp());
    result = result && (getAverageMarks()
        == other.getAverageMarks());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + EMPLIST_FIELD_NUMBER;
    hash = (53 * hash) + getEmpList().hashCode();
    hash = (37 * hash) + TOTALEMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalEmp());
    hash = (37 * hash) + AVERAGEMARKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAverageMarks());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.milind.grpc.StreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.milind.grpc.StreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.milind.grpc.StreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.milind.grpc.StreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.milind.grpc.StreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.milind.grpc.StreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.milind.grpc.StreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.milind.grpc.StreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.milind.grpc.StreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.milind.grpc.StreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.milind.grpc.StreamResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.milind.grpc.StreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.milind.grpc.StreamResponse)
      com.milind.grpc.StreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.milind.grpc.Clientstream.internal_static_com_milind_grpc_StreamResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.milind.grpc.Clientstream.internal_static_com_milind_grpc_StreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.milind.grpc.StreamResponse.class, com.milind.grpc.StreamResponse.Builder.class);
    }

    // Construct using com.milind.grpc.StreamResponse.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      empList_ = "";

      totalEmp_ = 0L;

      averageMarks_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.milind.grpc.Clientstream.internal_static_com_milind_grpc_StreamResponse_descriptor;
    }

    public com.milind.grpc.StreamResponse getDefaultInstanceForType() {
      return com.milind.grpc.StreamResponse.getDefaultInstance();
    }

    public com.milind.grpc.StreamResponse build() {
      com.milind.grpc.StreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.milind.grpc.StreamResponse buildPartial() {
      com.milind.grpc.StreamResponse result = new com.milind.grpc.StreamResponse(this);
      result.empList_ = empList_;
      result.totalEmp_ = totalEmp_;
      result.averageMarks_ = averageMarks_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.milind.grpc.StreamResponse) {
        return mergeFrom((com.milind.grpc.StreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.milind.grpc.StreamResponse other) {
      if (other == com.milind.grpc.StreamResponse.getDefaultInstance()) return this;
      if (!other.getEmpList().isEmpty()) {
        empList_ = other.empList_;
        onChanged();
      }
      if (other.getTotalEmp() != 0L) {
        setTotalEmp(other.getTotalEmp());
      }
      if (other.getAverageMarks() != 0L) {
        setAverageMarks(other.getAverageMarks());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.milind.grpc.StreamResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.milind.grpc.StreamResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object empList_ = "";
    /**
     * <code>optional string empList = 1;</code>
     */
    public java.lang.String getEmpList() {
      java.lang.Object ref = empList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        empList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string empList = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEmpListBytes() {
      java.lang.Object ref = empList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        empList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string empList = 1;</code>
     */
    public Builder setEmpList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      empList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string empList = 1;</code>
     */
    public Builder clearEmpList() {
      
      empList_ = getDefaultInstance().getEmpList();
      onChanged();
      return this;
    }
    /**
     * <code>optional string empList = 1;</code>
     */
    public Builder setEmpListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      empList_ = value;
      onChanged();
      return this;
    }

    private long totalEmp_ ;
    /**
     * <code>optional int64 totalEmp = 2;</code>
     */
    public long getTotalEmp() {
      return totalEmp_;
    }
    /**
     * <code>optional int64 totalEmp = 2;</code>
     */
    public Builder setTotalEmp(long value) {
      
      totalEmp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 totalEmp = 2;</code>
     */
    public Builder clearTotalEmp() {
      
      totalEmp_ = 0L;
      onChanged();
      return this;
    }

    private long averageMarks_ ;
    /**
     * <code>optional int64 averageMarks = 3;</code>
     */
    public long getAverageMarks() {
      return averageMarks_;
    }
    /**
     * <code>optional int64 averageMarks = 3;</code>
     */
    public Builder setAverageMarks(long value) {
      
      averageMarks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 averageMarks = 3;</code>
     */
    public Builder clearAverageMarks() {
      
      averageMarks_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.milind.grpc.StreamResponse)
  }

  // @@protoc_insertion_point(class_scope:com.milind.grpc.StreamResponse)
  private static final com.milind.grpc.StreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.milind.grpc.StreamResponse();
  }

  public static com.milind.grpc.StreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamResponse>() {
    public StreamResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StreamResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamResponse> getParserForType() {
    return PARSER;
  }

  public com.milind.grpc.StreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
