diff --git a/src/edu/stanford/nlp/sentiment/SentimentCostAndGradient.java b/src/edu/stanford/nlp/sentiment/SentimentCostAndGradient.java
index b9e6eb6..2f0f37d 100644
--- a/src/edu/stanford/nlp/sentiment/SentimentCostAndGradient.java
+++ b/src/edu/stanford/nlp/sentiment/SentimentCostAndGradient.java
@@ -232,7 +232,7 @@
     SimpleMatrix fullVector = RNNUtils.concatenate(leftVector, rightVector);
     for (int slice = 0; slice < size; ++slice) {
       SimpleMatrix scaledFullVector = fullVector.scale(deltaFull.get(slice));
-      deltaTensor = deltaTensor.plus(Wt.getSlice(slice).mult(Wt.getSlice(slice).transpose()).mult(scaledFullVector));
+      deltaTensor = deltaTensor.plus(Wt.getSlice(slice).plus(Wt.getSlice(slice).transpose()).mult(scaledFullVector));
     }
     return deltaTensor.plus(WTDeltaNoBias);
   }
