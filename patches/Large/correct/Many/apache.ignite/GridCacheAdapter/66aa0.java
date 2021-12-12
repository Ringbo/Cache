diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
index b974c47..3271a5b 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
@@ -3398,7 +3398,7 @@
                 topVer = ctx.affinity().affinityTopologyVersion();
 
                 // Send job to all nodes.
-                Collection<ClusterNode> nodes = ctx.grid().forCache(name()).nodes();
+                Collection<ClusterNode> nodes = ctx.grid().forCacheNodes(name()).nodes();
 
                 IgniteInternalFuture<Object> fut = null;
 
