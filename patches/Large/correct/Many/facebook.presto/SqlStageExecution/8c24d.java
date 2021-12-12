diff --git a/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java b/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java
index 77fc5a6..1ef7eb9 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/SqlStageExecution.java
@@ -894,7 +894,7 @@
                     else if (any(taskStates, equalTo(TaskState.ABORTED))) {
                         // A task should only be in the aborted state if the STAGE is done (ABORTED or FAILED)
                         stageState.set(StageState.FAILED);
-                        failureCauses.add(new PrestoException(StandardErrorCode.INTERNAL_ERROR, "A task is in the ABORTED state but stage is " + stageState));
+                        failureCauses.add(new PrestoException(StandardErrorCode.INTERNAL_ERROR, "A task is in the ABORTED state but stage is " + currentState));
                     }
                     else if (currentState != StageState.PLANNED && currentState != StageState.SCHEDULING) {
                         // all tasks are now scheduled, so we can check the finished state
