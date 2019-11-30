// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.bnls;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class LoginResponse extends Table {
  public static LoginResponse getRootAsLoginResponse(ByteBuffer _bb) { return getRootAsLoginResponse(_bb, new LoginResponse()); }
  public static LoginResponse getRootAsLoginResponse(ByteBuffer _bb, LoginResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public LoginResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String username() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer usernameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer usernameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createLoginResponse(FlatBufferBuilder builder,
      int usernameOffset) {
    builder.startObject(1);
    LoginResponse.addUsername(builder, usernameOffset);
    return LoginResponse.endLoginResponse(builder);
  }

  public static void startLoginResponse(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addUsername(FlatBufferBuilder builder, int usernameOffset) { builder.addOffset(0, usernameOffset, 0); }
  public static int endLoginResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

