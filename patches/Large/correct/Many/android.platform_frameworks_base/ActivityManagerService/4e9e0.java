diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 4493917..c4122e8 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -8006,7 +8006,7 @@
         long ident = Binder.clearCallingIdentity();
         try {
             synchronized (this) {
-                TaskRecord task = mStackSupervisor.anyTaskForIdLocked(taskId, true);
+                TaskRecord task = mStackSupervisor.anyTaskForIdLocked(taskId);
                 if (task == null) {
                     Slog.w(TAG, "resizeTask: taskId=" + taskId + " not found");
                     return;
