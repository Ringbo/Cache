diff --git a/modules/activiti-cxf/src/test/java/org/activiti/engine/test/bpmn/sendtask/WebServiceUELTest.java b/modules/activiti-cxf/src/test/java/org/activiti/engine/test/bpmn/sendtask/WebServiceUELTest.java
index bf2b3c0..64209db 100644
--- a/modules/activiti-cxf/src/test/java/org/activiti/engine/test/bpmn/sendtask/WebServiceUELTest.java
+++ b/modules/activiti-cxf/src/test/java/org/activiti/engine/test/bpmn/sendtask/WebServiceUELTest.java
@@ -36,7 +36,7 @@
     assertEquals(-1, counter.getCount());
 
     ProcessDefinitionEntity processDefinition = processEngineConfiguration
-      .getCommandExecutorTxRequiresNew()
+      .getCommandExecutor()
       .execute(new Command<ProcessDefinitionEntity>() {
         public ProcessDefinitionEntity execute(CommandContext commandContext) {
           return Context
