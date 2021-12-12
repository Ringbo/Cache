diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 307e700..8a6b5da 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -15742,8 +15742,10 @@
             return;
         }
 
-        // Destroy any previous software drawing cache if needed
-        if (mLayerType == LAYER_TYPE_SOFTWARE) {
+        if (layerType != LAYER_TYPE_SOFTWARE) {
+            // Destroy any previous software drawing cache if present
+            // NOTE: even if previous layer type is HW, we do this to ensure we've cleaned up
+            // drawing cache created in View#draw when drawing to a SW canvas.
             destroyDrawingCache();
         }
 
