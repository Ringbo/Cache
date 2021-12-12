diff --git a/src/main/java/org/jboss/netty/handler/codec/http/HttpMessageDecoder.java b/src/main/java/org/jboss/netty/handler/codec/http/HttpMessageDecoder.java
index 7382eb8..7a80b91 100644
--- a/src/main/java/org/jboss/netty/handler/codec/http/HttpMessageDecoder.java
+++ b/src/main/java/org/jboss/netty/handler/codec/http/HttpMessageDecoder.java
@@ -164,7 +164,7 @@
         if (maxHeaderSize <= 0) {
             throw new IllegalArgumentException(
                     "maxHeaderSize must be a positive integer: " +
-                    maxChunkSize);
+                    maxHeaderSize);
         }
         if (maxChunkSize < 0) {
             throw new IllegalArgumentException(
