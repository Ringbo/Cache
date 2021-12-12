diff --git a/services/core/java/com/android/server/wm/DisplayContent.java b/services/core/java/com/android/server/wm/DisplayContent.java
index b7a268c..d85552a 100644
--- a/services/core/java/com/android/server/wm/DisplayContent.java
+++ b/services/core/java/com/android/server/wm/DisplayContent.java
@@ -1954,7 +1954,8 @@
             for (int i = mTaskStackContainers.size() - 1; i >= 0; --i) {
                 final TaskStack stack = mTaskStackContainers.get(i);
                 final boolean isDockedOnBottom = stack.getDockSide() == DOCKED_BOTTOM;
-                if (stack.isVisible() && (imeOnBottom || isDockedOnBottom)) {
+                if (stack.isVisible() && (imeOnBottom || isDockedOnBottom) &&
+                        StackId.isStackAffectedByDragResizing(stack.mStackId)) {
                     stack.setAdjustedForIme(imeWin, imeOnBottom && imeHeightChanged);
                 } else {
                     stack.resetAdjustedForIme(false);
