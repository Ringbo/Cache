diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheUtils.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheUtils.java
index c5037c5..12b6566 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheUtils.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheUtils.java
@@ -1755,7 +1755,7 @@
         boolean readThrough,
         boolean skipVals
     ) {
-        if (!readThrough || skipVals ||
+        if (cctx.mvccEnabled() || !readThrough || skipVals ||
             (key != null && !cctx.affinity().backupsByKey(key, topVer).contains(cctx.localNode())))
             return null;
 
