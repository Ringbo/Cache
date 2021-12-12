diff --git a/jetty-websocket/websocket-core/src/test/java/org/eclipse/jetty/websocket/parser/TextPayloadParserTest.java b/jetty-websocket/websocket-core/src/test/java/org/eclipse/jetty/websocket/parser/TextPayloadParserTest.java
index ffe47f6..a40cabc 100644
--- a/jetty-websocket/websocket-core/src/test/java/org/eclipse/jetty/websocket/parser/TextPayloadParserTest.java
+++ b/jetty-websocket/websocket-core/src/test/java/org/eclipse/jetty/websocket/parser/TextPayloadParserTest.java
@@ -61,10 +61,10 @@
 
         Assert.assertThat("Must be a long length payload",utf.length,greaterThan(0xFFFF));
 
-        ByteBuffer buf = ByteBuffer.allocate(utf.length + 10);
+        ByteBuffer buf = ByteBuffer.allocate(utf.length + 32);
         buf.put((byte)0x81);
-        buf.put((byte)(0x80 | 0x7F)); // 0x7F == 127 (a 4 byte payload length)
-        buf.putInt(utf.length);
+        buf.put((byte)(0x80 | 0x7F)); // 0x7F == 127 (a 8 byte payload length)
+        buf.putLong(utf.length);
         MaskedByteBuffer.putMask(buf);
         MaskedByteBuffer.putPayload(buf,utf);
         buf.flip();
