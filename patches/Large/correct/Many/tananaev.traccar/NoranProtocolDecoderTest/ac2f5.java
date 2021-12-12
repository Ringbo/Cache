diff --git a/test/org/traccar/protocol/NoranProtocolDecoderTest.java b/test/org/traccar/protocol/NoranProtocolDecoderTest.java
index 8d6025b..9d787c3 100644
--- a/test/org/traccar/protocol/NoranProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/NoranProtocolDecoderTest.java
@@ -17,10 +17,10 @@
         decoder.setDataManager(new TestDataManager());
 
         int[] buf1 = {0x0f,0x00,0x00,0x00,0x4e,0x52,0x30,0x39,0x46,0x30,0x34,0x31,0x35,0x35,0x00};
-        assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(buf1))));
+        assertNull(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(buf1))));
         
         int[] buf2 = {0x22,0x00,0x08,0x00,0x01,0x0c,0x00,0x8a,0x00,0x7e,0x9d,0xaa,0x42,0x31,0x7b,0xdd,0x41,0xa7,0xf3,0xe2,0x38,0x4e,0x52,0x30,0x39,0x46,0x30,0x34,0x31,0x35,0x35,0x00,0x00,0x00};
-        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(buf2))));
+        verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertArray(buf2))));
 
     }
 
