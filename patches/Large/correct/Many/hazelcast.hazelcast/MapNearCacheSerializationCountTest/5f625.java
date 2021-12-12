diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/MapNearCacheSerializationCountTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/MapNearCacheSerializationCountTest.java
index f312431..857fcd2 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/MapNearCacheSerializationCountTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/nearcache/MapNearCacheSerializationCountTest.java
@@ -147,7 +147,7 @@
         IMap<K, V> nearCacheMap = nearCacheMember.getMap(DEFAULT_NEAR_CACHE_NAME);
         IMap<K, V> dataMap = dataMember.getMap(DEFAULT_NEAR_CACHE_NAME);
 
-        NearCacheManager nearCacheManager = getMapNearCacheManager(dataMember);
+        NearCacheManager nearCacheManager = getMapNearCacheManager(nearCacheMember);
         NearCache<Data, String> nearCache = nearCacheManager.getNearCache(DEFAULT_NEAR_CACHE_NAME);
 
         return new NearCacheTestContextBuilder<K, V, Data, String>(nearCacheConfig, getSerializationService(dataMember))
