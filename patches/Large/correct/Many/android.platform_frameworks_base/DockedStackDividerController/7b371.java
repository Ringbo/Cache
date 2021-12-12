diff --git a/services/core/java/com/android/server/wm/DockedStackDividerController.java b/services/core/java/com/android/server/wm/DockedStackDividerController.java
index 88aad13..7295318 100644
--- a/services/core/java/com/android/server/wm/DockedStackDividerController.java
+++ b/services/core/java/com/android/server/wm/DockedStackDividerController.java
@@ -175,7 +175,7 @@
         boolean visibleAndValid = visible && stack != null;
         if (visibleAndValid) {
             stack.getDimBounds(mTmpRect);
-            if (mTmpRect.height() > 0) {
+            if (mTmpRect.height() > 0 && mTmpRect.width() > 0) {
                 mDimLayer.setBounds(mTmpRect);
                 mDimLayer.show(mDisplayContent.mService.mLayersController.getResizeDimLayer(),
                         alpha, 0 /* duration */);
