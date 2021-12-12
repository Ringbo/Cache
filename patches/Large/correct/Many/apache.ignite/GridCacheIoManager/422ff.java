diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheIoManager.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheIoManager.java
index 6bc9be9..8cd7c4b 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheIoManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheIoManager.java
@@ -500,7 +500,7 @@
         ClusterNode n = cctx.discovery().node(nodeId);
 
         if (n == null)
-            throw new ClusterTopologyException("Failed to send message because node left grid [nodeId=" + nodeId +
+            throw new ClusterTopologyCheckedException("Failed to send message because node left grid [nodeId=" + nodeId +
                 ", msg=" + msg + ']');
 
         send(n, msg, plc);
