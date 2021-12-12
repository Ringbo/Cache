diff --git a/modules/activiti-explorer/src/main/java/org/activiti/explorer/ui/process/ProcessDefinitionImageStreamResourceBuilder.java b/modules/activiti-explorer/src/main/java/org/activiti/explorer/ui/process/ProcessDefinitionImageStreamResourceBuilder.java
index 062f352..5d2a9ee 100644
--- a/modules/activiti-explorer/src/main/java/org/activiti/explorer/ui/process/ProcessDefinitionImageStreamResourceBuilder.java
+++ b/modules/activiti-explorer/src/main/java/org/activiti/explorer/ui/process/ProcessDefinitionImageStreamResourceBuilder.java
@@ -75,7 +75,7 @@
     if (processDefinition != null && processDefinition.isGraphicalNotationDefined()) {
       try {
         
-        BpmnModel bpmnModel = repositoryService.getBpmnModel(processInstance.getId());
+        BpmnModel bpmnModel = repositoryService.getBpmnModel(processInstance.getProcessDefinitionId());
         InputStream definitionImageStream = ProcessDiagramGenerator.generateDiagram(bpmnModel, "png", 
                 runtimeService.getActiveActivityIds(processInstance.getId()));
               
