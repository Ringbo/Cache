diff --git a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java
index 9b86288..e7963d1 100644
--- a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java
+++ b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/extensions/compress/CompressExtension.java
@@ -149,7 +149,7 @@
 
     protected ByteAccumulator newByteAccumulator()
     {
-        int maxSize = Math.max(getPolicy().getMaxTextMessageSize(),getPolicy().getMaxBinaryMessageBufferSize());
+        int maxSize = Math.max(getPolicy().getMaxTextMessageSize(),getPolicy().getMaxBinaryMessageSize());
         return new ByteAccumulator(maxSize);
     }
 
