diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelId.java b/transport/src/main/java/io/netty/channel/DefaultChannelId.java
index fdc55b0..b31663c 100644
--- a/transport/src/main/java/io/netty/channel/DefaultChannelId.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelId.java
@@ -280,7 +280,7 @@
     }
 
     private static int scoreAddress(InetAddress addr) {
-        if (addr.isAnyLocalAddress()) {
+        if (addr.isAnyLocalAddress() || addr.isLoopbackAddress()) {
             return 0;
         }
         if (addr.isMulticastAddress()) {
