diff --git a/services/core/java/com/android/server/wm/Task.java b/services/core/java/com/android/server/wm/Task.java
index 1f03c04..eea0ca0 100644
--- a/services/core/java/com/android/server/wm/Task.java
+++ b/services/core/java/com/android/server/wm/Task.java
@@ -425,7 +425,7 @@
         if (mFullscreen
                 || !StackId.isTaskResizeableByDockedStack(mStack.mStackId)
                 || displayContent == null
-                || displayContent.getDockedStackLocked() != null) {
+                || displayContent.getDockedStackVisibleForUserLocked() != null) {
             return true;
         }
         return false;
