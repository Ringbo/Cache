diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/ConjugateGradient.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/ConjugateGradient.java
index 9119c9f..978d21d 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/ConjugateGradient.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/optimize/solvers/ConjugateGradient.java
@@ -88,7 +88,7 @@
         // = ((grad(current)-grad(last)) \dot (grad(current))) / (grad(last) \dot grad(last))
         double dgg = Nd4j.getBlasWrapper().dot(gradient.sub(gLast),gradient);
         double gg = Nd4j.getBlasWrapper().dot(gLast, gLast);
-        double gamma = Double.max(dgg / gg, 0.0);
+        double gamma = Math.max(dgg / gg, 0.0);
         
         //Standard Polak-Ribiere does not guarantee that the search direction is a descent direction
         //But using max(gamma_Polak-Ribiere,0) does guarantee a descent direction. Hence the max above.
