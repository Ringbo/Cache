diff --git a/modules/yardstick/src/main/java/org/apache/ignite/yardstick/cache/load/IgniteCacheRandomOperationBenchmark.java b/modules/yardstick/src/main/java/org/apache/ignite/yardstick/cache/load/IgniteCacheRandomOperationBenchmark.java
index 539d4d9..bcea03c 100644
--- a/modules/yardstick/src/main/java/org/apache/ignite/yardstick/cache/load/IgniteCacheRandomOperationBenchmark.java
+++ b/modules/yardstick/src/main/java/org/apache/ignite/yardstick/cache/load/IgniteCacheRandomOperationBenchmark.java
@@ -199,7 +199,8 @@
             CacheConfiguration configuration = cache.getConfiguration(CacheConfiguration.class);
 
             if (isClassDefinedInConfig(configuration)) {
-                if (configuration.getMemoryMode() == CacheMemoryMode.OFFHEAP_TIERED) {
+                if (configuration.getMemoryMode() == CacheMemoryMode.OFFHEAP_TIERED &&
+                    configuration.getQueryEntities().size() > 2) {
                     throw new IgniteException("Off-heap mode is unsupported by the load test due to bugs IGNITE-2982" +
                         " and IGNITE-2997");
                 }
@@ -560,7 +561,6 @@
     }
 
     /**
-     * @param cacheName Ignite cache name.
      * @return Operation.
      */
     @NotNull private Operation nextRandomOperation() {
