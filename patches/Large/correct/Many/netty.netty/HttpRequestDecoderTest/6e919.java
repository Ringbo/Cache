diff --git a/codec-http/src/test/java/io/netty/handler/codec/http/HttpRequestDecoderTest.java b/codec-http/src/test/java/io/netty/handler/codec/http/HttpRequestDecoderTest.java
index 51cb356..77f98dc 100644
--- a/codec-http/src/test/java/io/netty/handler/codec/http/HttpRequestDecoderTest.java
+++ b/codec-http/src/test/java/io/netty/handler/codec/http/HttpRequestDecoderTest.java
@@ -86,7 +86,7 @@
         assertEquals(CONTENT_LENGTH, c.content().readableBytes());
         assertEquals(
                 Unpooled.wrappedBuffer(content, content.length - CONTENT_LENGTH, CONTENT_LENGTH),
-                c.content().readBytes(CONTENT_LENGTH));
+                c.content().readSlice(CONTENT_LENGTH));
         c.release();
 
         assertFalse(channel.finish());
