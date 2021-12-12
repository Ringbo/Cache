diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
index e4d3fa0..37cf058 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
@@ -3406,7 +3406,7 @@
                 }
             } while (ctx.affinity().affinityTopologyVersion() > topVer);
         }
-        catch (ClusterGroupEmptyException ignore) {
+        catch (ClusterGroupEmptyCheckedException ignore) {
             if (log.isDebugEnabled())
                 log.debug("All remote nodes left while cache remove [cacheName=" + name() + "]");
         }
