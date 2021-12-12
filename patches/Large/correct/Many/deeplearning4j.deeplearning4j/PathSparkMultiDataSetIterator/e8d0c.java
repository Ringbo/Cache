diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkMultiDataSetIterator.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkMultiDataSetIterator.java
index 66ce9f7..b291945 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkMultiDataSetIterator.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkMultiDataSetIterator.java
@@ -104,7 +104,8 @@
         try (FSDataInputStream inputStream = fileSystem.open(new Path(path), BUFFER_SIZE)) {
             ds.load(inputStream);
         } catch (IOException e) {
-            throw new RuntimeException(e);
+            throw new RuntimeException("Error loading MultiDataSet at path " + path + " - DataSet may be corrupt or invalid." +
+                    " Spark MultiDataSets can be validated using org.deeplearning4j.spark.util.data.SparkDataValidation", e);
         }
 
         return ds;
