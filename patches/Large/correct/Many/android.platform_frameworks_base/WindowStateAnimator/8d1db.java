diff --git a/services/core/java/com/android/server/wm/WindowStateAnimator.java b/services/core/java/com/android/server/wm/WindowStateAnimator.java
index 056267d..ac1b0f1 100644
--- a/services/core/java/com/android/server/wm/WindowStateAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowStateAnimator.java
@@ -1341,7 +1341,7 @@
         }
     }
 
-    private void setSurfaceBoundariesLocked(final boolean recoveringMemory) {
+    void setSurfaceBoundariesLocked(final boolean recoveringMemory) {
         final WindowState w = mWin;
 
         int width;
