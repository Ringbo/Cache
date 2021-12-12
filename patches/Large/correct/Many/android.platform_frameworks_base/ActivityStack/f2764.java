diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index ee37463..3d50b7c 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -2795,7 +2795,8 @@
                     } else {
                         // If a new task is being launched, then mark the existing top activity as
                         // supporting picture-in-picture while pausing
-                        if (focusedTopActivity != null) {
+                        if (focusedTopActivity != null &&
+                                focusedTopActivity.getStack().getStackId() != PINNED_STACK_ID) {
                             focusedTopActivity.supportsPictureInPictureWhilePausing = true;
                         }
                         transit = TRANSIT_TASK_OPEN;
@@ -4403,7 +4404,7 @@
         }
         // If a new task is moved to the front, then mark the existing top activity as supporting
         // picture-in-picture while paused
-        if (topActivity != null) {
+        if (topActivity != null && topActivity.getStack().getStackId() != PINNED_STACK_ID) {
             topActivity.supportsPictureInPictureWhilePausing = true;
         }
 
