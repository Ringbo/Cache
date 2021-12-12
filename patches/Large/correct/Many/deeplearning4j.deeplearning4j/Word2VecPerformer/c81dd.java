diff --git a/deeplearning4j-scaleout/hadoop-yarn/deeplearning4j-nlp-yarn/src/main/java/org/deeplearning4j/models/word2vec/Word2VecPerformer.java b/deeplearning4j-scaleout/hadoop-yarn/deeplearning4j-nlp-yarn/src/main/java/org/deeplearning4j/models/word2vec/Word2VecPerformer.java
index 12aed97..c1decfd 100644
--- a/deeplearning4j-scaleout/hadoop-yarn/deeplearning4j-nlp-yarn/src/main/java/org/deeplearning4j/models/word2vec/Word2VecPerformer.java
+++ b/deeplearning4j-scaleout/hadoop-yarn/deeplearning4j-nlp-yarn/src/main/java/org/deeplearning4j/models/word2vec/Word2VecPerformer.java
@@ -335,7 +335,7 @@
             //score
             double f =  expTable[idx];
             //gradient
-            double g = (1 - code - f) * (useAdaGrad ?  w1.getGradient(i, alpha) : alpha);
+            double g = (1 - code - f) * (useAdaGrad ?  w1.getGradient(i, alpha, alpha) : alpha);
 
 
             if(neu1e.data().dataType() == DataBuffer.Type.DOUBLE) {
@@ -374,11 +374,11 @@
                 double f = Nd4j.getBlasWrapper().dot(l1, syn1Neg);
                 double g;
                 if (f > MAX_EXP)
-                    g = useAdaGrad ? w1.getGradient(target, (label - 1)) : (label - 1) *  alpha;
+                    g = useAdaGrad ? w1.getGradient(target, (label - 1), this.alpha) : (label - 1) *  alpha;
                 else if (f < -MAX_EXP)
-                    g = (label - 0) * (useAdaGrad ?  w1.getGradient(target, alpha) : alpha);
+                    g = (label - 0) * (useAdaGrad ?  w1.getGradient(target, alpha, this.alpha) : alpha);
                 else
-                    g = useAdaGrad ? w1.getGradient(target, label - expTable[(int)((f + MAX_EXP) * (expTable.length / MAX_EXP / 2))]) : (label - expTable[(int)((f + MAX_EXP) * (expTable.length / MAX_EXP / 2))]) *   alpha;
+                    g = useAdaGrad ? w1.getGradient(target, label - expTable[(int)((f + MAX_EXP) * (expTable.length / MAX_EXP / 2))], this.alpha) : (label - expTable[(int)((f + MAX_EXP) * (expTable.length / MAX_EXP / 2))]) *   alpha;
                 if(syn1Neg.data().dataType() == DataBuffer.Type.DOUBLE)
                     Nd4j.getBlasWrapper().axpy(g,neu1e,l1);
                 else
