diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index e3212c2..dde948f 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -4599,13 +4599,13 @@
             // Defer updating the stack in which recents is until the app transition is done, to
             // not run into issues where we still need to draw the task in recents but the
             // docked stack is already created.
-            deferUpdateBounds(RECENTS_STACK_ID);
+            deferUpdateBounds(HOME_STACK_ID);
             mWindowManager.prepareAppTransition(TRANSIT_DOCK_TASK_FROM_RECENTS, false);
         }
 
         task = anyTaskForIdLocked(taskId, RESTORE_FROM_RECENTS, launchStackId);
         if (task == null) {
-            continueUpdateBounds(RECENTS_STACK_ID);
+            continueUpdateBounds(HOME_STACK_ID);
             mWindowManager.executeAppTransition();
             throw new IllegalArgumentException(
                     "startActivityFromRecentsInner: Task " + taskId + " not found.");
