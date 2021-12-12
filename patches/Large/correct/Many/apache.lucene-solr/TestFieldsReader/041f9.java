diff --git a/lucene/core/src/test/org/apache/lucene/index/TestFieldsReader.java b/lucene/core/src/test/org/apache/lucene/index/TestFieldsReader.java
index 1057e4f..28ce0d7 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestFieldsReader.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestFieldsReader.java
@@ -172,7 +172,7 @@
       try {
         i.seek(getFilePointer());
       } catch (IOException e) {
-        throw new RuntimeException();
+        throw new RuntimeException(e);
       }
       return i;
     }
