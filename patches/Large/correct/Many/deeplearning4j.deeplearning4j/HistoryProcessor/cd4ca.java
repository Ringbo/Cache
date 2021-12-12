diff --git a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/learning/HistoryProcessor.java b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/learning/HistoryProcessor.java
index 22f68e1..6558753 100644
--- a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/learning/HistoryProcessor.java
+++ b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/learning/HistoryProcessor.java
@@ -101,7 +101,7 @@
         int[] shape = raw.shape();
         Mat ocvmat = new Mat(shape[0], shape[1], CV_32FC(3), raw.data().pointer());
         Mat cvmat = new Mat(shape[0], shape[1], CV_8UC(3));
-        ocvmat.convertTo(cvmat, CV_8UC(3));
+        ocvmat.convertTo(cvmat, CV_8UC(3), 255.0, 0.0);
         cvtColor(cvmat, cvmat, COLOR_RGB2GRAY);
         Mat resized = new Mat(conf.getRescaledHeight(), conf.getRescaledWidth(), CV_8UC(1));
         resize(cvmat, resized, new Size(conf.getRescaledWidth(), conf.getRescaledHeight()));
@@ -119,7 +119,7 @@
             e.printStackTrace();
         }
         //System.out.println(out.shapeInfoToString());
-        out = out.reshape(1, conf.getCroppingHeight(), conf.getCroppingWidth());
+        out = out.reshape(1, conf.getCroppingHeight(), conf.getCroppingWidth()).muli(1.0 / 255.0);
         INDArray compressed = compressor.compress(out);
         return compressed;
     }
