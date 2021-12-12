diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/export/StringToDataSetExportFunction.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/export/StringToDataSetExportFunction.java
index d563a44..c33d599 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/export/StringToDataSetExportFunction.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/export/StringToDataSetExportFunction.java
@@ -88,8 +88,7 @@
             return;
 
         RecordReader rr = new CollectionRecordReader(list);
-        RecordReaderDataSetIterator iter = new RecordReaderDataSetIterator(rr, new SelfWritableConverter(), batchSize,
-                        labelIndex, numPossibleLabels, regression);
+        RecordReaderDataSetIterator iter = new RecordReaderDataSetIterator(rr, batchSize, labelIndex, numPossibleLabels, regression);
 
         DataSet ds = iter.next();
 
