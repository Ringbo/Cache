diff --git a/src/java/org/apache/lucene/index/TermInfosReader.java b/src/java/org/apache/lucene/index/TermInfosReader.java
index e2781d5..d0fcfd4 100644
--- a/src/java/org/apache/lucene/index/TermInfosReader.java
+++ b/src/java/org/apache/lucene/index/TermInfosReader.java
@@ -195,7 +195,7 @@
     int hi = indexTerms.length - 1;
 
     while (hi >= lo) {
-      int mid = (lo + hi) >> 1;
+      int mid = (lo + hi) >>> 1;
       int delta = term.compareTo(indexTerms[mid]);
       if (delta < 0)
 	hi = mid - 1;
