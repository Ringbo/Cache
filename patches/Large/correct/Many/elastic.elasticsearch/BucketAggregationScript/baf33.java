diff --git a/server/src/main/java/org/elasticsearch/script/BucketAggregationScript.java b/server/src/main/java/org/elasticsearch/script/BucketAggregationScript.java
index 5fa8d1f..76ff776 100644
--- a/server/src/main/java/org/elasticsearch/script/BucketAggregationScript.java
+++ b/server/src/main/java/org/elasticsearch/script/BucketAggregationScript.java
@@ -46,7 +46,7 @@
         return params;
     }
 
-    public abstract Double execute();
+    public abstract Number execute();
 
     public interface Factory {
         BucketAggregationScript newInstance(Map<String, Object> params);
