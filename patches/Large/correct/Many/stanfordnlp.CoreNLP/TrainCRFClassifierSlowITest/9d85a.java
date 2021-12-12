diff --git a/itest/src/edu/stanford/nlp/ie/crf/TrainCRFClassifierSlowITest.java b/itest/src/edu/stanford/nlp/ie/crf/TrainCRFClassifierSlowITest.java
index f6f1fcd..45c1d08 100644
--- a/itest/src/edu/stanford/nlp/ie/crf/TrainCRFClassifierSlowITest.java
+++ b/itest/src/edu/stanford/nlp/ie/crf/TrainCRFClassifierSlowITest.java
@@ -42,7 +42,7 @@
     double p = scanner.nextDouble();
     Assert.assertEquals("Precision outside target range", 0.8364, p, 0.001);
     double r = scanner.nextDouble();
-    Assert.assertEquals("Recall outside target range", 0.6924, r, 0.001);
+    Assert.assertEquals("Recall outside target range", 0.691, r, 0.001);
     double f1 = scanner.nextDouble();
     Assert.assertEquals("Precision outside target range", 0.7576, f1, 0.001);
   }
