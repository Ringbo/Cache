diff --git a/lucene/suggest/src/java/org/apache/lucene/search/suggest/FileDictionary.java b/lucene/suggest/src/java/org/apache/lucene/search/suggest/FileDictionary.java
index 3ee0efe..0b7cfec 100644
--- a/lucene/suggest/src/java/org/apache/lucene/search/suggest/FileDictionary.java
+++ b/lucene/suggest/src/java/org/apache/lucene/search/suggest/FileDictionary.java
@@ -113,7 +113,7 @@
     try {
       return new FileIterator();
     } catch (IOException e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e);
     }
   }
 
