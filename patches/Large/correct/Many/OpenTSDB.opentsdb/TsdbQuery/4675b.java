diff --git a/src/core/TsdbQuery.java b/src/core/TsdbQuery.java
index 105cecf..7270c0c 100644
--- a/src/core/TsdbQuery.java
+++ b/src/core/TsdbQuery.java
@@ -365,14 +365,14 @@
         @Override
         public Object call(final ArrayList<byte[]> results) throws Exception {
           findGroupBys();
-          return Deferred.fromResult(null);
+          return null;
         }
       }
 
       /** Resolve and group by tags after resolving the metric */
-      class MetricCB implements Callback<Object, byte[]> {
+      class MetricCB implements Callback<Deferred<Object>, byte[]> {
         @Override
-        public Object call(final byte[] uid) throws Exception {
+        public Deferred<Object> call(final byte[] uid) throws Exception {
           metric = uid;
           if (filters != null) {
             final List<Deferred<byte[]>> deferreds = 
@@ -389,7 +389,7 @@
       
       // fire off the callback chain by resolving the metric first
       return tsdb.metrics.getIdAsync(sub_query.getMetric())
-          .addCallback(new MetricCB());
+          .addCallbackDeferring(new MetricCB());
     }
   }
   
