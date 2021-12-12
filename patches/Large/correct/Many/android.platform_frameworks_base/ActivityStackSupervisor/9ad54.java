diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index e8bc68f..1b92ffc 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -4494,9 +4494,10 @@
                         }
                         mLockTaskNotify.show(false);
                         try {
-                            boolean shouldLockKeyguard = Settings.Secure.getInt(
+                            boolean shouldLockKeyguard = Settings.Secure.getIntForUser(
                                     mService.mContext.getContentResolver(),
-                                    Settings.Secure.LOCK_TO_APP_EXIT_LOCKED) != 0;
+                                    Settings.Secure.LOCK_TO_APP_EXIT_LOCKED,
+                                    UserHandle.USER_CURRENT) != 0;
                             if (mLockTaskModeState == LOCK_TASK_MODE_PINNED && shouldLockKeyguard) {
                                 mWindowManager.lockNow(null);
                                 mWindowManager.dismissKeyguard(null /* callback */);
