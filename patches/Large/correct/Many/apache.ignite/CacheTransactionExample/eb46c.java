diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheTransactionExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheTransactionExample.java
index f5042da..6710ebc 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheTransactionExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheTransactionExample.java
@@ -50,7 +50,7 @@
             System.out.println(">>> Cache transaction example started.");
 
             // Clean up caches on all nodes before run.
-            ignite.cache(CACHE_NAME).clear(0);
+            ignite.jcache(CACHE_NAME).clear();
 
             IgniteCache<Integer, Account> cache = ignite.jcache(CACHE_NAME);
 
