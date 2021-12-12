diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/iterator/IteratorUtils.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/iterator/IteratorUtils.java
index 4a56bdb..15d5908 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/iterator/IteratorUtils.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/main/java/org/deeplearning4j/spark/datavec/iterator/IteratorUtils.java
@@ -173,7 +173,7 @@
             if(allRecordsArr != null){
                 for(int i=0; i<allRecordsArr.length; i++ ){
                     if(allRecordsArr[i] == null){
-                        throw new IllegalStateException();
+                        throw new IllegalStateException("Encountered null records for input index " + i);
                     }
                 }
             }
@@ -181,7 +181,7 @@
             if(allRecordsSeqArr != null){
                 for(int i=0; i<allRecordsSeqArr.length; i++ ){
                     if(allRecordsSeqArr[i] == null){
-                        throw new IllegalStateException();
+                        throw new IllegalStateException("Encountered null sequence records for input index " + i);
                     }
                 }
             }
@@ -265,16 +265,19 @@
 
 
         if(rrs != null && rrs.size() > maxReaders){
-            throw new IllegalStateException();
+            throw new IllegalStateException("Invalid state: iterator has " + rrs.size() + " readers but " + maxReaders
+                    + " RDDs of List<Writable> were provided");
         }
         if(seqRRs != null && seqRRs.size() > maxSeqReaders){
-            throw new IllegalStateException();
+            throw new IllegalStateException("Invalid state: iterator has " + seqRRs.size() + " sequence readers but " +
+                    maxSeqReaders + " RDDs of sequences - List<List<Writable>> were provided");
         }
 
         if(rrs != null && rrs.size() > 0){
             for(Map.Entry<String,RecordReader> e : rrs.entrySet()){
                 if(!(e.getValue() instanceof SparkSourceDummyReader)){
-                    throw new IllegalStateException(e.getKey());
+                    throw new IllegalStateException("Invalid state: expected SparkSourceDummyReader for reader with name \""
+                            + e.getKey() + "\", but got reader type: " + e.getKey().getClass());
                 }
             }
         }
@@ -282,7 +285,8 @@
         if(seqRRs != null && seqRRs.size() > 0){
             for(Map.Entry<String,SequenceRecordReader> e : seqRRs.entrySet()){
                 if(!(e.getValue() instanceof SparkSourceDummySeqReader)){
-                    throw new IllegalStateException(e.getKey());
+                    throw new IllegalStateException("Invalid state: expected SparkSourceDummySeqReader for sequence reader with name \""
+                            + e.getKey() + "\", but got reader type: " + e.getKey().getClass());
                 }
             }
         }
