diff --git a/lucene/src/java/org/apache/lucene/search/cache/ShortValuesCreator.java b/lucene/src/java/org/apache/lucene/search/cache/ShortValuesCreator.java
index 603fcbbb..88c776b 100644
--- a/lucene/src/java/org/apache/lucene/search/cache/ShortValuesCreator.java
+++ b/lucene/src/java/org/apache/lucene/search/cache/ShortValuesCreator.java
@@ -75,7 +75,7 @@
   }
 
   @Override
-  public ShortValues validate(ShortValues entry, IndexReader reader) throws IOException {
+  public synchronized ShortValues validate(ShortValues entry, IndexReader reader) throws IOException {
     boolean ok = false;
     
     if( hasOption(OPTION_CACHE_VALUES) ) {
