diff --git a/arbiter/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/util/ScoreUtil.java b/arbiter/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/util/ScoreUtil.java
index c837cce..fd1931c 100644
--- a/arbiter/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/util/ScoreUtil.java
+++ b/arbiter/arbiter-deeplearning4j/src/main/java/org/deeplearning4j/arbiter/scoring/util/ScoreUtil.java
@@ -153,7 +153,7 @@
         int totalExamples = 0;
         while (testData.hasNext()) {
             DataSet ds = testData.next();
-            int numExamples = testData.numExamples();
+            int numExamples = ds.numExamples();
 
             sumScore += numExamples * model.score(ds);
             totalExamples += numExamples;
