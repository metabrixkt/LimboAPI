/*
 * Copyright (C) 2021 Elytrium
 *
 * The LimboAPI (excluding the LimboAPI plugin) is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package net.elytrium.limboapi.api.chunk.util;

import com.velocitypowered.api.network.ProtocolVersion;
import io.netty.buffer.ByteBuf;

public interface CompactStorage {

  void set(int index, int value);

  int get(int index);

  void write(ByteBuf buf, ProtocolVersion version);

  int getBitsPerEntry();

  int getDataLength();

  long[] getData();

  CompactStorage copy();
}
