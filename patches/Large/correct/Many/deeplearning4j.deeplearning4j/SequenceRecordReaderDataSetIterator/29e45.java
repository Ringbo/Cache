diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java
index 183c302..728872b 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/SequenceRecordReaderDataSetIterator.java
@@ -332,7 +332,7 @@
             initializeUnderlyingFromReader();
         }
 
-        MultiDataSet mds = underlying.next(num);
+        MultiDataSet mds = underlying.next();
         DataSet ds = mdsToDataSet(mds);
 
         if(preProcessor != null){
