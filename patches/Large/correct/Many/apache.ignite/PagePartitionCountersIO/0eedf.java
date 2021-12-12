diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/tree/io/PagePartitionCountersIO.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/tree/io/PagePartitionCountersIO.java
index 9bd806f..d5b81c1 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/tree/io/PagePartitionCountersIO.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/tree/io/PagePartitionCountersIO.java
@@ -129,7 +129,7 @@
             long cacheSize = PageUtils.getLong(pageAddr, off);
             off += 8;
 
-            assert cacheSize > 0 : cacheSize;
+            assert cacheSize >= 0 : cacheSize;
 
             Long old = res.put(cacheId, cacheSize);
 
