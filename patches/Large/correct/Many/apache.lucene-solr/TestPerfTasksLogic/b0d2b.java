diff --git a/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java b/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
index 80e6ce8..1043f0d 100755
--- a/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
+++ b/contrib/benchmark/src/test/org/apache/lucene/benchmark/byTask/TestPerfTasksLogic.java
@@ -347,7 +347,7 @@
   /** use reuters and the exhaust mechanism, but to be faster, add 20 docs only... */
   public static class Reuters20DocMaker extends ReutersDocMaker {
     private int nDocs=0;
-    protected DocData getNextDocData() throws Exception {
+    protected synchronized DocData getNextDocData() throws Exception {
       if (nDocs>=20 && !forever) {
         throw new NoMoreDataException();
       }
