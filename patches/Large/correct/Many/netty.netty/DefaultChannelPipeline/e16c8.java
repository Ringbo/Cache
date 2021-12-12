diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java b/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
index 9fa4c8e..11e209a 100644
--- a/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelPipeline.java
@@ -143,7 +143,7 @@
         if (handlers == null) {
             throw new NullPointerException("handlers");
         }
-        if (handlers[0] == null) {
+        if (handlers.length == 0 || handlers[0] == null) {
             return this;
         }
 
