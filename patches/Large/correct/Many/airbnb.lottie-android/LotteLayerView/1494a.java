diff --git a/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java b/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java
index b13efb8..51395e6 100644
--- a/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java
+++ b/lotte/src/main/java/com/airbnb/lotte/layers/LotteLayerView.java
@@ -259,7 +259,7 @@
         }
 
         LotteTransform3D scale = layer.getScale().getObservable().getValue();
-        if (scale.getScaleX() != 0f || scale.getScaleY() != 0f) {
+        if (scale.getScaleX() != 1f || scale.getScaleY() != 1f) {
             canvas.scale(scale.getScaleX(), scale.getScaleY());
         }
 
