diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheEventsExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheEventsExample.java
index 0a3245f..5156a1b 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheEventsExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheEventsExample.java
@@ -53,7 +53,7 @@
             final IgniteCache<Integer, String> cache = ignite.jcache(CACHE_NAME);
 
             // Clean up caches on all nodes before run.
-            cache.clear(0);
+            cache.clear();
 
             // This optional local callback is called for each event notification
             // that passed remote predicate listener.
