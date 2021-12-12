diff --git a/lucene/src/java/org/apache/lucene/search/cache/IntValuesCreator.java b/lucene/src/java/org/apache/lucene/search/cache/IntValuesCreator.java
index 287fcb4..7c41f4f 100644
--- a/lucene/src/java/org/apache/lucene/search/cache/IntValuesCreator.java
+++ b/lucene/src/java/org/apache/lucene/search/cache/IntValuesCreator.java
@@ -75,7 +75,7 @@
   }
 
   @Override
-  public IntValues validate(IntValues entry, IndexReader reader) throws IOException {
+  public synchronized IntValues validate(IntValues entry, IndexReader reader) throws IOException {
     boolean ok = false;
     
     if( hasOption(OPTION_CACHE_VALUES) ) {
