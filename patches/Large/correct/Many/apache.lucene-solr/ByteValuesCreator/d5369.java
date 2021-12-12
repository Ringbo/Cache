diff --git a/lucene/src/java/org/apache/lucene/search/cache/ByteValuesCreator.java b/lucene/src/java/org/apache/lucene/search/cache/ByteValuesCreator.java
index d28494b..11bde67 100644
--- a/lucene/src/java/org/apache/lucene/search/cache/ByteValuesCreator.java
+++ b/lucene/src/java/org/apache/lucene/search/cache/ByteValuesCreator.java
@@ -74,7 +74,7 @@
   }
 
   @Override
-  public ByteValues validate(ByteValues entry, IndexReader reader) throws IOException {
+  public synchronized ByteValues validate(ByteValues entry, IndexReader reader) throws IOException {
     boolean ok = false;
     
     if( hasOption(OPTION_CACHE_VALUES) ) {
