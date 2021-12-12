diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/cache/impl/HazelcastClientCacheManager.java b/hazelcast-client/src/main/java/com/hazelcast/client/cache/impl/HazelcastClientCacheManager.java
index c489365..b0e40e6 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/cache/impl/HazelcastClientCacheManager.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/cache/impl/HazelcastClientCacheManager.java
@@ -126,7 +126,7 @@
     protected <K, V> CacheConfig<K, V> createConfigOnPartition(CacheConfig<K, V> cacheConfig) {
         try {
             int partitionId = clientContext.getPartitionService().getPartitionId(cacheConfig.getNameWithPrefix());
-            CacheCreateConfigRequest request = new CacheCreateConfigRequest(cacheConfig, true, partitionId);
+            CacheCreateConfigRequest request = new CacheCreateConfigRequest(cacheConfig, false, partitionId);
             Future future = clientContext.getInvocationService()
                                 .invokeOnKeyOwner(request, cacheConfig.getNameWithPrefix());
             return (CacheConfig<K, V>) clientContext.getSerializationService().toObject(future.get());
