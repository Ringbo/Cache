diff --git a/contrib/spatial/src/java/org/apache/lucene/spatial/tier/LatLongDistanceFilter.java b/contrib/spatial/src/java/org/apache/lucene/spatial/tier/LatLongDistanceFilter.java
index 8e811c7..588cc99 100644
--- a/contrib/spatial/src/java/org/apache/lucene/spatial/tier/LatLongDistanceFilter.java
+++ b/contrib/spatial/src/java/org/apache/lucene/spatial/tier/LatLongDistanceFilter.java
@@ -81,7 +81,7 @@
   public BitSet bits(IndexReader reader) throws IOException {
 
     /* Create a BitSet to store the result */
-    int maxdocs = reader.numDocs();
+    int maxdocs = reader.maxDoc();
     BitSet bits = new BitSet(maxdocs);
     
     setPrecision(maxdocs);
