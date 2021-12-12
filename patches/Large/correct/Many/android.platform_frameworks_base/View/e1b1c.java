diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 7e51096..13712fb 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -15741,8 +15741,10 @@
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
 
