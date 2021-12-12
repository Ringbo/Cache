diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java
index 728872b..183c302 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java
@@ -332,7 +332,7 @@
             initializeUnderlyingFromReader();
         }
 
-        MultiDataSet mds = underlying.next();
+        MultiDataSet mds = underlying.next(num);
         DataSet ds = mdsToDataSet(mds);
 
         if(preProcessor != null){
