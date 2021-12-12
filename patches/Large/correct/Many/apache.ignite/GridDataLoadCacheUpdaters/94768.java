diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/dataload/GridDataLoadCacheUpdaters.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/dataload/GridDataLoadCacheUpdaters.java
index be417f5..9f15572 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/dataload/GridDataLoadCacheUpdaters.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/dataload/GridDataLoadCacheUpdaters.java
@@ -100,7 +100,7 @@
      * @param putMap Entries to put.
      * @throws IgniteException If failed.
      */
-    protected static <K, V> void updateAll(IgniteCache<K, V> cache, @Nullable Collection<K> rmvCol,
+    protected static <K, V> void updateAll(IgniteCache<K, V> cache, @Nullable Set<K> rmvCol,
         Map<K, V> putMap) {
         assert rmvCol != null || putMap != null;
 
