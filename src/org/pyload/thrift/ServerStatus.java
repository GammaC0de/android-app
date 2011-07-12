/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pyload.thrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ServerStatus implements TBase<ServerStatus, ServerStatus._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ServerStatus");

  private static final TField PAUSE_FIELD_DESC = new TField("pause", TType.BOOL, (short)1);
  private static final TField ACTIVE_FIELD_DESC = new TField("active", TType.I16, (short)2);
  private static final TField QUEUE_FIELD_DESC = new TField("queue", TType.I16, (short)3);
  private static final TField TOTAL_FIELD_DESC = new TField("total", TType.I16, (short)4);
  private static final TField SPEED_FIELD_DESC = new TField("speed", TType.I64, (short)5);
  private static final TField DOWNLOAD_FIELD_DESC = new TField("download", TType.BOOL, (short)6);
  private static final TField RECONNECT_FIELD_DESC = new TField("reconnect", TType.BOOL, (short)7);

  public boolean pause;
  public short active;
  public short queue;
  public short total;
  public long speed;
  public boolean download;
  public boolean reconnect;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PAUSE((short)1, "pause"),
    ACTIVE((short)2, "active"),
    QUEUE((short)3, "queue"),
    TOTAL((short)4, "total"),
    SPEED((short)5, "speed"),
    DOWNLOAD((short)6, "download"),
    RECONNECT((short)7, "reconnect");

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
        case 1: // PAUSE
          return PAUSE;
        case 2: // ACTIVE
          return ACTIVE;
        case 3: // QUEUE
          return QUEUE;
        case 4: // TOTAL
          return TOTAL;
        case 5: // SPEED
          return SPEED;
        case 6: // DOWNLOAD
          return DOWNLOAD;
        case 7: // RECONNECT
          return RECONNECT;
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
  private static final int __PAUSE_ISSET_ID = 0;
  private static final int __ACTIVE_ISSET_ID = 1;
  private static final int __QUEUE_ISSET_ID = 2;
  private static final int __TOTAL_ISSET_ID = 3;
  private static final int __SPEED_ISSET_ID = 4;
  private static final int __DOWNLOAD_ISSET_ID = 5;
  private static final int __RECONNECT_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAUSE, new FieldMetaData("pause", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.ACTIVE, new FieldMetaData("active", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.QUEUE, new FieldMetaData("queue", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.TOTAL, new FieldMetaData("total", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.SPEED, new FieldMetaData("speed", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.DOWNLOAD, new FieldMetaData("download", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.RECONNECT, new FieldMetaData("reconnect", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ServerStatus.class, metaDataMap);
  }

  public ServerStatus() {
  }

  public ServerStatus(
    boolean pause,
    short active,
    short queue,
    short total,
    long speed,
    boolean download,
    boolean reconnect)
  {
    this();
    this.pause = pause;
    setPauseIsSet(true);
    this.active = active;
    setActiveIsSet(true);
    this.queue = queue;
    setQueueIsSet(true);
    this.total = total;
    setTotalIsSet(true);
    this.speed = speed;
    setSpeedIsSet(true);
    this.download = download;
    setDownloadIsSet(true);
    this.reconnect = reconnect;
    setReconnectIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServerStatus(ServerStatus other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.pause = other.pause;
    this.active = other.active;
    this.queue = other.queue;
    this.total = other.total;
    this.speed = other.speed;
    this.download = other.download;
    this.reconnect = other.reconnect;
  }

  public ServerStatus deepCopy() {
    return new ServerStatus(this);
  }

  @Override
  public void clear() {
    setPauseIsSet(false);
    this.pause = false;
    setActiveIsSet(false);
    this.active = 0;
    setQueueIsSet(false);
    this.queue = 0;
    setTotalIsSet(false);
    this.total = 0;
    setSpeedIsSet(false);
    this.speed = 0;
    setDownloadIsSet(false);
    this.download = false;
    setReconnectIsSet(false);
    this.reconnect = false;
  }

  public boolean isPause() {
    return this.pause;
  }

  public ServerStatus setPause(boolean pause) {
    this.pause = pause;
    setPauseIsSet(true);
    return this;
  }

  public void unsetPause() {
    __isset_bit_vector.clear(__PAUSE_ISSET_ID);
  }

  /** Returns true if field pause is set (has been asigned a value) and false otherwise */
  public boolean isSetPause() {
    return __isset_bit_vector.get(__PAUSE_ISSET_ID);
  }

  public void setPauseIsSet(boolean value) {
    __isset_bit_vector.set(__PAUSE_ISSET_ID, value);
  }

  public short getActive() {
    return this.active;
  }

  public ServerStatus setActive(short active) {
    this.active = active;
    setActiveIsSet(true);
    return this;
  }

  public void unsetActive() {
    __isset_bit_vector.clear(__ACTIVE_ISSET_ID);
  }

  /** Returns true if field active is set (has been asigned a value) and false otherwise */
  public boolean isSetActive() {
    return __isset_bit_vector.get(__ACTIVE_ISSET_ID);
  }

  public void setActiveIsSet(boolean value) {
    __isset_bit_vector.set(__ACTIVE_ISSET_ID, value);
  }

  public short getQueue() {
    return this.queue;
  }

  public ServerStatus setQueue(short queue) {
    this.queue = queue;
    setQueueIsSet(true);
    return this;
  }

  public void unsetQueue() {
    __isset_bit_vector.clear(__QUEUE_ISSET_ID);
  }

  /** Returns true if field queue is set (has been asigned a value) and false otherwise */
  public boolean isSetQueue() {
    return __isset_bit_vector.get(__QUEUE_ISSET_ID);
  }

  public void setQueueIsSet(boolean value) {
    __isset_bit_vector.set(__QUEUE_ISSET_ID, value);
  }

  public short getTotal() {
    return this.total;
  }

  public ServerStatus setTotal(short total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bit_vector.clear(__TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been asigned a value) and false otherwise */
  public boolean isSetTotal() {
    return __isset_bit_vector.get(__TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bit_vector.set(__TOTAL_ISSET_ID, value);
  }

  public long getSpeed() {
    return this.speed;
  }

  public ServerStatus setSpeed(long speed) {
    this.speed = speed;
    setSpeedIsSet(true);
    return this;
  }

  public void unsetSpeed() {
    __isset_bit_vector.clear(__SPEED_ISSET_ID);
  }

  /** Returns true if field speed is set (has been asigned a value) and false otherwise */
  public boolean isSetSpeed() {
    return __isset_bit_vector.get(__SPEED_ISSET_ID);
  }

  public void setSpeedIsSet(boolean value) {
    __isset_bit_vector.set(__SPEED_ISSET_ID, value);
  }

  public boolean isDownload() {
    return this.download;
  }

  public ServerStatus setDownload(boolean download) {
    this.download = download;
    setDownloadIsSet(true);
    return this;
  }

  public void unsetDownload() {
    __isset_bit_vector.clear(__DOWNLOAD_ISSET_ID);
  }

  /** Returns true if field download is set (has been asigned a value) and false otherwise */
  public boolean isSetDownload() {
    return __isset_bit_vector.get(__DOWNLOAD_ISSET_ID);
  }

  public void setDownloadIsSet(boolean value) {
    __isset_bit_vector.set(__DOWNLOAD_ISSET_ID, value);
  }

  public boolean isReconnect() {
    return this.reconnect;
  }

  public ServerStatus setReconnect(boolean reconnect) {
    this.reconnect = reconnect;
    setReconnectIsSet(true);
    return this;
  }

  public void unsetReconnect() {
    __isset_bit_vector.clear(__RECONNECT_ISSET_ID);
  }

  /** Returns true if field reconnect is set (has been asigned a value) and false otherwise */
  public boolean isSetReconnect() {
    return __isset_bit_vector.get(__RECONNECT_ISSET_ID);
  }

  public void setReconnectIsSet(boolean value) {
    __isset_bit_vector.set(__RECONNECT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAUSE:
      if (value == null) {
        unsetPause();
      } else {
        setPause((Boolean)value);
      }
      break;

    case ACTIVE:
      if (value == null) {
        unsetActive();
      } else {
        setActive((Short)value);
      }
      break;

    case QUEUE:
      if (value == null) {
        unsetQueue();
      } else {
        setQueue((Short)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Short)value);
      }
      break;

    case SPEED:
      if (value == null) {
        unsetSpeed();
      } else {
        setSpeed((Long)value);
      }
      break;

    case DOWNLOAD:
      if (value == null) {
        unsetDownload();
      } else {
        setDownload((Boolean)value);
      }
      break;

    case RECONNECT:
      if (value == null) {
        unsetReconnect();
      } else {
        setReconnect((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAUSE:
      return new Boolean(isPause());

    case ACTIVE:
      return new Short(getActive());

    case QUEUE:
      return new Short(getQueue());

    case TOTAL:
      return new Short(getTotal());

    case SPEED:
      return new Long(getSpeed());

    case DOWNLOAD:
      return new Boolean(isDownload());

    case RECONNECT:
      return new Boolean(isReconnect());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAUSE:
      return isSetPause();
    case ACTIVE:
      return isSetActive();
    case QUEUE:
      return isSetQueue();
    case TOTAL:
      return isSetTotal();
    case SPEED:
      return isSetSpeed();
    case DOWNLOAD:
      return isSetDownload();
    case RECONNECT:
      return isSetReconnect();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServerStatus)
      return this.equals((ServerStatus)that);
    return false;
  }

  public boolean equals(ServerStatus that) {
    if (that == null)
      return false;

    boolean this_present_pause = true;
    boolean that_present_pause = true;
    if (this_present_pause || that_present_pause) {
      if (!(this_present_pause && that_present_pause))
        return false;
      if (this.pause != that.pause)
        return false;
    }

    boolean this_present_active = true;
    boolean that_present_active = true;
    if (this_present_active || that_present_active) {
      if (!(this_present_active && that_present_active))
        return false;
      if (this.active != that.active)
        return false;
    }

    boolean this_present_queue = true;
    boolean that_present_queue = true;
    if (this_present_queue || that_present_queue) {
      if (!(this_present_queue && that_present_queue))
        return false;
      if (this.queue != that.queue)
        return false;
    }

    boolean this_present_total = true;
    boolean that_present_total = true;
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_speed = true;
    boolean that_present_speed = true;
    if (this_present_speed || that_present_speed) {
      if (!(this_present_speed && that_present_speed))
        return false;
      if (this.speed != that.speed)
        return false;
    }

    boolean this_present_download = true;
    boolean that_present_download = true;
    if (this_present_download || that_present_download) {
      if (!(this_present_download && that_present_download))
        return false;
      if (this.download != that.download)
        return false;
    }

    boolean this_present_reconnect = true;
    boolean that_present_reconnect = true;
    if (this_present_reconnect || that_present_reconnect) {
      if (!(this_present_reconnect && that_present_reconnect))
        return false;
      if (this.reconnect != that.reconnect)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ServerStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ServerStatus typedOther = (ServerStatus)other;

    lastComparison = Boolean.valueOf(isSetPause()).compareTo(typedOther.isSetPause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPause()) {
      lastComparison = TBaseHelper.compareTo(this.pause, typedOther.pause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActive()).compareTo(typedOther.isSetActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActive()) {
      lastComparison = TBaseHelper.compareTo(this.active, typedOther.active);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueue()).compareTo(typedOther.isSetQueue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueue()) {
      lastComparison = TBaseHelper.compareTo(this.queue, typedOther.queue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(typedOther.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = TBaseHelper.compareTo(this.total, typedOther.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpeed()).compareTo(typedOther.isSetSpeed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpeed()) {
      lastComparison = TBaseHelper.compareTo(this.speed, typedOther.speed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownload()).compareTo(typedOther.isSetDownload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownload()) {
      lastComparison = TBaseHelper.compareTo(this.download, typedOther.download);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReconnect()).compareTo(typedOther.isSetReconnect());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReconnect()) {
      lastComparison = TBaseHelper.compareTo(this.reconnect, typedOther.reconnect);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PAUSE
          if (field.type == TType.BOOL) {
            this.pause = iprot.readBool();
            setPauseIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ACTIVE
          if (field.type == TType.I16) {
            this.active = iprot.readI16();
            setActiveIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // QUEUE
          if (field.type == TType.I16) {
            this.queue = iprot.readI16();
            setQueueIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TOTAL
          if (field.type == TType.I16) {
            this.total = iprot.readI16();
            setTotalIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SPEED
          if (field.type == TType.I64) {
            this.speed = iprot.readI64();
            setSpeedIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DOWNLOAD
          if (field.type == TType.BOOL) {
            this.download = iprot.readBool();
            setDownloadIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // RECONNECT
          if (field.type == TType.BOOL) {
            this.reconnect = iprot.readBool();
            setReconnectIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(PAUSE_FIELD_DESC);
    oprot.writeBool(this.pause);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ACTIVE_FIELD_DESC);
    oprot.writeI16(this.active);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(QUEUE_FIELD_DESC);
    oprot.writeI16(this.queue);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(TOTAL_FIELD_DESC);
    oprot.writeI16(this.total);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SPEED_FIELD_DESC);
    oprot.writeI64(this.speed);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DOWNLOAD_FIELD_DESC);
    oprot.writeBool(this.download);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(RECONNECT_FIELD_DESC);
    oprot.writeBool(this.reconnect);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServerStatus(");
    boolean first = true;

    sb.append("pause:");
    sb.append(this.pause);
    first = false;
    if (!first) sb.append(", ");
    sb.append("active:");
    sb.append(this.active);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queue:");
    sb.append(this.queue);
    first = false;
    if (!first) sb.append(", ");
    sb.append("total:");
    sb.append(this.total);
    first = false;
    if (!first) sb.append(", ");
    sb.append("speed:");
    sb.append(this.speed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("download:");
    sb.append(this.download);
    first = false;
    if (!first) sb.append(", ");
    sb.append("reconnect:");
    sb.append(this.reconnect);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

