diff --git a/presto-main/src/main/java/com/facebook/presto/execution/scheduler/ScheduleResult.java b/presto-main/src/main/java/com/facebook/presto/execution/scheduler/ScheduleResult.java
index 975032a..3df9ab7 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/scheduler/ScheduleResult.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/scheduler/ScheduleResult.java
@@ -110,7 +110,7 @@
         return toStringHelper(this)
                 .add("finished", finished)
                 .add("newTasks", newTasks.size())
-                .add("blocked", blocked.isDone())
+                .add("blocked", !blocked.isDone())
                 .add("splitsScheduled", splitsScheduled)
                 .add("blockedReason", blockedReason)
                 .toString();
