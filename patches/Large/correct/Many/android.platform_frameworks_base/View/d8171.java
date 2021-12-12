diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 623759e..269b4e3 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -26853,7 +26853,7 @@
         if (mAttachInfo == null || mTooltipInfo == null) {
             return false;
         }
-        if ((mViewFlags & ENABLED_MASK) != ENABLED) {
+        if (fromLongClick && (mViewFlags & ENABLED_MASK) != ENABLED) {
             return false;
         }
         if (TextUtils.isEmpty(mTooltipInfo.mTooltipText)) {
@@ -26900,7 +26900,7 @@
         }
         switch(event.getAction()) {
             case MotionEvent.ACTION_HOVER_MOVE:
-                if ((mViewFlags & TOOLTIP) != TOOLTIP || (mViewFlags & ENABLED_MASK) != ENABLED) {
+                if ((mViewFlags & TOOLTIP) != TOOLTIP) {
                     break;
                 }
                 if (!mTooltipInfo.mTooltipFromLongClick) {
