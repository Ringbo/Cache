diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/store/CacheStoreLoadDataExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/store/CacheStoreLoadDataExample.java
index f38374e..7bc7133 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/store/CacheStoreLoadDataExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/store/CacheStoreLoadDataExample.java
@@ -53,7 +53,7 @@
             final IgniteCache<String, Integer> cache = ignite.jcache(null);
 
             // Clean up caches on all nodes before run.
-            cache.clear(0);
+            cache.clear();
 
             long start = System.currentTimeMillis();
 
