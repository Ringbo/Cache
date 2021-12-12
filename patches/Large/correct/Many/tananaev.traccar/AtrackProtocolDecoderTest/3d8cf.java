diff --git a/test/org/traccar/protocol/AtrackProtocolDecoderTest.java b/test/org/traccar/protocol/AtrackProtocolDecoderTest.java
index c0d1461..1c0938e 100644
--- a/test/org/traccar/protocol/AtrackProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/AtrackProtocolDecoderTest.java
@@ -15,7 +15,7 @@
         decoder.setDataManager(new TestDataManager());
 
         int[] buf1 = {0xfe,0x02,0x00,0x01,0x41,0x04,0xd8,0xf1,0x96,0x82,0x00,0x01};
-        assertNotNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(buf1))));
+        assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(buf1))));
 
     }
 
