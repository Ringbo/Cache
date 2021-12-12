diff --git a/services/core/java/com/android/server/wm/WindowStateAnimator.java b/services/core/java/com/android/server/wm/WindowStateAnimator.java
index ac1b0f1..056267d 100644
--- a/services/core/java/com/android/server/wm/WindowStateAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowStateAnimator.java
@@ -1341,7 +1341,7 @@
         }
     }
 
-    void setSurfaceBoundariesLocked(final boolean recoveringMemory) {
+    private void setSurfaceBoundariesLocked(final boolean recoveringMemory) {
         final WindowState w = mWin;
 
         int width;
