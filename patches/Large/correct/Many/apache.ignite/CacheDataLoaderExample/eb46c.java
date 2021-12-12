diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheDataLoaderExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheDataLoaderExample.java
index ca2ef64..64fa179 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheDataLoaderExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheDataLoaderExample.java
@@ -56,7 +56,7 @@
             System.out.println(">>> Cache data loader example started.");
 
             // Clean up caches on all nodes before run.
-            ignite.cache(CACHE_NAME).clear(0);
+            ignite.jcache(CACHE_NAME).clear();
 
             System.out.println();
             System.out.println(">>> Cache clear finished.");
