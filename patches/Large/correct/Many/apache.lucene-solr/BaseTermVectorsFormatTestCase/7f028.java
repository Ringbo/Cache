diff --git a/lucene/test-framework/src/java/org/apache/lucene/index/BaseTermVectorsFormatTestCase.java b/lucene/test-framework/src/java/org/apache/lucene/index/BaseTermVectorsFormatTestCase.java
index 565aa15..c76b944 100644
--- a/lucene/test-framework/src/java/org/apache/lucene/index/BaseTermVectorsFormatTestCase.java
+++ b/lucene/test-framework/src/java/org/apache/lucene/index/BaseTermVectorsFormatTestCase.java
@@ -722,7 +722,7 @@
       writer.close();
       dir.close();
       if (exception.get() != null) {
-        throw new AssertionError("One thread threw an exception", exception.get());
+        throw new RuntimeException("One thread threw an exception", exception.get());
       }
     }
   }
