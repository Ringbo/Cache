diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapManagerImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapManagerImpl.java
index c9b1cf0..a34d35f 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapManagerImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/IgniteCacheOffheapManagerImpl.java
@@ -928,7 +928,7 @@
                 throw new NodeStoppingException("Operation has been cancelled (node is stopping).");
 
             try {
-                DataRow dataRow = new DataRow(key, val, ver, p, expireTime);
+                DataRow dataRow = new DataRow(key, val, ver, partId, expireTime);
 
                 CacheObjectContext coCtx = cctx.cacheObjectContext();
 
@@ -998,7 +998,7 @@
         /** {@inheritDoc} */
         @Override public void updateIndexes(KeyCacheObject key) throws IgniteCheckedException {
             if (indexingEnabled) {
-                DataRow row = dataTree.findOne(new KeySearchRow(key.hashCode(), key, 0));
+                CacheDataRow row = dataTree.findOne(new SearchRow(key));
 
                 GridCacheQueryManager qryMgr = cctx.queries();
 
