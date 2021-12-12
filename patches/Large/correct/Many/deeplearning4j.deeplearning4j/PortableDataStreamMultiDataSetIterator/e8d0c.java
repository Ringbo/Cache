diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamMultiDataSetIterator.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamMultiDataSetIterator.java
index c9251fc..5b281fa 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamMultiDataSetIterator.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamMultiDataSetIterator.java
@@ -77,7 +77,8 @@
         try (InputStream is = pds.open()) {
             ds.load(is);
         } catch (IOException e) {
-            throw new RuntimeException(e);
+            throw new RuntimeException("Error loading MultiDataSet at path " + pds.getPath() + " - MultiDataSet may be corrupt or invalid." +
+                    " Spark MultiDataSets can be validated using org.deeplearning4j.spark.util.data.SparkDataValidation", e);
         }
 
         if (preprocessor != null)
