diff --git a/modules/activiti-diagram-rest/src/main/java/org/activiti/rest/diagram/services/BaseProcessDefinitionDiagramLayoutResource.java b/modules/activiti-diagram-rest/src/main/java/org/activiti/rest/diagram/services/BaseProcessDefinitionDiagramLayoutResource.java
index 960cfc5..8f8c9a0 100644
--- a/modules/activiti-diagram-rest/src/main/java/org/activiti/rest/diagram/services/BaseProcessDefinitionDiagramLayoutResource.java
+++ b/modules/activiti-diagram-rest/src/main/java/org/activiti/rest/diagram/services/BaseProcessDefinitionDiagramLayoutResource.java
@@ -436,7 +436,7 @@
 
         // If active activities nas no instance of this callActivity then add
         // last definition
-        if (processInstanceArray.size() == 0) {
+        if (processInstanceArray.size() == 0 && StringUtils.isNotEmpty(callActivityBehavior.getProcessDefinitonKey())) {
           // Get last definition by key
           ProcessDefinition lastProcessDefinition = repositoryService
               .createProcessDefinitionQuery()
