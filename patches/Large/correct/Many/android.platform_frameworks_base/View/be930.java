diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 2afbe81..35b806a 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -8543,7 +8543,7 @@
         if ((privateFlags & PRESSED) != 0) viewStateIndex |= VIEW_STATE_PRESSED;
         if ((mViewFlags & ENABLED_MASK) == ENABLED) viewStateIndex |= VIEW_STATE_ENABLED;
         if (isFocused()) viewStateIndex |= VIEW_STATE_FOCUSED;
-        if ((privateFlags & SELECTED) != 0) viewStateIndex |= VIEW_STATE_PRESSED;
+        if ((privateFlags & SELECTED) != 0) viewStateIndex |= VIEW_STATE_SELECTED;
         if (hasWindowFocus()) viewStateIndex |= VIEW_STATE_WINDOW_FOCUSED;
         if ((privateFlags & ACTIVATED) != 0) viewStateIndex |= VIEW_STATE_ACTIVATED;
 
