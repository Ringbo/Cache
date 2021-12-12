diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 50bbbc3..47c3029 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -1479,7 +1479,7 @@
         cancelInitializingActivities();
 
         // Find the first activity that is not finishing.
-        ActivityRecord next = topRunningActivityLocked(null);
+        final ActivityRecord next = topRunningActivityLocked(null);
 
         // Remember how we'll process this pause/resume situation, and ensure
         // that the state is reset however we wind up proceeding.
@@ -1821,7 +1821,9 @@
 
                 EventLog.writeEvent(EventLogTags.AM_RESUME_ACTIVITY,
                         next.userId, System.identityHashCode(next),
-                        next.task.taskId, next.shortComponentName);
+                        next.task.taskId, next.shortComponentName + " top="
+                                + mStacks.get(mStacks.size() - 1).mStackId + " Callers="
+                                + Debug.getCallers(6));
 
                 next.sleeping = false;
                 mService.showAskCompatModeDialogLocked(next);
