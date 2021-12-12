diff --git a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/feeds/TrecDocMaker.java b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/feeds/TrecDocMaker.java
index af3c00e..9114079 100644
--- a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/feeds/TrecDocMaker.java
+++ b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/feeds/TrecDocMaker.java
@@ -155,7 +155,7 @@
     return sb;
   }
   
-  protected DocData getNextDocData() throws NoMoreDataException, Exception {
+  protected synchronized DocData getNextDocData() throws NoMoreDataException, Exception {
     if (reader==null) {
       openNextFile();
     }
