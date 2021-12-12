diff --git a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
index 55d3c5f..547cd59 100644
--- a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
+++ b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
@@ -1923,7 +1923,9 @@
             if (log.isDebugEnabled())
                 log.debug("Join request has been sent, but receipt has not been read (returning RES_WAIT).");
 
-            return RES_WAIT;
+            // Topology will not include this node,
+            // however, warning on timed out join will be output.
+            return RES_OK;
         }
 
         throw new GridSpiException(
