diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkDataSetIterator.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkDataSetIterator.java
index d98e94b..94ccc97 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkDataSetIterator.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PathSparkDataSetIterator.java
@@ -70,7 +70,8 @@
         try (FSDataInputStream inputStream = fileSystem.open(new Path(path), BUFFER_SIZE)) {
             ds.load(inputStream);
         } catch (IOException e) {
-            throw new RuntimeException(e);
+            throw new RuntimeException("Error loading DataSet at path " + path + " - DataSet may be corrupt or invalid." +
+                    " Spark DataSets can be validated using org.deeplearning4j.spark.util.data.SparkDataValidation", e);
         }
 
         cursor++;
