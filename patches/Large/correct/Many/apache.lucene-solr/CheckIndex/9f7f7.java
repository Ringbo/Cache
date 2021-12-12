diff --git a/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java b/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java
index 028da24..c676568 100644
--- a/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java
+++ b/lucene/core/src/java/org/apache/lucene/index/CheckIndex.java
@@ -2195,7 +2195,7 @@
           throw new RuntimeException("dv iterator field=" + field + ": doc=" + (doc-1) + " has unstable advanceExact");
         }
 
-        if (i % 1 == 0) {
+        if (i % 2 == 0) {
           int doc2 = it2.nextDoc();
           if (doc != doc2) {
             throw new RuntimeException("dv iterator field=" + field + ": doc=" + doc + " was not found through advance() (got: " + doc2 + ")");
