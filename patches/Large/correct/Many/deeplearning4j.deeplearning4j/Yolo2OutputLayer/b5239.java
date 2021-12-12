diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/objdetect/Yolo2OutputLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/objdetect/Yolo2OutputLayer.java
index af51c40..5b602ca 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/objdetect/Yolo2OutputLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/objdetect/Yolo2OutputLayer.java
@@ -671,7 +671,7 @@
 
                         INDArray sm;
                         try (MemoryWorkspace wsO = Nd4j.getMemoryManager().scopeOutOfWorkspaces()) {
-                            sm = softmax.get(point(i), point(box), all(), point(x), point(y)).dup();
+                            sm = softmax.get(point(i), point(box), all(), point(y), point(x)).dup();
                         }
 
                         out.add(new DetectedObject(i, px, py, pw, ph, sm, conf));
