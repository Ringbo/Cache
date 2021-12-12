diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index e5565dc..b1ca64e 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -2890,10 +2890,8 @@
         try {
             ActivityRecord r = stack.topRunningActivityLocked();
             Rect insetBounds = null;
-            if (tempPinnedTaskBounds != null) {
-                // We always use 0,0 as the position for the inset rect because
-                // if we are getting insets at all in the pinned stack it must mean
-                // we are headed for fullscreen.
+            if (tempPinnedTaskBounds != null && stack.isAnimatingBoundsToFullscreen()) {
+                // Use 0,0 as the position for the inset rect because we are headed for fullscreen.
                 insetBounds = tempRect;
                 insetBounds.top = 0;
                 insetBounds.left = 0;
