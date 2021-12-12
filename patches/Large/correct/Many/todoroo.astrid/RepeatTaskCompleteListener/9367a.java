diff --git a/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java b/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java
index 71b0dc2..56c724c 100644
--- a/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java
+++ b/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java
@@ -43,7 +43,7 @@
 
         Task task = PluginServices.getTaskService().fetchById(taskId, Task.ID, Task.RECURRENCE,
                 Task.DUE_DATE, Task.FLAGS, Task.HIDE_UNTIL, Task.REMOTE_ID, Task.COMPLETION_DATE);
-        if(task == null)
+        if(task == null || !task.isCompleted())
             return;
 
         String recurrence = task.getValue(Task.RECURRENCE);
