diff --git a/services/java/com/android/server/wm/WindowStateAnimator.java b/services/java/com/android/server/wm/WindowStateAnimator.java
index 0a7e7fd..3a51afe 100644
--- a/services/java/com/android/server/wm/WindowStateAnimator.java
+++ b/services/java/com/android/server/wm/WindowStateAnimator.java
@@ -978,7 +978,7 @@
 
         setSurfaceBoundaries(recoveringMemory);
 
-        if (w.mAttachedHidden || !w.isReadyForDisplay()) {
+        if (w.mAttachedHidden || !w.isReadyForDisplay() || !w.isDrawnLw()) {
             if (!mLastHidden) {
                 //dump();
                 mLastHidden = true;
