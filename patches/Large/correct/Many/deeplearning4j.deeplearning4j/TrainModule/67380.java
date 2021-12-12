diff --git a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
index a6dd2ff..f4a4760 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
@@ -795,7 +795,7 @@
                         layerInfoRows.add(new String[]{i18N.getMessage("train.model.layerinfotable.layerSize"), String.valueOf(ffl.getNOut())});
                         activationFn = layer.getActivationFunction();
                     }
-                    int nParams = layer.initializer().numParams(nnc, true);
+                    int nParams = layer.initializer().numParams(nnc);
                     layerInfoRows.add(new String[]{i18N.getMessage("train.model.layerinfotable.layerNParams"), String.valueOf(nParams)});
                     if (nParams > 0) {
                         WeightInit wi = layer.getWeightInit();
