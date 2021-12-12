diff --git a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterWithThreads.java b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterWithThreads.java
index 706a3a6..8144e97 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterWithThreads.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterWithThreads.java
@@ -290,7 +290,7 @@
         success = true;
       } catch (IOException ioe) {
         failure.clearDoFail();
-        writer.shutdown(false);
+        writer.close();
       }
       if (VERBOSE) {
         System.out.println("TEST: success=" + success);
