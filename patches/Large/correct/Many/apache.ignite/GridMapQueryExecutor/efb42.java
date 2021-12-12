diff --git a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridMapQueryExecutor.java b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridMapQueryExecutor.java
index 2503a87..ba95d43 100644
--- a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridMapQueryExecutor.java
+++ b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridMapQueryExecutor.java
@@ -401,7 +401,7 @@
                 }
             }
             catch (IgniteCheckedException e) {
-                throw new CacheException(e);
+                throw new CacheException("Failed to unmarshall parameters.", e);
             }
 
             List<String> caches = (List<String>)F.concat(true, req.space(), req.extraSpaces());
@@ -422,7 +422,7 @@
             GridCacheContext<?,?> mainCctx = cacheContext(req.space());
 
             if (mainCctx == null)
-                throw new CacheException("Cache was destroyed: " + req.space());
+                throw new CacheException("Failed to find cache: " + req.space());
 
             qr = new QueryResults(req.requestId(), qrys.size(), mainCctx);
 
