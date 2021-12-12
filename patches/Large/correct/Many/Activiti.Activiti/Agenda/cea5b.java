diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/agenda/Agenda.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/agenda/Agenda.java
index 7da71dd..9949957 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/agenda/Agenda.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/agenda/Agenda.java
@@ -69,7 +69,7 @@
     }
     
     public void planContinueProcessSynchronousOperation(ActivityExecution execution) {
-        planOperation(new ContinueProcessOperation(this, execution, true), (ExecutionEntity) execution);
+        planOperation(new ContinueProcessOperation(commandContext, execution, true), (ExecutionEntity) execution);
     }
 
     public void planTakeOutgoingSequenceFlowsOperation(ActivityExecution execution, boolean evaluateConditions) {
