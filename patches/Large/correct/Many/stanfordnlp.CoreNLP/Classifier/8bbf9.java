diff --git a/src/edu/stanford/nlp/parser/nndep/Classifier.java b/src/edu/stanford/nlp/parser/nndep/Classifier.java
index f57213d..a1b32e0 100644
--- a/src/edu/stanford/nlp/parser/nndep/Classifier.java
+++ b/src/edu/stanford/nlp/parser/nndep/Classifier.java
@@ -654,7 +654,7 @@
    */
   public void preCompute(Set<Integer> toPreCompute) {
     long startTime = System.currentTimeMillis();
-    saved = new double[toPreCompute.size()][config.hiddenSize];
+    saved = new double[preMap.size()][config.hiddenSize];
     for (int x : toPreCompute) {
       int mapX = preMap.get(x);
       int tok = x / config.numTokens;
