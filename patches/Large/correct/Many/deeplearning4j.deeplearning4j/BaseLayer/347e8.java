diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/BaseLayer.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/BaseLayer.java
index 5af350f..d6826b6 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/BaseLayer.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/BaseLayer.java
@@ -367,7 +367,7 @@
 
     @Override
     public  INDArray activate() {
-        return activate();
+        return activate(false);
     }
 
 
