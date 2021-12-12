diff --git a/h2o-algos/src/test/java/hex/deepwater/DeepWaterAbstractIntegrationTest.java b/h2o-algos/src/test/java/hex/deepwater/DeepWaterAbstractIntegrationTest.java
index 89779d8..4d386a0 100755
--- a/h2o-algos/src/test/java/hex/deepwater/DeepWaterAbstractIntegrationTest.java
+++ b/h2o-algos/src/test/java/hex/deepwater/DeepWaterAbstractIntegrationTest.java
@@ -93,7 +93,7 @@
   }
 
   @Test public void trainSamplesPerIteration0() { trainSamplesPerIteration(0,3); }
-  @Test public void trainSamplesPerIteration_auto() { trainSamplesPerIteration(-2,1); }
+  @Test public void trainSamplesPerIteration_auto() { trainSamplesPerIteration(-2,2); }
   @Test public void trainSamplesPerIteration_neg1() { trainSamplesPerIteration(-1,3); }
   @Test public void trainSamplesPerIteration_32() { trainSamplesPerIteration(32,26); }
   @Test public void trainSamplesPerIteration_1000() { trainSamplesPerIteration(1000,1); }
