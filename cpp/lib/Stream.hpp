/*
 * #%L
 * Copyright (C) 2016 Glencoe Software, Inc. All rights reserved.
 * %%
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * #%L
 */
#pragma once

#include <vector>

#include "JXRGlue.h"
#include "windowsmediaphoto.h"

namespace jxrlib {

  struct Stream {
    struct WMPStream *pStream;
    ERR err;
    Stream() : pStream(NULL), err(WMP_errSuccess) {}
    // No destructor required as resources are cleaned up by
    // PKImageDecode_Release
    //~Stream();
    Stream(unsigned char *bytes, size_t len);
  };

} // namespace jxrlib
