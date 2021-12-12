diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java
index dcd22cd..26e2f6c 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java
@@ -890,7 +890,7 @@
 
             String cacheName = ((CollectionInfo)oldInfo.info).cacheName;
 
-            GridCacheContext cacheCtx = ctx.cache().internalCache(cacheName).context();
+            GridCacheContext cacheCtx = ctx.cache().getOrStartCache(cacheName).context();
 
             return c.applyx(cacheCtx);
         }
