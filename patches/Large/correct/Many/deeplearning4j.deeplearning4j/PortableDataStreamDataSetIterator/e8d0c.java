diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamDataSetIterator.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamDataSetIterator.java
index 9dfad27..a2bfc39 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamDataSetIterator.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/iterator/PortableDataStreamDataSetIterator.java
@@ -56,7 +56,8 @@
         try (InputStream is = pds.open()) {
             ds.load(is);
         } catch (IOException e) {
-            throw new RuntimeException(e);
+            throw new RuntimeException("Error loading DataSet at path " + pds.getPath() + " - DataSet may be corrupt or invalid." +
+                    " Spark DataSets can be validated using org.deeplearning4j.spark.util.data.SparkDataValidation", e);
         }
         cursor++;
         return ds;
