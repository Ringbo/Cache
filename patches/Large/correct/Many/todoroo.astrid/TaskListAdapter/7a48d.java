diff --git a/src/com/timsu/astrid/activities/TaskListAdapter.java b/src/com/timsu/astrid/activities/TaskListAdapter.java
index 3a396ca..c0e2c23 100644
--- a/src/com/timsu/astrid/activities/TaskListAdapter.java
+++ b/src/com/timsu/astrid/activities/TaskListAdapter.java
@@ -245,7 +245,7 @@
         hooks.getTaskController().saveTask(task);
 
         // if our timer is on, ask if we want to stop
-        if(task.getTimerStart() != null) {
+        if(progress == 100 && task.getTimerStart() != null) {
             new AlertDialog.Builder(activity)
             .setTitle(R.string.question_title)
             .setMessage(R.string.stop_timer_title)
