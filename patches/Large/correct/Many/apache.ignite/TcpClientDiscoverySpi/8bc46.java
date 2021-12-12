diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
index f32a991..7abdd4e 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
@@ -450,7 +450,7 @@
 
     /** {@inheritDoc} */
     @Override public void sendCustomEvent(DiscoverySpiCustomMessage evt) {
-        if (segmentation)
+        if (segmented)
             throw new IgniteException("Failed to send custom message: client is disconnected");
 
         try {
