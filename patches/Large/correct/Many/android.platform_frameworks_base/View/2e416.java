diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index de304da..39dc3f4 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -13676,7 +13676,7 @@
             if (layerType == LAYER_TYPE_HARDWARE) {
                 HardwareLayer layer = getHardwareLayer();
                 if (layer != null) {
-                    layer.setLayerPaint(paint);
+                    layer.setLayerPaint(mLayerPaint);
                 }
                 invalidateViewProperty(false, false);
             } else {
