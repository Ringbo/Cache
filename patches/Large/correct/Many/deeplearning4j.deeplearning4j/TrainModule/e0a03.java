diff --git a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
index acc4b6f..f3cd1a0 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
@@ -911,7 +911,7 @@
                 lastBytes[0] = jvmCurrentBytes;
                 lastBytes[1] = ohCurrentBytes;
 
-                lastMaxBytes[0] = jvmCurrentBytes;
+                lastMaxBytes[0] = jvmMaxBytes;
                 lastMaxBytes[1] = ohMaxBytes;
 
                 if (numDevices > 0) {
