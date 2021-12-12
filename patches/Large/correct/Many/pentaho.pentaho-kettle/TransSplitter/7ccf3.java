diff --git a/src/org/pentaho/di/trans/cluster/TransSplitter.java b/src/org/pentaho/di/trans/cluster/TransSplitter.java
index 98ed40f..f27d4c4 100644
--- a/src/org/pentaho/di/trans/cluster/TransSplitter.java
+++ b/src/org/pentaho/di/trans/cluster/TransSplitter.java
@@ -538,7 +538,7 @@
                               // Also set the target partitioning on the slave step.
                               // A copy of the original previous step partitioning schema
                               //
-                              if (previousStepPartitioningMeta.isPartitioned()) {
+                              if (referenceStep.isPartitioned()) {
                                 
                                 // Set the target partitioning schema for the source step (master)
                                 //
