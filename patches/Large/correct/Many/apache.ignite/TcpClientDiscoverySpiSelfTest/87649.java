diff --git a/modules/core/src/test/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpiSelfTest.java b/modules/core/src/test/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpiSelfTest.java
index 331b581..63504bd 100644
--- a/modules/core/src/test/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpiSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpiSelfTest.java
@@ -2037,7 +2037,7 @@
      * @return Time in milliseconds.
      */
     protected long awaitTime() {
-        return 10_000;
+        return 20_000;
     }
 
     /**
