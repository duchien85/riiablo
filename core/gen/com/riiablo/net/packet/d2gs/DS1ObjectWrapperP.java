// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.d2gs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class DS1ObjectWrapperP extends Table {
  public static DS1ObjectWrapperP getRootAsDS1ObjectWrapperP(ByteBuffer _bb) { return getRootAsDS1ObjectWrapperP(_bb, new DS1ObjectWrapperP()); }
  public static DS1ObjectWrapperP getRootAsDS1ObjectWrapperP(ByteBuffer _bb, DS1ObjectWrapperP obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public DS1ObjectWrapperP __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int act() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int type() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int id() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createDS1ObjectWrapperP(FlatBufferBuilder builder,
      int act,
      int type,
      int id) {
    builder.startObject(3);
    DS1ObjectWrapperP.addId(builder, id);
    DS1ObjectWrapperP.addType(builder, type);
    DS1ObjectWrapperP.addAct(builder, act);
    return DS1ObjectWrapperP.endDS1ObjectWrapperP(builder);
  }

  public static void startDS1ObjectWrapperP(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addAct(FlatBufferBuilder builder, int act) { builder.addByte(0, (byte)act, (byte)0); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addByte(1, (byte)type, (byte)0); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addByte(2, (byte)id, (byte)0); }
  public static int endDS1ObjectWrapperP(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
