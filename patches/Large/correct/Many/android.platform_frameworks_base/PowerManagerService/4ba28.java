diff --git a/services/java/com/android/server/PowerManagerService.java b/services/java/com/android/server/PowerManagerService.java
index 71105f1..e77ed69 100644
--- a/services/java/com/android/server/PowerManagerService.java
+++ b/services/java/com/android/server/PowerManagerService.java
@@ -871,7 +871,7 @@
             mWakeLockState = mLocks.gatherState();
             // goes in the middle to reduce flicker
             if ((wl.flags & PowerManager.ON_AFTER_RELEASE) != 0) {
-                userActivity(SystemClock.uptimeMillis(), false);
+                userActivity(SystemClock.uptimeMillis(), -1, false, OTHER_EVENT, false);
             }
             setPowerState(mWakeLockState | mUserState);
         }
