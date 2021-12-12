diff --git a/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasLayer.java b/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasLayer.java
index b070933..b6df3d8 100644
--- a/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasLayer.java
+++ b/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/KerasLayer.java
@@ -814,9 +814,9 @@
         if (innerConfig.containsKey(LAYER_FIELD_DROPOUT)) {
             /* For most feedforward layers. */
             dropout = 1.0 - (double) innerConfig.get(LAYER_FIELD_DROPOUT);
-        } else if (layerConfig.containsKey(LAYER_FIELD_DROPOUT_W)) {
+        } else if (innerConfig.containsKey(LAYER_FIELD_DROPOUT_W)) {
             /* For LSTMs. */
-            dropout = 1.0 - (double) layerConfig.get(LAYER_FIELD_DROPOUT_W);
+            dropout = 1.0 - (double) innerConfig.get(LAYER_FIELD_DROPOUT_W);
         }
         return dropout;
     }
