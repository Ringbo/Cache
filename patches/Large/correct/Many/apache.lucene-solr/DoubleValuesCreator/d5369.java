diff --git a/lucene/src/java/org/apache/lucene/search/cache/DoubleValuesCreator.java b/lucene/src/java/org/apache/lucene/search/cache/DoubleValuesCreator.java
index a72a322..13a8558 100644
--- a/lucene/src/java/org/apache/lucene/search/cache/DoubleValuesCreator.java
+++ b/lucene/src/java/org/apache/lucene/search/cache/DoubleValuesCreator.java
@@ -74,7 +74,7 @@
   }
 
   @Override
-  public DoubleValues validate(DoubleValues entry, IndexReader reader) throws IOException {
+  public synchronized DoubleValues validate(DoubleValues entry, IndexReader reader) throws IOException {
     boolean ok = false;
     
     if( hasOption(OPTION_CACHE_VALUES) ) {
