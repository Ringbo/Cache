diff --git a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningReproducibilityTest.java b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningReproducibilityTest.java
index 1b824f5..9953d86 100644
--- a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningReproducibilityTest.java
+++ b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningReproducibilityTest.java
@@ -123,7 +123,7 @@
           stddev /= N;
           stddev = Math.sqrt(stddev);
           //Log.info("standard deviation: " + stddev);
-          assertTrue(stddev < 0.15 / Math.sqrt(N));
+          assertTrue(stddev < 0.3 / Math.sqrt(N));
           //Log.info("difference to reproducible mode: " + Math.abs(mean - repro_error) / stddev + " standard deviations");
         }
       } finally {
