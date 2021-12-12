diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index e464e77..ea0a077 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -728,8 +728,8 @@
                 }
 
                 final Rect insets = attrs.surfaceInsets;
-                final boolean hasSurfaceInsets = insets.left == 0 || insets.right == 0
-                        || insets.top == 0 || insets.bottom == 0;
+                final boolean hasSurfaceInsets = insets.left != 0 || insets.right != 0
+                        || insets.top != 0 || insets.bottom != 0;
                 final boolean translucent = attrs.format != PixelFormat.OPAQUE || hasSurfaceInsets;
                 mAttachInfo.mHardwareRenderer = HardwareRenderer.create(mContext, translucent);
                 if (mAttachInfo.mHardwareRenderer != null) {
