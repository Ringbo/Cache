diff --git a/src/java/org/apache/solr/search/function/LongFieldSource.java b/src/java/org/apache/solr/search/function/LongFieldSource.java
index 3dcf4f1..7a0579d 100644
--- a/src/java/org/apache/solr/search/function/LongFieldSource.java
+++ b/src/java/org/apache/solr/search/function/LongFieldSource.java
@@ -69,11 +69,11 @@
       }
 
       public String strVal(int doc) {
-        return Double.toString(arr[doc]);
+        return Long.toString(arr[doc]);
       }
 
       public String toString(int doc) {
-        return description() + '=' + floatVal(doc);
+        return description() + '=' + longVal(doc);
       }
 
 
