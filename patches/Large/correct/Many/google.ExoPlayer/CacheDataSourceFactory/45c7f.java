diff --git a/library/src/main/java/com/google/android/exoplayer2/upstream/cache/CacheDataSourceFactory.java b/library/src/main/java/com/google/android/exoplayer2/upstream/cache/CacheDataSourceFactory.java
index 125bec5..f280cc0 100644
--- a/library/src/main/java/com/google/android/exoplayer2/upstream/cache/CacheDataSourceFactory.java
+++ b/library/src/main/java/com/google/android/exoplayer2/upstream/cache/CacheDataSourceFactory.java
@@ -65,7 +65,7 @@
   }
 
   @Override
-  public DataSource createDataSource() {
+  public CacheDataSource createDataSource() {
     return new CacheDataSource(cache, upstreamFactory.createDataSource(),
         cacheReadDataSourceFactory.createDataSource(),
         cacheWriteDataSinkFactory.createDataSink(), flags, eventListener);
