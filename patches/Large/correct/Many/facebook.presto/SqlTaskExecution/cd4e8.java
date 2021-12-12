diff --git a/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java b/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java
index 542474a..f4d2341 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java
@@ -420,7 +420,7 @@
             while (!taskOutput.getState().isDone()) {
                 FutureTask<?> futureTask = scheduledWorkers.pollFirst(1, TimeUnit.SECONDS);
                 // if we got a task and the state is not done, run the task
-                if (futureTask != null && taskOutput.getState().isDone()) {
+                if (futureTask != null && !taskOutput.getState().isDone()) {
                     futureTask.run();
                 }
             }
