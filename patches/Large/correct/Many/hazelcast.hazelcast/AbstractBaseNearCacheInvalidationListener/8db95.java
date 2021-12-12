diff --git a/hazelcast/src/main/java/com/hazelcast/internal/nearcache/impl/invalidation/AbstractBaseNearCacheInvalidationListener.java b/hazelcast/src/main/java/com/hazelcast/internal/nearcache/impl/invalidation/AbstractBaseNearCacheInvalidationListener.java
index a17fc65..0d48c0f 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/nearcache/impl/invalidation/AbstractBaseNearCacheInvalidationListener.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/nearcache/impl/invalidation/AbstractBaseNearCacheInvalidationListener.java
@@ -90,14 +90,14 @@
         return new ExtractedParams(keys, sourceUuids, partitionUuids, sequences);
     }
 
-    private final class ExtractedParams {
+    private static final class ExtractedParams {
+
         private final List<Data> keys;
         private final List<String> sourceUuids;
         private final List<UUID> partitionUuids;
         private final List<Long> sequences;
 
-        public ExtractedParams(List<Data> keys, List<String> sourceUuids,
-                               List<UUID> partitionUuids, List<Long> sequences) {
+        ExtractedParams(List<Data> keys, List<String> sourceUuids, List<UUID> partitionUuids, List<Long> sequences) {
             this.keys = keys;
             this.sourceUuids = sourceUuids;
             this.partitionUuids = partitionUuids;
