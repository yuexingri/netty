package entities;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeRespProto.proto

import com.google.protobuf.CodedInputStream;

public final class SubscribeRespProto {
  private SubscribeRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubscribeRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SubscribeResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 subReqID = 1;</code>
     */
    boolean hasSubReqID();
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    int getSubReqID();

    /**
     * <code>required int32 respCode = 2;</code>
     */
    boolean hasRespCode();
    /**
     * <code>required int32 respCode = 2;</code>
     */
    int getRespCode();

    /**
     * <code>required string desc = 3;</code>
     */
    boolean hasDesc();
    /**
     * <code>required string desc = 3;</code>
     */
    String getDesc();
    /**
     * <code>required string desc = 3;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();

    /**
     * <code>required string username = 4;</code>
     */
    boolean hasUsername();
    /**
     * <code>required string username = 4;</code>
     */
    String getUsername();
    /**
     * <code>required string username = 4;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>required string bookname = 5;</code>
     */
    boolean hasBookname();
    /**
     * <code>required string bookname = 5;</code>
     */
    String getBookname();
    /**
     * <code>required string bookname = 5;</code>
     */
    com.google.protobuf.ByteString
        getBooknameBytes();
  }
  /**
   * Protobuf type {@code SubscribeResp}
   */
  public  static final class SubscribeResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SubscribeResp)
      SubscribeRespOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscribeResp.newBuilder() to construct.
    private SubscribeResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscribeResp() {
      subReqID_ = 0;
      respCode_ = 0;
      desc_ = "";
      username_ = "";
      bookname_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SubscribeResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              subReqID_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              respCode_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              desc_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              username_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              bookname_ = bs;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SubscribeRespProto.internal_static_SubscribeResp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SubscribeRespProto.internal_static_SubscribeResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SubscribeRespProto.SubscribeResp.class, SubscribeRespProto.SubscribeResp.Builder.class);
    }

    private int bitField0_;
    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqID_;
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    public boolean hasSubReqID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    public int getSubReqID() {
      return subReqID_;
    }

    public static final int RESPCODE_FIELD_NUMBER = 2;
    private int respCode_;
    /**
     * <code>required int32 respCode = 2;</code>
     */
    public boolean hasRespCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 respCode = 2;</code>
     */
    public int getRespCode() {
      return respCode_;
    }

    public static final int DESC_FIELD_NUMBER = 3;
    private volatile Object desc_;
    /**
     * <code>required string desc = 3;</code>
     */
    public boolean hasDesc() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string desc = 3;</code>
     */
    public String getDesc() {
      Object ref = desc_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          desc_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string desc = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 4;
    private volatile Object username_;
    /**
     * <code>required string username = 4;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string username = 4;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string username = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BOOKNAME_FIELD_NUMBER = 5;
    private volatile Object bookname_;
    /**
     * <code>required string bookname = 5;</code>
     */
    public boolean hasBookname() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required string bookname = 5;</code>
     */
    public String getBookname() {
      Object ref = bookname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          bookname_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string bookname = 5;</code>
     */
    public com.google.protobuf.ByteString
        getBooknameBytes() {
      Object ref = bookname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        bookname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSubReqID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRespCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDesc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUsername()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBookname()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, respCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, desc_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, username_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, bookname_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, respCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, desc_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, username_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, bookname_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SubscribeRespProto.SubscribeResp)) {
        return super.equals(obj);
      }
      SubscribeRespProto.SubscribeResp other = (SubscribeRespProto.SubscribeResp) obj;

      boolean result = true;
      result = result && (hasSubReqID() == other.hasSubReqID());
      if (hasSubReqID()) {
        result = result && (getSubReqID()
            == other.getSubReqID());
      }
      result = result && (hasRespCode() == other.hasRespCode());
      if (hasRespCode()) {
        result = result && (getRespCode()
            == other.getRespCode());
      }
      result = result && (hasDesc() == other.hasDesc());
      if (hasDesc()) {
        result = result && getDesc()
            .equals(other.getDesc());
      }
      result = result && (hasUsername() == other.hasUsername());
      if (hasUsername()) {
        result = result && getUsername()
            .equals(other.getUsername());
      }
      result = result && (hasBookname() == other.hasBookname());
      if (hasBookname()) {
        result = result && getBookname()
            .equals(other.getBookname());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSubReqID()) {
        hash = (37 * hash) + SUBREQID_FIELD_NUMBER;
        hash = (53 * hash) + getSubReqID();
      }
      if (hasRespCode()) {
        hash = (37 * hash) + RESPCODE_FIELD_NUMBER;
        hash = (53 * hash) + getRespCode();
      }
      if (hasDesc()) {
        hash = (37 * hash) + DESC_FIELD_NUMBER;
        hash = (53 * hash) + getDesc().hashCode();
      }
      if (hasUsername()) {
        hash = (37 * hash) + USERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getUsername().hashCode();
      }
      if (hasBookname()) {
        hash = (37 * hash) + BOOKNAME_FIELD_NUMBER;
        hash = (53 * hash) + getBookname().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SubscribeRespProto.SubscribeResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(CodedInputStream.newInstance(data));
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(CodedInputStream.newInstance(data), extensionRegistry);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SubscribeRespProto.SubscribeResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SubscribeRespProto.SubscribeResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SubscribeRespProto.SubscribeResp parseFrom(
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
    public static Builder newBuilder(SubscribeRespProto.SubscribeResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SubscribeResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SubscribeResp)
        SubscribeRespProto.SubscribeRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SubscribeRespProto.internal_static_SubscribeResp_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SubscribeRespProto.internal_static_SubscribeResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SubscribeRespProto.SubscribeResp.class, SubscribeRespProto.SubscribeResp.Builder.class);
      }

      // Construct using SubscribeRespProto.SubscribeResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
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
        subReqID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        respCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        desc_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        bookname_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SubscribeRespProto.internal_static_SubscribeResp_descriptor;
      }

      public SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
        return SubscribeRespProto.SubscribeResp.getDefaultInstance();
      }

      public SubscribeRespProto.SubscribeResp build() {
        SubscribeRespProto.SubscribeResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SubscribeRespProto.SubscribeResp buildPartial() {
        SubscribeRespProto.SubscribeResp result = new SubscribeRespProto.SubscribeResp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.subReqID_ = subReqID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.respCode_ = respCode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.desc_ = desc_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.bookname_ = bookname_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof SubscribeRespProto.SubscribeResp) {
          return mergeFrom((SubscribeRespProto.SubscribeResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SubscribeRespProto.SubscribeResp other) {
        if (other == SubscribeRespProto.SubscribeResp.getDefaultInstance()) return this;
        if (other.hasSubReqID()) {
          setSubReqID(other.getSubReqID());
        }
        if (other.hasRespCode()) {
          setRespCode(other.getRespCode());
        }
        if (other.hasDesc()) {
          bitField0_ |= 0x00000004;
          desc_ = other.desc_;
          onChanged();
        }
        if (other.hasUsername()) {
          bitField0_ |= 0x00000008;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasBookname()) {
          bitField0_ |= 0x00000010;
          bookname_ = other.bookname_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSubReqID()) {
          return false;
        }
        if (!hasRespCode()) {
          return false;
        }
        if (!hasDesc()) {
          return false;
        }
        if (!hasUsername()) {
          return false;
        }
        if (!hasBookname()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SubscribeRespProto.SubscribeResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SubscribeRespProto.SubscribeResp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int subReqID_ ;
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public boolean hasSubReqID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public int getSubReqID() {
        return subReqID_;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public Builder setSubReqID(int value) {
        bitField0_ |= 0x00000001;
        subReqID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public Builder clearSubReqID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subReqID_ = 0;
        onChanged();
        return this;
      }

      private int respCode_ ;
      /**
       * <code>required int32 respCode = 2;</code>
       */
      public boolean hasRespCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 respCode = 2;</code>
       */
      public int getRespCode() {
        return respCode_;
      }
      /**
       * <code>required int32 respCode = 2;</code>
       */
      public Builder setRespCode(int value) {
        bitField0_ |= 0x00000002;
        respCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 respCode = 2;</code>
       */
      public Builder clearRespCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        respCode_ = 0;
        onChanged();
        return this;
      }

      private Object desc_ = "";
      /**
       * <code>required string desc = 3;</code>
       */
      public boolean hasDesc() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public String getDesc() {
        Object ref = desc_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            desc_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public Builder setDesc(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public Builder clearDesc() {
        bitField0_ = (bitField0_ & ~0x00000004);
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>required string desc = 3;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        desc_ = value;
        onChanged();
        return this;
      }

      private Object username_ = "";
      /**
       * <code>required string username = 4;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string username = 4;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            username_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string username = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string username = 4;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 4;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000008);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 4;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        username_ = value;
        onChanged();
        return this;
      }

      private Object bookname_ = "";
      /**
       * <code>required string bookname = 5;</code>
       */
      public boolean hasBookname() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required string bookname = 5;</code>
       */
      public String getBookname() {
        Object ref = bookname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            bookname_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string bookname = 5;</code>
       */
      public com.google.protobuf.ByteString
          getBooknameBytes() {
        Object ref = bookname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          bookname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string bookname = 5;</code>
       */
      public Builder setBookname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        bookname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string bookname = 5;</code>
       */
      public Builder clearBookname() {
        bitField0_ = (bitField0_ & ~0x00000010);
        bookname_ = getDefaultInstance().getBookname();
        onChanged();
        return this;
      }
      /**
       * <code>required string bookname = 5;</code>
       */
      public Builder setBooknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        bookname_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SubscribeResp)
    }

    // @@protoc_insertion_point(class_scope:SubscribeResp)
    private static final SubscribeRespProto.SubscribeResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SubscribeRespProto.SubscribeResp();
    }

    public static SubscribeRespProto.SubscribeResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<SubscribeResp>
        PARSER = new com.google.protobuf.AbstractParser<SubscribeResp>() {
      public SubscribeResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeResp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubscribeResp> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SubscribeResp> getParserForType() {
      return PARSER;
    }

    public SubscribeRespProto.SubscribeResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscribeResp_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscribeResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030SubscribeRespProto.proto\"e\n\rSubscribeR" +
      "esp\022\020\n\010subReqID\030\001 \002(\005\022\020\n\010respCode\030\002 \002(\005\022" +
      "\014\n\004desc\030\003 \002(\t\022\020\n\010username\030\004 \002(\t\022\020\n\010bookn" +
      "ame\030\005 \002(\tB\024B\022SubscribeRespProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SubscribeResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SubscribeResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscribeResp_descriptor,
        new String[] { "SubReqID", "RespCode", "Desc", "Username", "Bookname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
