diff --git a/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java b/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java
index db9d62f..d4b8234 100644
--- a/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java
+++ b/handler/src/main/java/io/netty/handler/stream/ChunkedWriteHandler.java
@@ -350,7 +350,7 @@
         void progress() {
             progress ++;
             if (promise instanceof ChannelProgressivePromise) {
-                ((ChannelProgressivePromise) promise).setProgress(progress, -1);
+                ((ChannelProgressivePromise) promise).tryProgress(progress, -1);
             }
         }
     }
