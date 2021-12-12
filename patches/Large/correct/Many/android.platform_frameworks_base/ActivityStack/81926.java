diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 3f4749a..c3a344f 100755
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -1478,7 +1478,7 @@
         cancelInitializingActivities();
 
         // Find the first activity that is not finishing.
-        ActivityRecord next = topRunningActivityLocked(null);
+        final ActivityRecord next = topRunningActivityLocked(null);
 
         // Remember how we'll process this pause/resume situation, and ensure
         // that the state is reset however we wind up proceeding.
@@ -1819,7 +1819,9 @@
 
                 EventLog.writeEvent(EventLogTags.AM_RESUME_ACTIVITY,
                         next.userId, System.identityHashCode(next),
-                        next.task.taskId, next.shortComponentName);
+                        next.task.taskId, next.shortComponentName + " top="
+                                + mStacks.get(mStacks.size() - 1).mStackId + " Callers="
+                                + Debug.getCallers(6));
 
                 next.sleeping = false;
                 mService.showAskCompatModeDialogLocked(next);
