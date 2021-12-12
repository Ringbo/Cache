diff --git a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java
index 45243f1..ec5af38 100644
--- a/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java
+++ b/rl4j-core/src/main/java/org/deeplearning4j/rl4j/network/ac/ActorCriticCompGraph.java
@@ -44,7 +44,7 @@
 
 
     public void applyGradient(Gradient[] gradient, int batchSize) {
-        cg.getUpdater().update(cg, gradient[0], 1, batchSize);
+        cg.getUpdater().update(gradient[0], 1, batchSize);
         cg.params().subi(gradient[0].gradient());
     }
 
