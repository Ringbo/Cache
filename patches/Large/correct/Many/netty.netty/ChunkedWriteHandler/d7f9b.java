diff --git a/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java b/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java
index 5ef5dfa..ec915cd 100644
--- a/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java
+++ b/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java
@@ -351,7 +351,7 @@
         void fail(Throwable cause) {
             ReferenceCountUtil.release(msg);
             if (promise != null) {
-                promise.setFailure(cause);
+                promise.tryFailure(cause);
             }
         }
 
