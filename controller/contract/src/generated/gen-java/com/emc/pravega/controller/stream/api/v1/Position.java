/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.emc.pravega.controller.stream.api.v1;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-04")
public class Position implements org.apache.thrift.TBase<Position, Position._Fields>, java.io.Serializable, Cloneable, Comparable<Position> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Position");

  private static final org.apache.thrift.protocol.TField OWNED_SEGMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("ownedSegments", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField FUTURE_OWNED_SEGMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("futureOwnedSegments", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PositionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PositionTupleSchemeFactory());
  }

  private Map<SegmentId,Long> ownedSegments; // required
  private Map<FutureSegment,Long> futureOwnedSegments; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OWNED_SEGMENTS((short)1, "ownedSegments"),
    FUTURE_OWNED_SEGMENTS((short)2, "futureOwnedSegments");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OWNED_SEGMENTS
          return OWNED_SEGMENTS;
        case 2: // FUTURE_OWNED_SEGMENTS
          return FUTURE_OWNED_SEGMENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OWNED_SEGMENTS, new org.apache.thrift.meta_data.FieldMetaData("ownedSegments", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SegmentId.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.FUTURE_OWNED_SEGMENTS, new org.apache.thrift.meta_data.FieldMetaData("futureOwnedSegments", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FutureSegment.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Position.class, metaDataMap);
  }

  public Position() {
  }

  public Position(
    Map<SegmentId,Long> ownedSegments,
    Map<FutureSegment,Long> futureOwnedSegments)
  {
    this();
    this.ownedSegments = ownedSegments;
    this.futureOwnedSegments = futureOwnedSegments;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Position(Position other) {
    if (other.isSetOwnedSegments()) {
      Map<SegmentId,Long> __this__ownedSegments = new HashMap<SegmentId,Long>(other.ownedSegments.size());
      for (Map.Entry<SegmentId, Long> other_element : other.ownedSegments.entrySet()) {

        SegmentId other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        SegmentId __this__ownedSegments_copy_key = new SegmentId(other_element_key);

        Long __this__ownedSegments_copy_value = other_element_value;

        __this__ownedSegments.put(__this__ownedSegments_copy_key, __this__ownedSegments_copy_value);
      }
      this.ownedSegments = __this__ownedSegments;
    }
    if (other.isSetFutureOwnedSegments()) {
      Map<FutureSegment,Long> __this__futureOwnedSegments = new HashMap<FutureSegment,Long>(other.futureOwnedSegments.size());
      for (Map.Entry<FutureSegment, Long> other_element : other.futureOwnedSegments.entrySet()) {

        FutureSegment other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        FutureSegment __this__futureOwnedSegments_copy_key = new FutureSegment(other_element_key);

        Long __this__futureOwnedSegments_copy_value = other_element_value;

        __this__futureOwnedSegments.put(__this__futureOwnedSegments_copy_key, __this__futureOwnedSegments_copy_value);
      }
      this.futureOwnedSegments = __this__futureOwnedSegments;
    }
  }

  public Position deepCopy() {
    return new Position(this);
  }

  @Override
  public void clear() {
    this.ownedSegments = null;
    this.futureOwnedSegments = null;
  }

  public int getOwnedSegmentsSize() {
    return (this.ownedSegments == null) ? 0 : this.ownedSegments.size();
  }

  public void putToOwnedSegments(SegmentId key, long val) {
    if (this.ownedSegments == null) {
      this.ownedSegments = new HashMap<SegmentId,Long>();
    }
    this.ownedSegments.put(key, val);
  }

  public Map<SegmentId,Long> getOwnedSegments() {
    return this.ownedSegments;
  }

  public Position setOwnedSegments(Map<SegmentId,Long> ownedSegments) {
    this.ownedSegments = ownedSegments;
    return this;
  }

  public void unsetOwnedSegments() {
    this.ownedSegments = null;
  }

  /** Returns true if field ownedSegments is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnedSegments() {
    return this.ownedSegments != null;
  }

  public void setOwnedSegmentsIsSet(boolean value) {
    if (!value) {
      this.ownedSegments = null;
    }
  }

  public int getFutureOwnedSegmentsSize() {
    return (this.futureOwnedSegments == null) ? 0 : this.futureOwnedSegments.size();
  }

  public void putToFutureOwnedSegments(FutureSegment key, long val) {
    if (this.futureOwnedSegments == null) {
      this.futureOwnedSegments = new HashMap<FutureSegment,Long>();
    }
    this.futureOwnedSegments.put(key, val);
  }

  public Map<FutureSegment,Long> getFutureOwnedSegments() {
    return this.futureOwnedSegments;
  }

  public Position setFutureOwnedSegments(Map<FutureSegment,Long> futureOwnedSegments) {
    this.futureOwnedSegments = futureOwnedSegments;
    return this;
  }

  public void unsetFutureOwnedSegments() {
    this.futureOwnedSegments = null;
  }

  /** Returns true if field futureOwnedSegments is set (has been assigned a value) and false otherwise */
  public boolean isSetFutureOwnedSegments() {
    return this.futureOwnedSegments != null;
  }

  public void setFutureOwnedSegmentsIsSet(boolean value) {
    if (!value) {
      this.futureOwnedSegments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OWNED_SEGMENTS:
      if (value == null) {
        unsetOwnedSegments();
      } else {
        setOwnedSegments((Map<SegmentId,Long>)value);
      }
      break;

    case FUTURE_OWNED_SEGMENTS:
      if (value == null) {
        unsetFutureOwnedSegments();
      } else {
        setFutureOwnedSegments((Map<FutureSegment,Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OWNED_SEGMENTS:
      return getOwnedSegments();

    case FUTURE_OWNED_SEGMENTS:
      return getFutureOwnedSegments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OWNED_SEGMENTS:
      return isSetOwnedSegments();
    case FUTURE_OWNED_SEGMENTS:
      return isSetFutureOwnedSegments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Position)
      return this.equals((Position)that);
    return false;
  }

  public boolean equals(Position that) {
    if (that == null)
      return false;

    boolean this_present_ownedSegments = true && this.isSetOwnedSegments();
    boolean that_present_ownedSegments = true && that.isSetOwnedSegments();
    if (this_present_ownedSegments || that_present_ownedSegments) {
      if (!(this_present_ownedSegments && that_present_ownedSegments))
        return false;
      if (!this.ownedSegments.equals(that.ownedSegments))
        return false;
    }

    boolean this_present_futureOwnedSegments = true && this.isSetFutureOwnedSegments();
    boolean that_present_futureOwnedSegments = true && that.isSetFutureOwnedSegments();
    if (this_present_futureOwnedSegments || that_present_futureOwnedSegments) {
      if (!(this_present_futureOwnedSegments && that_present_futureOwnedSegments))
        return false;
      if (!this.futureOwnedSegments.equals(that.futureOwnedSegments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ownedSegments = true && (isSetOwnedSegments());
    list.add(present_ownedSegments);
    if (present_ownedSegments)
      list.add(ownedSegments);

    boolean present_futureOwnedSegments = true && (isSetFutureOwnedSegments());
    list.add(present_futureOwnedSegments);
    if (present_futureOwnedSegments)
      list.add(futureOwnedSegments);

    return list.hashCode();
  }

  @Override
  public int compareTo(Position other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOwnedSegments()).compareTo(other.isSetOwnedSegments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnedSegments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ownedSegments, other.ownedSegments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFutureOwnedSegments()).compareTo(other.isSetFutureOwnedSegments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFutureOwnedSegments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.futureOwnedSegments, other.futureOwnedSegments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Position(");
    boolean first = true;

    sb.append("ownedSegments:");
    if (this.ownedSegments == null) {
      sb.append("null");
    } else {
      sb.append(this.ownedSegments);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("futureOwnedSegments:");
    if (this.futureOwnedSegments == null) {
      sb.append("null");
    } else {
      sb.append(this.futureOwnedSegments);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ownedSegments == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ownedSegments' was not present! Struct: " + toString());
    }
    if (futureOwnedSegments == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'futureOwnedSegments' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PositionStandardSchemeFactory implements SchemeFactory {
    public PositionStandardScheme getScheme() {
      return new PositionStandardScheme();
    }
  }

  private static class PositionStandardScheme extends StandardScheme<Position> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Position struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OWNED_SEGMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.ownedSegments = new HashMap<SegmentId,Long>(2*_map0.size);
                SegmentId _key1;
                long _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = new SegmentId();
                  _key1.read(iprot);
                  _val2 = iprot.readI64();
                  struct.ownedSegments.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setOwnedSegmentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FUTURE_OWNED_SEGMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.futureOwnedSegments = new HashMap<FutureSegment,Long>(2*_map4.size);
                FutureSegment _key5;
                long _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = new FutureSegment();
                  _key5.read(iprot);
                  _val6 = iprot.readI64();
                  struct.futureOwnedSegments.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setFutureOwnedSegmentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Position struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ownedSegments != null) {
        oprot.writeFieldBegin(OWNED_SEGMENTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.I64, struct.ownedSegments.size()));
          for (Map.Entry<SegmentId, Long> _iter8 : struct.ownedSegments.entrySet())
          {
            _iter8.getKey().write(oprot);
            oprot.writeI64(_iter8.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.futureOwnedSegments != null) {
        oprot.writeFieldBegin(FUTURE_OWNED_SEGMENTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.I64, struct.futureOwnedSegments.size()));
          for (Map.Entry<FutureSegment, Long> _iter9 : struct.futureOwnedSegments.entrySet())
          {
            _iter9.getKey().write(oprot);
            oprot.writeI64(_iter9.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PositionTupleSchemeFactory implements SchemeFactory {
    public PositionTupleScheme getScheme() {
      return new PositionTupleScheme();
    }
  }

  private static class PositionTupleScheme extends TupleScheme<Position> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Position struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.ownedSegments.size());
        for (Map.Entry<SegmentId, Long> _iter10 : struct.ownedSegments.entrySet())
        {
          _iter10.getKey().write(oprot);
          oprot.writeI64(_iter10.getValue());
        }
      }
      {
        oprot.writeI32(struct.futureOwnedSegments.size());
        for (Map.Entry<FutureSegment, Long> _iter11 : struct.futureOwnedSegments.entrySet())
        {
          _iter11.getKey().write(oprot);
          oprot.writeI64(_iter11.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Position struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map12 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.ownedSegments = new HashMap<SegmentId,Long>(2*_map12.size);
        SegmentId _key13;
        long _val14;
        for (int _i15 = 0; _i15 < _map12.size; ++_i15)
        {
          _key13 = new SegmentId();
          _key13.read(iprot);
          _val14 = iprot.readI64();
          struct.ownedSegments.put(_key13, _val14);
        }
      }
      struct.setOwnedSegmentsIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.futureOwnedSegments = new HashMap<FutureSegment,Long>(2*_map16.size);
        FutureSegment _key17;
        long _val18;
        for (int _i19 = 0; _i19 < _map16.size; ++_i19)
        {
          _key17 = new FutureSegment();
          _key17.read(iprot);
          _val18 = iprot.readI64();
          struct.futureOwnedSegments.put(_key17, _val18);
        }
      }
      struct.setFutureOwnedSegmentsIsSet(true);
    }
  }

}

