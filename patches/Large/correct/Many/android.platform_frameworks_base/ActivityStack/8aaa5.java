diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 777a368..51e0e3b 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -1912,9 +1912,11 @@
                 } else if (mStackId == FULLSCREEN_WORKSPACE_STACK_ID) {
                     if (DEBUG_VISIBILITY) Slog.v(TAG_VISIBILITY, "Skipping after task=" + task
                             + " returning to non-application type=" + task.getTaskToReturnTo());
-                    // Once we reach a fullscreen task that should return to another task, then no
-                    // other activities behind that one should be visible.
-                    if (task.getTaskToReturnTo() != APPLICATION_ACTIVITY_TYPE) {
+                    // Once we reach a fullscreen stack task that has a running activity and should
+                    // return to another stack task, then no other activities behind that one should
+                    // be visible.
+                    if (task.topRunningActivityLocked() != null &&
+                            task.getTaskToReturnTo() != APPLICATION_ACTIVITY_TYPE) {
                         behindFullscreenActivity = true;
                     }
                 }
