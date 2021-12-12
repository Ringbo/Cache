diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 30df978..ac68a9e 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -1808,7 +1808,7 @@
                     }
                     AppErrorResult res = (AppErrorResult) data.get("result");
                     if (mShowDialogs && !mSleeping && !mShuttingDown) {
-                        Dialog d = new StrictModeViolationDialog(mContext,
+                        Dialog d = new StrictModeViolationDialog(mUiContext,
                                 ActivityManagerService.this, res, proc);
                         d.show();
                         proc.crashDialog = d;
