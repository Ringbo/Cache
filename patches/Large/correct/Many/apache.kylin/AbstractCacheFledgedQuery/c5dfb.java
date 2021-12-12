diff --git a/core-storage/src/main/java/org/apache/kylin/storage/cache/AbstractCacheFledgedQuery.java b/core-storage/src/main/java/org/apache/kylin/storage/cache/AbstractCacheFledgedQuery.java
index 745ddd1..18011e4 100644
--- a/core-storage/src/main/java/org/apache/kylin/storage/cache/AbstractCacheFledgedQuery.java
+++ b/core-storage/src/main/java/org/apache/kylin/storage/cache/AbstractCacheFledgedQuery.java
@@ -58,7 +58,7 @@
                 //maxBytesLocalHeap(10, MemoryUnit.MEGABYTES).//
                 persistence(new PersistenceConfiguration().strategy(PersistenceConfiguration.Strategy.NONE)));
 
-        CACHE_MANAGER.addCache(storageCache);
+        CACHE_MANAGER.addCacheIfAbsent(storageCache);
     }
 
     protected StreamSQLResult getStreamSQLResult(StreamSQLDigest streamSQLDigest) {
@@ -103,8 +103,7 @@
                     //maxBytesLocalHeap(templateConf.getMaxBytesLocalHeap(), MemoryUnit.BYTES).//using pooled size
                     persistence(templateConf.getPersistenceConfiguration()));
 
-            CACHE_MANAGER.addCache(storageCache);
-
+            CACHE_MANAGER.addCacheIfAbsent(storageCache);
         }
     }
 }
