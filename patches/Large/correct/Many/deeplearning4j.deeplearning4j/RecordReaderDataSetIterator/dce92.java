diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/RecordReaderDataSetIterator.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/RecordReaderDataSetIterator.java
index 9c04247..3067ae0 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/RecordReaderDataSetIterator.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/datasets/datavec/RecordReaderDataSetIterator.java
@@ -680,7 +680,7 @@
             configuration = WorkspaceConfiguration.builder()
                     // FIXME: overalloc limit is wrong here obviously. We should do (divide prefetch size by number of threads) + 1 probably
                     .overallocationLimit(prefetchSize + 5)
-                    .minSize(200 * 1024L * 1024L)
+                    .minSize(10 * 1024L * 1024L)
                     .policyMirroring(MirroringPolicy.FULL)
                     .policySpill(SpillPolicy.EXTERNAL)
                     .policyLearning(LearningPolicy.OVER_TIME)
