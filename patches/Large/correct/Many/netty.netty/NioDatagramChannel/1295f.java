diff --git a/transport/src/main/java/io/netty/channel/socket/nio/NioDatagramChannel.java b/transport/src/main/java/io/netty/channel/socket/nio/NioDatagramChannel.java
index 8ce572c..ad647aa 100755
--- a/transport/src/main/java/io/netty/channel/socket/nio/NioDatagramChannel.java
+++ b/transport/src/main/java/io/netty/channel/socket/nio/NioDatagramChannel.java
@@ -200,7 +200,7 @@
             if (remoteAddress == null) {
                 return 0;
             }
-            buf.add(new DatagramPacket(buffer.writerIndex(buffer.writerIndex() + data.remaining()), remoteAddress));
+            buf.add(new DatagramPacket(buffer.writerIndex(buffer.writerIndex() + data.position()), remoteAddress));
             free = false;
             return 1;
         } catch (Throwable cause) {
