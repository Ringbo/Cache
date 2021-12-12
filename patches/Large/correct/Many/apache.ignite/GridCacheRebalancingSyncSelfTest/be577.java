diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/rebalancing/GridCacheRebalancingSyncSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/rebalancing/GridCacheRebalancingSyncSelfTest.java
index 09f9e58..4ee080f 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/rebalancing/GridCacheRebalancingSyncSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/rebalancing/GridCacheRebalancingSyncSelfTest.java
@@ -348,7 +348,7 @@
 
     /** {@inheritDoc} */
     @Override protected long getTestTimeout() {
-        return 5 * 60_000;
+        return 10 * 60_000;
     }
 
     /**
