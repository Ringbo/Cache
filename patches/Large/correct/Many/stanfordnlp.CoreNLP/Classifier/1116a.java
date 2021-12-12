diff --git a/src/edu/stanford/nlp/parser/nndep/Classifier.java b/src/edu/stanford/nlp/parser/nndep/Classifier.java
index 8a563bc..12dc993 100644
--- a/src/edu/stanford/nlp/parser/nndep/Classifier.java
+++ b/src/edu/stanford/nlp/parser/nndep/Classifier.java
@@ -271,7 +271,7 @@
         double[] gradHidden = new double[config.hiddenSize];
         for (int nodeIndex : ls) {
           gradHidden[nodeIndex] = gradHidden3[nodeIndex] * 3 * hidden[nodeIndex] * hidden[nodeIndex];
-          gradb1[nodeIndex] += gradHidden3[nodeIndex];
+          gradb1[nodeIndex] += gradHidden[nodeIndex];
         }
 
         offset = 0;
