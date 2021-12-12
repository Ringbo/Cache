diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/deployer/BpmnDeployer.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/deployer/BpmnDeployer.java
index 5bb834c..139013f 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/deployer/BpmnDeployer.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/deployer/BpmnDeployer.java
@@ -185,7 +185,7 @@
         processDefinition.setDeploymentId(deploymentId);
         
         ProcessDefinitionEntity persistedProcessDefinition = null; 
-        if (processDefinition.getTenantId() == null) {
+        if (processDefinition.getTenantId() == null || ProcessEngineConfiguration.NO_TENANT_ID.equals(processDefinition.getTenantId())) {
         	persistedProcessDefinition = processDefinitionManager.findProcessDefinitionByDeploymentAndKey(deploymentId, processDefinition.getKey());
         } else {
         	persistedProcessDefinition = processDefinitionManager.findProcessDefinitionByDeploymentAndKeyAndTenantId(deploymentId, processDefinition.getKey(), processDefinition.getTenantId());
