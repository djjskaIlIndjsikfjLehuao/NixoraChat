package com.telix.messenger.tgnet.model

import com.telix.messenger.tgnet.OutputSerializedData

public interface TlGen_Object {
    fun serializeToStream(stream: OutputSerializedData)
}