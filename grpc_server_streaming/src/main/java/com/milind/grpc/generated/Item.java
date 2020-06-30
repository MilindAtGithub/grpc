// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serverside-streaming.proto

package com.milind.grpc.generated;

/**
 * Protobuf type {@code com.milind.grpc.generated.Item}
 */
public  final class Item extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.milind.grpc.generated.Item)
    ItemOrBuilder {
  // Use Item.newBuilder() to construct.
  private Item(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Item() {
    itemId_ = 0;
    itemDesc_ = "";
    price_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Item(
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
          case 8: {

            itemId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            itemDesc_ = s;
            break;
          }
          case 25: {

            price_ = input.readDouble();
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
    return com.milind.grpc.generated.ServersideStreaming.internal_static_com_milind_grpc_generated_Item_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.milind.grpc.generated.ServersideStreaming.internal_static_com_milind_grpc_generated_Item_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.milind.grpc.generated.Item.class, com.milind.grpc.generated.Item.Builder.class);
  }

  public static final int ITEMID_FIELD_NUMBER = 1;
  private int itemId_;
  /**
   * <code>optional int32 itemId = 1;</code>
   */
  public int getItemId() {
    return itemId_;
  }

  public static final int ITEMDESC_FIELD_NUMBER = 2;
  private volatile java.lang.Object itemDesc_;
  /**
   * <code>optional string itemDesc = 2;</code>
   */
  public java.lang.String getItemDesc() {
    java.lang.Object ref = itemDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemDesc_ = s;
      return s;
    }
  }
  /**
   * <code>optional string itemDesc = 2;</code>
   */
  public com.google.protobuf.ByteString
      getItemDescBytes() {
    java.lang.Object ref = itemDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemDesc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private double price_;
  /**
   * <code>optional double price = 3;</code>
   */
  public double getPrice() {
    return price_;
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
    if (itemId_ != 0) {
      output.writeInt32(1, itemId_);
    }
    if (!getItemDescBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, itemDesc_);
    }
    if (price_ != 0D) {
      output.writeDouble(3, price_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (itemId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, itemId_);
    }
    if (!getItemDescBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, itemDesc_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, price_);
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
    if (!(obj instanceof com.milind.grpc.generated.Item)) {
      return super.equals(obj);
    }
    com.milind.grpc.generated.Item other = (com.milind.grpc.generated.Item) obj;

    boolean result = true;
    result = result && (getItemId()
        == other.getItemId());
    result = result && getItemDesc()
        .equals(other.getItemDesc());
    result = result && (
        java.lang.Double.doubleToLongBits(getPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPrice()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId();
    hash = (37 * hash) + ITEMDESC_FIELD_NUMBER;
    hash = (53 * hash) + getItemDesc().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.milind.grpc.generated.Item parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.milind.grpc.generated.Item parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.milind.grpc.generated.Item parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.milind.grpc.generated.Item parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.milind.grpc.generated.Item parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.milind.grpc.generated.Item parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.milind.grpc.generated.Item parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.milind.grpc.generated.Item parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.milind.grpc.generated.Item parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.milind.grpc.generated.Item parseFrom(
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
  public static Builder newBuilder(com.milind.grpc.generated.Item prototype) {
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
   * Protobuf type {@code com.milind.grpc.generated.Item}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.milind.grpc.generated.Item)
      com.milind.grpc.generated.ItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.milind.grpc.generated.ServersideStreaming.internal_static_com_milind_grpc_generated_Item_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.milind.grpc.generated.ServersideStreaming.internal_static_com_milind_grpc_generated_Item_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.milind.grpc.generated.Item.class, com.milind.grpc.generated.Item.Builder.class);
    }

    // Construct using com.milind.grpc.generated.Item.newBuilder()
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
      itemId_ = 0;

      itemDesc_ = "";

      price_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.milind.grpc.generated.ServersideStreaming.internal_static_com_milind_grpc_generated_Item_descriptor;
    }

    public com.milind.grpc.generated.Item getDefaultInstanceForType() {
      return com.milind.grpc.generated.Item.getDefaultInstance();
    }

    public com.milind.grpc.generated.Item build() {
      com.milind.grpc.generated.Item result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.milind.grpc.generated.Item buildPartial() {
      com.milind.grpc.generated.Item result = new com.milind.grpc.generated.Item(this);
      result.itemId_ = itemId_;
      result.itemDesc_ = itemDesc_;
      result.price_ = price_;
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
      if (other instanceof com.milind.grpc.generated.Item) {
        return mergeFrom((com.milind.grpc.generated.Item)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.milind.grpc.generated.Item other) {
      if (other == com.milind.grpc.generated.Item.getDefaultInstance()) return this;
      if (other.getItemId() != 0) {
        setItemId(other.getItemId());
      }
      if (!other.getItemDesc().isEmpty()) {
        itemDesc_ = other.itemDesc_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
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
      com.milind.grpc.generated.Item parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.milind.grpc.generated.Item) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int itemId_ ;
    /**
     * <code>optional int32 itemId = 1;</code>
     */
    public int getItemId() {
      return itemId_;
    }
    /**
     * <code>optional int32 itemId = 1;</code>
     */
    public Builder setItemId(int value) {
      
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 itemId = 1;</code>
     */
    public Builder clearItemId() {
      
      itemId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object itemDesc_ = "";
    /**
     * <code>optional string itemDesc = 2;</code>
     */
    public java.lang.String getItemDesc() {
      java.lang.Object ref = itemDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string itemDesc = 2;</code>
     */
    public com.google.protobuf.ByteString
        getItemDescBytes() {
      java.lang.Object ref = itemDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string itemDesc = 2;</code>
     */
    public Builder setItemDesc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemDesc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string itemDesc = 2;</code>
     */
    public Builder clearItemDesc() {
      
      itemDesc_ = getDefaultInstance().getItemDesc();
      onChanged();
      return this;
    }
    /**
     * <code>optional string itemDesc = 2;</code>
     */
    public Builder setItemDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemDesc_ = value;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>optional double price = 3;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>optional double price = 3;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double price = 3;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.milind.grpc.generated.Item)
  }

  // @@protoc_insertion_point(class_scope:com.milind.grpc.generated.Item)
  private static final com.milind.grpc.generated.Item DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.milind.grpc.generated.Item();
  }

  public static com.milind.grpc.generated.Item getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Item>
      PARSER = new com.google.protobuf.AbstractParser<Item>() {
    public Item parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Item(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Item> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Item> getParserForType() {
    return PARSER;
  }

  public com.milind.grpc.generated.Item getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
