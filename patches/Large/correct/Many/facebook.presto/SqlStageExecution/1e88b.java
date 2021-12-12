diff --git a/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java b/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java
index 781a5f4..e66d938 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java
@@ -358,7 +358,7 @@
         }
         else {
             // stage finished while we were scheduling this task
-            task.cancel();
+            task.abort();
         }
 
         return task;
