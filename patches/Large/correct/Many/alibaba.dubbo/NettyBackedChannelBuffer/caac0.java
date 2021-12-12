diff --git a/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyBackedChannelBuffer.java b/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyBackedChannelBuffer.java
index 3bd911f..51c697c 100644
--- a/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyBackedChannelBuffer.java
+++ b/dubbo-remoting/dubbo-remoting-netty/src/main/java/org/apache/dubbo/remoting/transport/netty/NettyBackedChannelBuffer.java
@@ -119,7 +119,7 @@
         // careful
         byte[] data = new byte[length];
         buffer.getBytes(srcIndex, data, 0, length);
-        setBytes(0, data, index, length);
+        setBytes(index, data, 0, length);
     }
 
 
