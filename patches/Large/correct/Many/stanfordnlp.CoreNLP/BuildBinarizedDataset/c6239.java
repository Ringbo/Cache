diff --git a/src/edu/stanford/nlp/sentiment/BuildBinarizedDataset.java b/src/edu/stanford/nlp/sentiment/BuildBinarizedDataset.java
index 8d7928b..31690d9 100644
--- a/src/edu/stanford/nlp/sentiment/BuildBinarizedDataset.java
+++ b/src/edu/stanford/nlp/sentiment/BuildBinarizedDataset.java
@@ -201,7 +201,7 @@
         scorer.forwardPropagateTree(collapsedUnary);
         setPredictedLabels(collapsedUnary);
       } else {
-        setUnknownLabels(binarized, mainLabel);
+        setUnknownLabels(collapsedUnary, mainLabel);
       }
 
       Trees.convertToCoreLabels(collapsedUnary);
