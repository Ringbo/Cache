diff --git a/src/java/org/apache/solr/search/function/DoubleFieldSource.java b/src/java/org/apache/solr/search/function/DoubleFieldSource.java
index db7b6c2..0345604 100644
--- a/src/java/org/apache/solr/search/function/DoubleFieldSource.java
+++ b/src/java/org/apache/solr/search/function/DoubleFieldSource.java
@@ -72,7 +72,7 @@
       }
 
       public String toString(int doc) {
-        return description() + '=' + floatVal(doc);
+        return description() + '=' + doubleVal(doc);
       }
 
       @Override
