diff --git a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModuleUtils.java b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModuleUtils.java
index 76d8be0..5a9fc37 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModuleUtils.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModuleUtils.java
@@ -146,7 +146,7 @@
             FeedForwardLayer layer1 = (FeedForwardLayer) layer;
             map.put("Input size", String.valueOf(layer1.getNIn()));
             map.put("Output size", String.valueOf(layer1.getNOut()));
-            map.put("Num Parameters", String.valueOf(layer1.initializer().numParams(c, true)));
+            map.put("Num Parameters", String.valueOf(layer1.initializer().numParams(c)));
             map.put("Activation Function", layer1.getActivationFunction());
         }
 
