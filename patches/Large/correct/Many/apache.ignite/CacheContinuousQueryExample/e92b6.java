diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheContinuousQueryExample.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheContinuousQueryExample.java
index ec7a040..23a23f7 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheContinuousQueryExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/CacheContinuousQueryExample.java
@@ -60,9 +60,9 @@
                 cache.put(i, Integer.toString(i));
 
             // Create new continuous query.
-            ContinuousQuery<Integer, String> qry = Query.continuous();
+            ContinuousQuery<Integer, String> qry = new ContinuousQuery<>();
 
-            qry.setInitialPredicate(Query.scan(new IgniteBiPredicate<Integer, String>() {
+            qry.setInitialPredicate(new ScanQuery<>(new IgniteBiPredicate<Integer, String>() {
                 @Override public boolean apply(Integer key, String val) {
                     return key > 10;
                 }
@@ -80,7 +80,7 @@
             // Entry that pass this filter will be sent to the caller.
             qry.setRemoteFilter(new CacheEntryEventFilter<Integer, String>() {
                 @Override public boolean evaluate(CacheEntryEvent<? extends Integer, ? extends String> e) {
-                    return e.getKey() > 25;
+                    return e.getKey() > 10;
                 }
             });
 
