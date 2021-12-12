diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/RuntimeServiceImpl.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/RuntimeServiceImpl.java
index 8b4e354..bb3a440 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/RuntimeServiceImpl.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/RuntimeServiceImpl.java
@@ -182,11 +182,11 @@
   }
   
   public Map<String, VariableInstance> getVariableInstancesLocal(String executionId, Collection<String> variableNames) {
-    return commandExecutor.execute(new GetExecutionVariableInstancesCmd(executionId, variableNames, false));
+    return commandExecutor.execute(new GetExecutionVariableInstancesCmd(executionId, variableNames, true));
   }
 
   public Map<String, VariableInstance> getVariableInstancesLocal(String executionId, Collection<String> variableNames, String locale, boolean withLocalizationFallback) {
-    return commandExecutor.execute(new GetExecutionVariableInstancesCmd(executionId, variableNames, false, locale, withLocalizationFallback));
+    return commandExecutor.execute(new GetExecutionVariableInstancesCmd(executionId, variableNames, true, locale, withLocalizationFallback));
   }
 
   public Object getVariable(String executionId, String variableName) {
