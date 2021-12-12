diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 8d21862..3f11fcf 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -4611,7 +4611,7 @@
         Slog.i(TAG, "moveTaskToBack: " + tr);
 
         // If the task is locked, then show the lock task toast
-        if (!mService.mLockTaskController.checkLockedTask(tr)) {
+        if (mService.mLockTaskController.checkLockedTask(tr)) {
             return false;
         }
 
