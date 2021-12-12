diff --git a/src/java/org/apache/lucene/search/FieldCache.java b/src/java/org/apache/lucene/search/FieldCache.java
index 7204c0b..22ff379 100644
--- a/src/java/org/apache/lucene/search/FieldCache.java
+++ b/src/java/org/apache/lucene/search/FieldCache.java
@@ -48,7 +48,7 @@
       int high = lookup.length-1;
 
       while (low <= high) {
-        int mid = (low + high) >> 1;
+        int mid = (low + high) >>> 1;
         int cmp = lookup[mid].compareTo(key);
 
         if (cmp < 0)
