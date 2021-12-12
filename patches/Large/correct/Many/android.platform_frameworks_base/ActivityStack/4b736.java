diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 4ead64b..2673854 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -1350,8 +1350,11 @@
             prev.cpuTimeAtResume = 0; // reset it
         }
 
-        // Notify when the task stack has changed, but only if visibilities changed (not just focus)
-        if (mStackSupervisor.mAppVisibilitiesChangedSinceLastPause) {
+        // Notify when the task stack has changed, but only if visibilities changed (not just
+        // focus). Also if there is an active pinned stack - we always want to notify it about
+        // task stack changes, because its positioning may depend on it.
+        if (mStackSupervisor.mAppVisibilitiesChangedSinceLastPause
+                || mService.mStackSupervisor.getStack(PINNED_STACK_ID) != null) {
             mService.notifyTaskStackChangedLocked();
             mStackSupervisor.mAppVisibilitiesChangedSinceLastPause = false;
         }
