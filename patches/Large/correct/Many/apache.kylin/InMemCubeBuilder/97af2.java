diff --git a/core-cube/src/main/java/org/apache/kylin/cube/inmemcubing/InMemCubeBuilder.java b/core-cube/src/main/java/org/apache/kylin/cube/inmemcubing/InMemCubeBuilder.java
index 8293756..575583f 100644
--- a/core-cube/src/main/java/org/apache/kylin/cube/inmemcubing/InMemCubeBuilder.java
+++ b/core-cube/src/main/java/org/apache/kylin/cube/inmemcubing/InMemCubeBuilder.java
@@ -355,8 +355,9 @@
 
     private CuboidResult updateCuboidResult(long cuboidId, GridTable table, int nRows, long timeSpent, int aggrCacheMB) {
         if (aggrCacheMB <= 0 && baseResult != null) {
-            aggrCacheMB = (int) Math.ceil( //
-                    (DERIVE_AGGR_CACHE_CONSTANT_FACTOR + DERIVE_AGGR_CACHE_VARIABLE_FACTOR * nRows / baseResult.nRows) * baseResult.aggrCacheMB);
+            aggrCacheMB = (int) Math.round( //
+                    (DERIVE_AGGR_CACHE_CONSTANT_FACTOR + DERIVE_AGGR_CACHE_VARIABLE_FACTOR * nRows / baseResult.nRows) //
+                            * baseResult.aggrCacheMB);
         }
 
         CuboidResult result = new CuboidResult(cuboidId, table, nRows, timeSpent, aggrCacheMB);
