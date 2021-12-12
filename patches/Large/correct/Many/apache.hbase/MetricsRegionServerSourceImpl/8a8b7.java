diff --git a/hbase-hadoop2-compat/src/main/java/org/apache/hadoop/hbase/regionserver/MetricsRegionServerSourceImpl.java b/hbase-hadoop2-compat/src/main/java/org/apache/hadoop/hbase/regionserver/MetricsRegionServerSourceImpl.java
index 4465332..27d5437 100644
--- a/hbase-hadoop2-compat/src/main/java/org/apache/hadoop/hbase/regionserver/MetricsRegionServerSourceImpl.java
+++ b/hbase-hadoop2-compat/src/main/java/org/apache/hadoop/hbase/regionserver/MetricsRegionServerSourceImpl.java
@@ -242,7 +242,7 @@
           .addCounter(Interns.info(MOB_FILE_CACHE_ACCESS_COUNT, MOB_FILE_CACHE_ACCESS_COUNT_DESC),
               rsWrap.getMobFileCacheAccessCount())
           .addCounter(Interns.info(MOB_FILE_CACHE_MISS_COUNT, MOB_FILE_CACHE_MISS_COUNT_DESC),
-              rsWrap.getMobFileCacheAccessCount())
+              rsWrap.getMobFileCacheMissCount())
           .addCounter(
               Interns.info(MOB_FILE_CACHE_EVICTED_COUNT, MOB_FILE_CACHE_EVICTED_COUNT_DESC),
               rsWrap.getMobFileCacheEvictedCount())
