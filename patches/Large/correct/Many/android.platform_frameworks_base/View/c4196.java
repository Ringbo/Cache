diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 7a1923b..7d09fb2 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -10372,10 +10372,10 @@
             if (mHardwareLayer == null) {
                 mHardwareLayer = mAttachInfo.mHardwareRenderer.createHardwareLayer(
                         width, height, isOpaque());
-                mLocalDirtyRect.setEmpty();
+                mLocalDirtyRect.set(0, 0, width, height);
             } else if (mHardwareLayer.getWidth() != width || mHardwareLayer.getHeight() != height) {
                 mHardwareLayer.resize(width, height);
-                mLocalDirtyRect.setEmpty();
+                mLocalDirtyRect.set(0, 0, width, height);
             }
 
             // The layer is not valid if the underlying GPU resources cannot be allocated
