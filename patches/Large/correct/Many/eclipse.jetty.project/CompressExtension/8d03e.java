diff --git a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java
index cc41325..de1c128 100644
--- a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java
+++ b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java
@@ -143,7 +143,7 @@
 
     protected ByteAccumulator newByteAccumulator()
     {
-        int maxSize = Math.max(getPolicy().getMaxTextMessageSize(),getPolicy().getMaxBinaryMessageBufferSize());
+        int maxSize = Math.max(getPolicy().getMaxTextMessageSize(),getPolicy().getMaxBinaryMessageSize());
         return new ByteAccumulator(maxSize);
     }
 
