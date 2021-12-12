diff --git a/lucene/src/java/org/apache/lucene/search/cache/FloatValuesCreator.java b/lucene/src/java/org/apache/lucene/search/cache/FloatValuesCreator.java
index 4219116..bfd6f07 100644
--- a/lucene/src/java/org/apache/lucene/search/cache/FloatValuesCreator.java
+++ b/lucene/src/java/org/apache/lucene/search/cache/FloatValuesCreator.java
@@ -75,7 +75,7 @@
   }
 
   @Override
-  public FloatValues validate(FloatValues entry, IndexReader reader) throws IOException {
+  public synchronized FloatValues validate(FloatValues entry, IndexReader reader) throws IOException {
     boolean ok = false;
     
     if( hasOption(OPTION_CACHE_VALUES) ) {
