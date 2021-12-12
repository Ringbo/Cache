diff --git a/modules/facet/src/java/org/apache/lucene/facet/taxonomy/lucene/LuceneTaxonomyWriter.java b/modules/facet/src/java/org/apache/lucene/facet/taxonomy/lucene/LuceneTaxonomyWriter.java
index 8da8920..3a7c899 100644
--- a/modules/facet/src/java/org/apache/lucene/facet/taxonomy/lucene/LuceneTaxonomyWriter.java
+++ b/modules/facet/src/java/org/apache/lucene/facet/taxonomy/lucene/LuceneTaxonomyWriter.java
@@ -709,9 +709,8 @@
     return true;
   }
 
-  // TODO (Facet): synchronization of some sort?
   private ParentArray parentArray;
-  private ParentArray getParentArray() throws IOException {
+  private synchronized ParentArray getParentArray() throws IOException {
     if (parentArray==null) {
       if (reader == null) {
         reader = openReader();
