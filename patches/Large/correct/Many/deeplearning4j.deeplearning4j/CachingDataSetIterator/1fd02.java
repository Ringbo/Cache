diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/iterator/CachingDataSetIterator.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/iterator/CachingDataSetIterator.java
index dc7134c..55128e4 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/iterator/CachingDataSetIterator.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/iterator/CachingDataSetIterator.java
@@ -82,7 +82,7 @@
 
     @Override
     public int batch() {
-        return sourceIterator.numExamples();
+        return sourceIterator.batch();
     }
 
     @Override
