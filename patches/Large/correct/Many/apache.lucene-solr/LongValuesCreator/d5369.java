diff --git a/lucene/src/java/org/apache/lucene/search/cache/LongValuesCreator.java b/lucene/src/java/org/apache/lucene/search/cache/LongValuesCreator.java
index f28eee7..27c1672 100644
--- a/lucene/src/java/org/apache/lucene/search/cache/LongValuesCreator.java
+++ b/lucene/src/java/org/apache/lucene/search/cache/LongValuesCreator.java
@@ -75,7 +75,7 @@
   }
 
   @Override
-  public LongValues validate(LongValues entry, IndexReader reader) throws IOException {
+  public synchronized LongValues validate(LongValues entry, IndexReader reader) throws IOException {
     boolean ok = false;
     
     if( hasOption(OPTION_CACHE_VALUES) ) {
