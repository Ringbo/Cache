diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/SetProcessDefinitionVersionCmd.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/SetProcessDefinitionVersionCmd.java
index c6c7531..2f5c1ad 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/SetProcessDefinitionVersionCmd.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cmd/SetProcessDefinitionVersionCmd.java
@@ -115,7 +115,7 @@
     
     // switch all sub-executions of the process instance to the new process definition version
     List<ExecutionEntity> childExecutions = executionManager
-      .findChildExecutionsByParentExecutionId(processInstanceId);
+      .findChildExecutionsByProcessInstanceId(processInstanceId);
     for (ExecutionEntity executionEntity : childExecutions) {
       validateAndSwitchVersionOfExecution(commandContext, executionEntity, newProcessDefinition);
     }
