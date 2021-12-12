diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java b/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java
index d011722..42ab3af 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java
@@ -203,10 +203,10 @@
 
     private void cleanup() {
         if (decoder != null) {
-            // Clean-up the previous encoder if not cleaned up correctly.
+            // Clean-up the previous decoder if not cleaned up correctly.
             if (decoder.finish()) {
                 for (;;) {
-                    ByteBuf buf = decoder.readOutbound();
+                    ByteBuf buf = decoder.readInbound();
                     if (buf == null) {
                         break;
                     }
