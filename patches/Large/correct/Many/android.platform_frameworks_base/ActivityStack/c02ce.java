diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 009c9a8..dac710d 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -5065,7 +5065,7 @@
     void positionTask(final TaskRecord task, int position) {
         final ActivityRecord topRunningActivity = task.topRunningActivityLocked();
         final boolean wasResumed = topRunningActivity == task.stack.mResumedActivity;
-        final ActivityStack prevStack = preAddTask(task, "positionTask", ON_TOP);
+        final ActivityStack prevStack = preAddTask(task, "positionTask", !ON_TOP);
         task.stack = this;
         insertTaskAtPosition(task, position);
         postAddTask(task, prevStack);
