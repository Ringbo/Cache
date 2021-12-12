diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 4dc2ab5..63d31e2 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -4510,7 +4510,7 @@
         Slog.i(TAG, "moveTaskToBack: " + tr);
 
         // If the task is locked, then show the lock task toast
-        if (!mService.mLockTaskController.checkLockedTask(tr)) {
+        if (mService.mLockTaskController.checkLockedTask(tr)) {
             return false;
         }
 
